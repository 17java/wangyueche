<#macro menu>
<div class="leftWrap" id="leftWrap">
    <div class="logoWrap">
        <p class="tabWide">
            网约车平台
            <span class="setNarrow"></span>
        </p>
        <p class="tabNarrow " id="tabNarrow"></p>
    </div>
    <ul id="leftTab" class="tabUl">
        <li>
            <div class="tabIconWrap">
                <img src="wangyueche/images/left/icon1.png">
            </div>
            <p>综合信息</p>
            <ul>
                <li><a href="wangyueche/html/demo/demo.html" target="downcon">平台信息</a></li>
                <li><a href="" target="downcon">车辆信息</a></li>
                <li><a href="" target="downcon">驾驶员信息</a></li>
            </ul>
        </li>
        <li>
            <div class="tabIconWrap">
                <img src="wangyueche/images/left/icon2.png">
            </div>
            <p>基础信息</p>
            <ul>
                <li><a href="" target="downcon">平台基本信息</a></li>
                <li><a href="" target="downcon">平台运行许可信息</a></li>
                <li><a href="" target="downcon">平台运营规模信息</a></li>
                <li><a href="" target="downcon">平台支付信息</a></li>
                <li><a href="" target="downcon">平台运价信息</a></li>
                <li><a href="" target="downcon">车辆基本信息</a></li>
            </ul>
        </li>
    </ul>
</div>
</#macro>

<#macro header>
    <div class="header">
        <div class="userWrap" id="userWrap">
            <span class="exit"></span>
            <span class="userPhoto">李达</span>
            <span class="infodate"><a class="num">4</a></span>
            <span class="infoemail"><a class="num">7</a></span>
            <span class="infoalarm"><a class="num">3</a></span>
        </div>
        <div class="navWrap">
            <ul class="navUl" id="navUl">
                <li class="active">基础信息</li>
                <li>运营监管</li>
                <li>统计分析</li>
                <li>合乘信息</li>
                <li>系统管理</li>
            </ul>
        </div>
    </div>
</#macro>

<#macro footer>
<footer class="main-footer">
    <div class="pull-right hidden-xs">
        <b>版本</b> 0.0.1
    </div>
    <strong>Copyright &copy; 2017 <a href="http://www.sun-create.com">四创电子</a>
    </strong> 版权所有
</footer>
</#macro>

<#macro style>
<!-- Tell the browser to be responsive to screen width -->
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

<link href="wangyueche/css/common/reset.css" rel="stylesheet"/>
<link href="wangyueche/css/common/base.css" rel="stylesheet"/>
<link href="wangyueche/css/main.css" rel="stylesheet"/>

<link href="wangyueche/css/re-main.css" rel="stylesheet"/>

<link rel="stylesheet" type="text/css" href="wangyueche/script/lib/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="wangyueche/script/lib/easyui/themes/icon.css">
<link href="wangyueche/css/common/reset.css" rel="stylesheet"/>
<link href="wangyueche/css/common/base.css" rel="stylesheet"/>
<link rel="stylesheet" type="text/css" href="wangyueche/script/lib/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="wangyueche/script/lib/easyui/themes/icon.css">

<link rel="stylesheet" type="text/css" href="wangyueche/script/lib/My97DatePicker/skin/whyGreen/datepicker.css">
<#--layer.css-->
<link rel="stylesheet" type="text/css" href="wangyueche/script/lib/layui/css/layui.css">

<script src="../../script/module/security/userlist.js" type="text/javascript"></script>
<![endif]-->
</#macro>

<#macro jsFile>

<script type="text/javascript" src="wangyueche/script/lib/jquery/jquery.js"></script>
<script src="wangyueche/script/common/common.js" type="text/javascript"></script>
<script src="wangyueche/script/common/carnet.js" type="text/javascript"></script>
<script src="wangyueche/script/server.js" type="text/javascript"></script>
<!-- layer -->
<script src="wangyueche/script/lib/layui/layui.js" type="text/javascript"></script>
<script src="wangyueche/script/module/main.js" type="text/javascript"></script>

<script type="text/javascript" src="wangyueche/script/lib/jquery/jquery.js"></script>
<script type="text/javascript" src="wangyueche/script/lib/easyui/jquery.easyui.min.js"></script>

<!-- dataPicker -->
<script src="wangyueche/script/lib/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
<script src="wangyueche/script/lib/My97DatePicker/calendar.js" type="text/javascript"></script>
<script src="wangyueche/script/lib/My97DatePicker/lang/zh-cn.js" type="text/javascript"></script>
<script src="wangyueche/script/common/common.js" type="text/javascript"></script>
<script src="wangyueche/script/common/carnet.js" type="text/javascript"></script>
<script src="wangyueche/script/server.js" type="text/javascript"></script>

<#--所有的js文件写在ftl文件中-->
<#--<script src="wangyueche/script/module/demo/demo.js" type="text/javascript"></script>-->

<script type="text/javascript">
    var list_ajax;
    var date_ajax;
    var search_ajax;
    //当你需要多条件查询，你可以调用此方法，动态修改参数传给服务器
    window.reloadTable = function (oTable, datePremise, premise) {
        var date = $(datePremise).val();
        var search = $(premise).val();
        var param = {
            "date": date,
            "search": search
        };
        oTable.settings()[0].ajax.data = param;
        oTable.ajax.reload();
    }

    function onClickCheckbox(clickName, target) {
        var status = false;
        if (document.getElementById(clickName).checked) {
            status = true;
        }
        var list = document.getElementsByName(target);
        for (var i = 0; i < list.length; i++) {
            list[i].checked = status;
        }
    }

    function iFrameHeight() {
        var ifm = document.getElementById("content");
        var subWeb = document.frames ? document.frames["content"].document : ifm.contentDocument;
        if (ifm != null && subWeb != null) {
            ifm.height = subWeb.body.scrollHeight;
        }
    }
