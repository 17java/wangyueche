/**
 * Created by wangpeng on 2017/4/1.
 */
(function ($) {
    //构造器
    function carInfo() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    carInfo.prototype = {
        constructor: carInfo,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            _self.loadSearchTitle();
            //加载底部默认的表格内容
            _self.loadDefaultTable('insurance');
            // _self.fillData();
            $('.tableTab').bind('click', function () {
                //加载底部默认的表格内容
                _self.loadDefaultTable($(this).attr('tablename'));
                // $(this).siblings().removeClass('active');
                // $(this).addClass('active');
            });
            //查询
            $('#searchBtn').bind('click', function () {
                    if ($('#sCarNo').val() == "") {
                        layer.msg('车牌号不能为空！', {
                            time: 1000 //20s后自动关闭
                        });
                    } else {
                        _self.fillData();
                        //加载底部默认的表格内容
                        _self.loadDefaultTable('insurance');
                    }
                }
            )
            // 清除搜索框
            $('#clearBtn').bind('click', function () {
                _self.clearSearch();
            })
        },
        // 清除搜索框内容
        clearSearch: function () {
            var _self = this;
            // $("#sCompanyName option:contains('请选择')").attr('selected', true);
            $("#sCompanyName").val("");
            $("#sCarNo").val("");
        },
        // 设置搜索条件栏
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
        }
        ,
//设置表格表头
        loadGridTitle: function (tableName) {
            var _self = this;
            switch (tableName) {
                case 'insurance'://保险信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'vehicleNo', title: '车牌号码', width: '12%'},
                        {field: 'insurCom', title: '保险公司', width: '12%'},
                        {field: 'insurNum', title: '保险号', width: '15%'},
                        {field: 'insurType', title: '保险类型', width: '10%'},
                        {field: 'insurCount', title: '保险金额(元)', width: '10%'},
                        {
                            field: 'insurEff', title: '保险生效时间', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        },
                        {
                            field: 'insurExp', title: '保险到期时间', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
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
                            field: 'updateTime', title: '更新时间', width: '16%'
                            , formatter: function (value, row, index) {
                            return (value == null ? '' : cLib.base.getLocalTime(value));
                        }
                        }
                    ]];
                    break;
                case 'totalMile'://里程信息
                    _self.listTypeShow = [[
                        {field: 'companyName', title: '公司名称', width: '24%'},
                        {field: 'address', title: '注册地行政区划', width: '15%'},
                        {field: 'vehicleNo', title: '车牌号码', width: '15%'},
                        {field: 'totalMile', title: '行驶总里程', width: '15%'},
                        {
                            field: 'flag', title: '操作标识', width: '14%',
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
                        }
                    ]];
                    break;
            }

        }
        ,
//加载数据列表
        loadDataGrid: function (data, tableName) {
            var _self = this;
            _self.loadGridTitle(tableName);  //设备表头
            _self.listView.datagrid({
                url: Carnet.basePrefixURL + '/vehicle/' + tableName + '/list',// 加载的URL
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
        }
        ,
        //填充数据
        fillData: function () {
            var _self = this;
            var subdata = {
                address: $('#sArea').val(),
                companyId: $('#sCompanyName').val(),
                vehicleNo: $('#sCarNo').val()
            };
            _self.server.carBaseInfo(subdata).done(function (res) {
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
    Carnet.module["carInfo"] = carInfo;
})
(jQuery);