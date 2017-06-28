<div class="row">
    <div class="col-md-12">
        <form id="permissionAddForm">
            <div class="user_caption">新增权限</div>
            <table class="table table-striped table-bordered table_font">
                <tr>
                    <td class="right">
                        <label class="notNull">*&nbsp;&nbsp;</label>
                        <label id="permissionName">权限名</label>
                    </td>
                    <td>
                        <input type="text" class="user_form-control" name="permissionName" id="permissionsName"
                               placeholder="输入权限名...">
                    </td>
                </tr>
                <tr>
                    <td class="right">
                        <label class="notNull">*&nbsp;&nbsp;</label>
                        <label id="permissionValue">权限值</label>
                    </td>
                    <td>
                        <input type="text" class="user_form-control" name="permissionValue" id="permissionsValue"
                               placeholder="输入权限值...">
                    </td>
                </tr>
                <tr>
                    <td class="right"><label class="notNull">*&nbsp;&nbsp;</label><label
                            id="roleValueLabel">权限状态</label>
                    </td>
                    <td>
                        <select class="user_form-control user_select" name="statusId" id="permissionStatus">
                            <option value="1">锁定</option>
                            <option value="0">激活</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="right">
                        <label class="notNull">*&nbsp;&nbsp;</label>
                        <label for="exampleInput" id="permissionValueLabel">父权限</label>
                    </td>
                    <td>
                        <label><input type="checkbox" id="allCheckbox" class="flat-red"
                                      onClick="onClickCheckbox('allCheckbox','permission')">全选</label>
                        <br/>
                    <#-- <#list permissions as permission>
                         <label>
                             <input type="checkbox" name="permission" class="flat-red"
                                    value="${permission.id}"> ${permission.permissionName}
                         </label>
                     </#list>-->
                    </td>
                </tr>
            </table>
            <div class="modal-footer">
                <div class="pull-right">
                    <button type="button" class="btn btn-default btn-xs" data-dismiss="modal"><i
                            class="fa fa-close"></i>取消
                    </button>
                    <button type="button" class="btn btn-primary btn-xs" onclick="permissionSave();"><i
                            class="fa fa-save"></i>保存
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript">
    function permissionSave() {
        $("span").remove(".errorClass");
        $("br").remove(".errorClass");
        var status = 1;
        if ($("#permissionsName").val() == "") {
            $("#permissionNameLabel").prepend('<span class="errorClass" style="color:red">*权限名不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if ($("#permissionsValue").val() == "") {
            $("#permissionValueLabel").prepend('<span class="errorClass" style="color:red">*权限名不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if (status == 0) {
            return false;
        } else {
            $.ajax({
                url: '${ctx}/admin/permission/save',
                type: 'post',
                dataType: 'text',
                data: $("#permissionAddForm").serialize(),
                success: function (data) {
                    $("#lgModal").modal('hide');
                    alertMsg("添加成功", "success");
                    permissionReload(permission_tab);
                }
            });
        }
    }
</script>