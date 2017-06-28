package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SysMenu;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.MenuService;
import com.wangyueche.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/4/5.
 */
@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuDao dao;

    @Override
    public SysMenu query(long id) {
        SysMenu sysMenu = dao.selectById(id);
        return sysMenu;
    }

    @Override
    public int save(SysMenu sysMenu) {
        return dao.insert(sysMenu);
    }

    @Override
    public int update(SysMenu sysMenu) {
        return dao.update(sysMenu);
    }

    @Override
    public int delete(long id) {
        return dao.deleteById(id);
    }

    @Override
    public EasyUIResult listForPage(int pageCurrent, int pageSize, String date, String search) {
        List<SysMenu> list = dao.listForPage(pageCurrent, pageSize, date, search);
        PageInfo<SysMenu> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }

    @Override
    public List<SysMenu> listForId(List<Long> idList) {
        return dao.listForId(idList);
    }

    @Override
    public List<SysMenu> list() {
        return dao.list();
    }

    @Override
    public List<SysMenu> listForParentId(Long parentId) {
        return dao.listForParentId(parentId);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        return dao.deleteByIds(ids);
    }
}
