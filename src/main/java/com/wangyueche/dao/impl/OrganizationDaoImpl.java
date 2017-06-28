package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.SysOrganization;
import com.wangyueche.bean.entity.SysOrganizationExample;
import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.bean.vo.SysOrganizationVo;
import com.wangyueche.dao.OrganizationDao;
import com.wangyueche.dao.UserDao;
import com.wangyueche.mybatis.SysOrganizationMapper;
import com.wangyueche.util.base.SqlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/20.
 */
@Repository
public class OrganizationDaoImpl implements OrganizationDao {

    @Autowired
    private SysOrganizationMapper mapper;

    @Autowired
    private UserDao userDao;

    @Override
    public SysOrganization selectById(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public SysOrganization selectByOrganizationName(String organizationName) {
        SysOrganizationExample example = new SysOrganizationExample();
        SysOrganizationExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(organizationName);
        List<SysOrganization> resultData = mapper.selectByExample(example);
        if (resultData.size() < 1){
            return null;
        }
        return resultData.get(0);
    }

    @Override
    public int insert(SysOrganization sysOrganization) {
        Date date = new Date();
        sysOrganization.setCreateTime(date);
        sysOrganization.setUpdateTime(date);
        return mapper.insertSelective(sysOrganization);
    }

    @Override
    public int update(SysOrganization sysOrganization) {
        Date date = new Date();
        sysOrganization.setUpdateTime(date);
        return mapper.updateByPrimaryKeySelective(sysOrganization);
    }

    @Override
    public int deleteById(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

   /* @Override
    public Page<SysOrganization> listForPage(int pageCurrent, int pageSize, String date, String search) {
        SysOrganizationExample example = new SysOrganizationExample();
        example.setOrderByClause("id desc");
        SysOrganizationExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(date)){
            Date time = SqlUtil.formatterDate(date);
            criteria.andCreateTimeBetween(time, SqlUtil.addDay(time,1));
        }
        if (StringUtils.hasText(search)){
            criteria.andNameLike(SqlUtil.like(search));
        }
        int totalCount = mapper.countByExample(example);
        pageSize = SqlUtil.checkPageSize(pageSize);
        pageCurrent = SqlUtil.checkPageCurrent(totalCount,pageSize,pageCurrent);
        int totalPage = SqlUtil.countTotalPage(totalCount,pageSize);
        example.setPageSize(pageSize);
        example.setLimitStart(SqlUtil.countOffset(pageCurrent,pageSize));
        List<SysOrganization> list = mapper.selectByExample(example);
        return new Page<>(totalCount,totalPage,pageCurrent,pageSize,list);
    }
*/
    /**
     * By Gaojl 2017-04-06 07:28:02
     * @param pageCurrent
     * @param pageSize
     * @param orgName
     * @param orgLeaderName
     * @return
     */
    @Override
    public List<SysOrganizationVo> listForPage(int pageCurrent, int pageSize, String orgName, String orgLeaderName) {
        SysOrganizationExample example = new SysOrganizationExample();
        SysOrganizationExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(orgName)) {//如果查询中有负责人的姓名
            criteria.andNameLike(SqlUtil.like(orgName));
        }
        if (StringUtils.hasText(orgLeaderName)) {
            //通过负责人姓名查找用户信息
            List<SysUser> userList = userDao.selectByName(orgLeaderName,true);
            //把符合姓名的用户的id并放入集合中
            List<Long> userIdList = new ArrayList<>();
            for(SysUser user:userList) {
                userIdList.add(user.getId());
            }
            if (userIdList.size() < 1) {
                List<SysOrganizationVo> vos = new ArrayList<>();
                return new ArrayList<>();
            }
            if (userIdList.size() > 0) {
                criteria.andUserIdIn(userIdList);
            }
        }
        int totalCount = mapper.countByExample(example);
        pageSize = SqlUtil.checkPageSize(pageSize);
        pageCurrent = SqlUtil.checkPageCurrent(totalCount,pageSize,pageCurrent);
        int totalPage = SqlUtil.countTotalPage(totalCount,pageSize);

        PageHelper.startPage(pageCurrent, pageSize);
        List<SysOrganization> list = mapper.selectByExample(example);
        //封装查找结果
        List<SysOrganizationVo> organizationVos = new ArrayList<>();
        for (SysOrganization organization : list) {
            SysUser user = userDao.select(organization.getUserId());
            organizationVos.add(new SysOrganizationVo(organization, user));
        }
        return organizationVos;
    }

    @Override
    public List<SysOrganization> listForId(List<Long> idList) {
        SysOrganizationExample example = new SysOrganizationExample();
        SysOrganizationExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(idList);
        return mapper.selectByExample(example);
    }

    @Override
    public List<SysOrganization> list() {
        SysOrganizationExample example = new SysOrganizationExample();
        return mapper.selectByExample(example);
    }

    /**
     * 根据多个ID删除数据 Gaojl 2017-04-06 14:19:15
     *
     * @param ids
     * @return
     */
    @Override
    public int deletByIds(List<Long> ids) {
        SysOrganizationExample example = new SysOrganizationExample();
        SysOrganizationExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return mapper.deleteByExample(example);
    }
}
