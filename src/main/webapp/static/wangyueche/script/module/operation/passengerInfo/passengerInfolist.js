/**
 * Created by Wyan_ on 2017/4/22.
 * 乘客信息
 */
(function ($) {
    //构造器
    function passengerInfolist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    passengerInfolist.prototype = {
        constructor: passengerInfolist,
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
                // {field: 'id', title: '序号', width: '4%'},
                {field: 'companyName', title: '公司名称', width: '24%'},
                {field: 'passengerName', title: '乘客称谓', width: '12%'},
            ]];
            _self.listTypeShow = [[
                {field: 'passengerPhone', title: '乘客手机号', width: '12%'},
                {field: 'passengerGender', title: '乘客性别', width: '12%'},
                {
                    field: 'state', title: '状态', width: '10%',
                    formatter: function (value, row, index) {
                        if (value == 0)
                            return "有效";
                        else if (value == 1)
                            return "失效";
                        else
                            return "未录入";
                    }
                },
                {
                    field: 'flag', title: '操作标识', width: '10%',
                    formatter: function (value, row, index) {
                        if (value == 1)
                            return "新增";
                        else if (value == 2)
                            return "更新";
                        else if (value == 3)
                            return "删除";
                        else
                            return "未录入";
                    }
                },
                {
                    field: 'registerDate', title: '注册日期', width: '14%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'updateTime', title: '更新时间', width: '14%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
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
                url: '/wangyueche/operation/passengerInfo/list',// 加载的URL
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
            var companyId = $("#oCompany").val();
            var passengerName = $("#sPassengerName").val();
            var passengerPhone = $("#sPassengerPhone").val();
            var param = {
                companyId: companyId,
                passengerName: passengerName,
                passengerPhone: passengerPhone
            }
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            // $("#oCompany option:contains('请选择')").attr('selected', true);
            $('#oCompany').val("");
            $('#sPassengerName').val("");
            $('#startDate').val("");
            $('#sPassengerPhone').val("");
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["passengerInfolist"] = passengerInfolist;
})(jQuery);
