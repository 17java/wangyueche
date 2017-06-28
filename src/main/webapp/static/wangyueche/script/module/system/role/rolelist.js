/**
 * Created by wangyan on 2017/4/17.
 */
(function ($) {
    //构造器
    function rolelist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    rolelist.prototype = {
        constructor: rolelist,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            _self.loadDataGrid();
            //添加
            $('#roleAdd').bind('click', function () {
                _self.add();
            });
            //搜索
            $('#roleSearch').bind('click', function () {
                _self.roleSearch();
            });
            //删除
            $('#rolesDel').bind('click', function () {
                _self.rolesDel();
            })
        },
        //设置表格表头
        loadGridTitle: function () {
            var _self = this;
            _self.listTypeShow = [[
                {field: 'choose', checkbox: true, width: "5%"},
                {field: 'roleName', title: '角色名称', width: '18%'},
                {field: 'roleValue', title: '角色值', width: '15%'},
                {
                    field: 'statusId', title: '状态', width: '12%',
                    formatter: function (value, row, index) {
                        if (value == "0") {
                            return "锁定";
                        }
                        if (value == "1") {
                            return "启用";
                        }
                        return "未知状态";
                    }
                },
                {
                    field: 'createTime', title: '创建时间', width: '17%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'updateTime', title: '修改时间', width: '17%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'operate', title: '操作', width: '17%',
                    formatter: function (value, row, index) {
                        var btn = "";
                        btn = '<a class="smallBtn"  onclick="roleView(' + row.id + ')">查看</a> &nbsp;'
                            + '<a class="smallBtn" onclick="roleEdit(' + row.id + ')">修改</a> &nbsp;'
                            + '<a class="smallBtn" onclick="roleDelete(' + row.id + ')" >删除</a>';
                        return btn;
                    }
                },

            ]]
        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                //url路径识别不了
                url: '/wangyueche/admin/role/page',// 加载的URL
                method: 'post',
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
                singleSelect: false,
                queryParams: data || {},
                loadMsg: "查询数据请稍候。。。",
                pagination: true,// 显示分页
                pageSize: 20,// 分页大小
                pageList: [10, 20, 30, 40, 50],// 每页的个数
                fit: false,// 自动补全
                fitColumns: true,
                title: '',
                iconCls: "icon-save",// 图标
                columns: _self.listTypeShow
            });
        },
        //添加
        add: function () {
            var _self = this;
            var title = "角色添加";
            var html = '<div class="open-table">' +
                '<table class="layui-table" lay-skin="nob" >' +
                '<tr> ' +
                '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>角色:</td>' +
                '<td style="width: 65%"><input type="text" class="user_form-control" name="roleName" id="roleName" placeholder="输入角色名称..."></td></tr>' +
                '<tr>' +
                '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>角色值:</td>' +
                '<td><input type="text" class="user_form-control" name="roleValue" id="roleValue" placeholder="输入角色值..."></td>' +
                '</tr>' +
                '<tr>' +
                '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>角色状态:</td>' +
                '<td><select  name="statusId" id="userStatus"> ' +
                '<option value="1">锁定</option> <option value="0">激活</option> </select></td>' +
                '</tr>' +
                '<tr>' +
                '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>权限设置:</td>' +
                '<td><input type="checkbox" id="allCheckbox" onclick="allCheckbox()">全选<div class="open_scroll"><ul></ul></div></td>' +
                // '<td id="permissionRole"><input type="checkbox" id="allCheckbox" class="flat-red"onClick="onClickCheckbox(allCheckbox,permission)">全选 <br/></td>' +
                '</tr>' +
                '</table>' +
                '</div>';
            layer.open({
                type: 1,
                title: '新增',
                skin: 'layui-layer-rim', //加上边框
                area: ['450px', '430px'],
                zIndex: 500,
                shadeClose: true, //点击遮罩关闭
                content: html,
                btn: ['保存', '取消'],
                success: function () {
                    // 权限
                    cLib.base.list("admin/permission/permissionList").done(function (data) {
                        $.each(data, function (index, item) {
                            $("ul").append("<li>" + "<input type='checkbox' onclick='subBox()' name='subBox' value='" + data[index].id + "'/>" + data[index].permissionName + "</li>");
                        });
                    });
                    //角色框全选和不全选
                    $("input[name='subBox']").bind('click', function () {
                        cLib.base.subBox("input[name='subBox']", "#allCheckbox");
                    });
                    $("#allCheckbox").bind('click', function () {
                        cLib.base.allCheckbox("input[name='subBox']", "#allCheckbox");
                    });
                },
                yes: function (index, layero) {
                    var roleName = $('#roleName').val(),
                        roleValue = $('#roleValue').val(),
                        statusId = $('#statusId').val(),
                        rolePers = '';
                    $('input[name="subBox"]:checked').each(function () {
                        rolePers += $(this).val() + ",";
                    });
                    rolePers = rolePers.substring(0, rolePers.length - 1);
                    if (roleName == '') {
                        layer.msg('角色名称不能为空！', {
                            time: 1000 //20s后自动关闭
                        });
                        return false;
                    } else if (roleValue == '') {
                        layer.msg('角色值不能为空！', {
                            time: 1000 //20s后自动关闭
                        });
                        return false;
                    } else if (rolePers == '') {
                        layer.msg('必须分配权限！', {
                            time: 1000 //20s后自动关闭
                        });
                        return false;
                    } else {
                        var subdata = {
                            roleName: roleName,
                            roleValue: roleValue,
                            statusId: statusId,
                            permission: rolePers,
                        };
                        cLib.base.add(subdata, "admin/role/save").done(function (res) {
                            layer.close(index);
                            if (res != 0) {
                                //服务器设置resultData为删除的记录数
                                layer.alert("添加失败");
                            }
                            else {
                                layer.msg('添加成功！', {
                                    time: 2000, //20s后自动关闭
                                    btn: ['确定'],
                                    yes: function () {
                                        layer.closeAll();
                                    }
                                });
                            }
                            _self.listView.datagrid('reload');
                        });
                    }

                },
                btn2: function (index, layero) {
                    layer.close(index);
                }
            })
        },
        //搜索
        roleSearch: function () {
            var _self = this;
            var roleName = $("#rName").val();
            var startDate = $("#startDate").val();
            var endDate = $("#endDate").val();
            var param = {
                roleName: roleName,
                startDate: startDate,
                endDate: endDate
            }
            _self.loadDataGrid(param);
        },
        //批量删除
        rolesDel: function () {
            var _self = this;
            var rows = _self.listView.datagrid('getSelections');
            //如果没有选中行
            if (!rows || rows.length == 0) {
                layer.alert("请先选中要删除的行");
            }
            else {
                var dataArray = [];
                $.each(rows, function (i, n) {
                    dataArray.push(n.id);
                });

                layer.confirm('是否删除选中数据?', function (result) {
                    // 取消删除操作
                    if (!result) {
                        return;
                    }
                    // 删除
                    cLib.base.deleteByIds({"checkedId[]": dataArray}, "admin/role/delChecked").done(function (result) {
                        if (result.status != 0) {
                            //服务器设置resultData为删除的记录数
                            layer.alert("成功删除" + result + "条记录！", "success");
                            _self.listView.datagrid('reload');
                        }
                        else {
                            layer.alert("删除失败");
                        }
                    });
                });
            }
        }

    };
    //将服务模型添加到全局变量中
    Carnet.module["rolelist"] = rolelist;
})(jQuery);
// 查看详情
function roleView(id) {
    cLib.base.view(id, "/admin/role/view?id=").done(function (data) {
        var html = '<div class="open-table">' +
            '<table class="layui-table" lay-skin="nob" >' +
            '<tr> ' +
            '<td class="right"> 角色:</td>' +
            '<td style="width: 65%"><input type="text" disabled class="user_form-control" name="roleName" id="roleName"placeholder="输入角色名称..."></td></tr>' +
            '<tr>' +
            '<td class="right"> 角色值:</td>' +
            '<td><input type="text" disabled class="user_form-control"  name="roleValue" id="roleValue" placeholder="输入角色值..."></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right">角色状态:</td>' +
            '<td><input type="text" disabled id="statusId"></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right">权限:</td>' +
            '<td><div class="open_scroll"><ul id="role_permission"></ul></div></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right"> 创建时间:</td>' +
            '<td><input type="text" disabled id="createTime" class="Wdate" onfocus="WdatePicker({dateFmt:\'yyyy-MM-dd\',maxDate:\'%y-%M-{%d}\',minDate:\'%y-%M-{%d-91}\'})"/></td>' +
            '</tr>' +
            '</table>' +
            '</div>';
        layer.open({
            type: 1,
            title: '角色查看',
            skin: 'layui-layer-rim', //加上边框
            area: ['450px', '430px'],
            zIndex: 500,
            shadeClose: true, //点击遮罩关闭
            content: html,
            btn: ['确定'],
            success: function () {
                $('#roleName').val(data.roleName);
                $('#roleValue').val(data.roleValue);
                // 状态
                if (data.statusId == "0") {
                    $('#statusId').val("锁定");
                } else if (data.statusId == "1") {
                    $('#statusId').val("激活");
                }
                ;
                // 权限
                $.each(data.permissionList, function (index, item) {
                    $("#role_permission").append("<li>" + item.permissionName + "</li>");
                });
                // 创建时间
                if (data.createTime != null) {
                    $('#createTime').val(data.createTime)
                } else if (data.createTime == null) {
                    $('#createTime').val("未录入")
                }
                ;

            },
            yes: function (index, layero) {
                layer.close(index);
            }
        });
    });
};
// 修改
function roleEdit(id) {
    cLib.base.view(id, "/admin/role/view?id=").done(function (data) {
        var html = '<div class="open-table">' +
            '<table class="layui-table" lay-skin="nob" >' +
            '<tr> ' +
            '<td class="right"> 角色:</td>' +
            '<td style="width: 65%"><input type="text"  class="user_form-control" name="roleName" id="roleName"placeholder="输入角色名称..."></td></tr>' +
            '<tr>' +
            '<td class="right"> 角色值:</td>' +
            '<td><input type="text"  class="user_form-control"  name="roleValue" id="roleValue" placeholder="输入角色值..."></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right">角色状态:</td>' +
            '<td>' +
            '<select name="statusId" id="statusId"> ' +
            '<option value="1">激活</option> ' +
            '<option value="0">锁定</option> </select>' +
            '</tr>' +
            '<tr>' +
            '<td class="right">权限:</td>' +
            '<td><input type="checkbox" id="allCheckbox" onclick="allCheckbox()">全选<div class="open_scroll"><ul id="role_permission"></ul></div></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right"> 创建时间:</td>' +
            '<td><input type="text"  didsabled id="createTime" disabled class="Wdate" onfocus="WdatePicker({dateFmt:\'yyyy-MM-dd\',maxDate:\'%y-%M-{%d}\',minDate:\'%y-%M-{%d-91}\'})"/></td>' +
            '</tr>' +
            '</table>' +
            '</div>';
        layer.open({
            type: 1,
            title: '角色修改',
            skin: 'layui-layer-rim', //加上边框
            area: ['450px', '430px'],
            zIndex: 500,
            shadeClose: true, //点击遮罩关闭
            content: html,
            btn: ['确定', '取消'],
            yes: function () {
                var roleName = $('#roleName').val(),
                    roleValue = $('#roleValue').val(),
                    statusId = $('#statusId').val(),
                    rolePers = '';
                $('input[name="subBox"]:checked').each(function () {
                    rolePers += $(this).val() + ",";
                });
                rolePers = rolePers.substring(0, rolePers.length - 1);
                if (roleName == '') {
                    layer.msg('角色名称不能为空！');
                    return false;
                } else if (roleValue == '') {
                    layer.msg('角色值不能为空！');
                    return false;
                } else {
                    var subdata = {
                        roleName: roleName,
                        roleValue: roleValue,
                        statusId: statusId,
                        permission: rolePers
                    };
                    cLib.base.update(id, "admin/role/update?id=", subdata).done(function (data) {
                        if (data != "0") {
                            layer.msg('更新失败，请检查');
                        }
                        else {
                            // layer.msg(subdata.permission);
                            layer.msg('更新成功！', {
                                time: 20000 //20s后自动关闭
                            });
                            layer.closeAll();
                            $('#dataList').datagrid('reload');
                        }
                    })
                }
                ;
            },
            btn2: function (index, layero) {
                layer.close(index);
            },
            success: function () {
                $('#roleName').val(data.roleName);
                $('#roleValue').val(data.roleValue);
                // 状态
                $('#statusId').val(data.statusId);
                // 权限(已设置项状态为checked）
                cLib.base.list("admin/permission/permissionList").done(function (result) {
                    $.each(result, function (index, item) {
                        isExit = 1;
                        $.each(data.permissionList, function (permissionIndex, permissionItem) {
                            if (permissionItem.id == item.id) {
                                $("#role_permission").append("<input  name='subBox' checked  type='checkbox' value='" + result[index].id + "'>" + result[index].permissionName + "<br/>");
                                isExit = 0;
                            }
                        });
                        if (isExit == 1) {
                            $("#role_permission").append("<input type='checkbox' name='subBox'  value='" + result[index].id + "'/>" + result[index].permissionName + "<br/>");
                        }
                    });
                });
                // 创建时间
                if (data.createTime != null) {
                    $('#createTime').val(data.createTime)
                } else if (data.createTime == null) {
                    $('#createTime').val("未录入")
                }
                ;
                //角色框全选和不全选
                $("input[name='subBox']").bind('click', function () {
                    cLib.base.subBox("input[name='subBox']", "#allCheckbox");
                });
                $("#allCheckbox").bind('click', function () {
                    cLib.base.allCheckbox("input[name='subBox']", "#allCheckbox");
                });
            },

        });
    });
};
// 删除
function roleDelete(id) {
    layer.confirm('您真的确定要删除id=' + id + '的角色吗？\n\n请确认！', {icon: 3, title: '提示'}, function (index) {
        cLib.base.update(id, "admin/role/delete?id=").done(function (result) {
            if (result == "0") {
                layer.alert("删除成功");
                $('#dataList').datagrid('reload');
            } else {
                layer.alert("删除失败，请检查");
            }
        });

    });
}
