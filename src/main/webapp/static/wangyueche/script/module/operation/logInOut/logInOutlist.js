/**
 * 车辆运营上下线
 */
(function ($) {
    //构造器
    function logInOutlist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    logInOutlist.prototype = {
        constructor: logInOutlist,
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
            _self.frozenListShow = [[
                {field: 'companyName', title: '公司名称', width: '24%'},
                {field: 'licenseId', title: '驾驶证号', width: '15%'},
            ]];
            _self.listTypeShow = [[
                {field: 'vehicleNo', title: '车牌号', width: '15%'},
                {
                    field: 'loginTime', title: '上线时间', width: '16%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'inLongitude', title: '上线经度', width: '15%'},
                {field: 'inLatitude', title: '上线纬度', width: '15%'},
                {
                    field: 'inEncrypt', title: '上线坐标加密标识', width: '20%',
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
                {
                    field: 'logoutTime', title: '下线时间', width: '16%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'outLongitude', title: '下线经度', width: '15%'},
                {field: 'outLatitude', title: '下线经度', width: '15%'},
                {
                    field: 'outEncrypt', title: '下线坐标加密标识', width: '20%',
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

                url: '/wangyueche/operation/logInOut/list',// 加载的URL
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
            var licenseId, vehicleNo = "";
            var type = $("#oType").val();
            var startDate = $("#startDate").val();
            var endDate = $("#endDate").val();
            switch (type) {
                case "0":
                    vehicleNo = $("#oInfo").val();
                    break;
                case "1":
                    licenseId = $("#oInfo").val();
                    break;
                default:
                    break;

            }
            var param = {
                address: address,
                companyId: companyId,
                licenseId: licenseId,
                vehicleNo: vehicleNo,
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
    Carnet.module["logInOutlist"] = logInOutlist;
})(jQuery);
