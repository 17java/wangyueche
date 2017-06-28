/**
 * 车辆运营上下线
 */
(function ($) {
    //构造器
    function beyondOperatelist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    }

    beyondOperatelist.prototype = {
        constructor: beyondOperatelist,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            _self.loadDataGrid();
            // 搜索
            $('#searchBtn').bind('click', function () {
                _self.loadSearch();
            })
            //清除搜索框
            $('#clearBtn').bind('click', function () {
                _self.clearSearch();
            })
        },
        //设置表格表头
        loadGridTitle: function () {
            var _self = this;
            _self.listTypeShow = [[
                {field: 'companyName', title: '公司名称', width: '24%'},
                {field: 'orderId', title: '订单号', width: '15%'},
                {field: 'driverName', title: '驾驶员', width: '8%'},
                {field: 'licenseId', title: '驾驶证编号', width: '15%'},
                {field: 'vehicleNo', title: '车牌号', width: '8%'},
                {field: 'onArea', title: '归属区划', width: '8%'},
                {field: 'fareType', title: '运价类型', width: '8%'},
                {
                    field: 'bookDepTime', title: '订单发起时间', width: '12%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'depTime', title: '出发时间', width: '12%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'depArea', title: '出发地址', width: '38%'},
                {field: 'depLongitude', title: '出发经度', width: '10%'},
                {field: 'depLatitude', title: '触发纬度', width: '10%'},
                {
                    field: 'destTime', title: '到达时间', width: '12%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'destArea', title: '目的地址', width: '20%'},
                {field: 'destLongitude', title: '目的地经度', width: '10%'},
                {field: 'destLatitude', title: '目的地纬度', width: '10%'},
                {field: 'driveMile', title: '行驶距离', width: '8%'},
                {field: 'driveTime', title: '行驶时间', width: '8%'},
                {field: 'waitMile', title: '等待距离', width: '8%'},
                {field: 'factPrice', title: '实际付款', width: '8%'},
                {field: 'price', title: '应付金额', width: '8%'},
                {field: 'cashPrice', title: '现金付款', width: '10%'},
                {field: 'lineName', title: '账户名称', width: '10%'},
                {field: 'linePrice', title: '账户金额', width: '10%'},
                {field: 'benfitPrice', title: '优惠金额', width: '10%'},
                {field: 'bookTip', title: '订单备注', width: '15%'},
                {field: 'passengerTip', title: '乘客备注', width: '15%'},
                {field: 'peakUpPrice', title: '早高峰价格', width: '10%'},
                {field: 'nightUpPrice', title: '晚高峰价格', width: '10%'},

                {field: 'farUpPrice', title: '远程高峰价格', width: '12%'},
                {field: 'otherUpPrice', title: '其他高峰价格', width: '12%'},
                {
                    field: 'payState', title: '付款状态', width: '10%',
                    formatter: function (value, row, index) {
                        if (value == 1)
                            return "已付款";
                        else if (value == 0)
                            return "未付款";
                        else
                            return "状态未知";
                    }
                },
                {
                    field: 'payTime', title: '付款时间', width: '16%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'orderMatchTime', title: '订单完成时间', width: '16%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'encrypt', title: '坐标加密', width: '15%',
                    formatter: function (value, row, index) {
                        if (value == 1)
                            return "GCJ-02 测绘局标准";
                        else if (value == 2)
                            return "WGS84 GPS标准";
                        else if (value == 3)
                            return "BD-09 百度标准";
                        else if (value == 0)
                            return "BD-09 其他";
                        else
                            return "未录入";
                    }
                }
            ]];
        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                url: '/wangyueche/operation/beyondOperate/list',// 加载的URL
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
                columns: _self.listTypeShow,
                frozenColumns: _self.frozenListShow
            });
        },
        //搜索
        loadSearch: function () {
            var _self = this;
            var vehicleNo = $("#oInfo").val();
            var startDate = $("#startDate").val();
            var endDate = $("#endDate").val();

            var param = {
                vehicleNo: vehicleNo,
                startDate: startDate,
                endDate: endDate
            }
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            $('#oInfo').val("");
            $('#startDate').val("");
            $('#endDate').val("");
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["beyondOperatelist"] = beyondOperatelist;
})(jQuery);
