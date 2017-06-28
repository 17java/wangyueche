/**
 * Created by wangpeng on 2017/4/20.
 */
(function ($) {
    //构造器
    function platformBaseInfo(type) {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
        this.type = type;
    };
    platformBaseInfo.prototype = {
        constructor: platformBaseInfo,
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
                case "info"://平台基本信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#sCompanyName').val("");
                    $('#sState').val("");
                    break;
                case "permit"://平台经营许可信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#sCompanyName').val("");
                    $('#sState').val("");
                    break;
                case "scale"://平台营运规模信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#sCompanyName').val("");
                    break;
                case "pay"://平台支付信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#sCompanyName').val("");
                    $('#sState').val("");
                    break;
                case "service"://平台服务机构
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#sCompanyName').val("");
                    $("#sAgencyName").val("");
                    $('#sState').val("");
                    break;
                case "fare"://平台运价信息
                    //$("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#sCompanyName').val("");
                    $("#sFareType").val("");
                    $('#sState').val("");
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
                case "info"://平台基本信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '26%'},
                        {field: 'identifier', title: '统一社会信用代码', width: '15%'},
                        {field: 'address', title: '注册地行政区划', width: '12%'},
                        {field: 'contactAddress', title: '通信地址', width: '22%'},
                        {field: 'economicType', title: '经营业户经济类型', width: '20%'},
                        {field: 'regCapital', title: '注册资本', width: '12%'},
                        {field: 'legalName', title: '法人代表姓名', width: '12%'},
                        {field: 'legalId', title: '法人代表身份证号', width: '15%'},
                        {field: 'legalPhone', title: '法人代表电话', width: '12%'},
                        {field: 'legalPhoto', title: '法人代表身份证扫描文件', width: '20%'},
                        {
                            field: 'state', title: '状态', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 0)
                                    return "有效";
                                else if (value = 1)
                                    return "失效";
                                else return "未录入";
                            }
                        },
                        {
                            field: 'flag', title: '操作标识', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 1)
                                    return "新增";
                                else if (value = 2)
                                    return "更新";
                                else if (value == 3)
                                    return "删除";
                                else return "未录入";
                            }
                        },
                    ]];
                    break;
                case "permit"://平台经营许可信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '22%'},
                        {field: 'address', title: '许可地行政区划', width: '12%'},
                        {field: 'certificate', title: '网络预约出租汽车经营许可证号', width: '25%'},
                        {field: 'operationArea', title: '经营区域', width: '10%'},
                        {field: 'ownerName', title: '业户名称', width: '25%'},
                        {field: 'organization', title: '发证机构名称', width: '20%'},
                        {
                            field: 'startDate', title: '有效期起', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {
                            field: 'stopDate', title: '有效期止', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {
                            field: 'certifyDate', title: '初次发证日期', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {
                            field: 'state', title: '证照状态', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 0)
                                    return "有效";
                                else if (value = 1)
                                    return "失效";
                                else return "未录入";
                            }
                        },
                        {
                            field: 'flag', title: '操作标识', width: '8%',
                            formatter: function (value, row, index) {
                                if (value == 1)
                                    return "新增";
                                else if (value = 2)
                                    return "更新";
                                else if (value == 3)
                                    return "删除";
                                else return "未录入";
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
                case "scale"://平台营运规模信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '22%'},
                        {field: 'vehicleNum', title: '平台注册网约车辆数', width: '22%'},
                        {field: 'driverNum', title: '平台注册驾驶员数', width: '20%'},
                        {
                            field: 'flag', title: '操作标识', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 1)
                                    return "新增";
                                else if (value = 2)
                                    return "更新";
                                else if (value == 3)
                                    return "删除";
                                else return "未录入";
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
                case "pay"://平台支付信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '22%'},
                        {field: 'payName', title: '银行或者非银行支付机构名称', width: '20%'},
                        {field: 'payId', title: '非银行支付机构支付业务许可证编号', width: '20%'},
                        {field: 'payType', title: '支付业务类型', width: '55%'},
                        {field: 'payScope', title: '业务覆盖范围', width: '50%'},
                        {field: 'prepareBank', title: '备付金存管银行', width: '22%'},
                        {field: 'countDate', title: '结算周期（天）', width: '12%'},
                        {
                            field: 'state', title: '状态', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 0)
                                    return "有效";
                                else if (value = 1)
                                    return "失效";
                                else return "未录入";
                            }
                        },
                        {
                            field: 'flag', title: '操作标识', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 1)
                                    return "新增";
                                else if (value = 2)
                                    return "更新";
                                else if (value == 3)
                                    return "删除";
                                else return "未录入";
                            }
                        },
                        {
                            field: 'updateTime', title: '更新时间', width: '15%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                    ]];
                    break;
                case "service"://平台服务机构
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '22%'},
                        {field: 'address', title: '行政区划', width: '12%'},
                        {field: 'serviceName', title: '服务机构名称', width: '22%'},
                        {field: 'serviceNo', title: '服务机构代码', width: '15%'},
                        {field: 'detailAddress', title: '服务机构地址', width: '20%'},
                        {field: 'responsibleName', title: '服务机构负责人姓名', width: '15%'},
                        {field: 'responsiblePhone', title: '负责人电话', width: '12%'},
                        {field: 'managerName', title: '服务机构管理人姓名', width: '15%'},
                        {field: 'managerPhone', title: '管理人电话', width: '12%'},
                        {field: 'contactPhone', title: '服务机构紧急联系电话', width: '20%'},
                        {field: 'mailAddress', title: '行政文书送达邮寄地址', width: '23%'},
                        {
                            field: 'state', title: '状态', width: '8%',
                            formatter: function (value, row, index) {
                                if (value == 0)
                                    return "有效";
                                else if (value = 1)
                                    return "失效";
                                else return "未录入";
                            }
                        },
                        {
                            field: 'flag', title: '操作标识', width: '8%',
                            formatter: function (value, row, index) {
                                if (value == 1)
                                    return "新增";
                                else if (value = 2)
                                    return "更新";
                                else if (value == 3)
                                    return "删除";
                                else return "未录入";
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
                case "fare"://平台运价信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '22%'},
                        {field: 'address', title: '行政区划', width: '12%'},
                        {field: 'fareType', title: '运价类型', width: '12%'},
                        {field: 'fareTypeNote', title: '运价类型说明', width: '20%'},
                        {
                            field: 'fareValidOn', title: '运价有效期起', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {
                            field: 'fareValidOff', title: '运价有效期止', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {field: 'startFare', title: '起步价(元)', width: '12%'},
                        {field: 'startMile', title: '起步里程(km)', width: '12%'},
                        {field: 'upPrice', title: '单程加价单价(元)', width: '12%'},
                        {field: 'upPriceStartMile', title: '单程加价公里(km)', width: '12%'},
                        {
                            field: 'morningPeakTimeOn', title: '营运早高峰时间起', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {
                            field: 'morningPeakTimeOff', title: '营运早高峰时间止', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {
                            field: 'eveningPeakTimeOn', title: '营运晚高峰时间起', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {
                            field: 'eveningPeakTimeOff', title: '营运晚高峰时间止', width: '16%'
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
                url: Carnet.basePrefixURL + '/company/' + _self.type + '/list',// 加载的URL
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
                    var companyId = $("#sCompanyName").val();
                    var state = $("#sState").val();
                    param = {
                        companyId: companyId,
                        state: state
                    }
                    break;
                case 'permit':
                    var companyId = $("#sCompanyName").val();
                    var state = $("#sState").val();
                    var address = $('#sArea').val();
                    param = {
                        companyId: companyId,
                        state: state,
                        address: address
                    }
                    break;
                case 'scale':
                    var companyId = $("#sCompanyName").val();
                    param = {
                        companyId: companyId
                    }
                    break;
                case 'pay':
                    var companyId = $("#sCompanyName").val();
                    var state = $("#sState").val();
                    param = {
                        companyId: companyId,
                        state: state
                    }
                    break;
                case 'service':
                    var companyId = $("#sCompanyName").val();
                    var serviceName = $("#sAgencyName").val();
                    var state = $("#sState").val();
                    var address = $('#sArea').val();
                    param = {
                        companyId: companyId,
                        state: state,
                        serviceName: serviceName,
                        address: address
                    }
                    break;
                case 'fare':
                    var companyId = $("#sCompanyName").val();
                    var state = $("#sState").val();
                    var address = $('#sArea').val();
                    var fareType = $('#sFareType').val();
                    param = {
                        companyId: companyId,
                        state: state,
                        address: address,
                        fareType: fareType
                    }
                    break;
            }

            _self.loadDataGrid(param);
        },

    }
    //将服务模型添加到全局变量中
    Carnet.module["platformBaseInfo"] = platformBaseInfo;
})(jQuery);