/**
 * Created by Wyan_ on 2017/4/22.
 * 乘客评价信息
 */
(function ($) {
    //构造器
    function passengerEvaluationlist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    passengerEvaluationlist.prototype = {
        constructor: passengerEvaluationlist,
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
                {field: 'orderId', title: '订单号', width: '15%'},
            ]];
            _self.listTypeShow = [[
                {field: 'serviceScore', title: '服务评分', width: '8%'},
                {field: 'driverScore', title: '司机评分', width: '8%'},
                {field: 'vehicleScore', title: '车辆评分', width: '8%'},
                {field: 'detail', title: '描述', width: '22%'},
                {
                    field: 'evaluateTime', title: '订单发起时间', width: '16%', formatter: function (value, row, index) {
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
                url: '/wangyueche/operation/passengerEvaluation/list',// 加载的URL
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
            var orderId, licenseId, vehicleNo, driverPhone;
            var type = $("#oType").val();
            var startDate = $("#startDate").val();
            var endDate = $("#endDate").val();
            switch (type) {
                case "0":
                    orderId = $("#oInfo").val();
                    break;
                case "1":
                    licenseId = $("#oInfo").val();
                    break;
                case "2":
                    vehicleNo = $("#oInfo").val();
                    break;
                case "3":
                    driverPhone = $("#oInfo").val();
                    break;
                default:
                    break;

            }
            var param = {
                address: address,
                companyId: companyId,
                orderId: orderId,
                licenseId: licenseId,
                vehicleNo: vehicleNo,
                driverPhone: driverPhone,
                startDate: startDate,
                endDate: endDate
            };
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
    Carnet.module["passengerEvaluationlist"] = passengerEvaluationlist;
})(jQuery);
