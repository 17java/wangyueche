<div class="row">
    <div class="box-body  no-padding">
        <div  class="user_caption" >部门信息</div>
        <table class="table table-striped table-bordered table_font">
            <tr>
                <td>部门名称：</td>
                <td>${bean.name!}</td>
            </tr>
            <tr>
                <td>负责人：</td>
                <td>${bean.userId!}</td>
            </tr>
            <tr>
                <td>邮箱:</td>
                <td>${bean.email}</td>
            </tr>
            <tr>
                <td>备注：</td>
                <td>${bean.remark!}</td>
            </tr>

            <tr>
                <td>上级部门：</td>
                <td>
                    ${(bean.parentName)?default("没有找到上级部门")}
                </td>
            </tr>
            <tr>
                <td>创建时间：</td>
                <td>${bean.createTime?string('yyyy-MM-dd HH:mm:ss')}</td>
            </tr>
            <tr>
                <td>更新时间：</td>
                <td>${bean.updateTime?string('yyyy-MM-dd HH:mm:ss')}</td>
            </tr>
        </table>
    </div>
        <div class="box-footer">
            <div class="pull-right">
                <button type="button" class="btn btn-default btn-sm" id="close" data-dismiss="modal"><i class="fa fa-close"></i>关闭</button>
            </div>
        </div>
    </div>
</div>