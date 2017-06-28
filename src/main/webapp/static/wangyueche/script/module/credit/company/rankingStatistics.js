/*!
 * Created by wangpeng on 2017/3/29.
 */
(function($) {
    //构造器
    function rankingStatistics() {
        this.server=new Carnet.module.server();
        this.listViewId='dataChart';
    };
    rankingStatistics.prototype = {
        constructor: rankingStatistics,
        init:function(){
            var _self=this;
            _self.bindEvents();
        },
        bindEvents:function(){
            var _self=this;
            // _self.loadSearchTitle();
            _self.loadChart();
            // //搜索
            // $('#searchBtn').bind('click',function(){
            //     _self.loadChart();
            // })
            // //清除搜索框
            // $('#clearBtn').bind('click', function () {
            //     _self.clearSearch();
            // })
        },
        // loadSearchTitle: function () {
        //     var _self = this;
        //     //公司名称
        //     cLib.base.list("company/name/list").done(function (data) {
        //         for (var key in data) {
        //             $('#oCompany').append("<option value=" + key + ">" + data[key] + "</option>");
        //         }
        //     });
        // },

        loadChart:function(){
            var _self=this;

            // var subData={
            //     // lat:$('#sLat').val(),
            //     companyId: $('#oCompany').val(),
            //     startDate:$('#startDate').val(),
            //     endDate:$('#endDate').val()
            // };

                _self.server.dataChart('/credit/company/rankingStatistics/star').done(function(res){
                    var myChart = echarts.init(document.getElementById('dataChartCellStar'));
                    // 为echarts对象加载数据
                    if(res){
                        myChart.setOption(res);
                    }
                });
                _self.server.dataChart('/credit/company/rankingStatistics/satisfaction').done(function(res){
                    var myChart = echarts.init(document.getElementById('dataChartCellSati'));
                    // 为echarts对象加载数据
                    if(res){
                        myChart.setOption(res);
                    }
                });

        },

        //清除搜索框内容
        // clearSearch: function () {
        //     // $("#oCompany option:contains('请选择')").attr('selected', true);
        //     $('#oCompany').val("");
        //     $('#startDate').val("");
        //     $('#endDate').val("");
        // }
    }
    //将服务模型添加到全局变量中
    Carnet.module["rankingStatistics"] = rankingStatistics;
})(jQuery);