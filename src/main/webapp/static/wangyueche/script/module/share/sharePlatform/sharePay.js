/**
 * Created by Wyan_ on 2017/5/15.
 */
(function ($) {
    //构造器
    function sharePay() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    sharePay.prototype = {
        constructor: sharePay,
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
            })
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
            _self.frozenListShow = [[
                {field: 'routeId', title: '驾驶员发起行程编号', width: '15%'},
                {field: 'orderId', title: '乘客合乘订单号', width: '10%'}
            ]];
            _self.listTypeShow = [[
                {field: 'companyName', title: '公司名称', width: '24%'},
                {field: 'address', title: '归属区划', width: '8%'},

                {field: 'driverPhone', title: '驾驶员手机号', width: '12%'},
                {field: 'licenseId', title: '驾驶证编号', width: '12%'},
                {field: 'vehicleNo', title: '车辆号牌', width: '12%'},
                {field: 'fareType', title: '运价类型', width: '8%'},
                {
                    field: 'bookDepartTime', title: '预计上车时间', width: '12%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'departTime', title: '预计用车时间', width: '12%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'departure', title: '上车地点', width: '20%'},
                {field: 'depLongitude', title: '上车经度', width: '11%'},
                {field: 'depLatitude', title: '上车纬度', width: '11%'},
                {
                    field: 'destTime', title: '下车时间', width: '12%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },

                {field: 'destination', title: '下车地点', width: '11%'},
                {field: 'destLongitude', title: '下车经度', width: '11%'},
                {field: 'destLatitude', title: '下车纬度', width: '11%'},
                {field: 'encrypt', title: '坐标加密标识', width: '11%'},
                {field: 'driveMile', title: '载客里程(km)', width: '11%'},
                {
                    field: 'driveTime', title: '载客时间(min)', width: '11%', formatter: function (value) {
                    return value / 60;
                }
                },
                {field: 'facePrice', title: '实收金额', width: '11%'},
                {field: 'price', title: '应收金额', width: '11%'},
                {field: 'cashPrice', title: '现金支付金额', width: '11%'},
                {field: 'lineName', title: '电子支付机构', width: '11%'},
                {field: 'linePrice', title: '电子支付金额', width: '11%'},
                {field: 'benfitPrice', title: '优惠金额', width: '11%'},
                {field: 'shareFueFee', title: '燃料成本分摊金额', width: '11%'},
                {field: 'shareHighwayToll', title: '路桥通行分摊金额', width: '11%'},
                {field: 'passengerTip', title: '附加费', width: '11%'},
                {field: 'shareOther', title: '其他费用分摊金额', width: '11%'},
                {
                    field: 'payState', title: '结算状态', width: '11%',
                    formatter: function (value) {
                        if (value == 0)
                            return "未结算";
                        else if (value == 1)
                            return "已结算";
                        else if (value == 2)
                            return "未知";
                        else
                            return "录入错误";
                    }
                },
                {field: 'passengerNum', title: '乘客人数', width: '11%'},
                {
                    field: 'payTime', title: '乘客结算时间', width: '12%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'orderMatchTime', title: '订单完成时间', width: '12%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                }
            ]];
        },
        //加载表格数据
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                url: '/wangyueche/share/pay',// 加载的URL
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
            // companyId, routeId, orderId, driverPhone, vehicleNo

            var companyId = $("#oCompany").val();
            var routeId = $("#routeId").val();
            var orderId = $("#orderId").val();
            var driverPhone = $("#driverPhone").val();
            var vehicleNo = $("#vehicleNo").val();

            var param = {
                companyId: companyId,
                routeId: routeId,
                orderId: orderId,
                driverPhone: driverPhone,
                vehicleNo: vehicleNo
            };
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            $('#oCompany').val("");
            $('#routeId').val("");
            $('#orderId').val("");
            $('#driverPhone').val("");
            $('#vehicleNo').val("");
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["sharePay"] = sharePay;
})(jQuery);
