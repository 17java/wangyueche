<div class="row">
    <div class="col-md-12">
        <div  class="user_caption" >修改部门信息</div>
        <form id="organizationEditForm">
            <input type="hidden" id="id" name="id" value=${bean.id}>

            <table class="table table-striped table-bordered table_font">
                <tr>
                    <td class="right">
                        <label class="notNull">*&nbsp;&nbsp;</label>
                        <label id="organizationNameLabel">部门名称</label>
                    </td>
                    <td>
                        <input type="text" class="user_form-control" value="${bean.name}" name="organizationName" id="organizationName" placeholder="输入部门名称...">
                    </td>
                </tr>
                <tr>
                    <td class="right">
                        <label id="userNameLabel">负责人</label>
                    </td>
                    <td>
                        <input type="text" class="form-control" value="${bean.userId}" name="userName" id="userName" placeholder="输入负责人...">
                    </td>
                </tr>
                <tr>
                    <td class="right">
                        <label id="emailLabel">邮箱</label></td>
                    <td>
                        <input type="email" class="form-control" value="${bean.email}" name="email" id="email" placeholder="输入负责人邮箱地址...">
                    </td>
                </tr>
                <tr>
                    <td class="right">
                        <label id="remarkLabel">备注</label>
                    </td>
                    <td>
                        <input type="text" class="form-control" value="${bean.remark}" name="remark" id="remark" placeholder="输入备注...">
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
                            <option value ="">${(bean.parentName)?default("没有找到上级部门")}</option>
                        <#--<#list organizations as organization>-->
                        <#--<option value="${organization.id}">${organization.organizationName}</option>-->
                        <#--</#list>-->
                        </select>
                    </td>
                </tr>
            </table>
            <div class="box-footer">
                <div class="pull-right">
                    <button type="button" class="btn btn-default btn-sm" data-dismiss="modal"><i class="fa fa-close"></i>关闭</button>
                    <button onclick="organizationUpdate();" type="button" class="btn btn-primary btn-sm"><i class="fa fa-paste"></i>更新</button>
                </div>
            </div>
        </form>
    </div>
    </div>
</div>
<script type="text/javascript">
    function organizationUpdate(){
        $.ajax({
            url: '${ctx}/admin/organization/update',
            type: 'post',
            dataType: 'text',
            data: $("#organizationEditForm").serialize(),
            success: function (data) {
                $("#lgModal").modal('hide');
                alertMsg("更新成功","success");
                reloadTable(list_ajax,"#organizationTime","#organizationPremise");
            }
        });
    }

</script>