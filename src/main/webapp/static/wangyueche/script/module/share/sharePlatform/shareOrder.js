/**
 * Created by Wyan_ on 2017/5/15.
 */
(function ($) {
    //构造器
    function shareOrder() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    shareOrder.prototype = {
        constructor: shareOrder,
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
                {field: 'routeId', title: '驾驶员发起行程编号', width: '15%'},
                {field: 'orderId', title: '乘客合乘订单号', width: '15%'},
            ]];
            _self.listTypeShow = [[
                {field: 'companyName', title: '公司名称', width: '24%'},
                {field: 'address', title: '归属区划', width: '12%'},
                {
                    field: 'bookDepartTime', title: '预计上车时间', width: '12%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'departure', title: '预计上车地点', width: '11%'},
                {field: 'depLongitude', title: '上车经度', width: '11%'},
                {field: 'depLatitude', title: '上车纬度', width: '11%'},
                {field: 'destination', title: '目的地', width: '11%'},
                {field: 'destLongitude', title: '目的地经度', width: '11%'},
                {field: 'destLatitude', title: '目的地纬度', width: '11%'},
                {field: 'encrypt', title: '坐标加密标识', width: '11%'},
                {
                    field: 'orderEnsureTime', title: '订单确认时间', width: '12%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'passengerNum', title: '乘客人数', width: '11%'},
                {field: 'passengerNote', title: '乘客备注', width: '11%'}
            ]];
        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                //url路径识别不了
                url: '/wangyueche/share/order',// 加载的URL
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
                rownumbers: true,
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
            var routeId = $("#routeId").val();
            var orderId = $("#orderId").val();
            var param = {
                companyId: companyId,
                routeId: routeId,
                orderId: orderId,
            };
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            $("#oCompany").val("");
            $('#routeId').val("");
            $('#orderId').val("");
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["shareOrder"] = shareOrder;
})(jQuery);
