/**
 * Created by wangyan on 2017/4/19.
 */
(function ($) {
    //构造器
    function permissionlist() {
        this.server = new Carnet.module.server();
        this.listViewId = 'dataList';
        this.listView = $('#' + this.listViewId);
    };
    permissionlist.prototype = {
        constructor: permissionlist,
        init: function () {
            var _self = this;
            _self.bindEvents();
        },
        bindEvents: function () {
            var _self = this;
            _self.loadDataGrid();
            //添加
            $('#perAdd').bind('click', function () {
                _self.add();
            });
            //搜索
            $('#perSearch').bind('click', function () {
                _self.permissionSearch();
            });
            //批量删除
            $('#persDel').bind('click', function () {
                _self.permissionsDel();
            })
        },
        //设置表格表头
        loadGridTitle: function () {
            var _self = this;
            _self.listTypeShow = [[
                {field: 'choose', checkbox: true, width: "5%"},
                {field: 'permissionName', title: '权限名称', width: '15%'},
                {field: 'permissionValue', title: '权限值', width: '12%'},
                {
                    field: 'type', title: '类型', width: '10%',
                    formatter: function (value, row, index) {
                        if (value == "2") {
                            return "系统按钮";
                        }
                        else if (value == "1") {
                            return "系统菜单";
                        }
                        else if (value == "0") {
                            return "目录";
                        }
                        return "未录入";
                    }
                },
                // {
                // field: 'parentId', title: '父权限', width: '10%'
                // ,formatter: function (value, row, index) {
                //     return value.permissionName;
                // }
                // },
                {
                    field: 'statusId', title: '状态', width: '8%',
                    formatter: function (value, row, index) {
                        if (value == "1") {
                            return "锁定";
                        }
                        if (value == "0") {
                            return "启用";
                        }
                        return "未知状态";
                    }
                },
                {
                    field: 'createTime', title: '创建时间', width: '17%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'updateTime', title: '更新时间', width: '17%', formatter: function (value, row, index) {
                    return (value == null ? '' : cLib.base.getLocalTime(value));
                }
                },
                {
                    field: 'operate', title: '操作', width: '17%',
                    formatter: function (value, row, index) {
                        var btn = "";
                        btn = '<a class="smallBtn"  onclick="permissionView(' + row.id + ')">查看</a> &nbsp;'
                            + '<a class="smallBtn" onclick="permissionEdit(' + row.id + ')">修改</a> &nbsp;'
                            + '<a class="smallBtn" onclick="permissionDelete(' + row.id + ')" >删除</a>';
                        return btn;
                    }
                },

            ]]
        },
        //加载数据列表
        loadDataGrid: function (data) {
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({

                //url路径识别不了
                url: '/wangyueche/admin/permission/page',// 加载的URL
                method: 'post',
                isField: "id",
                onLoadSuccess: function (data) {
                    cLib.base.setLangChina(_self.listViewId);//设置中文显示
                    //清除没有记录时重复显示的问题
                    if ($('#hasNoneData')) {
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
            var title = "权限添加";
            var selectId = '';
            var html = '<div class="open-table">' +
                '<table class="layui-table"  lay-skin="nob">' +
                '<tr> ' +
                '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>权限名称:</td>' +
                '<td style="width: 65%"><input type="text"  id="permissionName" placeholder="输入权限名称..."></td></tr>' +
                '<tr>' +
                '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>权限值:</td>' +
                '<td><input type="text" id="permissionValue"  placeholder="输入权限值..."></td>' +
                '</tr>' +
                '<tr>' +
                '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>状态:</td>' +
                '<td><select  id="permissionStatus"> ' +
                '<option value="1">锁定</option> <option value="0">启用</option> </select></td>' +
                '</tr>' +
                '<tr>' +
                '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>类型:</td>' +
                '<td><select  id="permissionType"> ' +
                '<option value="2">系统按钮</option> <option value="1">系统菜单</option><option value="0">目录</option></select></td>' +
                '</tr>' +
                '<tr>' +
                '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>url:</td>' +
                '<td><input type="text"   id="permissionUrl" placeholder="输入权限值..."></td>' +
                '</tr>' +
                '<tr id="parent">' +
                '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>父id:</td>' +
                '<td><div class="open_scroll"><ul id="tt"></ul></div></td>' +
                '</tr>' +
                '</table>' +
                '</div>';
            layer.open({
                type: 1,
                title: '权限新增',
                skin: 'layui-layer-rim', //加上边框
                area: ['460px', '430px'],
                zIndex: 500,
                shadeClose: true, //点击遮罩关闭
                content: html,
                btn: ['保存', '取消'],
                success: function () {
                    //如果是按钮型权限，隐藏新增框中的父权限内容
                    if ($('#permissionType').val() == 2) {
                        $('#parent').hide();
                    }
                    else {
                        $('#parent').show();
                    }
                    $('#permissionType').change(function () {
                        permissionType = $('#permissionType').val();
                        //如果type是按钮，则隐藏父菜单
                        if (permissionType == 2) {
                            $('#parent').hide();
                        }
                        else {
                            $('#parent').show();
                        }
                    });

                    $('#tt').tree({
                        method: "get",
                        url: '/wangyueche/admin/permission/getNodes',    // The url will be mapped to NodeController class and getNodes method
                        onClick: function (node) {
                            selectId = node.id;  // alert node text property when clicked
                        }
                    });
                },
                yes: function (index, layero) {
                    var permissionName = $('#permissionName').val(),
                        permissionValue = $('#permissionValue').val(),
                        permissionStatus = $('#permissionStatus').val(),
                        permissionType = $('#permissionType').val(),
                        permissionUrl = $('#permissionUrl').val(),
                        permissionParent = selectId;

                    if (permissionName == '') {
                        layer.msg('权限名称不能为空！' + permissionParent, {
                            time: 1000,//20s后自动关闭
                        });
                        return false;
                    } else if (permissionValue == '') {
                        layer.msg('权限值不能为空！', {
                            time: 1000 //20s后自动关闭
                        });
                        return false;
                    } else if (permissionUrl == '') {
                        layer.msg('url不能为空！', {
                            time: 1000 //20s后自动关闭
                        });
                        return false;
                    } else {
                        var subdata = {
                            permissionName: permissionName,
                            permissionValue: permissionValue,
                            statusId: permissionStatus,
                            type: permissionType,
                            url: permissionUrl,
                            parentId: permissionParent,
                        };
                        cLib.base.add(subdata, "admin/permission/save").done(function (res) {
                            layer.close(index);
                            if (res != 0) {
                                //服务器设置resultData为删除的记录数
                                layer.alert("添加失败");
                            }
                            else {
                                layer.msg('添加成功！', {
                                    time: 2000, //20s后自动关闭
                                    btn: ['确定'],
                                    yes: function () {
                                        layer.closeAll();
                                    }
                                });
                            }
                            _self.listView.datagrid('reload');
                        });
                    }

                },
                btn2: function (index, layero) {
                    layer.close(index);
                }
            })
        },
        //搜索
        permissionSearch: function () {
            var _self = this;
            var perName = $('#perName').val();
            var perValue = $('#perValue').val();
            layer.msg(perName + perValue);
            var param = {
                permissionName: perName,
                permissionValue: perValue
            }
            _self.loadDataGrid(param);
        },
        //批量删除
        permissionsDel: function () {
            var _self = this;
            var rows = _self.listView.datagrid('getSelections');
            //如果没有选中行
            if (!rows || rows.length == 0) {
                layer.alert("请先选中要删除的行");
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
                    cLib.base.deleteByIds({"checkedId[]": dataArray}, "admin/permission/delChecked").done(function (result) {
                        if (result.status != 0) {
                            //服务器设置resultData为删除的记录数
                            layer.alert("成功删除" + result + "条记录！", "success");
                            _self.listView.datagrid('reload');
                        }
                        else {
                            layer.alert("删除失败");
                        }
                    });
                });
            }
        }

    };
    //将服务模型添加到全局变量中
    Carnet.module["permissionlist"] = permissionlist;
})(jQuery);
// 查看详情
function permissionView(id) {
    cLib.base.view(id, "/admin/permission/view?id=").done(function (data) {
        var html = '<div class="open-table">' +
            '<table class="layui-table"  lay-skin="nob">' +
            '<tr> ' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>权限名称:</td>' +
            '<td style="width: 65%"><input type="text" class="open-input"  disabled id="permissionName" placeholder="输入权限名称..."></td></tr>' +
            '<tr>' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>权限值:</td>' +
            '<td><input type="text" id="permissionValue" class="open-input" disabled placeholder="输入权限值..."></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>状态:</td>' +
            '<td><input type="text"  id="permissionStatus" class="open-input" disabled></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>类型:</td>' +
            '<td><input type="text" id="permissionType" class="open-input" disabled></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>url:</td>' +
            '<td><input type="text" disabled  id="permissionUrl" class="open-input"></td>' +
            '</tr>' +
            // '<tr>' +
            // '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>父权限:</td>' +
            // '<td><input type="text" id="parentId" disabled class="open-input"></td>' +
            // '</tr>' +
            '<tr>' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>创建时间:</td>' +
            '<td><input type="text" disabled  id="createTime" class="open-input"></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>更新时间:</td>' +
            '<td><input type="text" disabled  id="updateTime" class="open-input"></td>' +
            '</tr>' +
            '</table>' +
            '</div>';
        layer.open({
            type: 1,
            title: '权限查看',
            skin: 'layui-layer-rim', //加上边框
            area: ['450px', '430px'],
            zIndex: 500,
            shadeClose: true, //点击遮罩关闭
            content: html,
            btn: ['确定'],
            success: function () {
                $('#permissionName').val(data.permissionName);
                $('#permissionValue').val(data.permissionValue);
                // $('#permissionStatus').val(data.statusId);
                $('#permissionUrl').val(data.url);
                // 状态
                if (data.statusId == "1") {
                    $('#permissionStatus').val("锁定");
                } else if (data.statusId == "0") {
                    $('#permissionStatus').val("启用");
                }
                // 类型
                if (data.type == "2") {
                    $('#permissionType').val("系统按钮");
                } else if (data.type == "1") {
                    $('#permissionType').val("系统菜单");
                } else if (data.type == "0") {
                    $('#permissionType').val("目录");
                } else {
                    $('#permissionType').val("error");
                }
                // 创建时间
                if (data.createTime != null) {
                    $('#createTime').val(data.createTime)
                } else if (data.createTime == null) {
                    $('#createTime').val("未录入")
                }
                // 修改时间
                if (data.updateTime != null) {
                    $('#updateTime').val(data.updateTime)
                } else if (data.updateTime == null) {
                    $('#updateTime').val("未录入")
                }
            },
            yes: function (index, layero) {
                layer.close(index);
            }
        });
    });
};
// 修改
function permissionEdit(id) {
    cLib.base.view(id, "/admin/permission/view?id=").done(function (data) {
        var selectId = "";
        var html = '<div class="open-table">' +
            '<table class="layui-table"  lay-skin="nob" >' +
            '<tr> ' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>权限名称:</td>' +
            '<td style="width: 65%"><input type="text" class="open-input"  id="permissionName" ></td></tr>' +
            '<tr>' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>权限值:</td>' +
            '<td><input type="text" id="permissionValue" class="open-input" ></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>状态:</td>' +
            '<td><select  id="permissionStatus"  style="width: 160px"> ' +
            '<option value="1">锁定</option> <option value="0">启用</option> </select></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>类型:</td>' +
            '<td><select  id="permissionType" style="width: 160px;" > ' +
            '<option value="2">系统按钮</option> <option value="1">系统菜单</option><option value="0">目录</option></select></td>' +
            '</tr>' +
            '<tr>' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>url:</td>' +
            '<td><input type="text" class="open-input"  id="permissionUrl" ></td>' +
            '</tr>' +
            '<tr id="parent">' +
            '<td class="right"><label class="notNull">*&nbsp;&nbsp;</label>父权限:</td>' +
            '<td><div class="open_scroll"><ul id="tt"></ul></div></td>' +
            '</tr>' +
            '</table>' +
            '</div>';
        layer.open({
            type: 1,
            title: '权限修改',
            skin: 'layui-layer-rim', //加上边框
            area: ['450px', '430px'],
            zIndex: 500,
            shadeClose: true, //点击遮罩关闭
            content: html,
            success: function () {
                $('#permissionName').val(data.permissionName);
                $('#permissionValue').val(data.permissionValue);
                $('#permissionUrl').val(data.url);
                // 状态
                $('#statusId').val(data.statusId);

                //如果是菜单型权限，show父权限内容
                if ($('#permissionType').val() == 1) {
                    $('#parent').show();
                }
                else {
                    $('#parent').hide();
                }

                //如果是目录型权限，禁止修改type
                if ($('#permissionType').val() == 0) {
                    $('#permissionType').attr('disabled', 'disabled');
                }

                $('#permissionType').change(function () {
                    permissionType = $('#permissionType').val();
                    //如果type是按钮，则隐藏父菜单
                    if (permissionType == 2) {
                        $('#parent').hide();
                    }
                    else {
                        $('#parent').show();
                    }
                });

                $('#tt').tree({
                    method: "get",
                    url: '/wangyueche/admin/permission/getNodes',    // The url will be mapped to NodeController class and getNodes method
                    onClick: function (node) {
                        selectId = node.id;  // alert node text property when clicked
                    }
                });
            },
            btn: ['确定', '取消'],
            yes: function () {
                var permissionName = $('#permissionName').val(),
                    permissionValue = $('#permissionValue').val(),
                    permissionStatus = $('#permissionStatus').val(),
                    permissionType = $('#permissionType').val(),
                    permissionUrl = $('#permissionUrl').val(),
                    parentId = selectId;
                if (permissionName == '') {
                    layer.msg('角色名称不能为空！');
                    return false;
                } else if (permissionValue == '') {
                    layer.msg('角色值不能为空！');
                    return false;
                } else if (permissionUrl == '') {
                    layer.msg('url不能为空！');
                    return false;
                } else {
                    var subdata = {
                        permissionName: permissionName,
                        permissionValue: permissionValue,
                        statusId: permissionStatus,
                        type: permissionType,
                        url: permissionUrl,
                        parentId: parentId,
                    };
                    cLib.base.update(id, "admin/permission/update?id=", subdata).done(function (data) {
                        if (data != "0") {
                            layer.msg('更新失败，请检查');
                        }
                        else {
                            // layer.msg(subdata.parentId);
                            layer.msg('更新成功！', {
                                time: 20000, //20s后自动关闭
                            });
                            layer.closeAll();
                            $('#dataList').datagrid('reload');
                        }
                    })
                }
                ;
            },
            btn2: function (index, layero) {
                layer.close(index);
            },

        });
    });
};
// 删除
function permissionDelete(id) {
    layer.confirm('您真的确定要删除id=' + id + '的角色吗？\n\n请确认！', {icon: 3, title: '提示'}, function (index) {
        cLib.base.update(id, "admin/permission/delete?id=").done(function (result) {
            if (result == "0") {
                layer.alert("删除成功");
                $('#dataList').datagrid('reload');
            } else {
                layer.alert("删除失败，请检查");
            }
        });

    });
}
