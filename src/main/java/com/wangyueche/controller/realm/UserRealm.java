package com.wangyueche.controller.realm;

import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.entity.SysRole;
import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.biz.UserBiz;
import com.wangyueche.util.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;

public class UserRealm extends AuthorizingRealm {

	@Autowired
	private UserBiz biz;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		String userno = (String) principals.getPrimaryPrincipal();
		SysUser result = biz.queryByUserNo(userno);
		if(result!=null){
			List<SysRole> resultRole = biz.queryRoles(result.getId());
			if(resultRole.size()>0){
				//获取角色
				HashSet<String> roles = new HashSet<String>();
				for (SysRole sysRole : resultRole) {
					roles.add(sysRole.getRoleValue());
				}
				System.out.println("角色："+roles);
				authorizationInfo.setRoles(roles);
				
				//获取权限
				List<SysPermission> resultPermission = biz.queryPermissions(resultRole);
				if(resultPermission.size()>0){
					HashSet<String> permissions = new HashSet<String>();
					for (SysPermission sysPermission : resultPermission) {
						permissions.add(sysPermission.getPermissionValue());
					}
					System.out.println("权限："+permissions);
					authorizationInfo.setStringPermissions(permissions);
				}
			}
		}
		return authorizationInfo;
		
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		String userno = (String) authenticationToken.getPrincipal();
		String password = new String((char[]) authenticationToken.getCredentials());
		SysUser result = biz.login(userno, password);
		if (result!=null) {
			Session session = SecurityUtils.getSubject().getSession();
			session.setAttribute(Constants.Token.RONCOO, userno);
			SysUser user = result;
			return new SimpleAuthenticationInfo(user.getUserNo(), user.getPassword(), getName());
		}
		return null;
	}
}
