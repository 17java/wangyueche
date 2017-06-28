<head>
<#include "../../macro/base.ftl" />
<@style/>
<@jsFile/>
</head>
<body>
<div class="row">
    <div class="col-md-12">
        <form id="roleAddForm">
            <table class="layui-table">
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="numberLabel">角色：</label>
                    </td>
                    <td style="width: 75%"><input type="text" class="user_form-control" name="roleName" id="roleName"
                                                  placeholder="输入角色名称..."></td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="roleValueLabel">角色值</label>
                    </td>
                    <td>
                        <input type="text" class="user_form-control" name="roleValue" id="roleValue"
                               placeholder="输入角色值...">
                    </td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label
                            id="roleValueLabel">角色状态</label>
                    </td>
                    <td>
                        <select class="user_form-control user_select" name="userStatus" id="userStatus">
                            <option value="1">锁定</option>
                            <option value="0">激活</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label>权限设置：</label></td>
                    <td>
                        <label>
                            <input type="checkbox" id="allCheckbox" class="flat-red"
                                   onClick="onClickCheckbox('allCheckbox','permission')">全选
                        </label>
                        <br/>
                    <#list permissions as permission>
                        <label>
                            <input type="checkbox" name="permission" class="flat-red"
                                   value="${permission.id}"> ${permission.permissionName}
                        </label>
                    </#list>
                    </td>
                </tr>
            </table>
            <div class="modal-footer">
                <div class="pull-right">
                    <button type="button" class="btn btn-default btn-xs" data-dismiss="modal"><i
                            class="fa fa-close"></i>取消
                    </button>
                    <button type="button" class="btn btn-primary btn-xs" onclick="roleAdd();"><i class="fa fa-save"></i>保存
                    </button>
                </div>
            </div>
    </div>
    </form>
</div>
</div>
<script type="text/javascript">
    function roleAdd() {
        $("span").remove(".errorClass");
        $("br").remove(".errorClass");
        var status = 1;
        if ($("#roleName").val() == "") {
            $("#roleNameLabel").prepend('<span class="errorClass" style="color:red">*角色名不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if ($("#roleValue").val() == "") {
            $("#roleValueLabel").prepend('<span class="errorClass" style="color:red">*角色值不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if (status == 0) {
            return false;
        } else {
            $.ajax({
                url: '${ctx}/admin/role/save',
                type: 'post',
                dataType: 'text',
                data: $("#roleAddForm").serialize(),
                success: function (data) {
                    debugger;
                    $("#lgModal").modal('hide');
                    alertMsg("添加成功", "success");
                    reloadTable(list_ajax, "#roleTime", "#rolePremise");
                }
            })
        }
    }
</script>
</body>