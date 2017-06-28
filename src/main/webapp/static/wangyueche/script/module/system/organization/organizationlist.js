/**
 * Created by wangpeng on 2017/4/1.
 */
(function ($) {
    //构造器
    function organizationlist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    organizationlist.prototype = {
        constructor: organizationlist,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            _self.loadDataGrid();
            //添加
            $('#addBtn').bind('click', function () {
                _self.add();
            })
            //搜索
            $('#searchBtn').bind('click', function () {
                _self.loadSearch();
            })
            //清除搜索框
            $('#clearBtn').bind('click', function () {
                _self.clearSearch();
            })
            //批量删除
            $('#deletesBtn').bind('click', function () {
                _self.deleteByIds();
            })
        },
        //设置表格表头
        loadGridTitle: function () {
            var _self = this;
            _self.listTypeShow = [[
                {field: 'choose', checkbox: true, width: "5%"},
                {field: 'name', title: '部门名称', width: '14%'},
                {field: 'sysUser', title: '负责人', width: '13%',
                    formatter: function (value, row, index) {
                        return value.name;
                    }
                },
                {field: 'email', title: '邮箱', width: '17%'},
                {field: 'remark', title: '备注', width: '13%'},
                {
                    field: 'statusId', title: '状态', width: '6%',
                    formatter: function (value, row, index) {
                        if (value == "0") {
                            return "不可用";
                        }
                        else if (value == "1") {
                            return "可用";
                        }
                        else return "未知状态";
                    }
                },
                {field: 'createTime', title: '创建时间', width: '20%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }},
                {
                    field: 'operate', title: '操作', width: '14%',
                    formatter: function (value, row, index) {
                        var btn = "";
                        //
                        btn = '<a class="smallBtn" id="viewBtn" onclick="viewOrganization(' + row.id + ')">查看</a> &nbsp;'
                            + '<a class="smallBtn" id="editBtn" onclick="editOrganization(' + row.id + ')">修改</a> &nbsp;'
                            + '<a class="smallBtn" id="deleteBtn" onclick="deleteOrganization(' + row.id + ')">删除</a>';

                        return btn;
                    }
                },

            ]];
        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                //url路径识别不了
                url: '/wangyueche/admin/organization/page',// 加载的URL
                method: 'post',
                isField: "id",
                onLoadSuccess: function (data) {
                    cLib.base.setLangChina(_self.listViewId);//设置中文显示
                    //清除没有记录时重复显示的问题
                    if($('#hasNoneData')){
                        $('#hasNoneData').remove();
                    }
                    if (data.total == 0) {
                        $('.datagrid-view').append('<div id = "hasNoneData" style="text-align:center;padding-top:40px;" class="searchnodata">没有找到相关记录</div>');
                    }
                },
                height: $('#contentIn', window.parent.document).height() - 200,
                width: '100%',
                rownumbers: true,
                singleSelect: false,
                queryParams: data || {},
                loadMsg: "查询数据请稍候。。。",
                pagination: true,// 显示分页
                pageSize: 20,// 分页大小
                pageList: [10, 20, 30, 40, 50],// 每页的个数
                fit: false,// 自动补全
                fitColumns: true,
                title: '',
                iconCls: "icon-save",// 图标
                columns: _self.listTypeShow
            });
        },
        //添加
        add: function () {
            var _self = this;
            var title = "添加";
            var html = '<div class="layerCon">' +
                '<p class="txtWrap">' +
                '<span class="txtName">部门名称：</span>' +
                '<input type="text" id="organizationName" placeholder="输入名称..."/>' +
                '</p>' +
                '<p class="txtWrap" >' +
                '<span class="txtName">负责人：</span>' +
                '<input type="text" id="organizationUser" placeholder="输入姓名，确认存在..."/>' +
                '</p><br/>' +
                '<p class="txtWrap">' +
                '<span class="txtName">邮箱：</span>' +
                '<input type="text" id="organizationEmail"  name="organizationEmail" placeholder="输入邮箱..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">备注：</span>' +
                '<input type="text" id="organizationRemark"  name="organizationRemark" placeholder="输入备注..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">状态：</span>' +
                '<select name="organizationStatus" id="organizationStatus"> ' +
                '<option value="1">可用</option> ' +
                '<option value="0">禁用</option> </select>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">上级部门：</span>' +
                '<select name="organizationParent" id="organizationParent">' +
                '</select>' +
                '</p> ' +
                '</div>';
            layer.open({
                type: 1,
                title: title,
                skin: 'layui-layer-rim', //加上边框
                area: ['400px', '400px'],
                zIndex: 500,
                shadeClose: true, //点击遮罩关闭
                content: html,
                btn: ['保存', '取消'],
                success: function () {

                    //获取organization列表
                    $("#organizationParent").empty();
                    cLib.base.list("admin/organization/organizationList").done(function (data) {
                        $.each(data, function (index, item) {
                            $("#organizationParent").append("<option value='" + data[index].id + "'>" + data[index].name + "</option>");
                        });
                    });
                },
                yes: function (index, layero) {
                    var organizationName = $('#organizationName').val(),
                        organizationUser = $('#organizationUser').val(),
                        organizationEmail = $('#organizationEmail').val(),
                        organizationRemark = $('#organizationRemark').val(),
                        organizationStatus = $('#organizationStatus').val(),
                        organizationParent = $('#organizationParent').val();

                    if (organizationName == '') {
                        layer.msg('名称不能为空！');
                        return false;
                    } else if (organizationUser == '') {
                        layer.msg('负责人不能为空！');
                        return false;
                    } else if (organizationParent == '') {
                        layer.msg('上级部门不能为空！');
                        return false;
                    } else {
                        //查询当前用户是否存在
                        $.ajax({
                            url: '/wangyueche/admin/security/checkUser?name=' + organizationUser + "&email=" + organizationEmail,
                            dataType: "json",
                            type: "post",
                            async: false,
                            success: function(result){
                                if(JSON.stringify(result)=="false"){
                                    layer.msg('负责人与邮箱不匹配，请确认');
                                }
                                else{
                                    organizationUser=result;
                                    var subdata = {
                                        name: organizationName,
                                        userId: organizationUser,
                                        email: organizationEmail,
                                        remark: organizationRemark,
                                        statusId: organizationStatus,
                                        parentId: organizationParent,
                                    }
                                    cLib.base.add(subdata, "admin/organization/save").done(function (res) {
                                        // if (res.ret == 0) {
                                        layer.close(index);
                                        layer.msg("添加成功");
                                        _self.listView.datagrid('reload');
                                        // }
                                    })
                                }
                            }
                        });
                    }

                },
                btn2: function (index, layero) {
                    layer.close();
                }
            })

        },
        //搜索
        loadSearch: function () {
            var _self = this;
            var orgName = $("#orgName").val();
            var orgLeader = $("#orgLeader").val();
            var param = {
                orgName: orgName,
                orgLeader: orgLeader
            }
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            $('#orgName').val("");
            $('#orgLeader').val("");
        },
        //批量删除
        deleteByIds: function () {
            var _self = this;
            var rows = _self.listView.datagrid('getSelections');
            //如果没有选中行
            if (!rows || rows.length == 0) {
                layer.msg("请先选中要删除的行");
            }
            else {
                var dataArray = [];
                $.each(rows, function (i, n) {
                    dataArray.push(n.id);
                });

                layer.confirm('是否删除选中数据?', function (result) {
                    // 取消删除操作
                    if (!result) {
                        return;
                    }
                    // 删除
                    cLib.base.deleteByIds({"checkedId[]": dataArray}, "admin/organization/delChecked").done(function (result) {
                        alert(result);
                        if (result != 0) {
                            //服务器设置resultData为删除的记录数
                            layer.msg("成功删除" + result + "条记录！");
                            _self.listView.datagrid('reload');
                        }
                        else {
                            layer.msg("删除失败");
                        }
                    });
                });
            }
        }


    }
    //将服务模型添加到全局变量中
    Carnet.module["organizationlist"] = organizationlist;
})(jQuery);

