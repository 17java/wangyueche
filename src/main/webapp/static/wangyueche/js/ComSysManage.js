/**
 * Created by Wyan_ on 2017/4/10.
 */
// table中全选按钮
//    全选
function fullChose() {
    $('.user_checkbox').prop("checked", true);
}
//    反选
function revChose() {
    $("input[name=items]:checkbox").each(function () {
        this.checked = !this.checked;
    });
}
//    取消选择
function unChose() {
    $('.user_checkbox').prop("checked", false);

}