</script>
</#macro>

<#macro setting>
<!-- Control Sidebar -->
<aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
        <li>
            <a href="#control-sidebar-home-tab" data-toggle="tab">
                <i class="fa fa-home"></i>
            </a>
        </li>
        <li>
            <a href="#control-sidebar-settings-tab" data-toggle="tab">
                <i class="fa fa-gears"></i>
            </a>
        </li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
        <!-- Home tab content -->
        <div class="tab-pane" id="control-sidebar-home-tab">
            <h3 class="control-sidebar-heading">最近的活动</h3>
            <ul class="control-sidebar-menu">
                <li>
                    <a href="javascript:void(0)">
                        <i class="menu-icon fa fa-birthday-cake bg-red"></i>
                        <div class="menu-info">
                            <h4 class="control-sidebar-subheading">我的生日</h4>
                            <p>四月二十四</p>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <i class="menu-icon fa fa-user bg-yellow"></i>

                        <div class="menu-info">
                            <h4 class="control-sidebar-subheading">更新我的资料</h4>
                            <p>新手机号码 (+86)1234567890</p>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>

                        <div class="menu-info">
                            <h4 class="control-sidebar-subheading">添加邮箱地址</h4>

                            <p>abc@roncoo.com</p>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <i class="menu-icon fa fa-file-code-o bg-green"></i>
                        <div class="menu-info">
                            <h4 class="control-sidebar-subheading">写个256字的描述</h4>
                            <p>执行时间5秒</p>
                        </div>
                    </a>
                </li>
            </ul>
            <h3 class="control-sidebar-heading">任务进度</h3>
            <ul class="control-sidebar-menu">
                <li>
                    <a href="javascript:void(0)">
                        <h4 class="control-sidebar-subheading">
                            自定义模板的设计 <span class="label label-danger pull-right">70%</span>
                        </h4>
                        <div class="progress progress-xxs">
                            <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <h4 class="control-sidebar-subheading">
                            更新简历 <span class="label label-success pull-right">95%</span>
                        </h4>

                        <div class="progress progress-xxs">
                            <div class="progress-bar progress-bar-success" style="width: 95%"></div>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <h4 class="control-sidebar-subheading">
                            获取积分 <span class="label label-warning pull-right">50%</span>
                        </h4>

                        <div class="progress progress-xxs">
                            <div class="progress-bar progress-bar-warning" style="width: 50%"></div>
                        </div>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0)">
                        <h4 class="control-sidebar-subheading">
                            后端框架 <span class="label label-primary pull-right">68%</span>
                        </h4>

                        <div class="progress progress-xxs">
                            <div class="progress-bar progress-bar-primary" style="width: 68%"></div>
                        </div>
                    </a>
                </li>
            </ul>
        </div>
        <!-- Settings tab content -->
        <div class="tab-pane" id="control-sidebar-settings-tab">
            <form method="post">
                <h3 class="control-sidebar-heading">一般设置</h3>
                <div class="form-group">
                    <label class="control-sidebar-subheading"> 面板的使用报告 <input type="checkbox" class="pull-right"
                                                                              checked>
                    </label>
                    <p>有关此常规设置选项的一些信息</p>
                </div>
                <div class="form-group">
                    <label class="control-sidebar-subheading"> 允许邮件重定向 <input type="checkbox" class="pull-right"
                                                                              checked>
                    </label>
                    <p>其他可用的选项集</p>
                </div>
                <div class="form-group">
                    <label class="control-sidebar-subheading"> 在帖子中公开作者姓名 <input type="checkbox" class="pull-right"
                                                                                 checked>
                    </label>
                    <p>允许用户在博客帖子中显示自己的名字</p>
                </div>
                <h3 class="control-sidebar-heading">聊天设置</h3>
                <div class="form-group">
                    <label class="control-sidebar-subheading"> 显示我是否在线 <input type="checkbox" class="pull-right"
                                                                              checked>
                    </label>
                </div>
                <div class="form-group">
                    <label class="control-sidebar-subheading"> 关闭通知 <input type="checkbox" class="pull-right">
                    </label>
                </div>
                <div class="form-group">
                    <label class="control-sidebar-subheading"> 删除的聊天记录 <a href="javascript:void(0)"
                                                                          class="text-red pull-right">
                        <i class="fa fa-trash-o"></i>
                    </a>
                    </label>
                </div>
            </form>
        </div>
    </div>
</aside>
<div class="control-sidebar-bg"></div>
</div>
<div id="loading" class="loading-panel">
    <div class="box">
        <i class="fa fa-refresh fa-spin"></i> <span class="tip"> 正在加载 · · · </span>
    </div>
</div>
<div class="modal fade" id="smModal">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
                <h4 class="modal-title">提示</h4>
            </div>
            <div class="modal-body">
                <p>确认删除？</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary">确认</button>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="lgModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">
                <p>确认删除？</p>
            </div>
        </div>
    </div>
</#macro>