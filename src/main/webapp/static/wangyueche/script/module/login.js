/**
 * Created by wangpeng on 2017/3/29.
 */
(function ($, win) {
    function login(){
        this.server=new Carnet.module.server();
    }
    login.prototype={
        constructor: login,
        init:function(){
            var _self=this;
            var high=$(window).height();
            $('#imgShow,#bannerImg').height(high);
            $('.bottom').css('line-height',high*0.0425+'px');
            _self.bindEvents();
        },
        bindEvents:function(){
            var _self=this;
            $('#goLogin').bind('click',function(){
                _self.goLogin();
            })
            var cookieUser=cLib.base.getCookie('username'),
            cookiePw=cLib.base.getCookie('password');
            if(cookieUser&&cookiePw){//判断是否记住了密码
            	$('#userName').val(cookieUser);
                $('#passWord').val(cookiePw);
            	$('#remember').prop('checked',true);
            }
            document.onkeydown = function (e) {//
                var e = e || event;
                //阻止事件冒泡
               // e.stopPropagation();
                if (e.keyCode == 13) {  //判断是否单击的enter按键(回车键)
                	_self.goLogin();
                }
            }
        },
        goLogin:function(){//登陆
        	var _self=this;
            var userName=$('#userName').val(),
                passWord=$('#passWord').val();
            if(userName==""){
            	layer.msg("用户名不能为空！",{'offset':['34%','74%']});
            	return false;
            	
            }else if(passWord==''){
            	layer.msg("密码不能为空！",{'offset':['34%', '74%']});
            	return false;
            }else{
            	var subData={
        			username:userName,
        			password:passWord
            	}
            	_self.server.login(subData).done(function(res){
                    if(res=="success"){
            			if($('#remember').prop("checked")==true){//记住密码
                            cLib.base.setCookie("username",userName,7);
                            cLib.base.setCookie("password",passWord,7);
            			}else{
                            cLib.base.setCookie("username","");
                            cLib.base.setCookie("password","");
            				$('#remember').prop('checked',false)
            			}
                        cLib.base.setCookie("user",userName);
            			window.location.href="main.html";
                    }else{
            			layer.msg("登录失败，请检查",{'offset':['34%', '74%']});
                    }
            	})
            }
        }
    }
    Carnet.module["login"] = login;
})(jQuery, window);