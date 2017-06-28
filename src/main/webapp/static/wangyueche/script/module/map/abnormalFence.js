/**
 * Created by wangpeng on 2017/4/20.
 */
(function($) {
    //构造器
    function abnormal(type) {
        this.server=new Carnet.module.server();
        this.listViewId='dataList';
        this.listView = $('#'+this.listViewId);
    };
    abnormal.prototype = {
        constructor: abnormal,
        init:function(){
            var _self=this;
            _self.bindEvents();
        },
        bindEvents:function(){
            var _self=this;
            _self.loadSearchTitle();
            _self.loadDataGrid();
            //搜索
            $('#searchBtn').bind('click', function () {
                _self.loadSearch();
            })
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

        },
        //设置表格表头
        loadGridTitle:function(){
            var _self = this;
            _self.listTypeShow = [[
                {field : 'name',title : '围栏名称',width : '12%'},
                {field : 'radius',title : '围栏半径',width : '12%'},
                {field : 'firstNum',title : '一级告警数量',width : '12%'},
                {field : 'secNum',title : '二级告警数量',width : '12%'},
                {field : 'thrNum',title : '三级告警数量',width : '12%'},
                // {
                //     field: 'type', title: '围栏类型', width: '12%', formatter: function (value, row, index) {
                //     if(value == 1){
                //         return "行政围栏";
                //     }
                //     else if(value == 2) {
                //         return "正常围栏";
                //     }
                //     else if(value == 3) {
                //         return "异常围栏";
                //     }
                //     else{
                //         return "类型未定义";
                //     }
                // }},
                {field : 'status',title : '备注',width : '12%',formatter: function (value, row, index) {
                    return (value==0?'停用':'启用');
                }},
                {
                    field: 'operate', title: '操作', width: '17%',
                    formatter: function (value, row, index) {
                        // '<a class="smallBtn" target="_self" href="abnormal_fence/map_no_fence_update.html?id="'+(row.id)+'>修改</a> &nbsp;'
                        var btn = "";
                        btn = (row.status==0? '<a class="smallBtn" onclick="fenceChangeStatus(' + row.id + ''+',1'+')" >启用</a>':'<a class="smallBtn" onclick="fenceChangeStatus(' + row.id + ''+',0'+')" >停用</a>')
                            + '&nbsp<a class="smallBtn" onclick="fenceDelete(' + row.id + ')">删除</a>';
                        return btn;
                    }
                },
            ]];
        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({
                url : Carnet.basePrefixURL+ '/abnormal/list',// 加载的URL
                method : 'post',
                idField : "id",
                onLoadSuccess: function (data) {
                    cLib.base.setLangChina(_self.listViewId);//设置中文显示
                    if (data.total == 0) {
                        if($('#hasNoneData').length==0) {
                            $('.datagrid-view').append('<div id = "hasNoneData" style="text-align:center;padding-top:40px;" class="searchnodata">没有找到相关记录</div>');
                        }else {
                            $('#hasNoneData').show();
                        }
                    }else{
                        $('#hasNoneData').hide();
                    }
                },
                height :400,//$('#contentIn',window.parent.document).height()-200
                width:'100%',
                rownumbers : true,
                singleSelect : false,
                queryParams:data||{},
                loadMsg: "查询数据请稍候。。。",
                pagination : true,// 显示分页
                pageSize : 20,// 分页大小
                pageList : [ 10, 20, 30, 40,50],// 每页的个数
                fit : false,// 自动补全
                fitColumns : true,
                title:'',
                iconCls : "icon-save",// 图标
                columns : _self.listTypeShow
            });
        },
        //搜索
        loadSearch: function () {
            var _self = this;
            var name = $("#sName").val();
            var state=$('#sState').val();
            var param = {
                name:name,
                status:state
            }
            _self.loadDataGrid(param);
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["abnormal"] = abnormal;
})(jQuery);

// 停用
function fenceChangeStatus(id,status) {
    layer.confirm('您真的确定要'+(status==0?'停用':'启用')+'该围栏吗？', {icon: 3, title: '提示'}, function (index) {
        return $.ajax({
            url: "http://" + window.location.host + "/wangyueche/abnormal/changeStatus",
            dataType: "json",
            data: {id:id,status:status},
            type: "post",
            async: false,
            success:function(res){
                if (res == "1") {
                    layer.alert("操作成功");
                    $('#dataList').datagrid('reload');
                } else {
                    layer.alert("操作失败，请检查");
                }
            }
        });
    });
}
// 删除
function fenceDelete(id) {
    layer.confirm('您真的确定要删除该围栏吗？', {icon: 3, title: '提示'}, function (index) {
        return $.ajax({
            url: "http://" + window.location.host + "/wangyueche/abnormal/delete",
            dataType: "json",
            data: id,
            type: "get",
            async: false,
            success:function(res){
                if (res == "0") {
                    layer.alert("操作成功");
                    $('#dataList').datagrid('reload');
                } else {
                    layer.alert("操作失败，请检查");
                }
            }
        });
    });
}