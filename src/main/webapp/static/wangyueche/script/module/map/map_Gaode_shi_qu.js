/**
 * Item Name  :
 *Creator         :cc
 *Email            :cc
 *Created Date:2017/3/28
 *@pararm     :
 */
(function ($, window) {
    function GDMap(opts) {
        this.id = opts.id;
        this.newTools = null;
        //登录用户标识
        this.ret = null;

        // ---------------- yub 地图聚合打点
        this.markers = [];

        // ----------------百度返回的数据
        this.subList = null;
        this.loading_key = false;
        // ----------------颜色收集器
        this.gradient = null;


        // ----------------市下的区监控层
        this._shi_jk_timer = null;
        // 市监控下的区块数组
        this._shi_jk_arr = [];


        // ----------------区下的监控层
        //点击的区
        this.s_ = null;
        //区监控层计时器
        this._qu_jk_timer = null;
        //区的最佳视角
        this._qu_jk_view = true;

        //------------------追踪
        this.t_outBtn = null;
        //追踪的定时器
        this._trail_timer = null;
        //追踪的marker容器
        this._trail_marker = null;

        // ------------------各种循环器的安全开关
        // 区块
        this.shi_click_key = false;
        // 区县的监控
        this.qu_click_key = false;
        // 追踪
        this.trail_out_key = false;


        // --------------------------------API
        this.api = new Carnet.module.server().map;
    };
    GDMap.prototype = {
        //面向对象初始化
        init: function (fn) {
            var me = this;
            // 功能的区别----in功能用于监控，主页面不能点击进入查看
            me.key = fn;
            me.init_Baner(); //开启控件
            setTimeout(function () {
                me.init_event();
            }, 500);
        },
        //控件默认初始化
        init_Baner: function () {
            var me = this;
            var map = me.map = new AMap.Map(me.id);
            map.setZoomAndCenter(11, [117.227, 31.820]);
            //公司名称----yub 切换网约车平台
            //   cLib.base.list("company/name/list").done(function (data) {
            //       for (var key in data) {
            //           $('#p_select').append("<option class='p_option' value=" + key + ">" + data[key] + "</option>");
            //       }
            //   });
        },
        init_event: function () {
            var me = this;
            me.scenic_bind();
            me.scenic();
        },
        scenic: function () {
            var me = this;
            me._pre_init();
            me._loading_area();
        },
        scenic_bind: function () {
            var me = this;
            var fn = {
                // 市监控层的鼠标滑过提示区信息
                _pre_init: function () {
                    var me = this;
                    me.map.on('mousemove', function (argument) {
                        $("#info").css({"top": (argument.pixel.y + 5) + "px", "left": (argument.pixel.x + 5) + "px"});
                    });
                },
                // 请求百度的区块数据
                _loading_area: function () {
                    var me = this;
                    me.map.clearMap();
                    me.s_draw_area();
                },
                // ---------------------------------------------------------------百度打区块
                // 打区块
                s_draw_area: function () {
                    var me = this;
                    // 加载工具
                    AMap.service('AMap.DistrictSearch', function () {
                        var district = new AMap.DistrictSearch({
                            //返回下一级行政区
                            subdistrict: 1,
                            level: 'city',
                            //是否显示商圈
                            showbiz: false,
                            // 返回边界显示
                            extensions: 'all'
                        });
                        //市编码查询
                        district.search(Carnet.city_code, function (status, result) {
                            if (status == 'complete') {
                                me.map.setFeatures([]);
                                // 区数据处理
                                me._district_date(result.districtList[0]);
                            }
                        });
                    });
                },
                // 区数据处理
                _district_date: function (data) {
                    var me = this;
                    // 区域块的收集容器
                    me._shi_jk_arr = [];
                    // 区列表
                    me.subList = data.districtList;
                    // 颜色生成器
                    me.gradient = new Carnet.module.gradientColor(Carnet.start_color, Carnet.end_color, me.subList.length);
                    //区块排序
                    me.area_sort_by_car();
                    // 递归的形式加载数据
                    me._district_gen(0);
                },
                // 区块递归生成
                _district_gen: function (index) {
                    var me = this;
                    var key = index;
                    if (key == me.subList.length) {
                        me.loading_key = true;
                        layer.msg('区块加载完成~');
                        // 收集完成后进行区块的数据请求
                        me.area_ajax();
                        return;
                    }
                    var level = me.subList[key].level;
                    var opts = null;
                    var district = null;

                    opts = {
                        subdistrict: 0, //返回下一级行政区
                        level: level,
                        showbiz: false, //是否显示商圈
                        // 返回边界显示
                        extensions: 'all'
                    };

                    district = new AMap.DistrictSearch(opts);
                    district.search(me.subList[key].adcode, function (status, result) {

                        if (status == 'complete') {
                            console.log("me.subList[key]： " + me.subList[key]);
                            //me.gradient[key]为区块颜色
                            me._district_gen_done(result.districtList[0]);
                            // me._init_map_data(me.subList[key].adcode,result.districtList[0].boundaries[0]);
                            // 计数器加一
                            key++;
                            me._district_gen(key);
                        }
                    });
                },
                // 打多边形的具体生成
                _district_gen_done: function (data) {
                    var me = this;
                    var bounds = data.boundaries;
                    var color = Carnet.start_color;
                    // 从area_sort中找到该区域的颜色，传入color，赋值
                    $.each(me.area_sort, function (index, item) {
                        if (item.adcode == data.adcode) {
                            color = item.color;
                        }
                    })

                    // 没有设置边界
                    if (bounds) {
                        for (var i = 0, l = bounds.length; i < l; i++) {
                            var polygon = new AMap.Polygon({
                                strokeWeight: 0,
                                strokeColor: color,
                                fillColor: color,
                                fillOpacity: Carnet.fill_opacity,
                                path: bounds[i]
                            });
                            polygon.name = data.name;
                            console.log("打区块时的区块名称" + polygon.name);
                            polygon.adcode = data.adcode;
                            // console.log(typeof(polygon.adcode), polygon.adcode);

                            polygon.setMap(me.map);
                            polygon.on('mouseover', function (argument) {
                                if (!me.loading_key) {
                                    return;
                                }
                                me.map.setDefaultCursor('pointer');
                                polygon.fillColor = polygon.getOptions().fillColor;
                                polygon.setOptions({fillColor: Carnet.over_color});
                                $("#s_info_name").html(polygon.name);
                                $("#s_carNum").html('汽车数量： ' + me.undefinedTo0(polygon.carNum));
                                $("#s_driverNum").html('驾驶员数量： ' + me.undefinedTo0(polygon.driverNum));
                                $("#s_orderNum").html('订单数量： ' + me.undefinedTo0(polygon.orderNum));

                                $("#info_name").html(polygon.name);
                                $("#carNum").html('汽车数量： ' + me.undefinedTo0(polygon.carNum));
                                $("#driverNum").html('驾驶员数量： ' + me.undefinedTo0(polygon.driverNum));
                                $("#orderNum").html('订单数量： ' + me.undefinedTo0(polygon.orderNum));
                                $("#info").show();

                            });
                            polygon.on('mouseout', function (argument) {
                                if (!me.loading_key) {
                                    return;
                                }
                                polygon.setOptions({fillColor: polygon.fillColor});
                                me.map.setDefaultCursor('auto');
                                $("#info").hide();
                            });

                            // 单独主页功能才可点击点击进入
                            // if (me.key == 'in') {
                                polygon.on('click', function (argument) {
                                    // 未加载完成不可进行点击
                                    if (!me.loading_key) {
                                        layer.msg('区块位加载完成，不可点击~');
                                        return;
                                    }
                                    polygon.setOptions({fillColor: polygon.fillColor});
                                    // 点击了区县块--区块的实时数据循环就关闭了
                                    me.shi_click_key = true;

                                    $("#info").hide();
                                    // 清除市监控
                                    clearTimeout(me._shi_jk_timer);
                                    me.map.clearMap();
                                    me.map.setFeatures(['bg', 'road', 'building']);
                                    // 加载退出事件
                                    me.s_out();
                                    // 点击marker
                                    me.area_click(polygon);
                                });
                            // }


                            // 收集区块
                            me._shi_jk_arr.push(polygon);
                        }

                        me.map.setFitView(); //地图自适应
                    }
                },
                // 判断数据是否undefined 如果是，赋值为0
                undefinedTo0: function (data) {
                    if (typeof(data) == "undefined") {
                        return "0";
                    }
                    return data;
                },
                // 将区块按车辆数量排序（由大到小）,并赋颜色
                area_sort_by_car: function () {
                    var me = this;
                    // 排序
                    me.api._shi_data({code: Carnet.city_code,}).done(function (data) {
                        data.districts.sort(function (a, b) {
                            return a.carNum - b.carNum
                        });
                        me.area_sort = data.districts;
                        // 赋颜色
                        for (var i = 0; i < me.area_sort.length; i++) {
                            me.area_sort[i].color = me.gradient[i];
                        }
                    });

                },
                // 初始化基础数据----只进行一次，以后就不用了。
                _init_map_data: function (code, arr) {
                    var me = this;
                    var fences = []
                    for (var i = 0; i < arr.length; i++) {
                        fences.push({
                            lng: arr[i].lng,
                            lat: arr[i].lat
                        });
                    }
                    me.api.save_init({
                        code: code,
                        fences: JSON.stringify(fences)
                    })
                        .done(function (data) {
                        });
                },
                //---------------------------------------------------------------市区模块监控
                //请求回区块的监控数据
                area_ajax: function () {
                    var me = this;
                    // -----这个不通
                    me.api._shi_data({
                        code: Carnet.city_code,
                    })
                        .done(function (data) {
                            if (data.districts.length != 0) {
                                // alert(data.districts.length);
                                console.log("后台请求到的区县个数：" + data.districts.length);


                                // 将请求到的区块数据绑定到地图上的polygon
                                me.area_ajax_data_bind(data.districts);

                                // ----------- 待完成 如果为车辆监控页面，右侧表格显示请求到的数据
                                if (me.key == "in") {
                                    $('#mapDataList').datagrid({
                                        title: '数据展示',
                                        // width: '200px',
                                        // height: '200px',
                                        // fitColumns: true,
                                        columns: [[
                                            {field: '区域名称', title: 'adcode', width: 80},
                                            {field: '车辆数量', title: 'carNum', width: 120},
                                            {field: '驾驶员数量', title: 'driverNum', width: 80, align: 'right'},
                                            {field: '订单数量', title: 'orderNum', width: 80, align: 'right'},
                                        ]],
                                    }).datagrid("loadData", eval(data.districts));
                                }
                                // ----------- 待完成end 如果为车辆监控页面，右侧表格显示请求到的数据

                                // 市监控数据循环
                                me.area_data_interval();
                            }
                        });
                },
                // 生成的区块和AJAX的数据进行绑定
                area_ajax_data_bind: function (arr) {
                    var me = this;
                    var doms = me._shi_jk_arr;
                    // 拿到数据,doms相当于shi_jk_arr,doms[k]相当于polygon
                    for (var i = 0; i < arr.length; i++) {
                        for (var k = 0; k < doms.length; k++) {
                            if (doms[k].adcode == arr[i].adcode) {
                                doms[k].carNum = arr[i].carNum;
                                doms[k].driverNum = arr[i].driverNum;
                                doms[k].orderNum = arr[i].orderNum;
                                break;
                            }
                        }
                    }
                },
                // 市监控数据循环
                area_data_interval: function (argument) {
                    var me = this;
                    me._shi_jk_timer = setTimeout(function (argument) {
                        if (!me.shi_click_key) {
                            me.area_ajax();
                        }
                    }, Carnet.shi_time);
                },
                // ------------------------------------start--------------聚合版本的fn,本版本不用


                // s_draw: function (data) {
                //     var me = this;
                //     // if (me.ret == 1) {
                //     //     alert(data);
                //
                //         data.forEach(function (item) {
                //
                //             // var convertData = me.convertCoord({ 'lng': item.lng, 'lat': item.lat });
                //             var marker = new AMap.Marker({
                //                 icon: "http://webapi.amap.com/theme/v1.3/markers/n/mark_b.png",
                //                 position: [item.position.lng, item.position.lat]
                //             });
                //             marker.setMap(me.map);
                //             marker.id = item.id;
                //             marker.name = item.name;
                //             marker.bikeQuantity = item.bikeQuantity;
                //
                //             // markers.push(marker);
                //
                //             alert(marker.name);
                //             alert("wf");
                //
                //             // 添加点击事件
                //             marker.on('click', function () {
                //                 me.s_out();
                //                 me.area_click(marker);
                //             });
                //             // 给marker设置label
                //             me.s_label(marker);
                //         });
                //         // 最优视角
                //         me.map.setFitView();
                //     // }
                // },
                //区中车辆打点，聚合和非聚合两种模式
                s_draw: function (data) {
                    var me = this;
                    var image = null;
                    var cluster;
                    me.markers = [];
                    // 添加标注点
                    data.forEach(function (item) {
                        // --载客
                        if (item.position.bizStatus == 1) {
                            image = Carnet.car_zk;
                        }
                        // --接单
                        else if (item.position.bizStatus == 2) {
                            image = Carnet.car_jd;
                        }
                        // --空驶
                        else if (item.position.bizStatus == 3) {
                            image = Carnet.car_ks;
                        }
                        // --停运
                        else if (item.position.bizStatus == 4) {
                            image = Carnet.car_ty;
                        }
                        //
                        else if (item.position.bizStatus == null) {
                            image = Carnet.car_zk;
                        }
                        var marker = new AMap.Marker({
                            position: [item.position.lng, item.position.lat],
                            title: '车牌号：' + item.vehicleNo,
                            icon: new AMap.Icon({
                                size: new AMap.Size(Carnet.car_size[0], Carnet.car_size[1]),
                                // imageSize:new AMap.Size(54, 46),
                                image: image,
                                // imageOffset: new AMap.Pixel(5, 5)
                            })
                        });
                        me.markers.push(marker);
                        // 添加点击事件
                        // marker.on('click', function () {
                        //     me.s_out();
                        //     me.area_click(marker);
                        // });
                        // // 给marker设置label
                        // me.s_label(marker);
                        // 绑定marker的id
                        marker.vehicleNo = item.vehicleNo;
                        // 追踪模式
                        marker.on('click', function (e) {
                            // 点击marker--区监控循环就失效
                            me.qu_click_key = true;
                            // 点击了marker--追踪的循环就开启
                            me.trail_out_key = false;

                            var event = e || window.e;
                            if (event && event.stopPropagation) {
                                event.stopPropagation();
                            } else {
                                event.cancelBubble = true;
                            }
                            clearTimeout(me._qu_jk_timer);
                            // 退出到区的监控层
                            me._trail_out();
                            me.map.clearMap();
                            me._trail(marker);
                        });

                        //打点1、没有聚合时的打点
                        marker.setMap(me.map);
                    });
                    //打点2、让地图适应屏幕大小
                    if (me._qu_jk_view) {
                        me.map.setFitView();
                    }
                    //打点3、聚合时的打点
                    me.map.clearMap();
                    addCluster(0);
                    // 添加点聚合
                    function addCluster(tag) {
                        if (cluster) {
                            cluster.setMap(null);
                        }
                        me.map.plugin(["AMap.MarkerClusterer"], function () {
                            cluster = new AMap.MarkerClusterer(me.map, me.markers);
                        });
                    }


                },

                //区的点击事件
                area_click: function (marker) {
                    var me = this;
                    // 记录下当前点击的区marker
                    me.s_ = marker;
                    var data = null;
                    // ------------------------------点击区下面的数据没有
                    me.api._qu_data({
                        code: marker.adcode
                    })
                        .done(function (data) {
                            if (data.cars.length == 0) {
                                layer.msg('您点击的这个区下面没有车辆数据，请点击其他区进行查看！');
                                // return;
                            }
                            me.map.clearMap();
                            // me.s_jk_draw(data.cars);
                            //  yub 聚合
                            me.s_draw(data.cars);
                            // 初始设置为true ，第一次进行视角最优化，接下来关闭
                            me._qu_jk_view = false;
                            me._qu_jk_timer = setTimeout(function () {
                                if (!me.qu_click_key) {
                                    console.log('区监控数据渲染');
                                    me.area_click(marker);
                                }
                            }, Carnet.qu_time);

                        });
                },
                //------------------------------------------------------------------区监控数据
                s_jk_draw: function (data) {
                    var me = this;
                    var image = null;
                    data.forEach(function (item) {
                        // --载客
                        if (item.position.bizStatus == 1) {
                            image = Carnet.car_zk;
                        }
                        // --接单
                        else if (item.position.bizStatus == 2) {
                            image = Carnet.car_jd;
                        }
                        // --空驶
                        else if (item.position.bizStatus == 3) {
                            image = Carnet.car_ks;
                        }
                        // --停运
                        else if (item.position.bizStatus == 4) {
                            image = Carnet.car_ty;
                        }
                        //
                        else if (item.position.bizStatus == null) {
                            image = Carnet.car_zk;
                        }
                        var marker = new AMap.Marker({
                            position: [item.position.lng, item.position.lat],
                            title: '车牌号：' + item.vehicleNo,
                            icon: new AMap.Icon({
                                size: new AMap.Size(Carnet.car_size[0], Carnet.car_size[1]),
                                // imageSize:new AMap.Size(54, 46),
                                image: image,
                                // imageOffset: new AMap.Pixel(5, 5)
                            })
                        });
                        marker.setMap(me.map);

                        // 绑定marker的id
                        marker.vehicleNo = item.vehicleNo;
                        // 追踪模式
                        marker.on('click', function (e) {
                            // 点击marker--区监控循环就失效
                            me.qu_click_key = true;
                            // 点击了marker--追踪的循环就开启
                            me.trail_out_key = false;

                            var event = e || window.e;
                            if (event && event.stopPropagation) {
                                event.stopPropagation();
                            } else {
                                event.cancelBubble = true;
                            }
                            clearTimeout(me._qu_jk_timer);
                            // 退出到区的监控层
                            me._trail_out();
                            me.map.clearMap();
                            me._trail(marker);
                        });
                    });
                    if (me._qu_jk_view) {
                        // me.map.setViewport(geoPoints);
                        me.map.setFitView();
                    }
                },
                //退出到市监控层
                s_out: function () {

                    var me = this;
                    $('#p_btn').show();
                    $('#p_btn').html('返回区监控');
                    $('#p_btn').unbind().on('click', function () {
                        clearTimeout(me._qu_jk_timer);
                        me.map.clearMap();
                        $('#p_btn').hide();
                        //点击了退出--区块的实时数据循环就打开了
                        me.shi_click_key = false;
                        me._qu_jk_view = true;

                        // me._loading_area();
                        // ---------------------------------退出到全局区监控
                        me.map.setFeatures([]);
                        me.map.clearMap();


                        var map = me.map = new AMap.Map(me.id);
                        map.setZoomAndCenter(11, [117.227, 31.820]);
                        me.map.setFeatures([]);
                        var arr = me._shi_jk_arr;
                        for (var i = 0; i < arr.length; i++) {
                            arr[i].setMap(me.map);
                        }

                        me.map.setFitView();
                        //重新绘图
                        me.init_event();
                    });
                },
                //-------------------------------------------------------------------追踪
                _trail: function (marker) {
                    var me = this;
                    me.api._moniter_car_data({
                        code: me.s_.adcode,
                        vehicleNo: marker.vehicleNo
                    })
                        .done(function (data) {
                            // 拿到渲染数据
                            me._trail_draw(data);

                            me._trail_timer = setTimeout(function () {
                                if (!me.trail_out_key) {
                                    console.log('追踪数据渲染');
                                    me._trail(marker);
                                }

                            }, Carnet.moniter_time);
                        });
                },
                // 追踪渲染
                _trail_draw: function (item) {
                    var me = this;
                    if (me._trail_marker == null) {
                        var marker = me._trail_marker = new AMap.Marker({
                            position: [item.position.lng, item.position.lat],
                            // title: 'ID号:' + item.id,
                        });
                        marker.position = item.position.lng + "," + item.position.lat;
                        marker.bizStatus = item.position.bizStatus;
                        marker.driverName = item.position.driverName;
                        marker.tel = item.position.tel;

                        me.s_label(marker);
                        marker.setMap(me.map);
                        // marker.setOffset(new AMap.Pixel(-15, -48));

                        // marker.unbind('click');

                    } else {
                        var newPoint = [item.position.lng, item.position.lat];
                        var oldP = me._trail_marker.getPosition();
                        var oldPoint = [oldP.lng, oldP.lat];

                        me._trail_line([oldPoint, newPoint], {});
                        me._trail_marker.setPosition(newPoint); //移动到新的数据点上
                    }

                    me.map.setFitView([me._trail_marker]);

                },
                //marker的信息框
                s_label: function (marker) {
                    var me = this;
                    // 自定义点标记内容
                    var markerContent = document.createElement("div");
                    markerContent.className = "P_div";
                    // 点标记中的图标
                    var markerImg = document.createElement("img");
                    markerImg.className = "markerlnglat";
                    // --载客
                    if (marker.bizStatus == 1) {
                        markerImg.src = Carnet.car_zk;
                        marker.bizStatus = "载客";
                    }
                    // --接单
                    else if (marker.bizStatus == 2) {
                        markerImg.src = Carnet.car_jd;
                        marker.bizStatus = "接单";
                    }
                    // --空驶
                    else if (marker.bizStatus == 3) {
                        markerImg.src = Carnet.car_ks;
                        marker.bizStatus = "空驶";
                    }
                    // --停运
                    else if (marker.bizStatus == 4) {
                        markerImg.src = Carnet.car_ty;
                        marker.bizStatus = "停运";
                    }

                    markerContent.appendChild(markerImg);

                    // 标记中的信息框
                    var markerDIV = document.createElement("div");
                    markerDIV.className = 'markLabel';
                    // -----待添加 订单信息 等 车辆追踪的悬浮信息
                    markerDIV.innerHTML = '<span class="labelName" id="devName">姓名：' + marker.driverName + '</span>' +
                        '<span class="labelName" id="devTel" >电话：' + marker.tel + '</span>' +
                        '<span class="labelName" id="devBizStatus" >状态：' + marker.bizStatus + '</span>' +
                        '<span class="labelName" id="devPosition" >位置：' + marker.position + '</span>' +
                        '<div class="labelArrow" style="align: left"></div>';
                    markerContent.appendChild(markerDIV);

                    marker.setContent(markerContent); //更新点标记内容
                },
                //退出追踪层，进入区下面的监控层
                _trail_out: function () {
                    var me = this;
                    $('#p_btn').html('退出追踪');
                    $('#p_btn').unbind().on('click', function () {
                        clearTimeout(me._trail_timer);
                        me.map.clearMap();
                        $('#p_btn').hide();
                        // 点击了退出追踪--追踪的循环就失效了。
                        me.trail_out_key = true;
                        // 点击了退出追踪--区块下监控循坏开启。
                        me.qu_click_key = false;
                        // 区下面的监控层的最优视角开启
                        me._qu_jk_view = true;

                        me._trail_marker = null;
                        me.s_out();
                        // 进入当前记录下的区的marker，然后进入区下的监控
                        me.area_click(me.s_);
                    });
                },
                //追踪的线
                _trail_line: function (points, opts) {
                    var me = this;
                    var polyLine = new AMap.Polyline({
                        path: points,
                        strokeColor: (opts.color || "#21536d"),
                        strokeWeight: (opts.weight || 4),
                        strokeOpacity: (opts.opacity || 0.8)
                    });
                    polyLine.setMap(me.map);
                },
            };
            for (k in fn) {
                me[k] = fn[k];
            }
            ;
        },
    };
    Carnet.module["GDMap"] = GDMap;
})(jQuery, window);
