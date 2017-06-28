/**
 * Created by Wyan_ on 2017/4/22.
 * 企业经营许可查询
 */
(function ($) {
    //构造器
    function evaluatelist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    evaluatelist.prototype = {
        constructor: evaluatelist,
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
            });
            //清除搜索框
            $('#clearBtn').bind('click', function () {
                _self.clearSearch();
            })
        },
        //设置搜索条件栏
        loadSearchTitle: function () {
            var _self = this;
            //公司名称
            cLib.base.list("company/name/list").done(function (data) {
                for (var key in data) {
                    $('#oCompany').append("<option value=" + key + ">" + data[key] + "</option>");
                }
            });
        },
        //设置表格表头
        loadGridTitle: function () {
            var _self = this;
            _self.listTypeShow = [[
                {field: 'companyName', title: '公司名称', width: '24%'},
                {field: 'passengerPhone', title: '乘客电话', width: '15%'},
                {field: 'orderId', title: '订单号', width: '15%'},
                {   field: 'star', title: '评价星级', width: '15%'
                    , formatter: function (value, row, index) {
                        return (value + "星");
                    }
                },
                {
                    field: 'score', title: '评价满意度', width: '15%'
                    , formatter: function (value, row, index) {
                        if(value == 0){
                            return "满意";
                        }
                        else if(value == 1){
                            return "一般";
                        }
                        else if(value == 2){
                            return "不满意";
                        }
                        else{
                            return "未评价";
                        }
                    }
                },
                {field: 'detail', title: '详细评价', width: '20%'},

            ]];
        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                //url路径识别不了
                url: '/wangyueche/credit/company/list',// 加载的URL
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
            var param = {
                companyId: companyId
            };
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            // $("#oCompany option:contains('请选择')").attr('selected', true);
            $('#oCompany').val("");
        }

    };
    //将服务模型添加到全局变量中
    Carnet.module["evaluatelist"] = evaluatelist;
})(jQuery);
