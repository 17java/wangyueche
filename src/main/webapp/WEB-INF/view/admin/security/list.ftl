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
<div class="conWrap" name="conWrap">
    <div class="opWrap">
        <div class="opTitle">查询条件:</div>
        <div class="searchWrap">
            <p class="txtWrap">
                <span class="txtName">姓名：</span>
                <input type="text" placeholder="请输入姓名">
            </p>
            <p class="txtWrap">
                <span class="txtName">编号：</span>
                <input type="text" placeholder="请输入编号">
            </p>
            <p class="txtWrap">
                <span class="txtName">组织：</span>
                <select>
                    <option>组织1</option>
                    <option>组织2</option>
                </select>
            </p>
            <a class="opBtn">
                <img width="16" height="16" src="sichuang/images/search_icon.png"/>
                &nbsp;查询
            </a>
        <#--target="modal"-->
        <#--<a class="opBtn" id="add" href="${ctx}/admin/security/add" >-->
            <a class="opBtn" id="add" onclick="add()">
                <img width="16" height="16" src="sichuang/images/clear_icon.png"/>
                &nbsp;新增
            </a>
        <#--id=所选中的数据id 待添加-->
            <a class="opBtn" href="${ctx}/admin/security/delete?id=?" target="ajaxTodo" callback="securityReload();"
               data-body="确认要删除吗？">
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
</div>

