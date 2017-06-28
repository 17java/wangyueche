package com.wangyueche.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wangyueche.bean.entity.SysMenu;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by gaoshiwei on 2017/3/30.
 */
public class SysMenuVo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;

    private String menuName;

    private Integer menuType;

    private Long parentId;

    private String parentIds;

    private Integer enable;

    private String iconcls;

    private String href;

    private Integer expand;

    private Integer sortNo;

    private Integer isLeaf;

    private String remark;

    private Long createBy;

    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Long updateBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public SysMenuVo(SysMenu sysMenu){
        this.id = sysMenu.getId();
        this.menuName = sysMenu.getMenuName();
        this.menuType = sysMenu.getMenuType();
        this.parentId = sysMenu.getParentId();
        this.parentIds = sysMenu.getParentIds();
        this.enable = sysMenu.getEnable();
        this.iconcls = sysMenu.getIconcls();
        this.href = sysMenu.getHref();
        this.expand = sysMenu.getExpand();
        this.sortNo = sysMenu.getSortNo();
        this.isLeaf = sysMenu.getIsLeaf();
        this.isLeaf = sysMenu.getIsLeaf();
        this.remark = sysMenu.getRemark();
        this.createBy = sysMenu.getCreateBy();
        this.createTime = sysMenu.getCreateTime();
        this.updateBy = sysMenu.getUpdateBy();
        this.updateTime = sysMenu.getUpdateTime();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
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

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getIconcls() {
        return iconcls;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getExpand() {
        return expand;
    }

    public void setExpand(Integer expand) {
        this.expand = expand;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
