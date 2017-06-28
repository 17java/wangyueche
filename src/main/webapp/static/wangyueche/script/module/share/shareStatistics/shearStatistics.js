/**
 * Created by Wyan_ on 2017/5/16.
 */
/*!
 * Created by wangpeng on 2017/3/29.
 */
(function ($) {
    //构造器
    function shearStatistics(url) {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataChart';
        this.url = url;
    };
    shearStatistics.prototype = {
        constructor: shearStatistics,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            _self.loadSearchTitle();
            _self.loadChart();
            //搜索
            $('#searchBtn').bind('click', function () {
                _self.loadChart();
            })
            //清除搜索框
            $('#clearBtn').bind('click', function () {
                _self.clearSearch();
            })
        },
        loadSearchTitle: function () {
            //公司名称
            cLib.base.list("share/company/names").done(function (data) {
                for (var key in data) {
                    $('#oCompany').append("<option value=" + key + ">" + data[key] + "</option>");
                }
            });
        },

        loadChart: function () {
            var _self = this;
            var subData = {
                companyId: $('#oCompany').val(),
                startDate: $('#startDate').val(),
                endDate: $('#endDate').val()
            };
            _self.server.dataChart(_self.url, subData).done(function (res) {
                var myChart = echarts.init(document.getElementById(_self.listViewId));
                // 为echarts对象加载数据
                if (res) {
                    myChart.setOption(res);
                }
            })

        },

        //清除搜索框内容
        clearSearch: function () {
            // $("#oCompany option:contains('请选择')").attr('selected', true);
            $("#oCompany").val("");
            $('#startDate').val("");
            $('#endDate').val("");
        }
    }
    //将服务模型添加到全局变量中
    Carnet.module["shearStatistics"] = shearStatistics;
})(jQuery);