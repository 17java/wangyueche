/**
 * Created by Wyan_ on 2017/4/22.
 * 车辆运输证许可信息
 */
(function ($) {
    //构造器
    function vehicleinfolist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    vehicleinfolist.prototype = {
        constructor: vehicleinfolist,
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
                // {field: 'id', title: 'id', width: '3%'},
                {field: 'companyName', title: '公司名称', width: '24%'},
                {field: 'vehicleNo', title: '车牌号', width: '15%'},
            ]];
            _self.listTypeShow = [[
                {field: 'plateColor', title: '车牌颜色', width: '15%'},//见JT/T 697.7—2014中5.6
                {field: 'seats', title: '核定载客位', width: '15%'},
                {field: 'brand', title: '车辆厂牌', width: '15%'},
                {field: 'model', title: '车辆型号', width: '15%'},
                {field: 'vehicleType', title: '车辆类型', width: '15%'},
                {field: 'ownerName', title: '所属车主', width: '15%'},
                {field: 'vehicleColor', title: '车身颜色', width: '15%'},
                {field: 'engineId', title: '发动机号', width: '15%'},
                {field: 'vin', title: '车辆VIN码', width: '15%'},
                {
                    field: 'certifyDateA', title: '车辆注册日期', width: '20%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'fuelType', title: '车辆燃料类型', width: '15%'},
                {field: 'engineDisplace', title: '发送机排量', width: '15%'},
                {field: 'photoId', title: '车辆照片文件编号', width: '20%'},
                {field: 'certificate', title: '运输证字号', width: '15%'},
                {field: 'transAgency', title: '车辆运输证发证机构', width: '20%'},
                {field: 'transArea', title: '车辆经营区域', width: '15%'},
                {
                    field: 'transDateStart', title: '车辆运输证有效期起', width: '20%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'transDateStop', title: '车辆运输证有效期止', width: '20%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'certifyDateB', title: '车辆初次登记日期', width: '20%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'fixState', title: '车辆检修状态', width: '15%'},
                {
                    field: 'nextFixDate', title: '车辆下次年检时间', width: '20%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {field: 'checkState', title: '车辆年度审验状态', width: '20%'},//见JT/T 415—2006中5.4.4
                {field: 'feePrintId', title: '发票打印设备序列号', width: '20%'},
                {field: 'gpsBrand', title: '卫星定位装置品牌', width: '20%'},
                {field: 'gpsModel', title: '卫星定位装置型号', width: '20%'},
                {field: 'gpsimei', title: '卫星定位装置IMEI号', width: '20%'},
                {
                    field: 'gpsInstallDate',
                    title: '卫星定位设备安装日期',
                    width: '20%',
                    formatter: function (value, row, index) {
                        return (value == null ? '' : cLib.base.getLocalTime(value));
                    }
                },
                {
                    field: 'registerDate', title: '注册日期', width: '20%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'CommercialType', title: '营运类型', width: '15%',
                    formatter: function (value, row, index) {
                        if (value == 1)
                            return "网络预约出租车";
                        else if (value == 2)
                            return "巡游出租车";
                        else if (value == 3)
                            return "合乘车";
                        else
                            return "未录入";
                    }
                },
                //由网约车公司定义，与A.4.10A.4.8.运价信息接口一一对应。,
                {field: 'fareType', title: '运价类型编码', width: '15%'},
                {
                    field: 'state', title: '状态', width: '8%',
                    formatter: function (value, row, index) {
                        if (value == 0)
                            return "有效";
                        else if (value = 1)
                            return "失效";
                        else return "未录入";
                    }
                },
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
                    field: 'updateTime', title: '更新时间', width: '16%', formatter: function (value, row, index) {
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
                url: '/wangyueche/vehicle/info/list',// 加载的URL
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
            var vehicleNo = $("#sVehicleNo").val();
            var param = {
                address: address,
                vehicleNo: vehicleNo,
            }
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            $('#oInfo').val("");
            $('#sVehicleNo').val("");
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["vehicleinfolist"] = vehicleinfolist;
})(jQuery);
