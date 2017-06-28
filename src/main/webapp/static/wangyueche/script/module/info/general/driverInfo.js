/**
 * Created by wangpeng on 2017/4/1.
 */
(function ($) {
    //构造器
    function driverInfo() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    driverInfo.prototype = {
        constructor: driverInfo,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            _self.loadSearchTitle();
            //加载底部默认的表格内容
            _self.loadDefaultTable('educate');
            // _self.fillData();
            $('.tableTab').bind('click', function () {
                //加载底部默认的表格内容
                _self.loadDefaultTable($(this).attr('tablename'));
                $(this).siblings().removeClass('active');
                $(this).addClass('active');
            })
            $('#searchBtn').bind('click', function () {
                //加载底部默认的表格内容
                _self.loadDefaultTable('educate');
                _self.fillData();
            })
            //清除搜索框
            $('#clearBtn').bind('click', function () {
                _self.clearSearch();
            })
        },
        //清除搜索框内容
        clearSearch: function () {
            var _self = this;
            // $("#sCompanyName option:contains('请选择')").attr('selected', true);
            $('#sCompanyName').val("");
            $("#sDriverLicense").val("");
            $("#sDriverPhone").val("");
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
        loadGridTitle: function (tableName) {
            var _self = this;
            switch (tableName) {
                case 'educate'://培训信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'licenseId', title: '驾驶证号', width: '15%'},
                        {field: 'address', title: '行政区划', width: '8%'},
                        {field: 'courseName', title: '驾驶员培训课程名称', width: '20%'},
                        {
                            field: 'courseDate', title: '培训课程日期', width: '16%'
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
                        {field: 'duration', title: '培训时长(h)', width: '8%'},
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
                            field: 'updatetime', title: '更新时间', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value)); 
                        }
                        }
                    ]];
                    break;
                case 'app'://移动终端信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'licenseId', title: '驾驶证号', width: '15%'},
                        {field: 'address', title: '行政区划', width: '8%'},
                        {field: 'driverPhone', title: '驾驶员手机号', width: '10%'},
                        {
                            field: 'netType', title: '手机运营商', width: '8%',
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
                        {field: 'appVersion', title: '使用APP版本号', width: '10%'},
                        {
                            field: 'mapType', title: '使用地图类型', width: '10%',
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
                            field: 'state', title: '状态', width: '7%',
                            formatter: function (value, row, index) {
                                if (value == 0)
                                    return "有效";
                                else if (value = 1)
                                    return "失效";
                                else return "未录入";
                            }
                        },
                        {
                            field: 'flag', title: '操作标识', width: '10%',
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
                case 'stat'://统计信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'licenseId', title: '驾驶证号', width: '15%'},
                        {field: 'address', title: '行政区划', width: '8%'},
                        {field: 'cycle', title: '统计周期（月份）', width: '12%'},
                        {field: 'orderCount', title: '完成订单(次)', width: '12%'},
                        {field: 'trafficViolationCount', title: '交通违章(次)', width: '12%'},
                        {field: 'complainedCount', title: '被投诉(次)', width: '11%'},
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
            }

        },
        //加载数据列表
        loadDataGrid: function (data, tableName) {
            var _self = this;
            _self.loadGridTitle(tableName);  //设备表头
            _self.listView.datagrid({
                url: Carnet.basePrefixURL + '/driver/' + tableName + '/list',// 加载的URL
                method: 'get',
                isField: "id",
                onLoadSuccess: function (data) {
                    cLib.base.setLangChina(_self.listViewId);//设置中文显示
                    //清除没有记录时重复显示的问题
                    if ($('#hasNoneData')) {
                        $('#hasNoneData').remove();
                    }
                    if (data.total == 0) {
                        if ($('#hasNoneData').length == 0) {
                            $('.datagrid-view').append('<div id = "hasNoneData" style="text-align:center;padding-top:40px;" class="searchnodata">没有找到相关记录</div>');
                        } else {
                            $('#hasNoneData').show();
                        }
                    }
                },
                height: '400',
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
        //填充数据
        fillData: function () {
            var _self = this;
            var subdata = {
                address: $('#sArea').val(),
                companyId: $('#sCompanyName').val(),
                licenseId: $('#sDriverLicense').val(),
                driverPhone: $('#sDriverPhone').val()
            }
            _self.server.driverBaseInfo(subdata).done(function (res) {
                cLib.base.matchData('baseInfo', res);
            })
        },
        //底部表格加载
        loadDefaultTable: function (tablename) {
            var _self = this;
            var subdata = {
                licenseId: $('#sDriverLicense').val(),
                companyId: $('#sCompanyName').val(),
                driverPhone: $('#sDriverPhone').val()
            }
            _self.loadDataGrid(subdata, tablename);

            //选中当前加载的表格的标题
            $("span[tablename='" + tablename + "']").siblings().removeClass('active');
            $("span[tablename='" + tablename + "']").addClass('active');
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["driverInfo"] = driverInfo;
})(jQuery);