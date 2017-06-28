package com.wangyueche.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.entity.SysRole;
import com.wangyueche.bean.entity.SysUser;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/30.
 */
public class SysRoleVo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;

    private String roleName;

    private String roleValue;

    private String statusId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private List<SysPermission> permissionList;

    //新增
    private List<SysUser> userList;

    public SysRoleVo(SysRole sysRole){
        this.id = sysRole.getId();
        this.roleName = sysRole.getRoleName();
        this.roleValue = sysRole.getRoleValue();
        this.statusId = sysRole.getStatusId();
        this.createTime = sysRole.getCreateTime();
        this.updateTime = sysRole.getUpdateTime();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(String roleValue) {
        this.roleValue = roleValue;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<SysPermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<SysPermission> permissionList) {
        this.permissionList = permissionList;
    }

    public List<SysUser> getUserList() {
        return userList;
    }

    public void setUserList(List<SysUser> userList) {
        this.userList = userList;
    }
}
