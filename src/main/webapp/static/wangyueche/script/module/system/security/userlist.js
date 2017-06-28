/**
 * Created by wangpeng on 2017/4/1.
 */
(function ($) {
    //构造器
    function userlist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    userlist.prototype = {
        constructor: userlist,
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
                {field: 'staffNo', title: '工号', width: '5%'},
                {field: 'userNo', title: '账号', width: '5%'},
                {field: 'name', title: '姓名', width: '5%'},
                {field: 'nickName', title: '昵称', width: '9%'},
                {
                    field: 'sex', title: '性别', width: '5%',
                    formatter: function (value, row, index) {
                        if (value == "0") {
                            return "女";
                        }
                        if (value == "1") {
                            return "男";
                        }
                        return "未录入";
                    }
                },
                {field: 'organizationName', title: '组织', width: '8%'},
                {field: 'position', title: '职位', width: '8%'},
                {
                    field: 'roleList', title: '角色', width: '20%',
                    formatter: function (value, row, index) {
                        var listStr = "";
                        var list = value;
                        for (var i = 0; i < list.length; i++) {
                            listStr = listStr + (i + 1) + "." + list[i].roleName;
                        }
                        return listStr;
                    }
                },
                {
                    field: 'locked', title: '锁定标志', width: '9%',
                    formatter: function (value, row, index) {
                        if (value == "0") {
                            return "激活";
                        }
                        if (value == "1") {
                            return "锁定";
                        }
                        return "未知状态";
                    }
                },
                {field: 'userType', title: '人员类型', width: '9%'},
                {field: 'phone', title: '电话', width: '12%'},
                {
                    field: 'operate', title: '操作', width: '14%',
                    formatter: function (value, row, index) {
                        var btn = "";
                        //
                        btn = '<a class="smallBtn" id="viewBtn" onclick="viewUser(' + row.id + ')">查看</a> &nbsp;'
                            + '<a class="smallBtn" id="editBtn" onclick="editUser(' + row.id + ')">修改</a> &nbsp;'
                            + '<a class="smallBtn" id="deleteBtn" onclick="deleteUser(' + row.id + ')">删除</a>';

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
                url: '/wangyueche/admin/security/page',// 加载的URL
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
        //添加用户
        add: function () {
            var _self = this;
            var title = "添加";
            var html = '<div class="layerCon">' +
                '<p class="txtWrap">' +
                '<span class="txtName">工号：</span>' +
                '<input type="text" id="userStaffNo" placeholder="输入工号..."/>' +
                '</p>' +
                '<p class="txtWrap" >' +
                '<span class="txtName">账号：</span>' +
                '<input type="text" id="userNo" placeholder="输入账号..."/>' +
                '</p><br/>' +
                '<p class="txtWrap">' +
                '<span class="txtName">姓名：</span>' +
                '<input type="text" id="userName"  name="userName" placeholder="输入姓名..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">密码：</span>' +
                '<input type="text" id="userPassword"  name="userPassword" placeholder="输入密码..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">昵称：</span>' +
                '<input type="text" id="userNickName"  name="userNickName" placeholder="输入昵称..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">性别：</span>' +
                '<select name="userSex" id="userSex"> ' +
                '<option value="1">男</option> ' +
                '<option value="0">女</option> </select>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">年龄：</span>' +
                '<input type="text" id="userAge"  name="userAge" placeholder="输入年龄..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">状态：</span>' +
                '<select name="userStatusId" id="userStatusId"> ' +
                '<option value="1">可用</option> ' +
                '<option value="0">禁用</option> </select>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">部门：</span>' +
                '<select name="userOrganizationId" id="userOrganizationId">' +
                '<option value="1"></option></select>' +
                '</p> ' +
                '<p class="txtWrap" id="role">' +
                '<span class="txtName" >角色：</span>' +
                '<input type="checkbox" id="allCheckbox">全选' +
                // '<input type="checkbox" name="role" >' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">电话：</span>' +
                '<input type="text" id="userPhone"  name="userPhone" placeholder="输入电话..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">邮箱：</span>' +
                '<input type="text" id="userEmail"  name="userEmail" placeholder="输入邮箱..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">体重：</span>' +
                '<input type="text" id="userWeight"  name="userWeight" placeholder="输入体重..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">身高：</span>' +
                '<input type="text" id="userHeight"  name="userHeight" placeholder="输入身高..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">民族：</span>' +
                '<input type="text" id="userNation"  name="userNation" placeholder="输入民族..."/>' +
                '</p> ' +
                '<p class="txtWrap">' +
                '<span class="txtName">婚姻：</span>' +
                '<select name="userIsMarried id=" userIsMarried" > ' +
                '<option value="0">未婚</option> ' +
                '<option value="1">已婚</option></select>' +
                '</p> </br>' +
                '<p class="txtWrap">' +
                '<span class="txtName">住址：</span>' +
                '<input type="text" id="userAddress"  name="userAddress" placeholder="输入住址..."/>' +
                '</p> ' +
                '</div>';
            layer.open({
                type: 1,
                title: title,
                skin: 'layui-layer-rim', //加上边框
                area: ['800px', '500px'],
                zIndex: 500,
                shadeClose: true, //点击遮罩关闭
                content: html,
                btn: ['保存', '取消'],
                success: function () {
                    //获取role列表
                    cLib.base.list("admin/role/roleList").done(function (data) {
                        $.each(data, function (index, item) {
                            $("#role").append("<input type='checkbox' name='subBox' value='" + data[index].id + "'/>" + data[index].roleName);
                        });
                    });

                    //角色框全选和不全选
                    $("input[name='subBox']").bind('click', function () {
                        cLib.base.subBox("input[name='subBox']", "#allCheckbox");
                    });
                    $("#allCheckbox").bind('click', function () {
                        cLib.base.allCheckbox("input[name='subBox']", "#allCheckbox");
                    });

                    //获取organization列表
                    $("#userOrganizationId").empty();
                    cLib.base.list("admin/organization/organizationList").done(function (data) {
                        $.each(data, function (index, item) {
                            $("#userOrganizationId").append("<option value='" + data[index].id + "'>" + data[index].name + "</option>");
                        });
                    });
                },
                yes: function (index, layero) {
                    var userStaffNo = $('#userStaffNo').val(),
                        userNo = $('#userNo').val(),
                        userName = $('#userName').val(),
                        userPassword = $('#userPassword').val(),
                        userNickName = $('#userNickName').val(),
                        userSex = $('#userSex').val(),
                        userAge = $('#userAge').val(),

                        userStatusId = $('#userStatusId').val(),
                        userOrganizationId = $('#userOrganizationId').val(),
                        userOrganizationName = $("#userOrganizationId option:selected").text(),
                        //角色信息以字符串格式传入
                        userRoleId = '',
                        userPhone = $('#userPhone').val(),
                        userEmail = $('#userEmail').val(),
                        userWeight = $('#userWeight').val(),
                        userHeight = $('#userHeight').val(),
                        userNation = $('#userNation').val(),
                        userIsMarried = $('#userIsMarried').val(),
                        userAddress = $('#userAddress').val();

                    $('input[name="subBox"]:checked').each(function () {
                        userRoleId += $(this).val() + ","
                    })
                    userRoleId = userRoleId.substring(0, userRoleId.length - 1);
                    if (userStaffNo == '') {
                        layer.msg('工号不能为空！');
                        return false;
                    } else if (userNo == '') {
                        layer.msg('账号不能为空！');
                        return false;
                    } else if (userName == '') {
                        layer.msg('姓名不能为空！');
                        return false;
                    } else {
                        var subdata = {

                            staffNo: userStaffNo,
                            userNo: userNo,
                            name: userName,
                            password: userPassword,
                            nickName: userNickName,
                            sex: userSex,
                            age: userAge,

                            locked: userStatusId,
                            organizationId: userOrganizationId,
                            organizationName: userOrganizationName,
                            //角色信息以字符串格式传入
                            role: userRoleId,
                            phone: userPhone,
                            email: userEmail,
                            weight: userWeight,
                            height: userHeight,
                            nation: userNation,
                            isMarried: userIsMarried,
                            address: userAddress
                        }
                        cLib.base.add(subdata, "admin/security/save").done(function (res) {
                            //if(res.ret==0){
                            layer.close(index);
                            _self.listView.datagrid('reload');
                            //}
                        })
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
            var sName = $("#sName").val();
            var sStaffNo = $("#sStaffNo").val();
            var organizationId = $("#sOrganizationId").val();
            var param = {
                name: sName,
                staffNo: sStaffNo,
                organizationName: organizationId
            }
            _self.loadDataGrid(param);
        },
        //清除搜索框内容
        clearSearch: function () {
            $('#sOrganizationId').val("");
            $('#sStaffNo').val("");
            $('#sName').val("");
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
                    cLib.base.deleteByIds({"checkedId[]": dataArray}, "admin/security/delChecked").done(function (result) {
                        if (result!= 0) {
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
    Carnet.module["userlist"] = userlist;
})(jQuery);

// 查看详情
function viewUser(id) {
    cLib.base.view(id, "/admin/security/view?id=").done(function (data) {
        var html = '<div class="layerCon">' +
            '<p class="txtWrap">' +
            '<span class="txtName">工号：</span>' +
            '<input type="text" id="userStaffNo" disabled placeholder="输入工号..."/>' +
            '</p>' +
            '<p class="txtWrap">' +
            '<span class="txtName">姓名：</span>' +
            '<input type="text" id="userName"  name="userName" disabled placeholder="输入姓名..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">昵称：</span>' +
            '<input type="text" id="userNickName"  name="userNickName" disabled placeholder="输入昵称..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">性别：</span>' +
            '<select name="userSex" id="userSex" disabled> ' +
            '<option value="1">男</option> ' +
            '<option value="0">女</option> </select>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">年龄：</span>' +
            '<input type="text" id="userAge"  name="userAge" disabled placeholder="输入年龄..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">状态：</span>' +
            '<select name="userStatusId" id="userStatusId" disabled> ' +
            '<option value="1">可用</option> ' +
            '<option value="0">禁用</option> </select>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">部门：</span>' +
            '<select name="userOrganizationId" id="userOrganizationId" disabled>' +
            // '<option value="1"></option>' +
            '</select>' +
            '</p> ' +
            '<p class="txtWrap" id="role">' +
            '<span class="txtName" >角色：</span>' +
            // '<input type="checkbox" id="allCheckbox">全选' +
            // '<input type="checkbox" name="role" >' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">电话：</span>' +
            '<input type="text" id="userPhone"  name="userPhone" disabled placeholder="输入电话..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">邮箱：</span>' +
            '<input type="text" id="userEmail"  name="userEmail" disabled placeholder="输入邮箱..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">体重：</span>' +
            '<input type="text" id="userWeight"  name="userWeight" disabled placeholder="输入体重..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">身高：</span>' +
            '<input type="text" id="userHeight"  name="userHeight" disabled placeholder="输入身高..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">民族：</span>' +
            '<input type="text" id="userNation"  name="userNation" disabled placeholder="输入民族..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">婚姻：</span>' +
            '<select name="userIsMarried id=" userIsMarried" disabled> ' +
            '<option value="0">未婚</option> ' +
            '<option value="1">已婚</option></select>' +
            '</p> </br>' +
            '<p class="txtWrap">' +
            '<span class="txtName">住址：</span>' +
            '<input type="text" id="userAddress"  name="userAddress" disabled placeholder="输入住址..."/>' +
            '</p> ' +
            '</div>';
        layer.open({
            type: 1,
            title: '详情',
            skin: 'layui-layer-rim', //加上边框
            area: ['800px', '500px'],
            zIndex: 500,
            shadeClose: true, //点击遮罩关闭
            content: html,
            btn: ['关闭'],
            success: function () {

                $('#userStaffNo').val(data.staffNo);
                $('#userName').val(data.name);
                $('#userNickName').val(data.nickName);
                $('#userSex').val(data.sex);
                $('#userAge').val(data.age);
                $('#userStatusId').val(data.locked);
                //部门信息
                $("#userOrganizationId").append("<option value=" + data.organizationId + ">" + data.organizationName + "</option>");
                $("#userOrganizationId").val(data.organizationId);
                //角色信息
                $.each(data.roleList, function (index, item) {
                    var roleInput = $('<input type="checkbox" name="roleCheckbox" disabled checked>' + item.roleName + '</input>');
                    roleInput.attr('value', item.id);
                    $('#role').append(roleInput);
                });
                $('#userPhone').val(data.phone);
                $('#userEmail').val(data.email);
                $('#userWeight').val(data.weight);
                $('#userHeight').val(data.height);
                $('#userNation').val(data.nation);
                $('#userIsMarried').val(data.isMarried);
                $('#userAddress').val(data.address);

            },
            btn2: function (index, layero) {
                layer.close(index);
            }
        });

    });

}
//修改更新
function editUser(id) {
    cLib.base.view(id, "/admin/security/view?id=").done(function (data) {
        var html = '<div class="layerCon">' +
            '<p class="txtWrap">' +
            '<span class="txtName">工号：</span>' +
            '<input type="text" id="userStaffNo" placeholder="输入工号..."/>' +
            '</p>' +
            '<p class="txtWrap" >' +
            '<span class="txtName">账号：</span>' +
            '<input type="text" id="userNo" placeholder="输入账号..."/>' +
            '</p><br/>' +
            '<p class="txtWrap">' +
            '<span class="txtName">姓名：</span>' +
            '<input type="text" id="userName"  name="userName" placeholder="输入姓名..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">密码：</span>' +
            '<input type="text" id="userPassword"  name="userPassword" placeholder="输入密码..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">昵称：</span>' +
            '<input type="text" id="userNickName"  name="userNickName" placeholder="输入昵称..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">性别：</span>' +
            '<select name="userSex" id="userSex"> ' +
            '<option value="1">男</option> ' +
            '<option value="0">女</option> </select>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">年龄：</span>' +
            '<input type="text" id="userAge"  name="userAge" placeholder="输入年龄..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">状态：</span>' +
            '<select name="userStatusId" id="userStatusId"> ' +
            '<option value="1">可用</option> ' +
            '<option value="0">禁用</option> </select>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">部门：</span>' +
            '<select name="userOrganizationId" id="userOrganizationId">' +
            // '<option value="1"></option>' +
            '</select>' +
            '</p> ' +
            '<p class="txtWrap" id="role">' +
            '<span class="txtName" >角色：</span>' +
            '<input type="checkbox" id="allCheckbox">全选' +
            // '<input type="checkbox" name="role" >' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">电话：</span>' +
            '<input type="text" id="userPhone"  name="userPhone" placeholder="输入电话..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">邮箱：</span>' +
            '<input type="text" id="userEmail"  name="userEmail" placeholder="输入邮箱..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">体重：</span>' +
            '<input type="text" id="userWeight"  name="userWeight" placeholder="输入体重..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">身高：</span>' +
            '<input type="text" id="userHeight"  name="userHeight" placeholder="输入身高..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">民族：</span>' +
            '<input type="text" id="userNation"  name="userNation" placeholder="输入民族..."/>' +
            '</p> ' +
            '<p class="txtWrap">' +
            '<span class="txtName">婚姻：</span>' +
            '<select name="userIsMarried id=" userIsMarried" > ' +
            '<option value="0">未婚</option> ' +
            '<option value="1">已婚</option></select>' +
            '</p> </br>' +
            '<p class="txtWrap">' +
            '<span class="txtName">住址：</span>' +
            '<input type="text" id="userAddress"  name="userAddress" placeholder="输入住址..."/>' +
            '</p> ' +
            '</div>';
        layer.open({
            type: 1,
            title: '更新',
            skin: 'layui-layer-rim', //加上边框
            area: ['800px', '500px'],
            zIndex: 500,
            shadeClose: true, //点击遮罩关闭
            content: html,
            btn: ['确定', '取消'],
            success: function () {
                $('#userStaffNo').val(data.staffNo);
                $('#userNo').val(data.userNo);
                $('#userName').val(data.name);
                $('#userPassword').val(data.password);
                $('#userNickName').val(data.nickName);
                $('#userSex').val(data.sex);
                $('#userAge').val(data.age);
                $('#userStatusId').val(data.locked);

                $('#userPhone').val(data.phone);
                $('#userEmail').val(data.email);
                $('#userWeight').val(data.weight);
                $('#userHeight').val(data.height);
                $('#userNation').val(data.nation);
                $('#userIsMarried').val(data.isMarried);
                $('#userAddress').val(data.address);


                //角色信息
                cLib.base.list("admin/role/roleList").done(function (result) {
                    //没有找到对应的role信息
                    var isExit = 1;
                    $.each(result, function (index, item) {
                        isExit = 1;
                        $.each(data.roleList, function (roleIndex, roleItem) {
                            if (roleItem.id == item.id) {
                                $("#role").append("<input type='checkbox' name='subBox' checked value='" + result[index].id + "'/>" + result[index].roleName);
                                isExit = 0;
                            }
                        });
                        if (isExit == 1) {
                            $("#role").append("<input type='checkbox' name='subBox'  value='" + result[index].id + "'/>" + result[index].roleName);
                        }
                    });
                });
                //角色框全选和不全选
                $("input[name='subBox']").bind('click', function () {
                    cLib.base.subBox("input[name='subBox']", "#allCheckbox");
                });
                $("#allCheckbox").bind('click', function () {
                    cLib.base.allCheckbox("input[name='subBox']", "#allCheckbox");
                });

                //获取organization列表
                cLib.base.list("admin/organization/organizationList").done(function (result) {
                    $.each(result, function (index, item) {
                        $("#userOrganizationId").append("<option value='" + result[index].id + "'>" + result[index].name + "</option>");
                    });
                });
                $("#userOrganizationId").val(data.organizationId);
            },
            yes: function (index, layero) {
                var userStaffNo = $('#userStaffNo').val(),
                    userNo = $('#userNo').val(),
                    userName = $('#userName').val(),
                    userPassword = $('#userPassword').val(),
                    userNickName = $('#userNickName').val(),
                    userSex = $('#userSex').val(),
                    userAge = $('#userAge').val(),

                    userStatusId = $('#userStatusId').val(),
                    userOrganizationId = $('#userOrganizationId').val(),
                    userOrganizationName = $("#userOrganizationId option:selected").text(),
                    //角色信息以字符串格式传入
                    userRoleId = '',
                    userPhone = $('#userPhone').val(),
                    userEmail = $('#userEmail').val(),
                    userWeight = $('#userWeight').val(),
                    userHeight = $('#userHeight').val(),
                    userNation = $('#userNation').val(),
                    userIsMarried = $('#userIsMarried').val(),
                    userAddress = $('#userAddress').val();

                $('input[name="subBox"]:checked').each(function () {
                    userRoleId += $(this).val() + ","
                })
                userRoleId = userRoleId.substring(0, userRoleId.length - 1);
                if (userStaffNo == '') {
                    layer.msg('工号不能为空！');
                    return false;
                } else if (userNo == '') {
                    layer.msg('账号不能为空！');
                    return false;
                } else if (userName == '') {
                    layer.msg('姓名不能为空！');
                    return false;
                } else {
                    var subdata = {
                        staffNo: userStaffNo,
                        userNo: userNo,
                        name: userName,
                        password: userPassword,
                        nickName: userNickName,
                        sex: userSex,
                        age: userAge,

                        locked: userStatusId,
                        organizationId: userOrganizationId,
                        organizationName: userOrganizationName,
                        //角色信息以字符串格式传入
                        role: userRoleId,
                        phone: userPhone,
                        email: userEmail,
                        weight: userWeight,
                        height: userHeight,
                        nation: userNation,
                        isMarried: userIsMarried,
                        address: userAddress
                    };
                    cLib.base.update(id, "admin/security/update?id=", subdata).done(function (data) {
                        if (data != "0") {
                            layer.msg('更新失败，请检查');
                        }
                        else {
                            layer.msg('更新成功');
                            layer.close(index);
                            $('#dataList').datagrid('reload');
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

function deleteUser(id) {
    layer.confirm('您真的确定要删除id=' + id + '的用户吗？\n\n请确认！', {icon: 3, title: '提示'}, function (index) {
        cLib.base.update(id, "admin/security/delete?id=").done(function (result) {
            if (result == "0") {
                layer.msg("删除成功");
                $('#dataList').datagrid('reload');
            } else {
                layer.msg("删除失败，请检查");
            }
        });
    });

};