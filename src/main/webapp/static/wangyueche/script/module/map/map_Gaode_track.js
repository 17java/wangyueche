/**
 * Item Name  :
 *Creator         :cc
 *Email            :cc
 *Created Date:2017.3.29.
 * 历史轨迹
 *@pararm     :
 */
(function ($, window) {
    function GD_track(opts) {
        this.id = opts.id;

        this.data1 = $('#check_ipt1');
        this.data2 = $('#check_ipt2');
        this.time1 = '';
        this.time2 = '';

        this.partTime1 = '';
        this.partTime2 = '';
        this.pointers = [];

        this.api = new Carnet.module.server().map.track;
    };
    GD_track.prototype = {
        //面向对象初始化
        init: function () {
            var me = this;
            me.init_Baner(); //开启控件
            setTimeout(function () {
                me.init_event();
            }, 500);
        },
        //控件默认初始化
        init_Baner: function () {
            var me = this;
            var map = me.map = new AMap.Map(me.id);
            map.setZoomAndCenter(11, [117.227, 31.820]);
        },

        init_event: function () {
            var me = this;
            me._line_bind();
            me._line();
        },
        _line: function () {
            var me = this;
            me._init_pre();
            //日期插件渲染
            me.date_init();
            // 查询按钮的事件
            me.btn_event();

            me.info_p_event();
        },
        _line_bind: function () {
            var me = this;
            var fn = {
                // 页面的一些样式问题
                _init_pre: function () {
                    var me = this;
                    var w = $('#parent').width();
                    // $('#parent').css('left',(-1*w));
                    $('#toggle_btn').on('click', function () {
                        var key = $('#parent').offset().left;
                        // 未展开
                        if (key < 0) {
                            $('#toggle_btn').html('◁');
                            $('#parent').css('left', 0);
                        }
                        // 已展开
                        else if (key == 0) {
                            $('#toggle_btn').html('▷');
                            $('#parent').css('left', (-1 * w - 10));
                        }
                    });
                },
                //日期插件渲染
                date_init: function () {
                    var me = this;

                    var start = {
                        elem: '#check_ipt1', //需显示日期的元素选择器
                        event: 'click', //触发事件
                        format: 'YYYY-MM-DD hh:mm:ss', //日期格式
                        istime: true, //是否开启时间选择
                        isclear: true, //是否显示清空
                        istoday: false, //是否显示今天
                        issure: true, //是否显示确认
                        festival: true, //是否显示节日
                        // min: '1900-01-01 00:00:00', //最小日期
                        // max: '2099-12-31 23:59:59', //最大日期
                        max: laydate.now(), //设定最大日期为当前日期
                        //start: '2014-6-15 23:00:00',  //开始日期
                        fixed: false, //是否固定在可视区域
                        zIndex: 99999999, //css z-index
                        choose: function (dates) { //选择好日期的回调
                            var time = (new Date(dates)).getTime();//得到毫秒数
                            var time_hm = time / 1000;


                            me.time1 = time_hm;
                            end.min = dates; //开始日选好后，重置结束日的最小日期
                            end.start = dates //将结束日的初始值设定为开始日
                        }
                    }
                    var end = {
                        elem: '#check_ipt2', //需显示日期的元素选择器
                        event: 'click', //触发事件
                        format: 'YYYY-MM-DD hh:mm:ss', //日期格式
                        istime: true, //是否开启时间选择
                        isclear: true, //是否显示清空
                        istoday: false, //是否显示今天
                        issure: true, //是否显示确认
                        festival: true, //是否显示节日
                        // min: '1900-01-01 00:00:00', //最小日期 max: '2099-12-31 23:59:59', //最大日期
                        //start: '2014-6-15 23:00:00',  //开始日期
                        max: laydate.now(), //设定最大日期为当前日期
                        fixed: false, //是否固定在可视区域
                        zIndex: 99999999, //css z-index
                        choose: function (dates) { //选择好日期的回调
                            // var time = dates.replace(new RegExp("-", "gm"), "/");
                            var time = (new Date(dates)).getTime();//得到毫秒数
                            var time_hm = time / 1000;
                            me.time2 = time_hm;
                            console.log(time_hm)
                            start.max = dates; //结束日选好后，重置开始日的最大日期
                        }
                    };
                    $('#check_ipt1').click(function () {
                        laydate(start);
                    });
                    $('#check_ipt2').click(function () {
                        laydate(end);
                    });
                },
                //查询按钮事件
                btn_event: function () {
                    var me = this;
                    var btn = $('#check_btn');

                    btn.click(function () {
                        var vehicleNo = me.vehicleNo = $('#vehicleNo').val();
                        if (vehicleNo == '') {
                            layer.msg('车牌号不能为空！');
                            return;
                        }
                        ;
                        if (me.data1.val() == '') {
                            layer.msg('请选择起始时间！');
                            return;
                        }
                        ;
                        if (me.data2.val() == '') {
                            layer.msg('请选择结束时间！');
                            return;
                        }
                        ;

                        // 测试数据
                        // var opts = {
                        //   vehicleNo: '皖AS7P19',
                        //   begin: "1391874742",
                        //   end: "1791875743",
                        // };
                        var opts = {
                            vehicleNo: me.vehicleNo,
                            begin: me.time1,
                            end: me.time2,
                        };

                        me.api.info(opts)
                            .then(function (data) {
                                me.trail_ajax(data.track);
                            });
                    });
                },
                // 处理查询返回的数据
                trail_ajax: function (arr) {
                    var me = this;
                    me.map.clearMap();
                    $('#trailInfo_show').html('');
                    if (arr.length == 0) {
                        layer.msg('该日期段无轨迹信息，请重新查询！');
                        return;
                    }
                    for (var i = 0; i < arr.length; i++) {
                        var staDate = arr[i].states[0].receive * 1000;
                        var endDate = arr[i].states[1].receive * 1000;
                        $('#trailInfo_show').append(
                            '<p class="info_p"  t1="' + arr[i].states[0].receive + '" t2="' + arr[i].states[1].receive + '">' +
                            '<span>轨迹' + (i + 1) + '</span>' +
                            '<span>起始时间：</span><span>' + cLib.base.formatterDateDay(staDate) + '</span>' +
                            '<span>截止时间：</span><span>' + cLib.base.formatterDateDay(endDate) + '</span>' +
                            '<span>轨迹长度：</span><span>' + arr[i].distance + arr[i].unit + '</span>' +
                            '</p>'
                        );
                    }
                    ;
                    me.info_p_event();
                },
                //列表信息点击事件
                info_p_event: function () {
                    var me = this;
                    var info_p = $('.info_p');
                    for (var i = 0; i < info_p.length; i++) {
                        info_p[i].onclick = function () {

                            // 当前点击对象
                            me.partTime1 = $(this).attr('t1');
                            me.partTime2 = $(this).attr('t2');
                            // 室内外数据的区别
                            var opts = {
                                vehicleNo: me.vehicleNo,
                                // part: me.type,
                                begin: me.partTime1,
                                end: me.partTime2
                            };
                            // me.p_ajax(opts);
                            me.api.line(opts)
                                .then(function (data) {
                                    me.p_ajax(data.track);
                                });
                        };
                    }
                },
                //每条记录的轨迹数据
                p_ajax: function (arr) {
                    var me = this;
                    me.map.clearMap();

                    var marker, lineArr = [];

                    var map = me.map;
                    marker = new AMap.Marker({
                        map: map,
                        position: [arr[0].longitude, arr[0].latitude],
                        icon: "http://webapi.amap.com/images/car.png",
                        offset: new AMap.Pixel(-26, -13),
                        autoRotation: true
                    });


                    for (var i = 1; i < arr.length; i++) {
                        lineArr.push([arr[i].longitude, arr[i].latitude]);
                    }
                    // 绘制轨迹
                    var polyline = new AMap.Polyline({
                        map: map,
                        path: lineArr,
                        strokeColor: "#00A", //线颜色
                        // strokeOpacity: 1,     //线透明度
                        strokeWeight: 3, //线宽
                        // strokeStyle: "solid"  //线样式
                    });

                    // 已结走过的轨迹
                    var passedPolyline = new AMap.Polyline({
                        map: map,
                        // path: lineArr,
                        strokeColor: "#F00", //线颜色
                        // strokeOpacity: 1,     //线透明度
                        strokeWeight: 3, //线宽
                        // strokeStyle: "solid"  //线样式
                    });


                    marker.on('moving', function (e) {
                        passedPolyline.setPath(e.passedPath);
                    })
                    map.setFitView();

                    $('#start').off().on('click', function () {
                        marker.moveAlong(lineArr, 1000);
                    });
                    $('#pause').off().on('click', function () {
                        marker.pauseMove();
                    });
                    $('#resume').off().on('click', function () {
                        marker.resumeMove();
                    });
                    $('#stop').off().on('click', function () {
                        marker.stopMove();
                    });
                },
            };
            for (k in fn) {
                me[k] = fn[k];
            }
            ;
        },
    };
    Carnet.module["GD_track"] = GD_track;
})(jQuery, window);
