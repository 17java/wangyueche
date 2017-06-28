/**
 * Created by Wyan_ on 2017/5/15.
 */

(function ($) {
    //构造器
    function shareCompany() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    shareCompany.prototype = {
        constructor: shareCompany,
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
            //公司名称
            cLib.base.list("share/company/names").done(function (data) {
                for (var key in data) {
                    $('#oCompany').append("<option value=" + key + ">" + data[key] + "</option>");
                }
            });
        },
        //设置表格表头
        loadGridTitle: function () {
            var _self = this;
            _self.frozenListShow = [[
                {field: 'companyName', title: '公司名称', width: '24%'},
            ]];
            _self.listTypeShow = [[
                {field: 'address', title: '注册地行政区划', width: '12%'},
                {field: 'identifier', title: '统一社会信用代码', width: '15%'},
                {field: 'contactAddress', title: '通信地址', width: '22%'},
                {field: 'economicType', title: '经营业户经济类型', width: '12%'},
                {field: 'legalName', title: '法人代表姓名', width: '12%'},
                {field: 'legalPhone', title: '法人代表电话', width: '12%'},
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
                    field: 'updateTime', title: '更新时间', width: '12%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                }
            ]];
        },
        //加载表格数据
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                url: '/wangyueche/share/company',// 加载的URL
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
            var state = $("#state").val();

            var param = {
                companyId: companyId,
                state: state
            };
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            $('#oCompany').val("");
            $('#state').val("");
        }

    };
    //将服务模型添加到全局变量中
    Carnet.module["shareCompany"] = shareCompany;
})(jQuery);
