// 特殊车辆 获取上车地下车地经纬度

(function ($, window) {
    function GD_pos_get(opts) {
        this.id = opts.id;
    };
    GD_pos_get.prototype = {
        //面向对象初始化
        init: function () {
            var me = this;
            me.init_Baner();
            //开启控件
            me.init_event();
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
            me.windowsArr = [];
            me.marker = [];
            me.get_pos_bind();
        },
        get_pos_bind: function () {
            var me = this;
            var clickEventListener = AMap.event.addListener(me.map, 'mousemove', function (e) {
                document.getElementById("lngX").value = e.lnglat.getLng();
                document.getElementById("latY").value = e.lnglat.getLat();
            });
            // document.getElementById("keyword").onkeyup = me.keydown();
            $("#keyword").keyup(function(){
                me.keydown();
            });

        },
        //输入提示
        autoSearch: function () {
            var me = this;
            var keywords = document.getElementById("keyword").value;
            var auto;
            //加载输入提示插件
            AMap.service(["AMap.Autocomplete"], function () {
                var autoOptions = {
                    city: "" //城市，默认全国
                };
                auto = new AMap.Autocomplete(autoOptions);
                //查询成功时返回查询结果
                if (keywords.length > 0) {
                    auto.search(keywords, function (status, result) {
                        me.autocomplete_CallBack(result);
                    });
                }
                else {
                    document.getElementById("result1").style.display = "none";
                }
            });
        },

        //输出输入提示结果的回调函数
        autocomplete_CallBack: function (data) {
            var me = this;
            var resultStr = "";
            var tipArr = data.tips;
            if (tipArr && tipArr.length > 0) {
                for (var i = 0; i < tipArr.length; i++) {
                    resultStr += "<div id='divid" + (i + 1) + "' onmouseover='this.openMarkerTipById(" + (i + 1)
                        + ",this)' onclick='this.selectResult(" + i + ",this)' onmouseout='this.onmouseout_MarkerStyle(" + (i + 1)
                        + ",this)' style=\"font-size: 13px;cursor:pointer;padding:5px 5px 5px 5px;\"" + "data=" + tipArr[i].adcode + ">" + tipArr[i].name + "<span style='color:#C1C1C1;'>" + tipArr[i].district + "</span></div>";
                }
            }
            else {
                resultStr = " π__π 亲,人家找不到结果!<br />要不试试：<br />1.请确保所有字词拼写正确<br />2.尝试不同的关键字<br />3.尝试更宽泛的关键字";
            }
            document.getElementById("result1").curSelect = -1;
            document.getElementById("result1").tipArr = tipArr;
            document.getElementById("result1").innerHTML = resultStr;
            document.getElementById("result1").style.display = "block";
        },

        //输入提示框鼠标滑过时的样式
        openMarkerTipById: function (pointid, thiss) {  //根据id打开搜索结果点tip
            var me = this;
            thiss.style.background = '#CAE1FF';
        },

        //输入提示框鼠标移出时的样式
        onmouseout_MarkerStyle: function (pointid, thiss) {  //鼠标移开后点样式恢复
            var me = this;
            thiss.style.background = "";
        },

        //从输入提示框中选择关键字并查询
        selectResult: function (index,thiss) {
            alert(index);
            var me = this;
            if (index < 0) {
                return;
            }
            if (navigator.userAgent.indexOf("MSIE") > 0) {
                document.getElementById("keyword").onpropertychange = null;
                document.getElementById("keyword").onfocus = me.focus_callback;
            }
            //截取输入提示的关键字部分
            var text = document.getElementById("divid" + (index + 1)).innerHTML.replace(/<[^>].*?>.*<\/[^>].*?>/g, "");
            var cityCode = document.getElementById("divid" + (index + 1)).getAttribute('data');
            document.getElementById("keyword").value = text;
            document.getElementById("result1").style.display = "none";
            //根据选择的输入提示关键字查询
            me.map.plugin(["AMap.PlaceSearch"], function () {
                var msearch = new AMap.PlaceSearch();  //构造地点查询类
                AMap.event.addListener(msearch, "complete", me.placeSearch_CallBack); //查询成功时的回调函数
                msearch.setCity(cityCode);
                msearch.search(text);  //关键字查询查询
            });
        },

        //定位选择输入提示关键字
        focus_callback: function () {
            var me = this;
            if (navigator.userAgent.indexOf("MSIE") > 0) {
                document.getElementById("keyword").onpropertychange = me.autoSearch;
            }
        },

        //输出关键字查询结果的回调函数
        placeSearch_CallBack: function (data) {
            var me = this;
            //清空地图上的InfoWindow和Marker
            me.windowsArr = [];
            me.marker = [];
            me.map.clearMap();
            var resultStr1 = "";
            var poiArr = data.poiList.pois;
            var resultCount = poiArr.length;
            for (var i = 0; i < resultCount; i++) {
                resultStr1 += "<div id='divid" + (i + 1) + "' onmouseover='me.openMarkerTipById1(" + i + ",this)' onmouseout='me.onmouseout_MarkerStyle(" + (i + 1) + ",this)' style=\"font-size: 12px;cursor:pointer;padding:0px 0 4px 2px; border-bottom:1px solid #C1FFC1;\"><table><tr><td><img src=\"http://webapi.amap.com/images/" + (i + 1) + ".png\"></td>" + "<td><h3><font color=\"#00a6ac\">名称: " + poiArr[i].name + "</font></h3>";
                resultStr1 += me.TipContents(poiArr[i].type, poiArr[i].address, poiArr[i].tel) + "</td></tr></table></div>";
                me.addmarker(i, poiArr[i]);
            }
            me.map.setFitView();
        },

        //鼠标滑过查询结果改变背景样式，根据id打开信息窗体
        openMarkerTipById1: function (pointid, thiss) {
            var me = this;
            thiss.style.background = '#CAE1FF';
            me.windowsArr[pointid].open(me.map, me.marker[pointid]);
        },

        //添加查询结果的marker&infowindow
        addmarker: function (i, d) {
            var me = this;
            var lngX = d.location.getLng();
            var latY = d.location.getLat();
            var markerOption = {
                map: me.map,
                icon: "http://webapi.amap.com/images/" + (i + 1) + ".png",
                position: new AMap.LngLat(lngX, latY)
            };
            var mar = new AMap.Marker(markerOption);
            me.marker.push(new AMap.LngLat(lngX, latY));

            var infoWindow = new AMap.InfoWindow({
                content: "<h3><font color=\"#00a6ac\">  " + (i + 1) + ". " + d.name + "</font></h3>" + me.TipContents(d.type, d.address, d.tel),
                size: new AMap.Size(300, 0),
                autoMove: true,
                offset: new AMap.Pixel(0, -30)
            });
            me.windowsArr.push(infoWindow);
            var aa = function (e) {
                var nowPosition = mar.getPosition(),
                    lng_str = nowPosition.lng,
                    lat_str = nowPosition.lat;
                infoWindow.open(me.map, nowPosition);
                document.getElementById("lngX").value = lng_str;
                document.getElementById("latY").value = lat_str;
            };
            AMap.event.addListener(mar, "mouseover", aa);
        },

        //infowindow显示内容
        TipContents: function (type, address, tel) {  //窗体内容
            var me = this;
            if (type == "" || type == "undefined" || type == null || type == " undefined" || typeof type == "undefined") {
                type = "暂无";
            }
            if (address == "" || address == "undefined" || address == null || address == " undefined" || typeof address == "undefined") {
                address = "暂无";
            }
            if (tel == "" || tel == "undefined" || tel == null || tel == " undefined" || typeof address == "tel") {
                tel = "暂无";
            }
            var str = "  地址：" + address + "<br />  电话：" + tel + " <br />  类型：" + type;
            return str;
        },
        keydown: function (event) {
            var me = this;
            var key = (event || window.event).keyCode;
            var result = document.getElementById("result1")
            var cur = result.curSelect;
            if (key === 40) {//down
                if (cur + 1 < result.childNodes.length) {
                    if (result.childNodes[cur]) {
                        result.childNodes[cur].style.background = '';
                    }
                    result.curSelect = cur + 1;
                    result.childNodes[cur + 1].style.background = '#CAE1FF';
                    document.getElementById("keyword").value = result.tipArr[cur + 1].name;
                }
            } else if (key === 38) {//up
                if (cur - 1 >= 0) {
                    if (result.childNodes[cur]) {
                        result.childNodes[cur].style.background = '';
                    }
                    result.curSelect = cur - 1;
                    result.childNodes[cur - 1].style.background = '#CAE1FF';
                    document.getElementById("keyword").value = result.tipArr[cur - 1].name;
                }
            } else if (key === 13) {
                var res = document.getElementById("result1");
                if (res && res['curSelect'] !== -1) {
                    me.selectResult(document.getElementById("result1").curSelect);
                }
            } else {
                me.autoSearch();
            }
        },
    };


    Carnet.module["GD_pos_get"] = GD_pos_get;
})(jQuery, window);

