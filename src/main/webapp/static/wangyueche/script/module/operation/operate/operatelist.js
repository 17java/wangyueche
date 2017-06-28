/**
 * Created by Wyan_ on 2017/4/22.
 * 企业运营数据
 */
(function ($) {
    //构造器
    function operatelist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    operatelist.prototype = {
        constructor: operatelist,
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
                {field: 'companyName', title: '公司名称', width: '24%'},
                {field: 'orderId', title: '订单号', width: '15%'},
                {field: 'driverName', title: '驾驶员', width: '10%'},
                {field: 'licenseId', title: '驾驶证编号', width: '15%'},
                {field: 'vehicleNo', title: '车牌号', width: '10%'},
                {field: 'onArea', title: '归属区划', width: '10%'},
                {field: 'fareType', title: '运价类型', width: '10%'},
                {
                    field: 'bookDepTime', title: '订单发起时间', width: '14%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'depTime', title: '出发时间', width: '14%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'depArea', title: '出发地址', width: '38%'},
                {field: 'depLongitude', title: '出发经度', width: '10%'},
                {field: 'depLatitude', title: '触发纬度', width: '10%'},
                {
                    field: 'destTime', title: '到达时间', width: '14%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'destArea', title: '目的地址', width: '30%'},
                {field: 'destLongitude', title: '目的地经度', width: '10%'},
                {field: 'destLatitude', title: '目的地纬度', width: '10%'},
                {field: 'driveMile', title: '行驶距离', width: '10%'},
                {
                    field: 'driveTime', title: '行驶时间(分)', width: '10%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },

                {field: 'waitMile', title: '等待距离', width: '10%'},
                {field: 'factPrice', title: '实际付款', width: '10%'},
                {field: 'price', title: '应付金额', width: '10%'},
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
                    field: 'payTime', title: '付款时间', width: '14%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'orderMatchTime', title: '订单完成时间', width: '14%', formatter: function (value, row, index) {
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

                //url路径识别不了
                url: '/wangyueche/operation/operate/list',// 加载的URL
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
                case "1":
                    vehicleNo = $("#oInfo").val();
                    break;
                case "1":
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
    Carnet.module["operatelist"] = operatelist;
})(jQuery);
