/**
 * Created by Wyan_ on 2017/4/22.
 * 订单业务信息
 */
(function ($) {
    //构造器
    function orderlist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    orderlist.prototype = {
        constructor: orderlist,
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
            var _self = this;
            //归属区划
            cLib.base.list("region/list").done(function (data) {
                $.each(data, function (index, item) {
                    $("#oArea").append("<option value=" + item.regionCode + ">" + item.regionName + "</option>");
                })
            });
            //公司名称
            cLib.base.list("company/name/list").done(function (data) {
                for (var key in data) {
                    $('#oCompany').append("<option value=" + key + ">" + data[key] + "</option>");
                }
            });
            //搜索类型和搜索框
            var searchType = "";
            $('#oType').change(function () {
                searchType = $('#oType').val();
                $('#sInfo').text($('#oType').find("option:selected").text() + "：");
            });
        },
        //设置表格表头
        loadGridTitle: function () {
            var _self = this;
            _self.listTypeShow = [[
                // {field: 'id', title: '序号', width: '4%'},
                {field: 'companyName', title: '公司名称', width: '24%'},
                {field: 'driverPhone', title: '联系方式', width: '12%'},
                {field: 'orderId', title: '订单号', width: '14%'},
                {field: 'vehicleNo', title: '车牌号', width: '12%'},
                {field: 'licenseId', title: '驾驶证编号', width: '15%'},
                {field: 'address', title: '归属区划', width: '8%'},
                {field: 'fareType', title: '运价类型', width: '6%'},
                {
                    field: 'orderTime', title: '订单发起时间', width: '14%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'distributeTime', title: '派单时间', width: '14%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'departTime', title: '预计用车时间', width: '14%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'departure', title: '预计出发地址', width: '30%'},
                {field: 'depLongitude', title: '预计出发经度', width: '11%'},
                {field: 'depLatitude', title: '预计出发纬度', width: '11%'},
                {field: 'destination', title: '预计目的地', width: '30%'},
                {field: 'destLongitude', title: '预计目的地经度', width: '12%'},
                {field: 'destLatitude', title: '预计目的地纬度', width: '12%'},
                {field: 'longitude', title: '上线经度', width: '8%'},
                {field: 'latitude', title: '上线纬度', width: '8%'},
                {
                    field: 'encrypt', title: '坐标加密', width: '12%',
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
                },
                {field: 'passengerNote', title: '乘客备注', width: '8%'},
                {
                    field: 'operator', title: '取消发起方', width: '9%',
                    formatter: function (value, row, index) {
                        if (value == 1)
                            return "乘客";
                        else if (value == 2)
                            return "驾驶员";
                        else if (value == 3)
                            return "平台公司";
                        else
                            return "未录入";
                    }
                },
                {
                    field: 'cancelTime', title: '取消时间', width: '16%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'cancelTypeCode', title: '取消类型', width: '12%',
                    formatter: function (value, row, index) {
                        if (value == 1)
                            return "乘客提前撤销";
                        else if (value == 2)
                            return "驾驶员提前撤销";
                        else if (value == 3)
                            return "平台公司撤销";
                        else if (value == 4)
                            return "驾驶员违约撤销";
                        else
                            return "未录入";
                    }
                },
                {field: 'cancelReason', title: '取消原因', width: '30%'},
            ]];
        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                //url路径识别不了
                url: '/wangyueche/operation/order/list',// 加载的URL
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
                // frozenColumns: _self.frozenListShow
            });
        },
        //搜索
        loadSearch: function () {
            var _self = this;
            var address = $("#oArea").val();
            var companyId = $("#oCompany").val();
            var orderId, licenseId, vehicleNo, driverPhone = "";
            var type = $("#oType").val();
            var startDate = $("#startDate").val();
            var endDate = $("#endDate").val();
            switch (type) {
                case "0":
                    orderId = $("#oInfo").val();
                    break;
                case "1":
                    licenseId = $("#oInfo").val();
                    break;
                case "2":
                    vehicleNo = $("#oInfo").val();
                    break;
                case "3":
                    driverPhone = $("#oInfo").val();
                    break;
                default:
                    break;

            }
            var param = {
                address: address,
                companyId: companyId,
                orderId: orderId,
                licenseId: licenseId,
                vehicleNo: vehicleNo,
                driverPhone: driverPhone,
                startDate: startDate,
                endDate: endDate
            }
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            // $("#oCompany option:contains('请选择')").attr('selected', true);
            $('#oCompany').val("");
            $('#oInfo').val("");
            $('#startDate').val("");
            $('#endDate').val("");
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["orderlist"] = orderlist;
})(jQuery);
