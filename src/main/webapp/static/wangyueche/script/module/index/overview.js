/**
 * Created by Wyan_ on 2017/5/9.
 * 数据概览JS
 */
(function ($) {
    //构造器
    function statistics(url) {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataChart';
        // this.comListViewId = 'banner';
        this.url = url;
    };
    // var length = 0;
    statistics.prototype = {
        constructor: statistics,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            $('.banner .left').bind('click', function () {
                _self.nextPlay();
            });
            $('.banner.right').bind('click', function () {
                _self.prevPlay();
            });

            _self.loadChart();
        },

        // 加载平台车辆数量
        loadChart: function () {
            var _self = this;
            var count = 0;
            var bannerHeight = '430px';
            var timer = null;
            var title = [
                '平台订单数据',
                '车辆接单量分布',
                '车辆运行信息统计',
                '平台市场占有率',
                '用车时间段分布',
                '驾驶员信誉统计',
                '乘客评价统计'
            ];
            var subData = [
                '/statistics/businessStatus/orderBusiness',
                '/statistics/businessStatus/carOrder/pie',
                '/statistics/businessStatus/carBusiness',
                '/statistics/businessStatus/platformScale',
                '/statistics/businessStatus/useCar',
                '/statistics/serviceQuality/driverReputation',
                '/statistics/serviceQuality/passengerAssess'
            ];
            var length = title.length;
            $('.b').append("<div class='banner'><ul></ul><ol></ol> <i class='left'></i><i class='right'></i></div>");

            //列表节点
            for (var j = 0; j < length + 1; j++) {
                $('.banner').append("<div id='chart" + j + "' class='dataChart'></div>");
                $('.banner ul').append("<li id='li" + j + "'></li>");
                if (j !== length) {
                    $('#li' + j).append("<div class='opTitle'>" + title[j] + "</div>");
                }
            }
            //轮播圆点按钮节点
            for (var i = 0; i < length; i++) {
                if (i == 0) {
                    $('.banner ol').append('<li class="current">&nbsp;&nbsp;' + title[i] + '&nbsp;&nbsp;</li>')
                } else {
                    $('.banner ol').append('<li>&nbsp;&nbsp;' + title[i] + '&nbsp;&nbsp;</li>')
                }
            }
            $.each(subData, function (key, value) {
                _self.server.dataChart(value).done(function (res) {
                    var mChart = echarts.init(document.getElementById('chart' + key));
                    if (res) {
                        mChart.setOption(res);
                    }
                });
                count = count + 1;
                $('#chart' + key).appendTo('#li' + key);

            });
            // 最后一个li放置第一张图表
            $('#li' + length).append("<div class='opTitle'>" + title[1] + "</div>");
            _self.server.dataChart('/statistics/serviceQuality/passengerAssess').done(function (res) {
                var mChart = echarts.init(document.getElementById('chart' + length));
                if (res) {
                    mChart.setOption(res);
                }
            });
            $('#chart' + length).appendTo('#li' + length);
            count++;

            $('.banner').css('height', bannerHeight);

            $('.banner ul').css('width', (count + 1) * 100 + '%');
            // $('.banner ol').css('width',count*20+'px');
            $('.banner ol').css('margin-left', -count * 20 * 0.5 - 10 + 'px');

            //=========================

            var num = 0;
            //获取窗口宽度
            var bannerWidth = $('.banner').width();

            $('.banner ul li').css({width: bannerWidth});
            $('.banner ul li').width(bannerWidth);
            //轮播圆点
            $('.banner ol li').mouseover(function () {//用hover的话会有两个事件(鼠标进入和离开)
                $(this).addClass('current').siblings().removeClass('current');
                //获取当前编号
                var i = $(this).index();
                //console.log(i);
                $('.banner ul').stop().animate({left: -i * bannerWidth}, 500);
                num = i;
            });
            //自动播放

            function prevPlay() {
                num--;
                if (num < 0) {
                    //悄悄把图片跳到最后一张图(复制页,与第一张图相同),然后做出图片播放动画，left参数是定位而不是移动的长度
                    $('.banner ul').css({left: -bannerWidth * count}).stop().animate({left: -bannerWidth * (count - 1)}, 500);
                    num = count - 1;
                } else {
                    //console.log(num);
                    $('.banner ul').stop().animate({left: -num * bannerWidth}, 500);
                }
                if (num == count - 1) {
                    $('.banner ol li').eq(count - 1).addClass('current').siblings().removeClass('current');
                } else {
                    $('.banner ol li').eq(num).addClass('current').siblings().removeClass('current');

                }
            }

            function nextPlay() {
                num++;
                if (num > length) {
                    //播放到最后一张(复制页)后,悄悄地把图片跳到第一张,因为和第一张相同,所以难以发觉,
                    $('.banner ul').css({left: 0}).stop().animate({left: -bannerWidth}, 500);
                    //css({left:0})是直接悄悄改变位置，animate({left:-bannerWidth},500)是做出移动动画
                    //随后要把指针指向第二张图片,表示已经播放至第二张了。
                    num = 1;
                } else {
                    //在最后面加入一张和第一张相同的图片，如果播放到最后一张，继续往下播，悄悄回到第一张(肉眼看不见)，从第一张播放到第二张
                    //console.log(num);
                    $('.banner ul').stop().animate({left: -num * bannerWidth}, 500);
                }
                if (num == count) {
                    $('.banner ol li').eq(0).addClass('current').siblings().removeClass('current');
                } else {
                    $('.banner ol li').eq(num).addClass('current').siblings().removeClass('current');

                }
            }

            timer = setInterval(nextPlay, 2000);
            //鼠标经过banner，停止定时器,离开则继续播放
            $('.banner').mouseenter(function () {
                clearInterval(timer);
                //左右箭头显示(淡入)
                $('.banner i').fadeIn();
            }).mouseleave(function () {
                timer = setInterval(nextPlay, 2000);
                //左右箭头隐藏(淡出)
                $('.banner i').fadeOut();
            });
            //播放下一张
            $('.banner .right').click(function () {
                nextPlay();
            });
            //返回上一张
            $('.banner .left').click(function () {
                prevPlay();
            });

        },

    }
    //将服务模型添加到全局变量中
    Carnet.module["statistics"] = statistics;
})(jQuery);