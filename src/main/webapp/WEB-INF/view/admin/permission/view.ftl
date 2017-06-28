<div class="user_view">
	<div class="box-body  no-padding">
        <div  class="user_caption" >权限信息</div>
        <table class="table table-striped table-bordered table_font">
			<tr>
                <td class="right"><label>角色值：</td>
				<td style="width: 75%">${bean.permissionsName!}</td>
			</tr>
			<tr>
                <td class="right"><label>类型：</label></td>
				<td>${bean.permissionsValue!}</td>
			</tr>
			<tr>
                <td class="right"><label>状态：</label></td>
				<td>
					<#if bean.statusId == '0'>不可用</#if>
					<#if bean.statusId == '1'>可用</#if>
				</td>
			</tr>
			<tr>
				<td class="right"><label>创建时间：</label></td>
				<td>${bean.createTime?string('yyyy-MM-dd HH:mm:ss')}</td>
			</tr>
			<tr>
				<td class="right"><label>更新时间：</label></td>
				<td>${bean.updateTime?string('yyyy-MM-dd HH:mm:ss')}</td>
			</tr>
		</table>
		<div class="box-footer">
			<div class="pull-right">
                <button type="button" class="btn btn-default btn-xs" id="close" data-dismiss="modal"><i
                        class="fa fa-close"></i>关闭
                </button>
			</div>
		</div>
	</div>
</div>