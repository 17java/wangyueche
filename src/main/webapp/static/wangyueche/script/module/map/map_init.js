(function ($, window) {
    function Map_init() {
        this.api = new Carnet.module.server();
    };
    Map_init.prototype = {
        init: function () {
            var me = this;
            $(window).on('resize', me.resize).trigger('resize');
            me.echart();
            me.loadBaseInfo();
        },
        loadBaseInfo: function () {
            // alert("7");

            var me = this;
            me.api.mapInit("/statistics/baseInfo").done(function (data) {
                $("#company").text(data.companyCount);
                $("#driver").text(data.driverCount);
                $("#car").text(data.vehicleCount);
                $("#orderRealTime").text(data.orderRealTime);
                $("#vehicleRealTime").text(data.vehicleRealTime);
                $(".ap").attr("onclick", "return false");
            });

        },

        // 屏幕响应
        resize: function () {
            var me = this;
            var _h = $('.section_left>.l_top').height();
            var all_h = $('.section_left').height();
            $('.section_left>.l_bottom').css('height', (all_h - _h - 20) + 'px');

            var r_h = $('.section_right>.r_top').height();
            var r_all_h = $('.section_right').height();
            $('.section_right>.r_bottom').css('height', (r_all_h - r_h) + 'px');

            // h1-----------------右侧--表格--当日订单数量的高度

            var _h1 = $('.section_right>.r_bottom>.bottom_l>div>p').height();
            $('.section_right>.r_bottom>.bottom_l>div>p').css('lineHeight', _h1 + 'px');
            var H1 = $('.section_right>.r_bottom>.bottom_l>div').height();
            // 右侧表格的高度
            $('.section_right>.r_bottom>.bottom_l>div>div').css('height', (H1 - _h1 * 2) + 'px');

            // h2-----------------右侧--table--标头的高度
            var _h2 = $('.section_right>.r_bottom>.bottom_r>p').height();
            $('.section_right>.r_bottom>.bottom_r>p').css('lineHeight', _h2 + 'px');
            var H2 = $('.section_right>.r_bottom>.bottom_r').height();
            $('.section_right>.r_bottom>.bottom_r>div').css('height', (H2 - _h2 * 2) + 'px');
        },
        // echart
        echart: function () {
            var me = this;

            me.api.mapInit("/statistics/businessStatus/orderBusiness/realTime").done(function (res) {
                var myChart = echarts.init(document.getElementById('chart_pay'));
                if (res) {
                    myChart.setOption(res);
                }
            });
            me.api.mapInit("/statistics/businessStatus/carBusiness/realTime").done(function (res) {
                var myChart = echarts.init(document.getElementById('chart_car'));
                if (res) {
                    myChart.setOption(res);
                }
            });


            // var myChart = echarts.init(document.getElementById('chart_pay'));
            // var option = {
            //     title: {
            //         text: '分时订单量（万单）',
            //         textStyle: {
            //             color: '#333',
            //             fontStyle: 'normal',
            //             fontWeight: 'bolder',
            //             fontFamily: 'sans-serif',
            //             fontSize: 14,
            //         },
            //     },
            //     // 提示框组件
            //     tooltip: {
            //         // 坐标轴触发，主要在柱状图，折线图等会使用类目轴的图表中使用。
            //         trigger: 'axis'
            //     },
            //     // 图例组件。默认找数据的中name属性
            //     // legend: {
            //     //   data: ['滴滴', 'Uber']
            //     // },
            //     grid: {
            //         left: '1%',
            //         right: '3%',
            //         bottom: '1%',
            //         // 包括了坐标轴标签在内的所有内容所形成的矩形的位置。防止溢出
            //         containLabel: true
            //     },
            //     // toolbox: {
            //     //   feature: {
            //     //     saveAsImage: {}
            //     //   }
            //     // },
            //     xAxis: {
            //         type: 'category',
            //         axisTick: {
            //             // 保证刻度线和标签对齐
            //             alignWithLabel: true
            //         },
            //         // 坐标轴两边留白策略,不留白
            //         boundaryGap: false,
            //         data: ['00', '02', '04', '06', '08', '10', '12', '14', '16', '18', '20', '22']
            //     },
            //     yAxis: {
            //         // 根据返回数据自己形成刻度
            //         type: 'value'
            //     },
            //     series: [{
            //         name: '滴滴',
            //         type: 'line',
            //         smooth: true,
            //         // stack: '总量',
            //         data: [0.2, 0.4, 0.53, 0.42, 1.2, 1.2, 1.3, 1.6]
            //     }, {
            //         name: 'Uber',
            //         type: 'line',
            //         smooth: true,
            //         // stack: '总量',
            //         data: [0.5, 0.3, 0.42, 0.53, 1.1, 1.6, 1.7]
            //     }]
            // };
            // myChart.setOption(option);
            // var myChart1 = echarts.init(document.getElementById('chart_car'));
            // myChart1.setOption(option);
        },
        echart_test: function () {
            var me = this;
            var colors = ['#5793f3', '#d14a61', '#675bba'];
            var option = {
                color: colors,
                tooltip: {
                    trigger: 'none',
                    axisPointer: {
                        type: 'cross'
                    }
                },
                legend: {
                    data: ['2015 降水量', '2016 降水量']
                },
                // 表格距离
                grid: {
                    top: 70,
                    bottom: 50
                },
                xAxis: [{
                    type: 'category',
                    // 坐标轴刻度相关设置
                    axisTick: {
                        // 保证刻度线和标签对齐
                        alignWithLabel: true
                    },
                    // 坐标轴轴线相关设置。
                    axisLine: {
                        // X 轴或者 Y 轴的轴线是否在另一个轴的 0 刻度上，只有在另一个轴为数值轴且包含 0 刻度时有效。
                        onZero: false,
                        // 轴线的样式
                        lineStyle: {
                            color: colors[1]
                        }
                    },
                    axisPointer: {
                        show: false,
                        label: {
                            formatter: function (params) {
                                return '降水量  ' + params.value + '：' + params.seriesData[0].data;
                            }
                        }
                    },
                    // 类目数据，在类目轴（type: 'category'）中有效。
                    data: ["2016-1", "2016-2", "2016-3", "2016-4", "2016-5", "2016-6", "2016-7", "2016-8", "2016-9", "2016-10", "2016-11", "2016-12"]
                },
                    // 另外一条X
                    {
                        type: 'category',
                        axisTick: {
                            alignWithLabel: true
                        },
                        axisLine: {
                            onZero: false,
                            lineStyle: {
                                color: colors[0]
                            }
                        },
                        axisPointer: {
                            label: {
                                formatter: function (params) {
                                    return '降水量  ' + params.value + '：' + params.seriesData[0].data;
                                }
                            }
                        },
                        data: ["2015-1", "2015-2", "2015-3", "2015-4", "2015-5", "2015-6", "2015-7", "2015-8", "2015-9", "2015-10", "2015-11", "2015-12"]
                    }
                ],
                yAxis: [{
                    // 数值轴，适用于连续数据。
                    type: 'value'
                }],
                series: [
                    // 每一条线
                    {
                        name: '2015 降水量',
                        type: 'line',
                        // 显示在哪个轴上，默认为0
                        xAxisIndex: 1,
                        // 是否平滑显示曲线
                        smooth: true,
                        data: [0, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3]
                    }, {
                        name: '2016 降水量',
                        type: 'line',
                        smooth: true,
                        data: [3.9, 5.9, 11.1, 18.7, 48.3, 69.2, 231.6, 46.6, 55.4, 18.4, 10.3, 0.7]
                    }
                ]
            };
        },
    };
    Carnet.module["Map_init"] = Map_init;
})(jQuery, window)
