<div class="user_view">
    <div class="box-body  no-padding">
        <div  class="user_caption" >用户信息</div>
        <table class="table table-striped table-bordered table_font">
            <tr>
                <td class="right"><label>工号：</label></td>
                <td>${bean.staffNo!}</td>
                <td class="right"><label>帐号：</label></td>
                <td >${bean.userNo!}</td>
            </tr>
            <tr>
                <td class="right"><label>姓名：</label></td>
                <td>${bean.name!}</td>
                <td class="right"><label>昵称：</label></td>
                <td>${bean.nickName!}</td>
            </tr>
            <tr>
                <td class="right"><label>性别：</label></td>
                <td>
                <#if bean.sex == 0>女</#if>
                <#if bean.sex == 1>男</#if>
                </td>
                <td class="right"><label>年龄：</label></td>
                <td>${bean.age!}</td>
            </tr>
            <tr>
                <td class="right"><label>锁定标志：</label></td>
                <td>
                <#if bean.locked == 0>激活</#if>
                <#if bean.locked == 1>锁定</#if>
                </td>
                <td class="right"><label>所属组织机构：</label></td>
                <td>${bean.organizationId!}</td>
            </tr>
            <tr>
                <td class="right"><label>职位：</label></td>
                <td>${bean.position!}</td>
                <td class="right"><label>人员类型：</label></td>
                <td>${bean.userType!}</td>
            </tr>
            <tr>
                <td class="right"><label>拥有角色：</label></td>
                <td>
                <#list bean.roleList as role>
                ${role_index+1}.${role.roleName}
                </#list>
                </td>
                <td class="right"><label>电话：</label></td>
                <td>${bean.phone!}</td>

            </tr>
            <tr>
                <td class="right"><label>邮箱：</label></td>
                <td>${bean.email!}</td>
                <td class="right"><label>体重：</label></td>
                <td>${bean.weight!}</td>
            </tr>
            <tr>
                <td class="right"><label>身高：</label></td>
                <td>${bean.height!}</td>
                <td class="right"><label>民族：</label></td>
                <td>${bean.nation!}</td>
            </tr>
            <tr>
                <td class="right"><label>婚姻状况：</label></td>
                <td>
                ${bean.isMarried!}
                <#if bean.isMarried == 0>未婚
                <#elseif  bean.isMarried == 1>已婚
                <#else >未录入
                </#if>
                </td>
                <td class="right"><label>户籍所在地：</label></td>
                <td>${bean.address!}</td>
            </tr>
            <tr>
                <td class="right"><label>创建时间：</label></td>
                <td>${bean.createTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                <td class="right"><label>更新时间：</label></td>
                <td>${bean.updateTime?string('yyyy-MM-dd HH:mm:ss')}</td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td class="right"><label>更新者：</label></td>
                <td>${bean.updateBy!}</td>
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

<script type="text/javascript">


    //<div>你说好</div>
    alert("进入script" + $(.user_view).html());
    $(function () {
        layer.open({
            type: 0,
            title: '列表',
//            skin: 'demo-class',
            skin: 'layui-layer-rim', //加上边框
            area: ['600px', '400px'],
            zIndex: 500,
            shadeClose: false, //点击遮罩关闭
            content:$('.user_view'),
            btn: ['关闭','确定'],
            success: function () {

            },
            btn2: function (index, layero) {
                layer.close(index);
            }

        });
    });

</script>