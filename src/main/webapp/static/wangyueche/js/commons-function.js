/**
 * Created by gaojl on 2017/4/7 13:16
 * @author gaojl
 */


/*//dataTbales根据参数重新加载数据
window.tableReload = function (oTable, param) {
    oTable.settings()[0].ajax.data = param;
    oTable.ajax.reload();
}*/


//复选框删除多项
window.deleteCheckedBoxes=function (classSelector, url, reload) {
    if (window.confirm("确认删除所选记录吗？")) {
        var checkedValue = [];
        var chkBoxes = $(classSelector);
        for (var i = 0; i < chkBoxes.length; i++) {
            if (chkBoxes[i].checked) {
                checkedValue.push(chkBoxes[i].value);
            }
        }
        if (!checkedValue.length) {
            alert("所选记录不能为空！");
            return;
        }
        $.ajax({
            url: url,//请求路径
            data: {"checkedId[]": checkedValue},
            dataTYpe: "json",
            type: "POST",
            success: function (data) {
                if (data.status) {
                    //服务器设置resultData为删除的记录数
                    alertMsg("成功删除" + data.resultData + "条记录！", "success");
                    reload();
                }
            }
        });
    }
}