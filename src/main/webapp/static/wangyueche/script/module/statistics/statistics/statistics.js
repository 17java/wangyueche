/*!
 * Created by wangpeng on 2017/3/29.
 */
(function($) {
    //构造器
    function statistics(url) {
        this.server=new Carnet.module.server();
        this.listViewId='dataChart';
        this.url=url;
    };
    statistics.prototype = {
        constructor: statistics,
        init:function(){
            var _self=this;
            _self.bindEvents();
        },
        bindEvents:function(){
            var _self=this;
            _self.loadSearchTitle();
            _self.loadChart();
            //搜索
            $('#searchBtn').bind('click',function(){
                _self.loadChart();
            })
            //清除搜索框
            $('#clearBtn').bind('click', function () {
                _self.clearSearch();
            })
        },
        loadSearchTitle: function () {
            var _self = this;
            //公司名称
            cLib.base.list("company/name/list").done(function (data) {
                for (var key in data) {
                    $('#oCompany').append("<option value=" + key + ">" + data[key] + "</option>");
                }
            });
        },

        loadChart:function(){
            var _self=this;

            var subData={
                // lat:$('#sLat').val(),
                companyId: $('#oCompany').val(),
                startDate:$('#startDate').val(),
                endDate:$('#endDate').val()
            };

            if(_self.url.indexOf("carOrder")>0){
                //车辆接单量，一个柱状图，一个饼状图
                _self.server.dataChart(_self.url + "/col",subData).done(function(res){
                    var myChart = echarts.init(document.getElementById('dataChartCellCol'));
                    // 为echarts对象加载数据
                    if(res){
                        myChart.setOption(res);
                    }
                })
                _self.server.dataChart(_self.url + "/pie",subData).done(function(res){
                    var myChart = echarts.init(document.getElementById('dataChartCellPie'));
                    // 为echarts对象加载数据
                    if(res){
                        myChart.setOption(res);
                    }
                })
            }
            //普通统计分析，只有一个柱状图
            else {
                _self.server.dataChart(_self.url,subData).done(function(res){
                    var myChart = echarts.init(document.getElementById(_self.listViewId));
                    // 为echarts对象加载数据
                    if(res){
                        myChart.setOption(res);
                    }
                })
            }

        },

        //清除搜索框内容
        clearSearch: function () {
            // $("#oCompany option:contains('请选择')").attr('selected', true);
            $('#oCompany').val("");
            $('#startDate').val("");
            $('#endDate').val("");
        }
    }
    //将服务模型添加到全局变量中
    Carnet.module["statistics"] = statistics;
})(jQuery);