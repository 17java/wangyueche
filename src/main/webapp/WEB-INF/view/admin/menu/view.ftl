<div class="user_view">
    <div class="box-body  no-padding">
        <div  class="user_caption" >菜单信息</div>
        <table class="table table-striped table-bordered table_font">
            <tr>
                <td class="right">菜单名称：</td>
                <td style="width: 75%">${bean.menuName!}</td>
            </tr>
            <tr>
                <td class="right">菜单类型：</td>
                <td>
                <#if bean.menuType == 0>CURD
                <#elseif  bean.menuType == 1>系统菜单
                <#else>业务菜单</#if></td>
            </tr>
            <tr>
                <td class="right">上级菜单:</td>
                <td>${bean.parentId!}</td>
            </tr>
            <tr>
                <td class="right">是否可用：</td>
                <td>
                <#if bean.enable == 0>不可用
                <#elseif  bean.enable == 1>可用
                <#else>未知状态</#if>
                </td>
            </tr>
            <tr>
                <td class="right">图标：</td>
                <td>${bean.iconcls?default("未录入")}</td>
            </tr>
            <tr>
                <td class="right">请求地址：</td>
                <td>${bean.href?default("未录入")}</td>
            </tr>
            <tr>
                <td class="right">展开状态：</td>
                <td>
                <#if bean.expand==0>收起
                <#elseif bean.expand==1>展开
                <#else >未知状态</#if>
                </td>
            </tr>
        </table>
        <div class="box-footer">
            <div class="pull-right">
                <button type="button" class="btn btn-default btn-sm" id="close" data-dismiss="modal"><i class="fa fa-close"></i>关闭</button>
            </div>
        </div>
    </div>
</div>