<head>
<#include "../../macro/base.ftl" />
    <base href="${ctx}/static/roncoo-adminlte/">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>网约车平台监管后台管理系统</title>
<@style/>
<@jsFile/>
</head>
<body>
<div class="conWrap">
    <div class="opWrap">
        <div class="opTitle">查询条件:</div>
        <div class="searchWrap">
            <p class="txtWrap">
                <span class="txtName">部门名称：</span>
                <input type="text" placeholder="请输入名称">
            </p>
            <p class="txtWrap">
                <span class="txtName">负责人：</span>
                <input type="text" placeholder="请输入负责人信息">
            </p>
            <a class="opBtn">
                <img width="16" height="16" src="sichuang/images/search_icon.png"/>
                &nbsp;查询
            </a>
            <a class="opBtn" href="${ctx}/admin/organization/add">
                <img width="16" height="16" src="sichuang/images/clear_icon.png" />
                &nbsp;新增
            </a>
        <#--id=所选中的数据id 待添加-->
            <a class="opBtn" href="${ctx}/admin/organization/delete?id=?" target="ajaxTodo" callback="organizationReload();" data-body="确认要删除吗？">
                <img width="16" height="16" src="sichuang/images/clear_icon.png"/>
                &nbsp;删除
            </a>
        </div>
    </div>
<#--<div class="atoolbar">-->
<#--<a href="#"   class="addicon">新增</a>-->
<#--<a href="#"   class='editicon'>编辑</a>-->
<#--<a href="#"   class="detailicon">详情</a>-->
<#--</div>-->
    <div id="dataList"></div>
</div>

<script type="text/javascript">
    $(function() {
        new Carnet.module.list().init();
    })

    var No = 0;

    (function($) {
        //构造器
        function list() {
            this.server=new Carnet.module.server();
            this.listViewId='dataList';
            this.listView = $('#'+this.listViewId);
        };
        list.prototype = {
            constructor: list,
            init:function(){
                var _self=this;
                _self.bindEvents();
            },
            bindEvents:function(){
                var _self=this;
                _self.loadGridTitle();
            },
            //设置表格表头及内容
            loadGridTitle:function(){
                var _self = this;

                // 表格内容
                _self.listView.datagrid({
                    height : $('#contentIn',window.parent.document).height()-200,
                    width:'100%',
                    rownumbers : true,
                    singleSelect : false,
//                    queryParams : data||{},
                    loadMsg: "查询数据请稍候。。。",
                    pagination : true,// 显示分页
                    pageSize : 10,// 分页大小
                    pageList : [ 10, 20, 30, 40,50],// 每页的个数
                    fit : false,// 自动补全
                    fitColumns : true,
                    title:'',
                    iconCls : "icon-save",// 图标
                    columns : [[
                        {field : 'choose',checkbox:true,width : "5%"},
                        {field : 'name',title : '部门名称',width : '14%'},
                        {field : 'sysUser.name',title : '负责人',width : '13%'},
                        {field : 'email',title : '邮箱',width : '17%'},
                        {field : 'remark',title : '备注',width : '17%'},
                        {field : 'statusId',title : '状态',width : '12%',
                            formatter: function(value,row,index){
                                if(value == "0"){
                                    return "不可用";
                                }
                                else if(value == "1"){
                                    return "可用";
                                }
                                else return "未知状态";
                            }},
                        {field : 'createTime',title : '创建时间',width : '12%'},
                        {field : 'operate',title : '操作',width : '14%',
                            formatter: function (value,row,index) {
                                var btn = "";
                                btn = '<a class="smallBtn" target="modal" href="${ctx}/admin/organization/view?id=' + row.id + '">查看</a> &nbsp;'
                                        + '<@shiro.hasPermission name="super:update">'
                                        + '<a class="smallBtn" onclick="organizationToListAjax();" target="modal"  href="${ctx}/admin/organization/edit?id='+ row.id+ '">修改</a> &nbsp;'
                                        +'</@shiro.hasPermission>'
                                        + '<@shiro.hasPermission name="super:delete">'
                                        + '<a class="smallBtn" callback="organizationReload();" data-body="确认要删除吗？" target="ajaxTodo" href="${ctx}/admin/organization/delete?id='+ row.id + '">删除</a>'
                                        +'</@shiro.hasPermission>';
                                return btn;
                            }},
                    ]],
                    onLoadSuccess: function (data) {
                        cLib.base.setLangChina(_self.listViewId);//设置中文显示
                        if (data.iTotalRecords == 0) {
                            $('.datagrid-view').append('<div id = "hasNoneData" style="text-align:center;padding-top:40px;" class="searchnodata">没有找到相关记录</div>');
                        }
                    }
                });

                $.ajax({
                    method : 'post',
                    url : "${ctx}/admin/organization/page",
                    async : false,
                    dataType : 'json',
                    success : function(data) {
//                        alert(data.iTotalRecords);
                        _self.listView.datagrid('loadData', data.data);

                    },
                    error : function() {
                        alert('error');
                    }
                });
            },

            organizationReload: function () {
                var _self = this;
                reloadTable(_self.listView, "#organizationTime", "#organizationPremise");
            },

            organizationToListAjax: function () {
                var _self = this;
                list_ajax = _self.listView;
                console.log(list_ajax);
            }
        }
        //将服务模型添加到全局变量中
        Carnet.module["list"] = list;
    })(jQuery);


</script>
</body>