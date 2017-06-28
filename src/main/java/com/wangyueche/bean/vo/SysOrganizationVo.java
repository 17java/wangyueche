package com.wangyueche.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wangyueche.bean.entity.SysOrganization;
import com.wangyueche.bean.entity.SysUser;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by gaoshiwei on 2017/3/30.
 */
public class SysOrganizationVo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Long parentId;

    private String parentIds;

    private String statusId;

    private String email;

    private Long userId;

    private Integer sortNo;

    private Integer expend;

    private Integer isLeaf;

    private String remark;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private SysUser sysUser;

    public SysOrganizationVo(SysOrganization sysOrganization){
        this.id = sysOrganization.getId();
        this.name= sysOrganization.getName();
        this.parentId = sysOrganization.getParentId();
        this.parentIds = sysOrganization.getParentIds();
        this.statusId = sysOrganization.getStatusId();
        this.email = sysOrganization.getEmail();
        this.userId = sysOrganization.getUserId();
        this.sortNo = sysOrganization.getSortNo();
        this.expend = sysOrganization.getExpend();
        this.isLeaf = sysOrganization.getIsLeaf();
        this.remark = sysOrganization.getRemark();
        this.createTime = sysOrganization.getCreateTime();
        this.updateTime = sysOrganization.getUpdateTime();
    }

    public SysOrganizationVo(SysOrganization sysOrganization,SysUser user){
        this.id = sysOrganization.getId();
        this.name= sysOrganization.getName();
        this.parentId = sysOrganization.getParentId();
        this.parentIds = sysOrganization.getParentIds();
        this.statusId = sysOrganization.getStatusId();
        this.email = sysOrganization.getEmail();
        this.sortNo = sysOrganization.getSortNo();
        this.expend = sysOrganization.getExpend();
        this.isLeaf = sysOrganization.getIsLeaf();
        this.remark = sysOrganization.getRemark();
        this.createTime = sysOrganization.getCreateTime();
        this.updateTime = sysOrganization.getUpdateTime();
        this.sysUser = user;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Integer getExpend() {
        return expend;
    }

    public void setExpend(Integer expend) {
        this.expend = expend;
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }
}
