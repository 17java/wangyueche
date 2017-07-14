package com.wangyueche.biz;

import com.wangyueche.bean.entity.*;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.SysRoleVo;
import com.wangyueche.service.*;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyq
 */
@Component
public class RoleBiz {

    @Autowired
    private RoleService service;

    @Autowired
    private RolePermissionService rolePermissionService;

    @Autowired
    private PermissionService permissionService;
    //新增，角色关联用户
    @Autowired
    private UserRoleService userRoleService;
    //新增，角色关联用户
    @Autowired
    private UserService userService;


    public EasyUIResult listForPage(int pageCurrent, int pageSize, String startDate, String endDate, String roleName) {
        Pager pager = new Pager(pageCurrent, pageSize);
        return service.listForPage(pager, startDate, endDate, roleName);
    }

    public SysRoleVo query(Long roleId) {
        SysRole sysRole = service.query(roleId);
        SysRoleVo sysRoleVo = new SysRoleVo(sysRole);
        List<SysRolePermission> rolePermissions = rolePermissionService.queryByParam(roleId);
        ArrayList<Long> idList = new ArrayList();
        for (SysRolePermission sysRolePermission : rolePermissions) {
            idList.add(sysRolePermission.getPermissionId());
        }
        List<SysPermission> permissions = permissionService.listForId(idList);
        sysRoleVo.setPermissionList(permissions);
        //新增
        List<SysUserRole> sysUserRoles = userRoleService.queryByParam(roleId, null);
        if (sysUserRoles.size() > 0) {
            ArrayList<Long> uidList = new ArrayList<>();
            for (SysUserRole sysUserRole : sysUserRoles) {
                uidList.add(sysUserRole.getUserId());
            }
            List<SysUser> sysUsers = userService.listForId(uidList);
            sysRoleVo.setUserList(sysUsers);
        }
        return sysRoleVo;
    }

    public List<SysPermission> queryPermissionList() {
        return permissionService.list();
    }

    @Transactional
    public int save(SysRole sysRole, List<Long> permissionList) {
        //只保存角色内容
        int result = service.save(sysRole);
        if (result > 0) {
            SysRole resultRole = service.queryByRoleName(sysRole.getRoleName());
            if (result > 0) {
                return rolePermissionService.save(resultRole.getId(), permissionList);
            }
        }
        return 0;
    }

    @Transactional
    public int delete(long id) {
        int result = rolePermissionService.delete(id);
        if (result > 0) {
            return service.delete(id);
        }
        return 0;
    }

    @Transactional
    public int update(SysRole sysRole, List<Long> permissionList) {
        int result = rolePermissionService.update(sysRole.getId(), permissionList);
        System.out.println(sysRole.getId());
        if (result > 0) {
            return service.update(sysRole);
        }
        return 0;
    }
}