<script type="text/javascript">
    $(function () {
        new Carnet.module.list().init();
    });

    (function ($) {
        //构造器
        function list() {
            this.server = new Carnet.module.server();
            this.listViewId = 'dataList';
            this.listView = $('#' + this.listViewId);
        };
        list.prototype = {
            constructor: list,
            init: function () {
                var _self = this;
                _self.bindEvents();
            },
            bindEvents: function () {
                var _self = this;
                _self.loadGridTitle();
            },
            //设置表格表头及内容
            loadGridTitle: function () {
                var _self = this;

                // 表格内容
                _self.listView.datagrid({
                    height: $('#contentIn', window.parent.document).height() - 200,
                    width: '100%',
                    rownumbers: true,
                    singleSelect: false,
//                    queryParams : data||{},
                    loadMsg: "查询数据请稍候。。。",
                    pagination: true,// 显示分页
                    pageSize: 10,// 分页大小
                    pageList: [10, 20, 30, 40, 50],// 每页的个数
                    fit: false,// 自动补全
                    fitColumns: true,
                    title: '',
                    iconCls: "icon-save",// 图标
                    columns: [[
                        {field: 'choose', checkbox: true, width: "5%"},
                        {field: 'staffNo', title: '工号', width: '5%'},
                        {field: 'userNo', title: '账号', width: '5%'},
                        {field: 'name', title: '姓名', width: '5%'},
                        {field: 'nickName', title: '昵称', width: '9%'},
                        {
                            field: 'sex', title: '性别', width: '5%',
                            formatter: function (value, row, index) {
                                if (value == "0") {
                                    return "女";
                                }
                                if (value == "1") {
                                    return "男";
                                }
                                return "未录入";
                            }
                        },
                        {field: 'organizationId', title: '组织', width: '5%'},
                        {field: 'position', title: '职位', width: '8%'},
                        {
                            field: 'roleList', title: '角色', width: '10%',
                            formatter: function (value, row, index) {
                                var listStr = "";
                                var list = value;
                                for (var i = 0; i < list.length; i++) {
                                    listStr = listStr + (i + 1) + "." + list[i].roleName;
                                }
                                return listStr;
                            }
                        },
                        {
                            field: 'locked', title: '锁定标志', width: '9%',
                            formatter: function (value, row, index) {
                                if (value == "0") {
                                    return "激活";
                                }
                                if (value == "1") {
                                    return "锁定";
                                }
                                return "未知状态";
                            }
                        },
                        {field: 'userType', title: '人员类型', width: '9%'},
                        {field: 'phone', title: '电话', width: '12%'},
                        {
                            field: 'operate', title: '操作', width: '14%',
                            formatter: function (value, row, index) {
                                var btn = "";
                                btn = '<a class="smallBtn" target="modal"  href="${ctx}/admin/security/view?id=' + row.id + '">查看</a> &nbsp;'
                                        + '<@shiro.hasPermission name="super:update">'
                                        + '<a class="smallBtn" onclick="securityToListAjax();" target="modal"  href="${ctx}/admin/security/edit?id='+ row.id+ '">修改</a> &nbsp;'
                                        +'</@shiro.hasPermission>'
                                        + '<@shiro.hasPermission name="super:delete">'
                                        + '<a class="smallBtn" callback="securityReload();" data-body="确认要删除吗？" target="ajaxTodo" href="${ctx}/admin/security/delete?id='+ row.id + '">删除</a>'
                                        +'</@shiro.hasPermission>';
//                                onclick="securityToListAjax();"
                                <#--btn = '<a class="smallBtn view" target="modal"  onclick="view(' + row.id + ')">查看</a> &nbsp;'-->
                                        <#--+ '<@shiro.hasPermission name="super:update">'-->
                                        <#--+ '<a class="smallBtn edit"  target="modal"  onclick="edit(' + row.id + ')">修改</a> &nbsp;'-->
                                        <#--+'</@shiro.hasPermission>'-->
                                        <#--+ '<@shiro.hasPermission name="super:delete">'-->
                                        <#--+ '<a class="smallBtn delete" callback="securityReload();" data-body="确认要删除吗？" target="ajaxTodo" href="${ctx}/admin/security/delete?id='+ row.id + '">删除</a>'-->
                                        <#--+'</@shiro.hasPermission>';-->
                                return btn;
                            }
                        },
                    ]],
                    onLoadSuccess: function (data) {
                        cLib.base.setLangChina(_self.listViewId);//设置中文显示
                        if (data.iTotalRecords == 0) {
                            $('.datagrid-view').append('<div id = "hasNoneData" style="text-align:center;padding-top:40px;" class="searchnodata">没有找到相关记录</div>');
                        }
                    }
                });

                $.ajax({
                    method: 'post',
                    url: "${ctx}/admin/security/page",
                    async: false,
                    dataType: 'json',
                    success: function (data) {
                        _self.listView.datagrid('loadData', data);

                    },
                    error: function () {
                        alert('error');
                    }
                });
            },

            securityReload: function () {
                var _self = this;
                reloadTable(_self.listView, "#securityTime", "#securityPremise");
            },

            securityToListAjax: function () {
                var _self = this;
                list_ajax = _self.listView;
                console.log(list_ajax);
            }
        }
        //将服务模型添加到全局变量中
        Carnet.module["list"] = list;
    })(jQuery);


    function add() {
        layui.use('layer', function () {
            var layer = layui.layer;
            layer.open({
                type: 2,
                area: ['500px', '700px'],
                fixed: false, //不固定
                content: '${ctx}/admin/security/add',
                skin: 'layui-layer-rim', //加上边框
                zIndex: 500,
                shadeClose: true, //点击遮罩关闭
                //                skin: 'demo-class',
                skin: 'layui-layer-rim', //加上边框
                zIndex: 500,
                shadeClose: true, //点击遮罩关闭
//                btn: [ '关闭','保存'],

                //第一个按钮回调
//                yes: function (index, layero) {
//                    alert(index);
//                },
//                btn2: function (index, layero) {
//                //按钮【按钮二】的回调
//                //return false 开启该代码可禁止点击该按钮关闭
//                },
                cancel: function () {
                    //右上角关闭回调

                    //return false 开启该代码可禁止点击该按钮关闭
                },

                success: function () {

                }
            });
        });
    }

    function view(id) {
        layui.use('layer', function () {
            var layer = layui.layer;
            alert("要查看的用户id:" + id);
            layer.open({
                type: 2,
                area: ['500px', '700px'],
                fixed: false, //不固定
                content: '${ctx}/admin/security/view?id=' + id,
                skin: 'layui-layer-rim', //加上边框
                zIndex: 500,
                shadeClose: true, //点击遮罩关闭
            });
        });

    }

    //href="${ctx}/admin/security/edit?id='+ row.id+ '"
    function edit(id){
        layui.use('layer', function () {
            var layer = layui.layer;
            alert("要修改的用户id:" + id);
            layer.open({
                type: 2,
                area: ['500px', '700px'],
                fixed: false, //不固定
                content: '${ctx}/admin/security/edit?id=' + id,
                skin: 'layui-layer-rim', //加上边框
                zIndex: 500,
                shadeClose: true, //点击遮罩关闭
            });
        });
    }

</script>
</body>