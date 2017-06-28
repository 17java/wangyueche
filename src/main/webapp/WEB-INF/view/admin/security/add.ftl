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
<div class="row">
    <div class="col-md-12">
        <form id="securityAddForm">
            <div class="user_caption">用户信息</div>
            <table class="layui-table table table-striped table_font table-bordered">
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="numberLabel">编号：</label>
                    </td>
                    <td style="width: 75%"><input type="text" class="user_form-control" name="userNumber"
                                                  id="userNumber"
                                                  placeholder="输入编号..."></td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="userNoLabel">账号：</label>
                    </td>
                    <td>
                        <input type="text" class="user_form-control" name="userNo" id="userNo" placeholder="输入账号...">
                    </td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="nameLabel">姓名：</label></td>
                    <td><input type="text" class="user_form-control" name="userName" id="userName"
                               placeholder="输入姓名...">
                    </td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="passwordLabel">密码：</label>
                    </td>
                    <td><input type="text" class="user_form-control" name="userPassword" id="userPassword"
                               placeholder="输入密码...">
                    </td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="nickNameLabel">昵称：</label>
                    </td>
                    <td><input type="text" class="user_form-control" name="userNnickName" id="userNnickName"
                               placeholder="输入昵称..."></td>
                </tr>
                <tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="sexLabel">性别：</label></td>
                    <td>
                        <select class="user_form-control user_select" name="userSex" id="userSex">
                            <option value="1">男</option>
                            <option value="0">女</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="ageLabel">年龄：</label></td>
                    <td><input type="text" class="user_form-control" name="userAge" id="userAge" placeholder="输入年龄...">
                    </td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="statusIdLabel">状态：</label>
                    </td>
                    <td class="user_select">
                        <select class="user_form-control user_select" name="userStatusId" id="userStatusId">
                            <option value="1">可用</option>
                            <option value="0">禁用</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label
                            id="organizationIdLabel">组织：</label></td>
                    <td>
                        <select class="user_form-control user_select" name="userOrganizationId"
                                id="userOrganizationId">
                            <option value="1"></option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="right"><label id="roleLabel">拥有角色：</label></td>
                    <td><label>
                        <input type="checkbox" id="allCheckbox" class="flat-red"
                               onClick="onClickCheckbox('allCheckbox','role')">全选
                    </label>
                        <br/>
                    <#list roles as role>
                        <#if role.roleValue == 'superAdmin'>
                            <@shiro.hasPermission name="super:update">
                                <label>
                                    <input type="checkbox" name="role" class="flat-red"
                                           value="${role.id}"> ${role.roleName}
                                </label>
                            </@shiro.hasPermission>
                        <#else>
                            <label>
                                <input type="checkbox" name="role" class="flat-red" value="${role.id}"> ${role.roleName}
                            </label>
                        </#if>
                    </#list>
                    </td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="phoneLabel">电话：</label>
                    </td>
                    <td><input type="text" class="user_form-control" name="userPhone" id="userPhone"
                               placeholder="输入电话..."></td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label id="emailLabel">邮箱：</label>
                    </td>
                    <td><input type="text" class="user_form-control" name="userEmail" id="userEmail"
                               placeholder="输入邮箱..."></td>
                </tr>
                <tr>
                    <td class="right"><label id="weightLabel">体重：</label></td>
                    <td><input type="text" class="user_form-control" name="userWeight" id="userWeight"
                               placeholder="输入体重..."></td>

                </tr>
                <tr>
                    <td class="right"><label id="Label">身高：</label></td>
                    <td><input type="text" class="user_form-control" name="userNo" id="userNo" placeholder="输入身高...">
                    </td>
                </tr>
                <tr>
                    <td class="right"><label id="heightLabel">民族：</label></td>
                    <td><input type="text" class="user_form-control" name="userHeight" id="userHeight"
                               placeholder="输入民族..."></td>
                </tr>
                <tr>
                    <td class="right"><label id="isMarriedLabel">婚姻状况：</label></td>
                    <td>
                        <select class="user_form-control user_select" name="userIsMarried id=" userIsMarried" >
                        <option value="0">未婚</option>
                        <option value="1">已婚</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="right"><label id="addressLabel">住址：</label></td>
                    <td><input type="text" class="user_form-control" name="userAddress" id="userAddress"
                               placeholder="输入住址..."></td>
                </tr>
            </table>

            <div class="modal-footer">
                <div class="pull-right">
                    <button type="button" class="btn btn-default btn-xs" data-dismiss="modal">
                        <i class="fa fa-close"></i>关闭
                    </button>
                    <button type="button" class="btn btn-primary btn-xs" onclick="securitySave();">
                        <i class="fa fa-save"></i>确定
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>

<script type="text/javascript">

    function securitySave() {
        $("span").remove(".errorClass");
        $("br").remove(".errorClass");
        var status = 1;
        if ($("#userNumber").val() == "") {
            $("#userNumber").after('<span class="errorClass" style="color:red">*编号不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if ($("#userNo").val() == "") {
            $("#userNo").after('<span class="errorClass" style="color:red">*账号不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if ($("#userName").val() == "") {
            $("#userName").after('<span class="errorClass" style="color:red">*姓名不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if ($("#userPassword").val() == "") {
            $("#userPassword").after('<span class="errorClass" style="color:red">*密码不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if ($("#userNnickName").val() == "") {
            $("#userNnickName").after('<span class="errorClass" style="color:red">*昵称不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if ($("#userAge").val() == "") {
            $("#userAge").after('<span class="errorClass" style="color:red">*年龄不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if ($("#userPhone").val() == "") {
            $("#userPhone").after('<span class="errorClass" style="color:red">*电话不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if ($("#userEmail").val() == "") {
            $("#userEmail").after('<span class="errorClass" style="color:red">*邮箱不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if (status == 0) {
            return false;
        } else {
            $.ajax({
                url: '${ctx}/admin/security/save',
                type: 'post',
                dataType: 'text',
                data: $("#securityAddForm").serialize(),
                success: function (data) {
                    $("#lgModal").modal('hide');
                    alertMsg("添加成功", "success");
                    reloadTable(list_ajax, "#securityTime", "#securityPremise");
                }
            });
        }
    }
</script>
</body>