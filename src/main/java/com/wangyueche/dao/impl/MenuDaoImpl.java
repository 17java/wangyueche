package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.SysMenu;
import com.wangyueche.bean.entity.SysMenuExample;
import com.wangyueche.dao.MenuDao;
import com.wangyueche.mybatis.SysMenuMapper;
import com.wangyueche.util.base.SqlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by gaoshiwei on 2017/4/5.
 */
@Repository
public class MenuDaoImpl implements MenuDao{

    @Autowired
    private SysMenuMapper mapper;

    @Override
    public SysMenu selectById(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(SysMenu sysMenu) {
        Date date = new Date();
        sysMenu.setCreateTime(date);
        sysMenu.setUpdateTime(date);
        return mapper.insertSelective(sysMenu);
    }

    @Override
    public int update(SysMenu sysMenu) {
        sysMenu.setUpdateTime(new Date());
        return mapper.updateByPrimaryKey(sysMenu);
    }

    @Override
    public int deleteById(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<SysMenu> listForPage(int pageCurrent, int pageSize, String date, String search) {
        SysMenuExample example = new SysMenuExample();
        SysMenuExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(date)){
            Date time = SqlUtil.formatterDate(date);
            criteria.andCreateTimeBetween(time,SqlUtil.addDay(time,1));
        }
        if (StringUtils.hasText(search)){
            criteria.andMenuNameEqualTo(search);
        }

        int totalCount = mapper.countByExample(example);
        pageSize = SqlUtil.checkPageSize(pageSize);
        pageCurrent = SqlUtil.checkPageCurrent(totalCount, pageSize, pageCurrent);

        PageHelper.startPage(pageCurrent, pageSize);
        List<SysMenu> list = mapper.selectByExample(example);
        return list;
    }

    @Override
    public List<SysMenu> listForId(List<Long> idList) {
        SysMenuExample example = new SysMenuExample();
        SysMenuExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(idList);
        return mapper.selectByExample(example);
    }

    @Override
    public List<SysMenu> list() {
        SysMenuExample example = new SysMenuExample();
        return mapper.selectByExample(example);
    }

    @Override
    public List<SysMenu> listForParentId(Long parentId) {
        SysMenuExample example = new SysMenuExample();
        SysMenuExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        return mapper.selectByExample(example);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        SysMenuExample example = new SysMenuExample();
        SysMenuExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return mapper.deleteByExample(example);
    }
}
