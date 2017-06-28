/**
 * Created by wangpeng on 2017/4/20.
 */
(function ($) {
    //构造器
    function carBaseInfo(type) {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
        this.type = type;
    };
    carBaseInfo.prototype = {
        constructor: carBaseInfo,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            _self.loadSearchTitle();
            _self.loadDataGrid();
            //搜索
            $('#searchBtn').bind('click', function () {
                _self.loadSearch();
            })
            //清除搜索框
            $('#clearBtn').bind('click', function () {
                _self.clearSearch();
            })
        },
        //清除搜索框内容
        clearSearch: function () {
            var _self = this;
            switch (_self.type) {
                case "info"://车辆基本信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#oCompany').val("");
                    $("#sCarNo").val("");
                    $('#sState').val("");
                    break;
                case "insurance"://车辆保险信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#oCompany').val("");
                    $("#sCarNo").val("");
                    $('#sInsuranceName').val("");
                    break;
                case "totalMile"://车辆里程信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#oCompany').val("");
                    $("#sCarNo").val("");
                    break;
            }
        },
        //设置搜索条件栏
        loadSearchTitle: function () {
            var _self = this;
            //归属区划
            cLib.base.list("region/list").done(function (data) {
                $.each(data, function (index, item) {
                    $("#sArea").append("<option value=" + item.regionCode + ">" + item.regionName + "</option>");
                });
            });
            //公司名称
            cLib.base.list("company/name/list").done(function (data) {
                for (var key in data) {
                    $('#sCompanyName').append("<option value=" + key + ">" + data[key] + "</option>");
                }
            });
        },
        //设置表格表头
        loadGridTitle: function () {
            var _self = this;
            switch (_self.type) {
                case "info"://车辆基本信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'address', title: '行政区划', width: '12%'},
                        {field: 'vehicleNo', title: '车牌号码', width: '15%'},
                        {field: 'seats', title: '核定载车位', width: '12%'},
                        {field: 'vehicleType', title: '车辆类型', width: '12%'},
                        {field: 'ownerName', title: '车辆所有人', width: '12%'},
                        {field: 'engineId', title: '发动机号', width: '12%'},
                        {field: 'fixState', title: '车辆检修状态', width: '12%'},
                        {
                            field: 'registerDate', title: '注册日期', width: '20%'
                            , formatter: function (value) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {field: 'fareType', title: '运价类型编码', width: '20%'},
                        {
                            field: 'CommercialType', title: '营运类型', width: '15%',
                            formatter: function (value, row, index) {
                                if (value == 1)
                                    return "网络预约出租车";
                                else if (value == 2)
                                    return "巡游出租车";
                                else if (value == 3)
                                    return "合乘车";
                                else
                                    return "未录入";
                            }
                        },
                        {
                            field: 'state', title: '状态', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 0)
                                    return "有效";
                                else if (value == 1)
                                    return "失效";
                                else return "未录入";
                            }
                        },
                        {
                            field: 'flag', title: '操作标识', width: '12%',
                            formatter: function (value) {
                                if (value == 1)
                                    return "新增";
                                else if (value == 2)
                                    return "更改";
                                else if (value == 3)
                                    return "删除";
                                else
                                    return "未录入";
                            }
                        },
                        {
                            field: 'updateTime', title: '更新时间', width: '20%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                    ]];
                    break;
                case "insurance"://车辆保险信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'vehicleNo', title: '车牌号码', width: '12%'},
                        {field: 'insurCom', title: '保险公司', width: '12%'},
                        {field: 'insurNum', title: '保险号', width: '15%'},
                        {field: 'insurType', title: '保险类型', width: '12%'},
                        {field: 'insurCount', title: '保险金额', width: '10%'},
                        {
                            field: 'insurEff', title: '保险生效时间', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {
                            field: 'flag', title: '操作标识', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 1)
                                    return "新增";
                                else if (value == 2)
                                    return "更改";
                                else if (value == 3)
                                    return "删除";
                                else
                                    return "未录入";
                            }
                        },
                        {
                            field: 'updateTime', title: '更新时间', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                    ]];
                    break;
                case "totalMile"://车辆里程信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'address', title: '注册地行政区划', width: '20%'}, // 见JT/T 697.7—2014中5.697
                        {field: 'vehicleNo', title: '车牌号码', width: '20%'},
                        {field: 'PlateColor', title: '车牌颜色', width: '20%'},//见JT/T 697.7—2014中5.6
                        {field: 'totalMile', title: '行驶总里程(km)', width: '20%'},
                        {
                            field: 'flag', title: '操作标识', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 1)
                                    return "新增";
                                else if (value == 2)
                                    return "更改";
                                else if (value == 3)
                                    return "删除";
                                else
                                    return "未录入";
                            }
                        },
                        {
                            field: 'updateTime', title: '更新时间', width: '20%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                    ]];
                    break;
            }

        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({
                url: Carnet.basePrefixURL + '/vehicle/' + _self.type + '/list',// 加载的URL
                method: 'get',
                idField: "id",
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
                rownumbers: true,
                singleSelect: false,
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
            });
        },
        //搜索
        loadSearch: function () {
            var _self = this;
            var param = {};
            switch (_self.type) {
                case 'info':
                    var address = $("#sArea").val();
                    var companyId = $("#sCompanyName").val();
                    var vehicleNo = $("#sCarNo").val();
                    var state = $("#sState").val();
                    param = {
                        address: address,
                        companyId: companyId,
                        vehicleNo: vehicleNo,
                        state: state
                    }
                    break;
                case 'insurance':
                    var address = $("#sArea").val();
                    var companyId = $("#sCompanyName").val();
                    var vehicleNo = $("#sCarNo").val();
                    var insurCom = $("#sInsuranceName").val();
                    param = {
                        address: address,
                        companyId: companyId,
                        vehicleNo: vehicleNo,
                        insurCom: insurCom
                    }
                    break;
                case 'totalMile':
                    var address = $("#sArea").val();
                    var companyId = $("#sCompanyName").val();
                    var vehicleNo = $("#sCarNo").val();
                    param = {
                        address: address,
                        companyId: companyId,
                        vehicleNo: vehicleNo
                    }
                    break;
            }

            _self.loadDataGrid(param);
        },

    }
    //将服务模型添加到全局变量中
    Carnet.module["carBaseInfo"] = carBaseInfo;
})(jQuery);