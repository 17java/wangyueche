var No = 0;

(function($) {
    //构造器
    function list() {
        this.server=new Carnet.module.server();
        this.listViewId='dataList';
        this.listView = $('#'+this.listViewId);
    };
    list.prototype = {
        constructor: list,
        init:function(){
            alert("init");
            var _self=this;
            _self.bindEvents();
        },
        bindEvents:function(){
            var _self=this;
            _self.loadDataGrid();
        },
        //设置表格表头
        loadGridTitle:function(){
            var _self = this;
            alert("datagrid");
            _self.listTypeShow = [[
                {field : 'choose', checkbox:true,width : "5%"},
                {field : 'id',title : '序号',width : "5%",
                    formatter: function(value,row,index){
                        No += 1;
                        return No;
                    }},
                {field : 'staffNo',title : '工号',width : '5%'},
                {field : 'userNo',title : '账号',width : '5%'},
                {field : 'name',title : '姓名',width : '5%'},
                {field : 'nickName',title : '昵称',width : '9%'},
                {field : 'sex',title : '性别',width : '5%',
                    formatter: function(value,row,index){
                        if (value == "0") {
                            return "女";
                        }
                        if (value == "1") {
                            return "男";
                        }
                        return "未录入";
                    }},
                {field : 'organizationId',title : '组织',width : '9%'},
                {field : 'position',title : '职位',width : '8%'},
                {field : 'roleList',title : '角色',width : '10%',
                    formatter: function (value,row,index) {
                        var listStr = "";
                        var list = value;
                        for (var i = 0; i < list.length; i++) {
                            listStr = listStr + (i + 1) + "." + list[i].roleName;
                        }
                        return listStr;
                    }},
                {field : 'locked',title : '锁定标志',width : '9%',
                    formatter: function (value,row,index) {
                        if (value == "0") {
                            return "激活";
                        }
                        if (value == "1") {
                            return "锁定";
                        }
                        return "未知状态";
                    }},
                {field : 'userType',title : '人员类型',width : '12%'},
                {field : 'phone',title : '电话',width : '12%'},
                // {field : '',title : '操作',width : '12%'}
            ]];
        },
        //加载数据列表
        loadDataGrid: function (data) {

            alert("loadDataGrid");
            var _self = this;
            _self.loadGridTitle();  //设备表头
            _self.listView.datagrid({
                url : "${ctx}/admin/security/page",// 加载的URL
                method : 'post',
                idField : "id",
                onLoadSuccess: function (data) {
                    cLib.base.setLangChina(_self.listViewId);//设置中文显示
                    if (data.total == 0) {
                        $('.datagrid-view').append('<div id = "hasNoneData" style="text-align:center;padding-top:40px;" class="searchnodata">没有找到相关记录</div>');
                    }
                },
                height : $('#contentIn',window.parent.document).height()-200,
                width:'100%',
                rownumbers : true,
                singleSelect : false,
                queryParams:data||{},
                loadMsg: "查询数据请稍候。。。",
                pagination : true,// 显示分页
                pageSize : 20,// 分页大小
                pageList : [ 10, 20, 30, 40,50],// 每页的个数
                fit : false,// 自动补全
                fitColumns : true,
                title:'',
                iconCls : "icon-save",// 图标
                columns : _self.listTypeShow
            });
        }

    }
    //将服务模型添加到全局变量中
    Carnet.module["list"] = list;
})(jQuery);