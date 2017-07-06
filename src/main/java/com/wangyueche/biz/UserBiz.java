package com.wangyueche.biz;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.*;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.Result;
import com.wangyueche.bean.vo.SysUserVo;
import com.wangyueche.service.*;
import com.wangyueche.util.base.Page;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/30.
 */
@Component
public class UserBiz {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private RolePermissionService rolePermissionsService;

    @Autowired
    private PermissionService permissionService;

    /**
     * 用户登录
     *
     * @param userno
     * @param password
     * @return
     */
    public SysUser login(String userno, String password) {
        return userService.login(userno, password);
    }


    /**
     * 分页查询用户信息
     *
     * @param pager
     * @param organizationId
     * @param name
     * @param staffNo
     * @return
     */
    public EasyUIResult listForPage(Pager pager, Long organizationId, String name, String staffNo,String organizationName) {
        EasyUIResult resultVo = new EasyUIResult();
        EasyUIResult result = userService.listForPage(pager, organizationId, name, staffNo,organizationName);
        if (result!=null) {
            ArrayList<SysUserVo> resultData = new ArrayList<SysUserVo>();
            SysUserVo sysUserVo;
            for (SysUser sysUser : (List<SysUser>)result.getRows()) {
                sysUserVo = new SysUserVo(sysUser);
                List<SysRole> resultRole = queryRoles(sysUser.getId());
                if (resultRole!=null) {
                    sysUserVo.setRoleList(resultRole);
                    resultData.add(sysUserVo);
                }
            }
            PageInfo<SysUserVo> pageInfo = new PageInfo<>(resultData);
            resultVo.setTotal(pageInfo.getTotal());
            resultVo.setRows(pageInfo.getList());
            return resultVo;
        }
        return resultVo;
    }

    /**
     * 根据id查询用户的信息
     *
     * @param id
     * @return
     */
    public SysUserVo query(long id) {
        SysUser result = userService.query(id);
        System.out.println(result);
        if (result!=null) {
            SysUserVo sysUserVo = new SysUserVo(result);
            List<SysRole> resultR = queryRoles(id);
            if (result!=null) {
                sysUserVo.setRoleList(resultR);
                return sysUserVo;
            }
        }
        return null;
    }

    /**
     * 根据账号查询用户信息
     *
     * @param userno
     * @return
     */
    public SysUser queryByUserNo(String userno) {
        return userService.queryByUserNo(userno);
    }

    /**
     * 获取角色列表
     *
     * @return
     */
    public List<SysRole> queryRoleList() {
        return roleService.list();
    }

    /**
     * 获取用户角色
     *
     * @param userId
     * @return
     */
    public List<SysRole> queryRoles(Long userId) {
        List<SysUserRole> userRoles = userRoleService.queryByParam(null,userId);
        ArrayList<Object> params = new ArrayList();
        for (SysUserRole sysUserRole : userRoles) {
            params.add(sysUserRole.getRoleId());
        }
        List<SysRole> sysRoles = roleService.listForId(params);
        return sysRoles;
    }

    /**
     * 获取角色权限
     *
     * @param roles
     * @return
     */
    public List<SysPermission> queryPermissions(List<SysRole> roles) {
        ArrayList<Object> roleParams = new ArrayList();
        for (SysRole sysRole : roles) {
            roleParams.add(sysRole.getId());
        }
        List<SysRolePermission> rolePermissions = rolePermissionsService.listForRoleId(roleParams);
        ArrayList<Object> params = new ArrayList();
        for (SysRolePermission sysRolePermission : rolePermissions) {
            params.add(sysRolePermission.getPermissionId());
        }
        return permissionService.listForId(params);
    }

    @Transactional
    public int save(SysUser sysUser, List<Long> roles) {
        int result = userService.save(sysUser);
        if (result>0) {
            SysUser resultUser = userService.queryByUserNo(sysUser.getUserNo());
            if (resultUser!=null) {
                return userRoleService.updateByUserId(resultUser.getId(), roles);
            }
        }
        return 0;
    }

    @Transactional
    public int delete(long userId) {
        SysUserRole sysUserRole = new SysUserRole();
        sysUserRole.setUserId(userId);
        int result = userRoleService.deleteByUserRole(sysUserRole);
        if (result>0) {
            return userService.delete(userId);
        }
        return 0;
    }

    @Transactional
    public int update(SysUser sysUser, List<Long> roles) {
        int result = userService.update(sysUser);
        if (result>0) {
            return userRoleService.updateByUserId(sysUser.getId(), roles);
        }
        return 0;
    }
}
