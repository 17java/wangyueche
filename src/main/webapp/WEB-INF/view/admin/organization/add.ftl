<div class="row">
    <div class="col-md-12">
        <form id="organizationAddForm">
            <div class="user_caption">部门添加</div>
            <table class="table table-striped table-bordered table_font">
                <tr>
                    <td class="right">
                        <label class="notNull">*&nbsp;&nbsp;</label>
                        <label id="organizationNameLabel">部门名称</label>
                    </td>
                    <td>
                        <input type="text" class="user_form-control" name="organizationName" id="organizationName" placeholder="输入部门名称...">
                    </td>
                </tr>
                <tr>
                    <td class="right">
                        <label id="userNameLabel">负责人</label>
                    </td>
                    <td>
                        <input type="text" class="form-control" name="userName" id="org_userName" placeholder="输入负责人...">
                    </td>
                </tr>
                <tr>
                    <td class="right">
                        <label id="emailLabel">邮箱</label></td>
                    <td>
                        <input type="email" class="form-control" name="email" id="email" placeholder="输入负责人邮箱地址...">
                    </td>
                </tr>
                <tr>
                    <td class="right">
                        <label id="remarkLabel">备注</label>
                    </td>
                    <td>
                        <input type="text" class="form-control" name="remark" id="remark" placeholder="输入备注...">
                    </td>
                </tr>
                <tr>
                    <td class="right">
                        <label class="notNull">*&nbsp;&nbsp;</label>
                        <label id="parentOrganizationNameLabel">上级部门</label>
                    </td>
                    <td>
                        <select name="parentOrganizationName" id="parentOrganizationName" class="form-control select2" style="width: 100%;">

                            <#--待修改，organizattions中目前无数据-->
                            <option value ="">--请选择--</option>
                            <#--<#list organizations as organization>-->
                                <#--<option value="${organization.id}">${organization.organizationName}</option>-->
                            <#--</#list>-->
                        </select>
                    </td>
                </tr>
            </table>
            <div class="modal-footer">
                <div class="pull-right">
                    <button type="button" class="btn btn-default btn-xs" data-dismiss="modal"><i class="fa fa-close"></i>取消
                    </button>
                    <button type="button" class="btn btn-primary btn-xs" onclick="organizationSave();"><i class="fa fa-save"></i>保存
                    </button>
                </div>
            </div>
    </div>
    </form>
</div>
</div>
<script type="text/javascript">
    function organizationSave(){
        $("span").remove(".errorClass");
        $("br").remove(".errorClass");
        var status = 1;
        if($("#organizationName").val()==""){
            $("#organizationNameLabel").prepend('<span class="errorClass" style="color:red">*部门名不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if($("#org_userName").val()==""){
            $("#userNameLabel").prepend('<span class="errorClass" style="color:red">*负责人不能为空</span><br class="errorClass"/>');
            status = 0;
        }
        if(status == 0){
            return false;
        }else{
            $.ajax({
                url: '${ctx}/admin/organization/save',
                type: 'post',
                dataType: 'text',
                data: $("#organizationAddForm").serialize(),
                success: function (data) {
                    $("#lgModal").modal('hide');
                    alertMsg("添加成功","success");
                    organizationReload();
                }
            });
        }
    }

    $(function () {
        //负责人输入框自动提示
        $("#org_userName").autocomplete({
            source:"${ctx}/admin/organization/autocomplete",
            minChars: 1,
            max: 10,
            autoFill: true,
            mustMatch: true,
            matchContains: true
        });
    })

</script>