// //输入提示框鼠标滑过时的样式
// function openMarkerTipById (pointid, thiss) {  //根据id打开搜索结果点tip
//     var me = this;
//     thiss.style.background = '#CAE1FF';
// }
//
// //输入提示框鼠标移出时的样式
// function onmouseout_MarkerStyle(pointid, thiss) {  //鼠标移开后点样式恢复
//     var me = this;
//     thiss.style.background = "";
// }
//
// //从输入提示框中选择关键字并查询
// function selectResult(index,thiss) {
//     alert(index);
//     var me = thiss;
//     if (index < 0) {
//         return;
//     }
//     if (navigator.userAgent.indexOf("MSIE") > 0) {
//         document.getElementById("keyword").onpropertychange = null;
//         document.getElementById("keyword").onfocus = me.focus_callback;
//     }
//     //截取输入提示的关键字部分
//     var text = document.getElementById("divid" + (index + 1)).innerHTML.replace(/<[^>].*?>.*<\/[^>].*?>/g, "");
//     var cityCode = document.getElementById("divid" + (index + 1)).getAttribute('data');
//     document.getElementById("keyword").value = text;
//     document.getElementById("result1").style.display = "none";
//     //根据选择的输入提示关键字查询
//     me.map.plugin(["AMap.PlaceSearch"], function () {
//         var msearch = new AMap.PlaceSearch();  //构造地点查询类
//         AMap.event.addListener(msearch, "complete", me.placeSearch_CallBack); //查询成功时的回调函数
//         msearch.setCity(cityCode);
//         msearch.search(text);  //关键字查询查询
//     });
// }
