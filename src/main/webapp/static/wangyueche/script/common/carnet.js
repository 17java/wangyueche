/**
 * Created by wangpeng on 2017/3/27.
 */
(function (win, $) {
    //DOM
    var hjkj;
    var carnet = win.Carnet = win.Carnet || {
            //BOM
            basePrefixURL: 'http://' + window.location.host + "/wangyueche",
            basePrefixImgUrl: "",
            module: {},
            // --------------------------------------------------区块
            // 城市编码  "340100"--合肥市   110100--北京
            city_code: '340100',
            // 区块开始颜色 #9292e3
            start_color: '#D7FFEE',
            // 区块结束颜色  2baef1
            end_color: '#6666ff',
            // 鼠标悬浮颜色
            over_color: 'transparent',
            // 区块的透明度
            fill_opacity: 0.5,
            // 区块围栏宽度
            qu_stroke: 1.5,

            // 市监控的循环时间
            shi_time: 2000,
            // 区监控的循环时间
            qu_time: 2000,
            // 设备追踪循环时间
            moniter_time: 2000,
            // 车的图标---载客
            car_zk: '../../images/map/car_zk.png',
            // -----空驶
            car_ks: '../../images/map/car_ks.png',
            // -----接单
            car_jd: '../../images/map/car_jd.png',
            // -----停运
            car_ty: '../../images/map/car_ty.png',
            // 图片的大小
            car_size: [33, 29],
            // -----------------------------------------围栏的配置
            // 围栏显示的样式
            fence_styleOptions: {
                strokeColor: "blue", //边线颜色。
                fillColor: "blue", //填充颜色。当参数为空时，圆形将没有填充效果。
                strokeWeight: 1, //边线的宽度，以像素为单位。
                strokeOpacity: 0.5, //边线透明度，取值范围0 - 1。
                fillOpacity: 0.1, //填充的透明度，取值范围0 - 1。
                strokeStyle: 'solid' //边线的样式，solid或dashed。
            },
            // 编辑围栏的样式
            fence_editOptions: {
                strokeColor: "red", //边线颜色。
                fillColor: "red", //填充颜色。当参数为空时，圆形将没有填充效果。
                strokeWeight: 1, //边线的宽度，以像素为单位。
                strokeOpacity: 0.5, //边线透明度，取值范围0 - 1。
                fillOpacity: 0.1, //填充的透明度，取值范围0 - 1。
                strokeStyle: 'solid' //边线的样式，solid或dashed。
            },
            // -----------------------------------------异常围栏的配置
            unnor_fence_time: 2000,
        }
})(window, jQuery);
