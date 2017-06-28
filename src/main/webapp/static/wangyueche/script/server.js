/*!
 * Created by wangpeng on 2017/3/29.
 */
(function ($) {
    //构造器
    function server() {
    };
    server.prototype = {
        // -----------------------------------------------所有地图API
        map: {
            // ----------------------------------------------所有zc围栏的接口
            fence: {
                all: function (obj) {
                    return $.ajax({
                        url: Carnet.basePrefixURL + "/fence/listAll.do",
                        dataType: "json",
                        type: "post",
                        data: obj,
                        // async: false
                    });
                },
                save: function (obj) {
                    return $.ajax({
                        url: Carnet.basePrefixURL + "/fence/save.do",
                        dataType: "json",
                        type: "post",
                        data: obj,
                        // async: false
                    });
                },
                upd: function (obj) {
                    return $.ajax({
                        url: Carnet.basePrefixURL + "/fence/update.do",
                        dataType: "json",
                        type: "post",
                        data: obj,
                        // async: false
                    });
                },
            },
            no_fence: {
                all: function (obj) {
                    return $.ajax({
                        url: Carnet.basePrefixURL + "/abnormal/listAll.do",
                        dataType: "json",
                        type: "post",
                        data: obj,
                        // async: false
                    });
                },
                save: function (obj) {
                    return $.ajax({
                        url: Carnet.basePrefixURL + "/abnormal/save.do",
                        dataType: "json",
                        type: "post",
                        data: obj,
                        // async: false
                    });
                },
                upd: function (obj) {
                    return $.ajax({
                        url: Carnet.basePrefixURL + "/abnormal/update.do",
                        dataType: "json",
                        type: "post",
                        data: obj,
                        // async: false
                    });
                },
                // 监控
                monitor: function () {
                    return $.ajax({
                        url: Carnet.basePrefixURL + "/abnormal/getNum.do",
                        dataType: "json",
                        type: "post",
                        // data: obj,
                        // async: false
                    });
                },
            },
            track: {
                info: function (obj) {
                    return $.ajax({
                        url: Carnet.basePrefixURL + "/carMonitor/getpart.do",
                        dataType: "json",
                        type: "post",
                        data: obj,
                        // async: false
                    });
                },
                line: function (obj) {
                    return $.ajax({
                        url: Carnet.basePrefixURL + "/carMonitor/gettrack.do",
                        dataType: "json",
                        type: "post",
                        data: obj,
                        // async: false
                    });
                }
            },
            // ---------------------------地图基础数据储存
            save_init: function (obj) {
                return $.ajax({
                    url: Carnet.basePrefixURL + "/carMonitor/initFence.do",
                    dataType: "json",
                    type: "post",
                    data: obj,
                    // async: false
                });
            },
            // ----------------------------市区下面的数据
            _shi_data: function (obj) {
                return $.ajax({
                    url: Carnet.basePrefixURL + "/carMonitor/districts.do",
                    dataType: "json",
                    type: "post",
                    data: obj,
                    async: false
                });
            },
            // -----------------------------返回=区下面的数据
            _qu_data: function (obj) {
                return $.ajax({
                    url: Carnet.basePrefixURL + "/carMonitor/carDistricts.do",
                    dataType: "json",
                    type: "post",
                    data: obj,
                    // async: false
                });
            },
            // ------------------------------单个车的追踪数据
            _moniter_car_data: function (obj) {
                return $.ajax({
                    url: Carnet.basePrefixURL + "/carMonitor/position.do",
                    dataType: "json",
                    type: "post",
                    data: obj,
                    // async: false
                });
            },
        },
        // 登陆
        login: function (requestModel) {
            return $.ajax({
                url: Carnet.basePrefixURL + "/login",
                type: "post",
                data: requestModel,
                // async: false
            });
        },
        // 注销
        logout: function () {
            return $.ajax({
                url: Carnet.basePrefixURL + "/logout",
                type: "get"
                // async: false
            });
        },
        getUserMenu: function (requestModel) {
            return $.ajax({
                url: Carnet.basePrefixURL + "/admin/permission/permissionListByUserId",
                dataType: "json",
                type: "get",
                data: requestModel,
                async: false
            });
        },
        //平台基本信息
        platformBaseInfo: function (requestModel) {
            return $.ajax({
                url: Carnet.basePrefixURL + "/company/info/view",
                dataType: "json",
                type: "get",
                data: requestModel,
                async: false
            });
        },
        //车辆基本信息
        carBaseInfo: function (requestModel) {
            return $.ajax({
                url: Carnet.basePrefixURL + "/vehicle/info/view",
                dataType: "json",
                type: "get",
                data: requestModel,
                async: false
            });
        },
        //驾驶员基本信息
        driverBaseInfo: function (requestModel) {
            return $.ajax({
                url: Carnet.basePrefixURL + "/driver/info/view",
                dataType: "json",
                type: "get",
                data: requestModel,
                async: false
            });
        },
        //获取图表数据
        dataChart: function (url, requestModel) {
            return $.ajax({
                url: Carnet.basePrefixURL + url,
                dataType: "json",
                type: "get",
                data: requestModel,
                async: false
            });
        },

        //首页统计数据
        mapInit: function (url) {
            return $.ajax({
                url: Carnet.basePrefixURL + url,
                dataType: "json",
                type: "get",
                async: false
            });

        }
    };
    //将服务模型添加到全局变量中
    Carnet.module["server"] = server;
})(jQuery);
