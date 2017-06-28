<#--详情弹出页面_tab-->
<div class="row">
    <!-- Custom Tabs -->
    <div class="nav-tabs-custom">
        <ul class="nav nav-tabs">
            <li class="active"><a href="#tab_userInfo" data-toggle="tab" >角色信息</a></li>
            <li><a href="#tab_userPer" data-toggle="tab">应用权限</a></li>
            <li><a href="#tab_userRole" data-toggle="tab">角色关联</a></li>
        </ul>
        <div class="tab-content">
        <#--基本信息页面-->
            <div class="tab-pane active" id="tab_userInfo">
            <#--<div class="row">-->
                <div class="user_view">
                    <div class="box-body  no-padding">
                        <table class="table table-striped table-bordered table_font">
                            <tr>
                                <td class="right" style="width:20%">角色：</td>
                                <td>${bean.roleName!}</td>
                            </tr>
                            <tr>
                                <td class="right">角色值：</td>
                                <td>${bean.roleValue}</td>
                            </tr>
                            <tr>
                                <td class="right">状态：</td>
                                <td>${bean.statusId}</td>
                            </tr>
                            <tr>
                                <td class="right">拥有权限：</td>
                                <td>
                                <#list bean.permissionList as permission>
                                ${permission_index+1}.${permission.permissionName}
                                    </#list>
                                </td>
                            </tr>
                            <tr>
                                <td class="right">创建时间：</td>
                                <td></td>
                            <#--<td>${bean.createTime?string('yyyy-MM-dd HH:mm:ss')!}</td>-->
                            </tr>
                            <tr>
                                <td class="right">更新时间：</td>
                                <td></td>
                            <#--<td>${bean.createTime?string('yyyy-MM-dd HH:mm:ss')!}</td>-->
                            </tr>
                        </table>
                        <div class="box-footer">
                            <div class="pull-right">
                                <button type="button" class="btn btn-default btn-sm" id="close"
                                        data-dismiss="modal"><i class="fa fa-close"></i>关闭
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            <#--</div>-->
            </div>
            <!-- 应用权限tab页面 -->
            <div class="tab-pane" id="tab_userPer">
            </div>
            <!-- 角色关联tab页面 -->
            <div class="tab-pane" id="tab_userRole">

            </div>
            <!-- /.tab-pane -->
        </div>
        <!-- /.tab-content -->
    </div>
    <!-- nav-tabs-custom -->
</div>

