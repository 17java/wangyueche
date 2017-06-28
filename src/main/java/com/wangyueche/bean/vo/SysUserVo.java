package com.wangyueche.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wangyueche.bean.entity.SysRole;
import com.wangyueche.bean.entity.SysUser;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/30.
 */
public class SysUserVo implements Serializable{

    private static final long serialVersionUID = -5657330758447750715L;

    private Long id;

    private String userNo;

    private String password;

    private String salt;

    private Integer locked;

    private Long organizationId;

    private Integer userType;

    private String name;

    private String staffNo;

    private String position;

    private Integer sex;

    private String age;

    private String nickName;

    private String phone;

    private String mobile;

    private String email;

    private String weight;

    private String height;

    private String nation;

    private String identityCard;

    private String birthday;

    private Integer isMarried;

    private String address;

    private Long createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Long updateBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String organizationName;

    private String permission;

    private List<SysRole> roleList;

    public SysUserVo() {
    }

    public SysUserVo(SysUser sysUser){
        this.id = sysUser.getId();
        this.userNo = sysUser.getUserNo();
        this.password = sysUser.getPassword();
        this.salt = sysUser.getSalt();
        this.locked = sysUser.getLocked();
        this.organizationId = sysUser.getOrganizationId();
        this.userType = sysUser.getUserType();
        this.name = sysUser.getName();
        this.staffNo = sysUser.getStaffNo();
        this.position = sysUser.getPosition();
        this.sex = sysUser.getSex();
        this.age = sysUser.getAge();
        this.nickName = sysUser.getNickName();
        this.phone = sysUser.getPhone();
        this.mobile = sysUser.getMobile();
        this.email = sysUser.getEmail();
        this.weight = sysUser.getWeight();
        this.height = sysUser.getHeight();
        this.nation = sysUser.getNation();
        this.identityCard = sysUser.getIdentityCard();
        this.birthday = sysUser.getBirthday();
        this.isMarried = sysUser.getIsMarried();
        this.address = sysUser.getAddress();
        this.createBy = sysUser.getCreateBy();
        this.createTime = sysUser.getCreateTime();
        this.updateBy = sysUser.getUpdateBy();
        this.updateTime = sysUser.getUpdateTime();
        this.organizationName = sysUser.getOrganizationName();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(Integer isMarried) {
        this.isMarried = isMarried;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

}
