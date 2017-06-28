/**
 * Item Name  :
 *Creator         :cc
 *Email            :cc
 *Created Date:2017.3.29.
 *@pararm
 * 正常围栏设置:
 */
(function ($, window) {
    function GD_fence_set(opts) {
        this.id = opts.id;
        this.fence_id = opts.fence_id;

        // 鼠标操作工具
        this.mouse_tools = null;
        // 围栏的默认样式
        this.styleOptions = Carnet.fence_styleOptions;
        // 编辑围栏的样式
        this.editOptions = Carnet.fence_editOptions;

        this.api = new Carnet.module.server().map.fence;
    };
    GD_fence_set.prototype = {
        //面向对象初始化
        init: function (key) {
            var me = this;
            // 功能关键字
            me.fn = key;
            me.init_Baner(); //开启控件
            setTimeout(function () {
                me.init_event();
            }, 500);
        },
        //控件默认初始化
        init_Baner: function () {
            var me = this;
            var map = me.map = new AMap.Map(me.id, {
                expandZoomRange: true,
                zoom: 20,
                zooms: [3, 20]
            });
            map.setZoomAndCenter(11, [117.227, 31.820]);
        },
        init_event: function () {
            var me = this;
            me.fence_bind();
            me.fence();
        },
        fence: function () {
            var me = this;
            me.f_init();
        },
        fence_bind: function () {
            var me = this;
            var fn = {
                f_init: function () {
                    var me = this;
                    me._show();
                    $('#f_out').on('click', function () {
                        $('#contentIn', parent.window.document).attr('src', Carnet.basePrefixURL + '/static/wangyueche/html/map/fenceList.html');
                    });
                    // -----------------------添加功能
                    if (me.fn == 'add') {
                        me._tool();
                        me._add();
                    }
                    // -----------------------编辑功能
                    else if (me.fn == 'upd') {
                        me._upd_f();
                    }
                },
                // *-----------------------------------------------tool
                _tool: function () {
                    var me = this;
                    me.map.plugin(["AMap.MouseTool"], function () {
                        me.mouse_tools = new AMap.MouseTool(me.map);
                        // 绘制完成的事件---进入编辑模式
                        me._tool_draw();
                    });
                    // 点击保存按钮
                    $('#f_opt_save').on('click', function () {
                        me._tool_save();
                    });
                    // 点击取消的按钮功能
                    $('#f_opt_un').on('click', function () {
                        me._tool_un();
                    });
                },
                // 绘制完成时的执行函数
                _tool_draw: function () {
                    var me = this;
                    me.mouse_tools.on('draw', function (data) {
                        me.mouse_tools.close();
                        me.map.setDefaultCursor("pointer");

                        // 保存和取消按钮
                        $('#f_edit,#f_opt_save,#f_opt_un').show();
                        // 拿到dom
                        var _dom = data.obj;

                        _dom.name = me.name;
                        // _dom.number = me.number;
                        _dom.shape = me.shape;
                        _dom.purpose = me.purpose;
                        _dom.remark = me.remark;
                        _dom.type = me.type;

                        me._dom = _dom;

                        // yuan
                        if (_dom.shape == 0) {
                            //输入半径，点击地图绘制圆形区域
                            if (me.radius) {
                                var circle = new AMap.Circle({   //圆形编辑器的样式
                                    map: me.map,
                                    center: new AMap.LngLat(me._dom.getCenter().lng, me._dom.getCenter().lat),
                                    radius: me.radius,
                                    strokeColor: "blue", //边线颜色。
                                    fillColor: "blue", //填充颜色。当参数为空时，圆形将没有填充效果。
                                    strokeWeight: 1, //边线的宽度，以像素为单位。
                                    strokeOpacity: 0.5, //边线透明度，取值范围0 - 1。
                                    fillOpacity: 0.1, //填充的透明度，取值范围0 - 1。
                                    strokeStyle: 'solid' //边线的样式，solid或dashed。
                                });
                                me._dom = circle;
                                me._dom.name = me.name;
                                // _dom.number = me.number;
                                me._dom.shape = me.shape;
                                me._dom.purpose = me.purpose;
                                me._dom.remark = me.remark;
                                me._dom.type = me.type;
                            }
                            me.mode = new AMap.CircleEditor(me.map, me._dom);   //创建圆形编辑器对象
                        }

                        // duo
                        else if (_dom.shape == 1) {
                            // 进入编辑模式
                            me.mode = new AMap.PolyEditor(me.map, me._dom);
                        }
                        me._show_e();
                        me.mode.open();
                        me._dom.setOptions(me.editOptions);
                    });
                },
                // -----点击保存
                _tool_save: function () {
                    var me = this;
                    var opts = null;

                    if (me._dom.shape == 0) {
                        opts = me._save_yuan();
                    } else if (me._dom.shape == 1) {
                        opts = me._save_duo();
                    }

                    me.api.save(opts)
                        .done(function (data) {
                            if (data > 0) {
                                layer.msg('围栏保存成功');
                                me.mode.close();
                                me._dom.setOptions(me.styleOptions);
                                // // 编辑模式关闭
                                $('#f_opt_save,#f_opt_un').hide();
                                $('#f_opt').show();
                            } else {
                                layer.msg('围栏保存失败');
                            }
                        });
                },
                _save_yuan: function () {
                    var me = this;
                    var opts = null;
                    var c, r;
                    r = me._dom.getRadius();
                    c = me._dom.getCenter();
                    return opts = {
                        name: me._dom.name,
                        // number: me._dom.number,
                        shape: me._dom.shape,
                        radius: r,
                        spots: JSON.stringify([{lng: c.lng, lat: c.lat}]),
                        purpose: me._dom.purpose,
                        remark: me._dom.remark,
                        type: me._dom.type,
                    };
                },
                // duo
                _save_duo: function () {
                    var me = this;
                    var opts = null;
                    var p_arr = me._dom.getPath();

                    var fence = [];
                    for (var j = 0; j < p_arr.length; j++) {
                        fence.push({lng: p_arr[j].lng, lat: p_arr[j].lat});
                    }

                    return opts = {
                        name: me._dom.name,
                        // number: me._dom.number,
                        shape: me._dom.shape,
                        radius: null,
                        spots: JSON.stringify(fence),
                        purpose: me._dom.purpose,
                        remark: me._dom.remark,
                        type: me._dom.type,
                    };
                },
                // -----点击取消
                _tool_un: function () {
                    var me = this;
                    $('#f_opt').show();
                    me.mode.close();
                    me._dom.setMap(null);
                    $('#f_opt_save,#f_opt_un').hide();
                    $('#f_opt').show();
                },


                // -------------------------------------------------显示
                _show: function () {
                    var me = this;
                    me.api.all()
                        .then(function (data) {
                            me.map.clearMap();
                            var items = data;
                            items.forEach(function (item) {
                                // yuan
                                if (item.shape == 0) {
                                    me._show_yuan(item);
                                }
                                // duo
                                else if (item.shape == 1) {
                                    me._show_duo(item);
                                }

                            });
                            me.map.setFitView();
                            // ------编辑模式直接定位到该围栏
                            if (me.fn == 'upd') {
                                me.map.setFitView([me._dom]);
                                me.map.setZoom(20);
                            }
                            // 展示的显示和编辑
                            me._show_e();
                        });
                },
                // 圆形展示
                _show_yuan: function (data) {
                    var me = this;
                    var center = JSON.parse(data.spots);
                    var opts = me.styleOptions;

                    var marker = new AMap.Circle(opts);
                    marker.setCenter(new AMap.LngLat(center[0].lng, center[0].lat));
                    marker.setRadius(data.radius);
                    marker.setMap(me.map);

                    marker.id = data.id;
                    marker.name = data.name;
                    // marker.number = data.number;
                    marker.shape = data.shape;
                    marker.purpose = data.purpose;
                    marker.remark = data.remark;
                    marker.type = data.type;
                },
                // 多边形
                _show_duo: function (data) {
                    var me = this;
                    var path = [];
                    var arr = JSON.parse(data.spots);
                    for (var i = 0; i < arr.length; i++) {
                        var p = arr[i];
                        path.push(new AMap.LngLat(p.lng, p.lat));
                    }

                    var Polygon = new AMap.Polygon(me.styleOptions);
                    Polygon.setPath(path);
                    Polygon.setMap(me.map);

                    Polygon.id = data.id;
                    Polygon.name = data.name;
                    // Polygon.number = data.number;
                    Polygon.shape = data.shape;
                    Polygon.purpose = data.purpose;
                    Polygon.remark = data.remark;
                    Polygon.type = data.type;

                    // --------------编辑模式
                    if (me.fn == 'upd') {
                        if (me.fence_id == Polygon.id) {
                            me._dom = Polygon;
                            me.mode = new AMap.PolyEditor(me.map, me._dom);
                            me.mode.open();
                            me._dom.setOptions(me.editOptions);
                        }
                    }
                },
                _show_e: function () {
                    var me = this;
                    var all_f = me.map.getAllOverlays();
                    // 显示信息事件
                    me._mouseover(all_f);
                    // 所有围栏的点击事件
                    // me._click(all_f);
                },
                // -----------------------------------------------------------显示功能
                _mouseover: function (arr) {
                    var me = this;
                    for (var i = 0; i < arr.length; i++) {
                        arr[i].off('mouseover');
                        arr[i].on('mouseover', function (e) {
                            e.target.indexLayer = layer.msg('名称：' + e.target.name +
                                // '</br>编号：' + e.target.number +
                                '</br>用途：' + e.target.purpose +
                                '</br>备注：' + e.target.remark, {
                                time: 0, //不自动关闭
                            });
                        });
                        arr[i].off('mouseout');
                        arr[i].on('mouseout', function (e) {
                            layer.close(e.target.indexLayer);
                        });
                    }
                },


                // *------------------------------------------------添加
                _add: function () {
                    var me = this;
                    $('#f_opt').show();

                    var str = '' +
                        '<p  class="f_p">' +
                        '<span> 名称： </span>' +
                        '<input name = "type" type = "text"  id = "name"/> *' +
                        '</p>' +
                        // '<p id = "type" class="f_p">' +
                        // '<span> 编码： </span>' +
                        // '<input name = "type" type = "text"  id = "number"/> *' +
                        // '</p>' +
                        '<p id class="f_p">' +
                        '<span> 形状： </span>' +
                        '<input name = "type" class="shape" type = "radio" value = "0"  checked = "checked" /><span class="f_p_one">圆形</span>' +
                        '<input name = "type" class="shape" type = "radio" value = "1" /><span class="f_p_one">多边形</span>' +
                        '</p>' +
                        '<p id = "s_radius" class="f_p">' +
                        '<span> 半径： </span>' +
                        '<input name = "type" type = "text"  id = "radius"/> *' +
                        '</p>' +
                        '<p id = "alarm" class="f_p">' +
                        '<span> 用途： </span>' +
                        '<input name = "type" type = "text"  id = "purpose"/>' +
                        '</p>' +
                        '<p id = "alarm" class="f_p">' +
                        '<span> 备注： </span>' +
                        '<input name = "type" type = "text"  id = "remark"/>' +
                        '</p>';


                    $('#f_opt').unbind().on('click', function () {
                        layer.open({
                            type: 1,
                            title: '新增围栏',
                            area: ['280px', '250px'],
                            zIndex: 500,
                            shadeClose: false, //点击遮罩关闭
                            content: str,
                            btn: ['保存', '取消'],
                            success: function () {
                                $(".shape").change(function () {
                                    me.shape = $("input[name='type']:checked").val();
                                    if (me.shape == 0) {
                                        $('#s_radius').show();
                                    }
                                    else {
                                        $('#s_radius').hide();
                                    }
                                });

                            },
                            yes: function (index, layero) {
                                me._add_yes(index);
                            },
                            btn2: function (index, layero) {
                                layer.close(index);
                            }
                        });
                    });
                },
                _add_yes: function (index) {
                    var me = this;
                    // 新增围栏影
                    if ($('#name').val() == '') {
                        layer.msg('名称不能为空！');
                        return;
                    }
                    // if ($('#number').val() == '') {
                    //     layer.msg('编码不能为空！');
                    //     return;
                    // }
                    // if (isNaN(Number($('#number').val()))) {
                    //     layer.msg('编码请输入数字！');
                    //     return;
                    // }


                    me.name = $('#name').val();
                    // me.number = $('#number').val();
                    me.shape = $("input[name='type']:checked").val();
                    me.radius = $('#radius').val();
                    me.purpose = $('#purpose').val();
                    me.remark = $('#remark').val();
                    me.type = "2";

                    $('#f_opt').hide();
                    // yuan
                    if (me.shape == 0) {
                        me.f_add_yuan();
                    }
                    // duo
                    else if (me.shape == 1) {
                        layer.msg('温馨提示：双击鼠标完成绘制围栏！');
                        // 绘制多边形
                        me.f_add_duo();
                    }
                    layer.close(index);
                },
                f_add_yuan: function () {
                    // body...
                    var me = this;
                    me.map.setDefaultCursor("crosshair");
                    me.mouse_tools.circle(me.styleOptions);
                },
                // 添加多边形
                f_add_duo: function (argument) {
                    var me = this;
                    me.map.setDefaultCursor("crosshair");
                    me.mouse_tools.polygon(me.styleOptions);
                },

                // -----------------------------------------------------------修改功能
                _upd_f: function (argument) {
                    var me = this;
                    $('#f_upd_save').on('click', function (argument) {
                        var dom = me._dom;
                        var str = '' +
                            '<p  class="f_p">' +
                            '<span> 名称： </span>' +
                            '<input name = "type" type = "text"  id = "name" value=' + dom.name + '> *' +
                            '</p>' +
                            // '<p id = "type" class="f_p">' +
                            // '<span> 编码： </span>' +
                            // '<input name = "type" type = "text"  id = "number"  value=' + dom.number + '> *' +
                            // '</p>' +
                            '<p id = "s_radius" class="f_p">' +
                            '<span> 半径： </span>' +
                            '<input name = "type" type = "text"  id = "radius"/> *' +
                            '</p>' +
                            '<p id = "alarm" class="f_p">' +
                            '<span> 用途： </span>' +
                            '<input name = "type" type = "text"  id = "purpose" value=' + dom.purpose + '>' +
                            '</p>' +
                            '<p id = "alarm" class="f_p">' +
                            '<span> 备注： </span>' +
                            '<input name = "type" type = "text"  id = "remark" value=' + dom.remark + '>' +
                            '</p>';

                        layer.open({
                            type: 1,
                            title: '修改围栏',
                            area: ['280px', '240px'],
                            zIndex: 500,
                            shadeClose: false, //点击遮罩关闭
                            content: str,
                            btn: ['保存', '取消'],
                            success: function () {
                                $(".shape").change(function () {
                                    me.shape = $("input[name='type']:checked").val();
                                    if (me.shape == 0) {
                                        $('#s_radius').show();
                                    }
                                    else {
                                        $('#s_radius').hide();
                                    }
                                });
                            },
                            yes: function (index, layero) {
                                me._upd_yes(index);
                            },
                            btn2: function (index, layero) {
                                layer.close(index);
                            }
                        });

                    });
                },
                _upd_yes: function (index) {
                    var me = this;
                    if ($('#name').val() == '') {
                        layer.msg('名称不能为空！');
                        return;
                    }
                    // if ($('#number').val() == '') {
                    //     layer.msg('编码不能为空！');
                    //     return;
                    // }
                    // if (isNaN(Number($('#number').val()))) {
                    //     layer.msg('编码请输入数字！');
                    //     return;
                    // }

                    me.name = $('#name').val();
                    // me.number = $('#number').val();
                    me.radius = $('#radius').val();
                    me.purpose = $('#purpose').val();
                    me.remark = $('#remark').val();
                    me.type = "2";

                    var opts = null;
                    // yuan
                    if (me._dom.shape == 0) {
                        opts = me._upd_yuan();
                    }
                    // duo
                    else if (me._dom.shape == 1) {
                        opts = me._upd_duo();
                    }

                    me.api.upd(opts)
                        .then(function (data) {
                            if (data > 0) {
                                layer.msg('修改围栏成功');
                                layer.close(index);
                                // $('#contentIn', parent.window.document).attr('src', Carnet.basePrefixURL + '/html/fence/fence.html');
                            } else {
                                layer.msg('修改围栏失败');
                            }
                        });
                },
                _upd_yuan: function (argument) {
                    var me = this;
                    var c = me._dom.getCenter();
                    var r = me._dom.getRadius();
                    return opts = {
                        id: me.fence_id,
                        name: me._dom.name,
                        // number: me._dom.number,
                        shape: me._dom.shape,
                        radius: r,
                        spots: JSON.stringify([{lng: c.lng, lat: c.lat}]),
                        purpose: me._dom.purpose,
                        remark: me._dom.remark,
                        type: me._dom.type,

                    };
                },
                _upd_duo: function () {
                    var me = this;
                    var opts = null;
                    var p_arr = me._dom.getPath();

                    var fence = [];
                    for (var j = 0; j < p_arr.length; j++) {
                        fence.push({lng: p_arr[j].lng, lat: p_arr[j].lat});
                    }

                    return opts = {
                        id: me.fence_id,
                        name: me.name,
                        // number: me.number,
                        shape: me._dom.shape,
                        radius: null,
                        spots: JSON.stringify(fence),
                        purpose: me.purpose,
                        remark: me.remark,
                        type: me.type,
                    };
                },


                // ---------------------------------以下函数为在地图上操作时的函数，这个页面上没有用
                // -----------------------------------------------------------编辑功能
                // _click: function(arr) {
                //   var me = this;
                //   for (var i = 0; i < arr.length; i++) {
                //     arr[i].off('click');
                //     arr[i].on('click', function(e) {
                //       // 没有记录点击的围栏
                //       if (me.active_f == null) {
                //         // 收集当前围栏
                //         me.active_f = e.target;
                //         // console.log(e);
                //         me._edit(e.target);
                //       }
                //       // 记录点击的围栏
                //       else {
                //         layer.msg('请完成围栏编辑，在进行其他操作！')
                //       }
                //     });
                //   }
                // },
                // // 编辑围栏
                // _edit: function(dom) {
                //   /* body... */
                //   var me = this;
                //   // 编辑删除按钮显示
                //   $('#f_opt').hide();
                //   $('#f_opt_save').show();
                //   $('#f_opt_del').show().css('left', '92px');

                //   // yuan
                //   if (dom.f_type == 0) {
                //     me._edit_mode("AMap.CircleEditor", dom);
                //   }
                //   // duo
                //   else if (dom.f_type == 2) {
                //     me._edit_mode("AMap.PolyEditor", dom);
                //   }

                // },
                // _edit_mode: function(mode, dom) {
                //   var me = this;
                //   me.map.plugin([mode], function() {
                //     // yuan
                //     if (dom.f_type == 0) {
                //       me.mode = new AMap.CircleEditor(me.map, dom);
                //     }
                //     // duo
                //     else if (dom.f_type == 2) {
                //       me.mode = new AMap.PolyEditor(me.map, dom);
                //     }
                //     me.mode.open();
                //     dom.setOptions(me.editOptions);

                //     // 编辑围栏
                //     me._edit_save(dom);
                //     // 删除围栏
                //     me._edit_del(dom);
                //   });
                // },
                // // -----------------------------------------------------------跟新围栏
                // _edit_save: function(dom) {
                //   var me = this;
                //   $('#f_opt_save').unbind().on('click', function() {

                //     var ck = '';
                //     if (dom.f_alarm == 0) {
                //       ck = '<input name = "alarm" type = "radio" value = "0" checked = "checked" /><span class="f_p_one">出围栏报警</span>' +
                //         '<input name = "alarm" type = "radio" value = "1" /><span class="f_p_one">入围栏报警</span>';
                //     } else if (dom.f_alarm == 1) {
                //       ck = '<input name = "alarm" type = "radio" value = "0" /><span class="f_p_one">出围栏报警</span>' +
                //         '<input name = "alarm" type = "radio" value = "1" checked = "checked" /><span class="f_p_one">入围栏报警</span>';
                //     }
                //     var str = '' +
                //       '<p  class="f_p">' +
                //       '<span> 围栏名称： </span>' +
                //       '<input name = "type" type = "text" value=' + dom.f_name + ' id = "f_name"/>' +
                //       '</p>' +
                //       '<p id = "alarm" class="f_p">' +
                //       '<span> 报警条件： </span>' +
                //       ck +
                //       '</p>';
                //     layer.open({
                //       type: 1,
                //       title: '修改围栏',
                //       area: ['350px', '180px'],
                //       zIndex: 600,
                //       shadeClose: false, //点击遮罩关闭
                //       content: str,
                //       btn: ['保存', '取消'],
                //       success: function() {},
                //       yes: function(index, layero) {
                //         // 重新拿下原来的值
                //         if ($('#f_name').val() == '') {
                //           layer.msg('围栏名称不能为空！');
                //           return;
                //         }
                //         dom.f_name = $('#f_name').val();
                //         dom.f_alarm = $('#alarm input[name="alarm"]:checked').val();
                //         // 保存围栏
                //         me._edit_save_done(dom, index);
                //       },
                //       btn2: function(index, layero) {
                //         layer.close(index);
                //       }
                //     });
                //   })
                // },
                // //
                // _edit_save_done: function(marker, index) {
                //   /* body... */
                //   var me = this;
                //   var opts = null;
                //   // 圆形数据
                //   if (marker.f_type == 0) {
                //     opts = {
                //       id: marker.id,
                //       f_name: marker.f_name,
                //       center: JSON.stringify([marker.getCenter().lng, marker.getCenter().lat]),
                //       radius: parseInt(marker.getRadius()),
                //       f_alarm: marker.f_alarm,
                //       f_type: marker.f_type + ""
                //     };
                //   }
                //   // duo
                //   else if (marker.f_type == 2) {
                //     var p_arr = marker.getPath();
                //     var region = [];
                //     for (var j = 0; j < p_arr.length; j++) {
                //       region.push({ lng: p_arr[j].lng, lat: p_arr[j].lat });
                //     }
                //     opts = {
                //       id: marker.id,
                //       f_name: marker.name,
                //       region: JSON.stringify(region),
                //       f_alarm: marker.f_alarm,
                //       f_type: marker.f_type + ""
                //     };
                //   }
                //   // 确认编辑
                //   me._edit_done(marker, opts, index);
                // },
                // // -----------------------------------------------------------删除围栏
                // _edit_del: function(dom) {
                //   var me = this;
                //   $('#f_opt_del').unbind().on('click', function() {
                //     layer.open({
                //       type: 1,
                //       title: '删除围栏',
                //       area: ['220px', '130px'],
                //       zIndex: 500,
                //       shadeClose: false, //点击遮罩关闭
                //       content: '<div style="margin-left: 30px; margin-top: 10px">确认删除围栏？</div>',
                //       btn: ['确认', '取消'],
                //       yes: function(index, layero) {
                //         var opts = {
                //           id: dom.id
                //         };

                //         me._edit_done(dom, opts, index)
                //       },
                //       btn2: function(index, layero) {
                //         layer.close(index);
                //       }
                //     });
                //   })
                // },
                // // -------------------------------------------------edit--done
                // _edit_done: function(marker, opts, index) {
                //   var me = this;
                //   console.log(opts);
                //   // 关闭模式
                //   me.mode.close();
                //   layer.close(index);
                //   marker.setOptions(me.styleOptions);
                //   // 清空容器
                //   me.active_f = null;
                //   $('#f_opt').show();
                //   $('#f_opt_save').hide();
                //   $('#f_opt_del').hide();

                //   me._show();
                //   me._add();
                // },


            };
            for (k in fn) {
                me[k] = fn[k];
            }
            ;
        },
    };
    Carnet.module["GD_fence_set"] = GD_fence_set;
})(jQuery, window);
