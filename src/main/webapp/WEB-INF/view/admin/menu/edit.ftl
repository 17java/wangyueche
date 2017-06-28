<div class="row">
    <div class="col-md-12">
        <form id="menuEditForm">
            <input type="hidden" id="id" name="id" value=${bean.id}>
            <div class="box-body">
                <div class="user_caption">菜单修改</div>
                <table class="table table-striped table-bordered table_font">
                    <tr>
                        <td class="right"><label for="menuName">菜单名称：</label></td>
                        <td style="width: 75%">
                            <input type="text" class="user_form-control" name="menuName" id="menuName"
                                   value=${bean.menuName!}>
                        </td>
                    </tr>
                    <tr>
                        <td class="right"><label for="menuType">菜单类型：</label></td>
                        <td>
                            <select name="menuType" id="menuType" class="user_form-control user_select" ">
                            <option <#if bean.menuType == 1>selected="selected"</#if> value="1"> 系统菜单</option>
                            <option <#if bean.menuType == 2>selected="selected"</#if> value="2">业务菜单</option>
                            <option <#if bean.menuType == 0>selected="selected"</#if> value="0">CURD</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="right"><label for="menuType">是否可用：</label></td>
                        <td>
                            <select name="menuType" id="menuType" class="user_form-control user_select" ">
                            <option <#if bean.menuType == 0>selected="selected"</#if> value="0">不可用</option>
                            <option <#if bean.menuType == 1>selected="selected"</#if> value="1">可用</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="right"><label for="expand">展开状态：</label></td>
                        <td>
                            <select name="expand" id="expand" class="user_form-control user_select" ">
                            <option <#if bean.expand == 0>selected="selected"</#if> value="0">收起</option>
                            <option <#if bean.expand == 1>selected="selected"</#if> value="1">展开</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="right"><label for="iconcls">图标：</label></td>
                        <td>
                            <input type="text" class="user_form-control" name="iconcls" id="iconcls"
                                   value=${bean.iconcls!}>
                        </td>
                    </tr>
                    <tr>
                        <td class="right"><label for="href">请求地址：</label></td>
                        <td>
                            <input type="text" class="user_form-control " name="href" id="href" disabled="disabled"
                                   value=${bean.href?default("未录入")}>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="box-footer">
                <div class="pull-right">
                    <button type="button" class="btn btn-default btn-xs" data-dismiss="modal"><i
                            class="fa fa-close"></i>关闭
                    </button>
                    <button type="button" class="btn btn-primary btn-xs" onclick="menuUpdate();"><i
                            class="fa fa-paste"></i>更新
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript">
    function menuUpdate() {
        $.ajax({
            url: '${ctx}/admin/menu/update',
            type: 'post',
            dataType: 'text',
            data: $("#menuEditForm").serialize(),
            success: function (data) {
                $("#lgModal").modal('hide');
                alertMsg("更新成功", "success");
                reloadTable(list_ajax, "#menuTime", "#menuPremise");
            }
        });
    }

</script>