<div class="row">
    <div class="col-md-12">
        <form id="permissionEditForm">
            <input type="hidden" id="id" name="id" value=${bean.id}>
            <div class="box-body">
                <div class="user_caption">权限修改</div>
                <table class="table table-striped table-bordered table_font">
                    <tr>
                        <td class="right"><label for="permissionsName" id="permissionNameLabel">权限名：</label></td>
                        <td style="width: 75%">
                            <input type="text" class="form-control" name="permissionsName" id="permissionsName"
                                   value=${bean.permissionsName!}>
                        </td>
                    </tr>
                    <tr>
                        <td class="right"><label for="permissionsValue" id="permissionValueLabel">权限值：</label></td>
                        <td>
                            <input type="text" class="form-control" name="permissionsValue" id="permissionsValue"
                                   value=${bean.permissionsValue!}>
                        </td>
                    </tr>
                    <tr>
                        <td class="right"><label for="exampleInput" id="permissionParentIdsLabel">父权限：</label></td>
                        <td><label>
                            <input type="checkbox" id="allCheckbox" class="flat-red"
                                   onClick="onClickCheckbox('allCheckbox','role')">全选
                            <#--具体显示待完善-->
                        </label>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="box-footer">
                <div class="pull-right">
                    <button type="button" class="btn btn-default btn-xs" data-dismiss="modal"><i
                            class="fa fa-close"></i>关闭
                    </button>
                    <button type="button" class="btn btn-primary btn-xs" onclick="permissionUpdate();"><i
                            class="fa fa-paste"></i>更新
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript">
    function permissionUpdate() {
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
                url: "${ctx}/admin/permission/update",
                type: "post",
                dataType: "text",
                data: $("#permissionEditForm").serialize(),
                success: function (data) {
                    $("#lgModal").modal('hide');
                    alertMsg("更新成功", "success");
                    permissionReload(permission_tab);
                }
            });
        }
    }
</script>