// 查看详情
function viewOrganization(id) {
    cLib.base.view(id, "/admin/organization/view?id=").done(function (data) {
        var html = '<div class="layerCon">' +
            '<p class="txtWrap">' +
            '<span class="txtName">部门名称：</span>' +
            '<input type="text" id="organizationName" disabled placeholder="输入名称..."/>' +
            '</p>' +
            '<p class="txtWrap" >' +
            '<span class="txtName">负责人：</span>' +
            '<input type="text" id="organizationUser" disabled placeholder="输入姓名，确认存在..."/>' +
            '</p><br/>' +
            '<p class="txtWrap">' +
            '<span class="txtName">邮箱：</span>' +
            '<input type="text" id="organizationEmail" disabled  name="organizationEmail" placeholder="输入邮箱..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">备注：</span>' +
            '<input type="text" id="organizationRemark" disabled name="organizationRemark" placeholder="输入备注..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">状态：</span>' +
            '<select name="organizationStatus" id="organizationStatus" disabled> ' +
            '<option value="1">可用</option> ' +
            '<option value="0">禁用</option> </select>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">上级部门：</span>' +
            '<select name="organizationParent" id="organizationParent">' +
            '</select>' +
            '</p> ' +
            '</div>';
        layer.open({
            type: 1,
            title: '详情',
            skin: 'layui-layer-rim', //加上边框
            area: ['400px', '500px'],
            zIndex: 500,
            shadeClose: true, //点击遮罩关闭
            content: html,
            btn: ['关闭'],
            success: function () {
                $('#organizationName').val(data.name);
                //负责人信息
                $("#organizationUser").val(data.sysUser.name);
                $('#organizationEmail').val(data.email);
                $('#organizationRemark').val(data.remark);
                $('#organizationStatus').val(data.statusId);

                //上级部门信息
                cLib.base.list("admin/organization/organizationList").done(function (result) {
                    $.each(result, function (index, item) {
                        if(result[index].id == data.parentId){
                            $("#organizationParent").append("<option value='" + result[index].id + "'>" + result[index].name + "</option>");
                        }
                    });
                });
                $("#organizationParent").val(data.parentId);
            },
            btn2: function (index, layero) {
                layer.close(index);
            }
        });

    });

}
//修改更新
function editOrganization(id) {
    cLib.base.view(id, "/admin/organization/view?id=").done(function (data) {
        var html = '<div class="layerCon">' +
            '<p class="txtWrap">' +
            '<span class="txtName">部门名称：</span>' +
            '<input type="text" id="organizationName" placeholder="输入名称..."/>' +
            '</p>' +
            '<p class="txtWrap" >' +
            '<span class="txtName">负责人：</span>' +
            '<input type="text" id="organizationUser" placeholder="输入姓名，确认存在..."/>' +
            '</p><br/>' +
            '<p class="txtWrap">' +
            '<span class="txtName">邮箱：</span>' +
            '<input type="text" id="organizationEmail"  name="organizationEmail" placeholder="输入邮箱..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">备注：</span>' +
            '<input type="text" id="organizationRemark"  name="organizationRemark" placeholder="输入备注..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">状态：</span>' +
            '<select name="organizationStatus" id="organizationStatus"> ' +
            '<option value="1">可用</option> ' +
            '<option value="0">禁用</option> </select>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">上级部门：</span>' +
            '<select name="organizationParent" id="organizationParent">' +
            '</select>' +
            '</p> ' +
            '</div>';
        layer.open({
            type: 1,
            title: '更新',
            skin: 'layui-layer-rim', //加上边框
            area: ['400px', '500px'],
            zIndex: 500,
            shadeClose: true, //点击遮罩关闭
            content: html,
            btn: ['确定', '取消'],
            success: function () {
                $('#organizationName').val(data.name);
                //负责人信息
                $("#organizationUser").val(data.sysUser.name);
                $('#organizationEmail').val(data.email);
                $('#organizationRemark').val(data.remark);
                $('#organizationStatus').val(data.statusId);

                //上级部门信息
                cLib.base.list("admin/organization/organizationList").done(function (result) {
                    $.each(result, function (index, item) {
                        if(result[index].id != data.id){
                            $("#organizationParent").append("<option value='" + result[index].id + "'>" + result[index].name + "</option>");
                        }
                    });
                });
                $("#organizationParent").val(data.parentId);
            },
            yes: function (index, layero) {
                var organizationName = $('#organizationName').val(),
                    organizationUser = $('#organizationUser').val(),
                    organizationEmail = $('#organizationEmail').val(),
                    organizationRemark = $('#organizationRemark').val(),
                    organizationStatus = $('#organizationStatus').val(),
                    organizationParent = $('#organizationParent').val();
                //查询当前用户是否存在

                if (organizationName == '') {
                    layer.msg('名称不能为空！');
                    return false;
                } else if (organizationUser == '') {
                    layer.msg('负责人不能为空！');
                    return false;
                } else if (organizationParent == '') {
                    layer.msg('上级部门不能为空！');
                    return false;
                } else {

                    //查询当前用户是否存在
                    $.ajax({
                        url: '/wangyueche/admin/security/checkUser?name=' + organizationUser + "&email=" + organizationEmail,
                        dataType: "json",
                        type: "post",
                        async: false,
                        success: function(result){
                            if(JSON.stringify(result)=="false"){
                                layer.msg('负责人与邮箱不匹配，请确认');
                            }
                            else{
                                organizationUser=result;
                                var subdata = {
                                    name: organizationName,
                                    userId: organizationUser,
                                    email: organizationEmail,
                                    remark: organizationRemark,
                                    statusId: organizationStatus,
                                    parentId: organizationParent
                                }
                                cLib.base.update(id, "admin/organization/update?id=", subdata).done(function (data) {
                                    if (data != "0") {
                                        layer.msg('更新失败，请检查');
                                    }
                                    else {
                                        layer.msg('更新成功');
                                        layer.close(index);
                                        $('#dataList').datagrid('reload');
                                    }
                                })
                            }
                        }
                    });
                }
            },
            btn2: function (index, layero) {
                layer.close(index);
            }
        });

    });

}

function deleteOrganization(id) {
    layer.confirm('您真的确定要删除id=' + id + '的组织吗？\n\n请确认！', {icon: 3, title: '提示'}, function (index) {
        cLib.base.update(id, "admin/organization/delete?id=").done(function (result) {
            if (result == "0") {
                layer.msg("删除成功");
                $('#dataList').datagrid('reload');
            } else {
                layer.msg("删除失败，请检查");
            }
        });
    });

}
