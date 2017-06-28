package com.wangyueche.bean.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class SysPermission implements Serializable {
    private Long id;

    private String type;

    private String url;

    private Long parentId;

    private String parentIds;

    private String permissionName;

    private String permissionValue;

    private String statusId;

    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer sortNo;

    private String icon;

    private Boolean isParent;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionValue() {
        return permissionValue;
    }

    public void setPermissionValue(String permissionValue) {
        this.permissionValue = permissionValue == null ? null : permissionValue.trim();
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId == null ? null : statusId.trim();
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

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", url=").append(url);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentIds=").append(parentIds);
        sb.append(", permissionName=").append(permissionName);
        sb.append(", permissionValue=").append(permissionValue);
        sb.append(", statusId=").append(statusId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", icon=").append(icon);
        sb.append(", isParent=").append(isParent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}