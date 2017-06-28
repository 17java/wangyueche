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
        // ---------------- yub 按照车辆数量排完序的区块数组
        this.area_sort = [];

        // ----------------高德返回的数据
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
            //屏幕响应
            // $(window).on('resize', me.resize).trigger('resize');
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

            //地图上方悬浮显示框宽度自适应,因为"in"的时候两个body宽度不一样，所以需要分情况计算
            if(me.key == "in"){
                $('#infoStaff').width(0.15 * $('body').width());
            }
            else{
                $('#infoStaff').width(0.265 * $('body').width());
            }
            console.log("body宽度：" + $('body').width() + "\n悬浮框实际宽度：" + $('#infoStaff').width() + "\n悬浮框应该宽度：" + 0.13 * $('body').width());

        },
        init_event: function () {
            var me = this;
            me.scenic_bind();
            me.scenic();
        },
        scenic: function () {
            var me = this;
            // me._pre_init();
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
                    me._pre_init();
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
                                // me.map.setFeatures(['bg', 'road', 'building']);
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
                    });

                    // 没有设置边界
                    if (bounds) {
                        for (var i = 0, l = bounds.length; i < l; i++) {
                            var polygon = new AMap.Polygon({
                                strokeWeight: Carnet.qu_stroke,
                                strokeColor: Carnet.end_color,
                                fillColor: color,
                                fillOpacity: Carnet.fill_opacity,
                                path: bounds[i],
                                title: data.name

                            });
                            polygon.setMap(me.map);


                            polygon.name = data.name;
                            polygon.adcode = data.adcode;
                            // console.log(typeof(polygon.adcode), polygon.adcode);


                            polygon.on('mouseover', function (argument) {
                                if (!me.loading_key) {
                                    return;
                                }
                                me.map.setDefaultCursor('pointer');
                                polygon.fillColor = polygon.getOptions().fillColor;
                                polygon.setOptions({fillColor: Carnet.over_color});
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
                            if (me.key == 'in') {
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
                                    // me.map.setFeatures(['bg', 'road', 'building']);
                                    // 加载退出事件
                                    me.s_out();
                                    // 点击区块
                                    me.area_click(polygon);
                                });
                            }
                            // 收集区块
                            me._shi_jk_arr.push(polygon);
                        }
                        me.map.setFitView(); //地图自适应
                    }
                },

                // 判断数据是否undefined 如果是，赋值为0
                undefinedTo0: function (data) {
                    if (typeof(data) == "undefined") {
                        return 0;
                    }
                    return data;
                },
                // ------暂时不用 将区块按车辆数量排序（由大到小）,并赋颜色
                area_sort_by_car: function () {
                    var me = this;
                    // 排序
                    me.api._shi_data({
                        code: Carnet.city_code,
                    })
                        .done(function (data) {
                            if (data.districts.length != 0) {
                                me.area_sort = data.districts;
                                me.area_sort.sort(function (a, b) {
                                    return a.carNum - b.carNum
                                });
                                // 赋颜色
                                for (var i = 0; i < me.area_sort.length; i++) {
                                    me.area_sort[i].color = me.gradient[i];
                                }
                            }

                        });
                    return true;
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
                                me.area_ajax_data_bind(data.districts);
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
                    me.area_show_table(doms);
                },
                // 右上角表格显示当前数据
                area_show_table: function (doms) {
                    var tableLine = '<tr><th> 区块 </th><th> 车辆数 </th><th> 驾驶员数 </th><th> 订单数 </th></tr>';
                    var carTotal = 0;
                    var driverTotal = 0;
                    var orderTotal = 0;
                    for (var k = 0; k < doms.length; k++) {
                        tableLine += '<tr><th>' + doms[k].name + '</th>' +
                            '<th>' + me.undefinedTo0(doms[k].carNum) + '</th>' +
                            '<th>' + me.undefinedTo0(doms[k].driverNum) + '</th>' +
                            '<th>' + me.undefinedTo0(doms[k].orderNum) + '</th></tr>';
                        carTotal += me.undefinedTo0(doms[k].carNum);
                        driverTotal += me.undefinedTo0(doms[k].driverNum);
                        orderTotal += me.undefinedTo0(doms[k].orderNum);
                    }
                    tableLine += '<tr><th>合计：</th>' +
                        '<th>' + carTotal + '</th>' +
                        '<th>' + driverTotal + '</th>' +
                        '<th>' + orderTotal + '</th></tr>';
                    $("#infoTable").html(tableLine);
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
                                // size: new AMap.Size(Carnet.car_size[0], Carnet.car_size[1]),
                                imageSize: new AMap.Size(Carnet.car_size[0], Carnet.car_size[1]),
                                image: image,
                                // imageOffset: new AMap.Pixel(2, 2)
                            })
                        });
                        me.markers.push(marker);
                        // 添加点击事件
                        // marker.on('click', function () {
                        //     me.s_out();
                        //     me.area_click(marker);
                        // });
                        // 给marker设置label
                        // me.s_label(marker);
                        // 绑定marker的id

                        //打点1、没有聚合时的打点
                        marker.setMap(me.map);
                        marker.vehicleNo = item.vehicleNo;
                        // 追踪模式
                        marker.on('click', function (e) {
                            if (me.key == 'in') {
                                //yub 如果是从区监控进入的追踪，则照常执行
                                //if (me._qu_jk_timer) {

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
                                me._trail(marker);
                                //}
                                //yub 否则，提示先进入区监控
                                //else {
                                //    layer.msg("请先进入区监控！");
                                //}

                            }
                            else {
                                layer.msg("本页面只作为概览，要监控车辆，请先进入车辆监控页面");
                            }
                        });

                    });
                    //打点2、让地图适应屏幕大小
                    if (me._qu_jk_view) {
                        me.map.setFitView();
                    }
                    //打点3、聚合时的打点
                    me.map.clearMap();
                    //自定义聚合打点
                    var count = me.markers.length;
                    var _renderCluserMarker = function (context) {
                        var factor = Math.pow(context.count / count, 1 / 18);
                        var div = document.createElement('div');
                        var Hue = 180 - factor * 180;
                        var bgColor = 'hsla(' + Hue + ',100%,50%,0.7)';
                        var fontColor = 'hsla(' + Hue + ',100%,20%,1)';
                        var borderColor = 'hsla(' + Hue + ',100%,40%,1)';
                        var shadowColor = 'hsla(' + Hue + ',100%,50%,1)';
                        div.style.backgroundColor = bgColor;
                        var size = Math.round(10 + Math.pow(context.count / count, 1 / 5) * 10);
                        div.style.width = div.style.height = size + 'px';
                        div.style.border = 'solid 1px ' + borderColor;
                        div.style.borderRadius = size / 2 + 'px';
                        div.style.boxShadow = '0 0 1px ' + shadowColor;
                        div.innerHTML = context.count;
                        div.style.lineHeight = size + 'px';
                        div.style.color = fontColor;
                        div.style.fontSize = '9px';
                        div.style.textAlign = 'center';
                        context.marker.setOffset(new AMap.Pixel(-size / 3, -size / 3));
                        context.marker.setContent(div)
                    }
                    // console.log("me.map.getZoom():" + me.map.getZoom());

                    // me.map.addEventListener('zoomchange', set_marker_style);
                    //
                    // function set_marker_style(){
                    //     if(me.map.getZoom() < 12){
                    //         _renderCluserMarker = function (context) {
                    //             var factor = Math.pow(context.count/count,1/18);
                    //             var div = document.createElement('div');
                    //             var Hue = 180 - factor* 180;
                    //             var fontColor = 'hsla('+Hue+',100%,20%,1)';
                    //             var size = Math.round(10 + Math.pow(context.count/count,1/5) * 10);
                    //             div.style.width = div.style.height = size+'px';
                    //             div.innerHTML = context.count;
                    //             div.style.lineHeight = size+'px';
                    //             div.style.color = fontColor;
                    //             div.style.fontSize = '9px';
                    //             div.style.textAlign = 'center';
                    //             context.marker.setOffset(new AMap.Pixel(-size/5,-size/5));
                    //             context.marker.setContent(div);
                    //         }
                    //     }
                    // }
                    addCluster();
                    // 添加点聚合
                    function addCluster() {
                        if (cluster) {
                            cluster.setMap(null);
                        }
                        me.map.plugin(["AMap.MarkerClusterer"], function () {
                            // 聚合打点需要的参数：地图，所有聚合点的数据（数组）
                            cluster = new AMap.MarkerClusterer(me.map, me.markers, {
                                gridSize: 80,
                                // 聚合点的样式
                                renderCluserMarker: _renderCluserMarker
                            });

                        });
                    }

                    // if (me._qu_jk_view) {
                    //     me.map.setViewport(geoPoints);
                    //     me.map.setFitView();
                    // }
                },

                //区的点击事件
                area_click: function (marker) {
                    var me = this;
                    // yub 必须由区块点击进入后才能够进行车辆追踪的原因（查询追踪数据时后台请求需要两个参数：区块代号和车牌号），
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
                // 没有用------------------------------------------------------------------区监控数据
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
                        // me.map.setFeatures([]);
                        me.map.clearMap();


                        // 每次退出到市监控都新建一个地图，否则上次聚合的点会打在市级监控页面
                        var map = me.map = new AMap.Map(me.id);
                        map.setZoomAndCenter(11, [117.227, 31.820]);
                        var arr = me._shi_jk_arr;
                        for (var i = 0; i < arr.length; i++) {
                            arr[i].setMap(me.map);
                        }
                        me.map.setFitView();
                        //重新绘图
                        me._loading_area();
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
                            if (!data.vehicleNo) {
                                layer.msg("请点击当前区域的车辆");
                            }
                            else {
                                // 拿到渲染数据
                                me._trail_draw(data);

                                me._trail_timer = setTimeout(function () {
                                    if (!me.trail_out_key) {
                                        console.log('追踪数据渲染');
                                        me._trail(marker);
                                    }

                                }, Carnet.moniter_time);
                            }
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
                        marker.positionTime = item.position.positionTime;

                        me.s_label(marker)
                        marker.setMap(me.map);
                        // marker.setOffset(new AMap.Pixel(-15, -48));

                    } else {
                        var newPoint = [item.position.lng, item.position.lat];
                        var oldP = me._trail_marker.getPosition();
                        var oldPoint = [oldP.lng, oldP.lat];

                        me._trail_line([oldPoint, newPoint], {});
                        me._trail_marker.setPosition(newPoint); //移动到新的数据点上
                    }

                    //设置屏幕自适应区域
                    // if(!me.polyLine){
                    me.map.setFitView([me._trail_marker]);
                    // }
                    // else{
                    //     me.map.setFitView([me.polyLine]);
                    // }

                },
                //marker的信息框
                s_label: function (marker) {
                    var me = this;
                    // 自定义点标记内容
                    var markerContent = document.createElement("div");
                    markerContent.className = "P_div";
                    // 点标记中的图标
                    var markerImg = document.createElement("img");
                    markerImg.width = Carnet.car_size[0];
                    markerImg.height = Carnet.car_size[1];
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
                    marker.driverName = me.marker_info_format(marker.driverName);
                    marker.tel = me.marker_info_format(marker.tel);
                    marker.bizStatus = me.marker_info_format(marker.bizStatus);
                    marker.positionTime = me.marker_info_format(cLib.base.formatter1970Day(marker.positionTime));
                    marker.position = me.marker_info_format(marker.position);


                    markerDIV.innerHTML = '<span class="labelName" id="devName">姓名：' + marker.driverName + '</span>' +
                        '<span class="labelName" id="devTel" >电话：' + marker.tel + '</span>' +
                        '<span class="labelName" id="devBizStatus" >状态：' + marker.bizStatus + '</span>' +
                        '<span class="labelName" id="devPositionTime" >时间：' + marker.positionTime + '</span>' +
                        '<span class="labelName" id="devPosition" >位置：' + marker.position + '</span>' +
                        '<div class="labelArrow" style="align: left"></div>';
                    markerContent.appendChild(markerDIV);

                    marker.setContent(markerContent); //更新点标记内容
                },
                // 格式化marker点标记信息
                marker_info_format: function(info){
                    if(!info){
                        return "无";
                    }
                    else{
                        return info;
                    }
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
                    me.polyLine = polyLine;
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
