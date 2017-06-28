/**
 * Created by wangpeng on 2017/3/27.
 */
var cLib = {}; //定义公共库全局变量
(function (lib) {
    base = {
        getCookie: function (c_name) { //获取cookie
            if (document.cookie.length > 0) {
                c_start = document.cookie.indexOf(c_name + "=");
                if (c_start != -1) {
                    c_start = c_start + c_name.length + 1;
                    c_end = document.cookie.indexOf(";", c_start);
                    if (c_end == -1)
                        c_end = document.cookie.length;
                    return unescape(document.cookie.substring(c_start, c_end))
                }
            }
            return "";
        },
        setCookie: function (c_name, value, expiredays, path) { //设置cookie
            var exdate = new Date();
            exdate.setDate(exdate.getTime() + expiredays * 24 * 60 * 60 * 1000);
            document.cookie = c_name + "=" + escape(value) + ((expiredays == null) ? "" : ";expires=" + exdate.toGMTString()) + ((path == null) ? "" : ";path=" + path + ";domain=capcare.com.cn");
        },
        clearCookie: function () { //清除cookie
            var keys = document.cookie.match(/[^ =;]+(?=\=)/g);
            if (keys) {
                for (var i = keys.length; i--;)
                    document.cookie = keys[i] + '=0;expires=' + new Date(0).toUTCString()
            }
        },
        //设置datagrid中文显示
        setLangChina: function (id) {

            $('#' + id + '').datagrid('getPager').pagination({ //分页栏下方文字显示
                beforePageText: '第', //页数文本框前显示的汉字
                afterPageText: '页    共 {pages} 页',
                displayMsg: '当前显示：从第{from}条到{to}条 共{total}条记录',
                onBeforeRefresh: function (pageNumber, pageSize) {
                    $(this).pagination('loading');
                    //alert('pageNumber:'+pageNumber+',pageSize:'+pageSize);
                    $(this).pagination('loaded');
                }
            });
        },
        //保留小数位
        digitFn: function (digit, length) { //digit数字，length长度
            length = length ? parseInt(length) : 0;
            if (length <= 0) return Math.round(digit);
            digit = Math.round(digit * Math.pow(10, length)) / Math.pow(10, length);
            return digit;
        },
        //时间戳转日期
        formatterDateDay: function (lmsd) {
            if (lmsd != null && lmsd != '') {
                var date = new Date();
                date.setTime(lmsd);
                var day = date.getDate().toString();
                day = day.length == 1 ? '0' + day : day;
                var month = (date.getMonth() + 1).toString();
                month = month.length == 1 ? '0' + month : month;
                var year = date.getFullYear();
                var hour = date.getHours().toString();
                hour = hour.length == 1 ? '0' + hour : hour;
                var min = date.getMinutes().toString();
                min = min.length == 1 ? '0' + min : min;
                var second = date.getSeconds().toString();
                second = second.length == 1 ? '0' + second : second;
                return (year + '-' + month + '-' + day + ' ' + hour + ':' + min + ':' + second);
            } else {
                return ('无');
            }
        },

        // 将字符串格式的日期转化成格式化形式的
        getLocalTime: function (nS) {
            var s = nS.toString();
            var date;

            // alert(s.length);
            if (s.length == 10) {
                date = parseInt(nS) * 1000;
            }
            else if (s.length == 8) {
                date = parseInt(nS) * 100000;
            }
            else if (s.length == 14) {
                date = parseInt(nS);
            } else {
                return nS;
            }
            var time = date.toString();
            var year = time.substring(0, 4);
            var month = time.substring(4, 6);
            var day = time.substring(6, 8);
            var hours = time.substring(8, 10);
            var minutes = time.substring(10, 12);
            var seconds = time.substring(12, 14);
            return year + '-' + month + '-' + day + ' ' + hours + ':' + minutes + ':' + seconds;

        },

        // 从1970开始的时间戳转换当前时间 .replace(/:\d{1,2}$/, ' ')
        formatter1970Day: function (nS) {
            return new Date(parseInt(nS) * 1000).toLocaleString();
        },



        //md5加密
        md5: function (psw) {
            return $.md5(psw.toLowerCase()).toLowerCase();
        },
        //日期转为时间戳
        dataToLong: function (str) {
            if (str != '' && str != '无') {
                str = str.replace(/-/g, '/'); // 将-替换成/
                var date = new Date(str); // 构造一个日期型数据，值为传入的字符串
                var time = date.getTime();
                return time;
            }
        },
        getParam: function (name) { //获取浏览器url的参数
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
            var r = window.location.search.substr(1).match(reg);
            if (r != null)
                return unescape(r[2]);
            return null;
        },

        //新添加 yub
        // 根据url查询list
        list: function (url) {
            return $.ajax({
                url: "http://" + window.location.host + "/wangyueche/" + url,
                dataType: "json",
                type: "get",
                async: true
            });
        },
        // 添加
        add: function (requestModel, url) {
            return $.ajax({
                url: "http://" + window.location.host + "/wangyueche/" + url,
                dataType: "json",
                type: "post",
                data: requestModel,
                async: false
            });
        },
        //详情 requestModel为id
        view: function (requestModel, url) {
            return $.ajax({
                url: "http://" + window.location.host + "/wangyueche/" + url + requestModel,
                dataType: "json",
                type: "get",
                async: false
            });
        },
        //修改
        update: function (requestModel, url, subdata) {
            return $.ajax({
                url: "http://" + window.location.host + "/wangyueche/" + url + requestModel,
                dataType: "json",
                data: subdata,
                type: "post",
                async: false
            });
        },
        //单项删除
        delete: function (requestModel, url) {
            return $.ajax({
                url: "http://" + window.location.host + "/wangyueche/" + url + requestModel,
                dataType: "json",
                type: "get",
                async: false
            });
        },
        //批量删除
        deleteByIds: function (requestModel, url) {
            return $.ajax({
                url: "http://" + window.location.host + "/wangyueche/" + url,
                dataType: "json",
                type: "post",
                data: requestModel,
                async: false
            });
        },
        //checkbox的全选全不选
        allCheckbox: function (subBox, allCheckbox) {
            $(subBox).prop("checked", $(allCheckbox).prop("checked"));
        },
        subBox: function (subBox, allCheckbox) {
            if ($(subBox).length == $("subBox:checked")) {
                $(allCheckbox).prop("checked", true);
            }
            if ($(subBox).length != $("subBox:checked")) {
                $(allCheckbox).prop("checked", false);
            }
        },
        //设备信息填充数据
        matchData: function (attr, json) { //attr: id or class   json:  数据
            var aEle = $('#' + attr + ' [data-name],.' + attr + ' [data-name]');
            $.each(aEle, function () {
                var name = $(this).attr('data-name');
                var data = json[name] || '';
                $(this).val(data);
            })
        },


    }
    lib.base = base;
})(cLib)
