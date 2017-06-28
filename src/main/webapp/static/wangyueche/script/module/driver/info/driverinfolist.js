(function ($) {
    //构造器
    function driverinfolist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    driverinfolist.prototype = {
        constructor: driverinfolist,
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
        },
        //设置表格表头
        loadGridTitle: function () {
            var _self = this;
            _self.frozenListShow = [[
                // {field: 'id', title: '序号', width: '3%'},
                {field: 'companyName', title: '公司名称', width: '24%'},
            ]];
            _self.listTypeShow = [[
                {field: 'address', title: '行政区划', width: '10%'},
                {field: 'driverName', title: '姓名', width: '10%'},
                {field: 'driverPhone', title: '手机号', width: '15%'},
                {
                    field: 'driverGender', title: '性别', width: '8%',
                    formatter: function (value, row, index) {
                        if (value == 1)
                            return "男";
                        if (value == 2)
                            return "女";
                        else return "录入错误";
                    }
                },

                {
                    field: 'driverBirthday', title: '生日', width: '16%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'driverNationality', title: '国籍', width: '10%'},
                {field: 'driverNation', title: '民族', width: '10%'},
                {field: 'driverMaritalStatus', title: '婚姻状况', width: '10%'},
                {field: 'driverLanguageLevel', title: '外语能力', width: '10%'},
                {field: 'driverEducation', title: '学历', width: '10%'},
                {field: 'driverCensus', title: '户口登记机关名称', width: '15%'},
                {field: 'driverAddress', title: '户口住址', width: '15%'},
                {field: 'driverContactAddress', title: '通信地址', width: '15%'},
                {field: 'photoId', title: '驾驶员照片文件编号', width: '15%'},
                {field: 'licenseId', title: '机动车驾驶号', width: '15%'},
                {field: 'licensePhotoId', title: '驾驶证扫描件文件编号', width: '15%'},
                {field: 'driverType', title: '准驾车型', width: '15%'},
                {
                    field: 'getDriverLicenseDate', title: '初次领取驾驶证日期', width: '15%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'driverLicenseOn', title: '驾驶证有效期限起', width: '15%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'driverLicenseOff', title: '驾驶证有效期限止', width: '15%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'taxiDriver', title: '是否巡游出租车驾驶员', width: '10%',
                    formatter: function (value, row, index) {
                        if (value == 0)
                            return "是";
                        else if (value == 1)
                            return "否";
                        else return "未录入";
                    }
                },
                {field: 'certificateNo', title: '出租车驾驶员资格证号', width: '15%'},
                {field: 'networkCarIssueOrganization', title: '出租车驾驶员发证机构', width: '20%'},
                {
                    field: 'networkCarIssueDate', title: '资格证发证日期', width: '15%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'getNetworkCarProofDate', title: '初次领取资格证日期', width: '15%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'networkCarProofOn', title: '资格证有效起始日期', width: '15%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'networkCarProofOff', title: '资格证有效终止日期', width: '15%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'registerDate', title: '注册日期', width: '15%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'fulltimeDriver', title: '是否专职驾驶员', width: '15%',
                    formatter: function (value, row, index) {
                        if (value == 0)
                            return "否";
                        else if (value == 1)
                            return "是";
                        else return "未录入";
                    }
                },
                {
                    field: 'inDriverBlacklist', title: '是否在驾驶员黑名单', width: '15%',
                    formatter: function (value, row, index) {
                        if (value == 0)
                            return "否";
                        else if (value == 1)
                            return "是";
                        else return "未录入";
                    }
                },
                {
                    field: 'commercialType', title: '营运类型', width: '15%',
                    formatter: function (value, row, index) {
                        if (value == 1)
                            return "网络预约出租车";
                        else if (value == 2)
                            return "巡游出租车";
                        else if (value == 3)
                            return "合乘车";
                        else return "未录入";
                    }
                },
                {field: 'contractCompany', title: '驾驶员合同(协议)签署公司', width: '20%'},
                {
                    field: 'contractOn', title: '合同(协议)有效期起', width: '15%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'contractOff', title: '合同(协议)有效期止', width: '15%'
                    , formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'emergencyContact', title: '紧急联系人', width: '15%'},
                {field: 'emergencyContactPhone', title: '紧急联系人电话', width: '15%'},
                {field: 'emergencyContactAddress', title: '紧急联系人通信地址', width: '20%'},
                {
                    field: 'state', title: '状态', width: '8%',
                    formatter: function (value, row, index) {
                        if (value == 0)
                            return "有效";
                        else if (value == 1)
                            return "失效";
                        else return "未录入";
                    }
                },
                {
                    field: 'flag', title: '操作标识', width: '8%',
                    formatter: function (value, row, index) {
                        if (value == 1)
                            return "新增";
                        else if (value == 2)
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
        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                //url路径识别不了
                url: '/wangyueche/driver/info/list',// 加载的URL
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
            var driverNo = $("#sDriverNo").val();
            var param = {
                address: address,
                driverNo: driverNo,
            }
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            $('#oInfo').val("");
            $('#sDriverNo').val("");
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["driverinfolist"] = driverinfolist;
})(jQuery);
