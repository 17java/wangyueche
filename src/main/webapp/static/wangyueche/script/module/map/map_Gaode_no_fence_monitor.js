/**
 * Item Name  : 
 *Creator         :cc
 *Email            :cc
 *Created Date:2017.3.29.
 *@pararm     :
 */
(function($, window) {
  function no_GD_fence_monitor(opts) {
    this.id = opts.id;
    this.fence_id = opts.fence_id;

    // 鼠标操作工具
    this.mouse_tools = null;
    // 围栏的默认样式
    this.styleOptions = Carnet.fence_styleOptions;
    // 编辑围栏的样式
    this.editOptions = Carnet.fence_editOptions;
    // 围栏的收集
    this.f_arr = [];

    this.api = new Carnet.module.server().map.no_fence;
  };
  no_GD_fence_monitor.prototype = {
    //面向对象初始化
    init: function(key) {
      var me = this;
      // 功能关键字
      me.fn = key;
      me.init_Baner(); //开启控件
      setTimeout(function() {
        me.init_event();
      }, 500);
    },
    //控件默认初始化
    init_Baner: function() {
      var me = this;
      var map = me.map = new AMap.Map(me.id, {
        expandZoomRange: true,
        zoom: 20,
        zooms: [3, 20]
      });
        map.setZoomAndCenter(11, [117.227, 31.820]);
    },
    init_event: function() {
      var me = this;
      me.fence_bind();
      me.fence();
    },
    fence: function() {
      var me = this;
      me._pre_init();
      me.f_init();
    },
    fence_bind: function() {
      var me = this;
      var fn = {
        _pre_init: function() {
          var me = this;
          me.map.on('mousemove', function(argument) {
            $("#info").css({ "top": (argument.pixel.y + 5) + "px", "left": (argument.pixel.x + 5) + "px" });
          });
        },
        f_init: function() {
          var me = this;
          me._show();
        },
        // -------------------------------------------------显示
        _show: function() {
          var me = this;
          me.api.all()
            .then(function(data) {
              me.map.clearMap();
              var items = data;
              items.forEach(function(item) {
                me._show_yuan(item);
              });
              me.map.setFitView();
              // 开始请求区块的更变数据
              me._yuan_data();
            });
        },
        // 圆形展示
        _show_yuan: function(data) {
          var me = this;
          var opts = me.editOptions;

          var marker = new AMap.Circle(opts);
          marker.setCenter(new AMap.LngLat(data.lng, data.lat));
          marker.setRadius(data.radius);
          marker.setMap(me.map);

          marker.id = data.id;

          marker.on('mouseover', function(argument) {
            $("#info").html("");
            var str = '' +
              '<p>当前警告级别：' + marker.level + '</p>' +
              '<p>当前聚集数量：' + marker.num + '</p>';
            $("#info").html(str);
            $("#info").show();
          });
          marker.on('mouseout', function(argument) {
            $("#info").hide();
          });
          me.f_arr.push(marker);
        },
        // --------------------------请求异常的数据
        _yuan_data: function() {
          var me = this;
          me.api.monitor()
            .then(function(data) {
              me._yuan_data_bind(data);
              me._data_interval();
            });
        },
        // 围栏数据绑定
        _yuan_data_bind: function(arr) {
          var me = this;
          var doms = me.f_arr;
          for (var i = 0; i < arr.length; i++) {
            for (var k = 0; k < doms.length; k++) {
              if (doms[k].id == arr[i].id) {
                doms[k].num = arr[i].num;
                doms[k].level = arr[i].level;
                break;
              }
            }
          }
        },
        // 异常循环
        _data_interval: function(argument) {
          var me = this;
          setTimeout(function(argument) {
            me._yuan_data();
          }, Carnet.unnor_fence_time);
        },

      };
      for (k in fn) {
        me[k] = fn[k];
      };
    },
  };
  Carnet.module["no_GD_fence_monitor"] = no_GD_fence_monitor;
})(jQuery, window);
