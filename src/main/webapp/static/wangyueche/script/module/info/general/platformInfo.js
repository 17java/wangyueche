/**
 * Created by wangpeng on 2017/4/1.
 */
(function ($) {
    //构造器
    function platformInfo() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    platformInfo.prototype = {
        constructor: platformInfo,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            _self.loadSearchTitle();
            //加载底部默认的表格内容
            _self.loadDefaultTable('permit');
            // _self.fillData();
            $('.tableTab').bind('click', function () {
                //加载底部默认的表格内容
                _self.loadDefaultTable($(this).attr('tablename'));
                $(this).siblings().removeClass('active');
                $(this).addClass('active');
            })
            $('#searchBtn').bind('click', function () {
                //加载底部默认的表格内容
                _self.loadDefaultTable('permit');
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
                case 'permit'://平台公司经营许可
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '26%'},
                        {field: 'address', title: '归属区划', width: '8%'},
                        {field: 'certificate', title: '经营许可证号', width: '15%'},
                        {field: 'operationArea', title: '经营区域', width: '8%'},
                        {field: 'ownerName', title: '业户名称', width: '18%'},
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
                            field: 'state', title: '证照状态', width: '8%',
                            formatter: function (value, row, index) {
                                if (value == 0) {
                                    return "有效";
                                } else if (value == 1) {
                                    return "无效";
                                } else {
                                    return "未录入";
                                }
                            }
                        },
                        {
                            field: 'flag', title: '操作标识', width: '8%',
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
                        }
                    ]];
                    break;
                case 'scale'://平台公司营运规模
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'vehicleNum', title: '平台注册网约车辆数', width: '22%'},
                        {field: 'driverNum', title: '平台注册驾驶员数', width: '22%'},
                        {
                            field: 'flag', title: '操作标识', width: '11%',
                            formatter: function (value, row, index) {
                                if (value == 1) {
                                    return "新增";
                                } else if (value == 2) {
                                    return "更改";
                                } else if (value == 3) {
                                    return "删除";
                                }
                                else {
                                    return "未录入";
                                }
                            }
                        },
                        {
                            field: 'updateTime', title: '更新时间', width: '22%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        }
                    ]];
                    break;
                case 'pay'://平台公司支付信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'payName', title: '银行或者非银行支付机构名称', width: '20%'},
                        {field: 'payId', title: '非银行支付机构支付业务许可证编号', width: '20%'},
                        {field: 'payType', title: '支付业务类型', width: '55%'},
                        {field: 'payScope', title: '业务覆盖范围', width: '55%'},
                        {field: 'prepareBank', title: '备付金存管银行', width: '25%'},
                        {field: 'countDate', title: '结算周期（天）', width: '8%'},
                        {
                            field: 'state', title: '状态', width: '8%',
                            formatter: function (value, row, index) {
                                if (value == 0) {
                                    return "有效";
                                } else if (value == 1) {
                                    return "无效";
                                } else {
                                    return "未录入";
                                }
                            }
                        },
                        {
                            field: 'flag', title: '操作标识', width: '8%',
                            formatter: function (value, row, index) {
                                if (value == 1) {
                                    return "新增";
                                } else if (value == 2) {
                                    return "更改";
                                } else if (value == 3) {
                                    return "删除";
                                }
                                else {
                                    return "未录入";
                                }
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
                case 'service'://平台公司服务机构
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'address', title: '行政区划', width: '10%'},
                        {field: 'serviceName', title: '服务机构名称', width: '22%'},
                        {field: 'serviceNo', title: '服务机构代码', width: '15%'},
                        {field: 'detailAddress', title: '服务机构地址', width: '20%'},
                        {field: 'responsibleName', title: '服务机构负责人姓名', width: '15%'},
                        {field: 'responsiblePhone', title: '负责人电话', width: '12%'},
                        {field: 'managerName', title: '服务机构管理人姓名', width: '15%'},
                        {field: 'managerPhone', title: '管理人电话', width: '12%'},
                        {field: 'contactPhone', title: '服务机构紧急联系电话', width: '20%'},
                        {field: 'mailAddress', title: '行政文书送达邮寄地址', width: '20%'}
                    ]];
                    break;

            }

        },
        //加载数据列表
        loadDataGrid: function (data, tableName) {
            var _self = this;
            _self.loadGridTitle(tableName);  //设备表头
            _self.listView.datagrid({
                url: Carnet.basePrefixURL + '/company/' + tableName + '/list',// 加载的URL
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
        //详情填充数据
        fillData: function () {
            var _self = this;
            var subdata = {
                address: $('#sArea').val(),
                companyId: $('#sCompanyName').val()
            };
            _self.server.platformBaseInfo(subdata).done(function (res) {
                cLib.base.matchData('baseInfo', res);
            })
        },
        //底部表格加载
        loadDefaultTable: function (tablename) {
            var _self = this;
            var subdata = {
                address: $('#sArea').val(),
                companyId: $('#sCompanyName').val(),
                vehicleNo: $('#sCarNo').val()
            }
            _self.loadDataGrid(subdata, tablename);

            //选中当前加载的表格的标题
            $("span[tablename='" + tablename + "']").siblings().removeClass('active');
            $("span[tablename='" + tablename + "']").addClass('active');
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["platformInfo"] = platformInfo;
})(jQuery);