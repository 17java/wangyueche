/**
 * Created by Wyan_ on 2017/6/1.
 */
(function ($) {
    //构造器
    function alarmList() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    alarmList.prototype = {
        constructor: alarmList,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            _self.loadSearchTitle();
            _self.loadDataGrid();
            // 搜索
            $('#searchBtn').bind('click', function () {
                _self.loadSearch();
            });
            //清除搜索框
            $('#clearBtn').bind('click', function () {
                _self.clearSearch();
            })
        },
        //设置搜索条件栏
        loadSearchTitle: function () {
            //公司名称
            cLib.base.list("share/company/names").done(function (data) {
                for (var key in data) {
                    $('#oCompany').append("<option value=" + key + ">" + data[key] + "</option>");
                }
            });
        },

        //设置表格表头
        loadGridTitle: function () {
            var _self = this;
            _self.listTypeShow = [[
                // {field: 'content', title: '内容', width: '12%'},
                {
                    field: 'type', title: '告警类型', width: '15%',
                    formatter: function (value) {
                        if (value == 0)
                            return "报备";
                        else if (value == 1)
                            return "异常聚集";
                        else if (value == 2)
                            return "超运营";
                        else if (value == 3)
                            return "人车分离";
                        else
                            return "未录入";
                    }
                },
                {field: 'num', title: '告警等级', width: '12%'},
                {
                    field: 'date', title: '时间', width: '18%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.formatterDateDay(value));
                }
                },
                {field: 'remark', title: '备注', width: '10%'},
                {field: 'vehicleLongitude', title: '告警车辆经度', width: '11%'},
                {field: 'vehicleLatitude', title: '告警车辆纬度', width: '11%'},
                {field: 'driverLongitude', title: '告警驾驶员经度', width: '11%'},
                {field: 'driverLatitude', title: '告警驾驶员纬度', width: '11%'}
            ]];
        },
        //加载表格数据
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                url: '/wangyueche/operation/alarm/list',// 加载的URL
                method: 'get',
                isField: "id",
                onLoadSuccess: function (data) {
                    cLib.base.setLangChina(_self.listViewId);//设置中文显示
                    //清除没有记录时重复显示的问题
                    if ($('#hasNoneData')) {
                        $('#hasNoneData').remove();
                    }
                    if (data.total == 0) {
                        $('.datagrid-view').append('<div id = "hasNoneData" style="text-align:center;padding-top:40px;" class="searchnodata">没有找到相关记录</div>');
                    }
                },
                height: $('#contentIn', window.parent.document).height() - 200,
                width: '100%',
                singleSelect: true,
                rownumbers: true,
                queryParams: data || {},
                loadMsg: "查询数据请稍候。。。",
                pagination: true,// 显示分页
                pageSize: 20,// 分页大小
                pageList: [10, 20, 30, 40, 50],// 每页的个数
                fit: false,// 自动补全
                fitColumns: true,
                title: '',
                iconCls: "icon-save",// 图标
                columns: _self.listTypeShow
                // frozenColumns: _self.frozenListShow
            });
        },
        //搜索
        loadSearch: function () {
            var _self = this;
            // type, startDate, endDate)
            var type = $("#type").val();
            var startDate = $("#startDate").val();
            var endDate = $("#endDate").val();

            var param = {
                type: type,
                startDate: startDate,
                endDate: endDate
            };
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            $("#type").val("");
            $('#startDate').val("");
            $('#endDate').val("");
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["alarmList"] = alarmList;
})(jQuery);
