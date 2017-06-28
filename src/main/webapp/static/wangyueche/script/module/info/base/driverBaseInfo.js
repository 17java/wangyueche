/**
 * Created by wangpeng on 2017/4/20.
 */
(function ($) {
    //构造器
    function driverBaseInfo(type) {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
        this.type = type;
    };
    driverBaseInfo.prototype = {
        constructor: driverBaseInfo,
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
                case "info"://驾驶员基本信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#sCompanyName').val("");
                    $("#sDriverLicenceNo").val("");
                    $('#sDriverLicenceName').val("");
                    $('#sState').val("");
                    break;
                case "educate"://驾驶员培训信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#sCompanyName').val("");
                    $("#sDriverLicenceNo").val("");
                    $('#sCourseName').val("");
                    break;
                case "app"://驾驶员移动终端信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#sCompanyName').val("");
                    $("#sDriverPhone").val("");
                    $('#sState').val("");
                    break;
                case "stat"://驾驶员统计信息
                    // $("#sCompanyName option:contains('请选择')").attr('selected', true);
                    $('#sCompanyName').val("");
                    $("#sDriverLicenceNo").val("");
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
                case "info"://驾驶员基本信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'licenseId', title: '驾驶证号', width: '15%'},
                        {field: 'address', title: '行政区划', width: '12%'},
                        {field: 'driverName', title: '驾驶员姓名', width: '12%'},
                        {field: 'driverPhone', title: '驾驶员电话', width: '12%'},
                        {
                            field: 'driverGender', title: '驾驶员性别', width: '8%',
                            formatter: function (value, row, index) {
                                if (value == "0") {
                                    return "女";
                                }
                                if (value == "1") {
                                    return "男";
                                }
                                return "未录入";
                            }
                        },
                        {
                            field: 'driverBirthday', title: '出生日期', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {field: 'driverNationality', title: '国籍', width: '12%'},
                        {field: 'driverNation', title: '驾驶员民族', width: '8%'},
                        {field: 'driverMaritalStatus', title: '驾驶员婚姻状况', width: '12%'},
                        {field: 'driverLanguageLevel', title: '驾驶员外语能力', width: '12%'},
                        {field: 'driverEducation', title: '驾驶员学历', width: '12%'},
                        {field: 'driverCensus', title: '户口', width: '20%'}
                    ]];
                    break;
                case "educate"://驾驶员培训信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'licenseId', title: '驾驶证号', width: '15%'},
                        {field: 'licenseId', title: '驾驶证号', width: '15%'},
                        {field: 'address', title: '行政区划', width: '12%'},
                        {field: 'courseName', title: '驾驶员培训课程名称', width: '20%'},
                        {
                            field: 'courseDate', title: '培训课程日期', width: '20%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {
                            field: 'startTime', title: '培训开始时间', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));

                        }
                        },
                        {
                            field: 'stopTime', title: '培训结束时间', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {field: 'duration', title: '培训时长（h）', width: '20%'},
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
                            field: 'updatetime', title: '更新时间', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        }
                    ]];
                    break;
                case "app"://驾驶员移动终端信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'licenseId', title: '驾驶证号', width: '15%'},
                        {field: 'address', title: '行政区划', width: '12%'},
                        {field: 'driverPhone', title: '驾驶员手机号', width: '12%'},
                        {
                            field: 'netType', title: '手机运营商', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 1)
                                    return "中国联通";
                                else if (value = 2)
                                    return "中国移动";
                                else if (value == 3)
                                    return "中国电信";
                                else if (value == 4)
                                    return "其他";
                                else return "未录入";
                            }
                        },
                        {field: 'appVersion', title: '使用APP版本号', width: '12%'},
                        {
                            field: 'mapType', title: '使用地图类型', width: '12%',
                            formatter: function (value, row, index) {
                                if (value == 1)
                                    return "百度地图";
                                else if (value = 2)
                                    return "高德地图";
                                else if (value == 3)
                                    return "其他";
                                else return "未录入";
                            }
                        },
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
                        }
                    ]];
                    break;
                case "stat"://驾驶员统计信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'licenseId', title: '驾驶证号', width: '15%'},
                        {field: 'address', title: '行政区划', width: '12%'},
                        {field: 'cycle', title: '统计周期（月）', width: '12%'},
                        {field: 'orderCount', title: '完成订单次数', width: '10%'},
                        {field: 'trafficViolationCount', title: '交通违章次数', width: '10%'},
                        {field: 'complainedCount', title: '被投诉次数', width: '10%'},
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
                            field: 'updateTime', title: '更新时间', width: '17%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        }
                    ]];
                    break;

            }

        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({
                url: Carnet.basePrefixURL + '/driver/' + _self.type + '/list',// 加载的URL
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
                    var licenseId = $("#sDriverLicenceNo").val();
                    var driverName = $("#sDriverLicenceName").val();
                    var state = $("#sState").val();
                    param = {
                        address: address,
                        companyId: companyId,
                        licenseId: licenseId,
                        driverName: driverName,
                        state: state
                    }
                    break;
                case 'educate':
                    var address = $("#sArea").val();
                    var companyId = $("#sCompanyName").val();
                    var licenseId = $("#sDriverLicenceNo").val();
                    var courseName = $("#sCourseName").val();
                    param = {
                        address: address,
                        companyId: companyId,
                        licenseId: licenseId,
                        courseName: courseName
                    }
                    break;
                case 'app':
                    var address = $("#sArea").val();
                    var companyId = $("#sCompanyName").val();
                    var driverPhone = $("#sDriverPhone").val();
                    var state = $("#sState").val();
                    param = {
                        address: address,
                        companyId: companyId,
                        driverPhone: driverPhone,
                        state: state
                    }
                    break;
                case 'stat':
                    var address = $("#sArea").val();
                    var companyId = $("#sCompanyName").val();
                    var licenseId = $("#sDriverLicenceNo").val();
                    param = {
                        address: address,
                        companyId: companyId,
                        licenseId: licenseId
                    }
                    break;
            }

            _self.loadDataGrid(param);
        },

    }
    //将服务模型添加到全局变量中
    Carnet.module["driverBaseInfo"] = driverBaseInfo;
})(jQuery);