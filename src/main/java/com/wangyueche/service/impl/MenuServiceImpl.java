package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SysMenu;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.mapper.SysMenuMapper;
import com.wangyueche.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lyq
 */
@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private SysMenuMapper mapper;

    @Override
    public SysMenu query(long id) {
        SysMenu sysMenu = mapper.selectByPrimaryKey(id);
        return sysMenu;
    }

    @Override
    public int save(SysMenu sysMenu) {
        return mapper.insert(sysMenu);
    }

    @Override
    public int update(SysMenu sysMenu) {
        return mapper.updateByPrimaryKeySelective(sysMenu);
    }

    @Override
    public int delete(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public EasyUIResult listForPage(int pageCurrent, int pageSize, String date, String search) {
       /* List<SysMenu> list = mapper.listForPage(pageCurrent, pageSize, date, search);
        PageInfo<SysMenu> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;*/
        return null;
    }

    @Override
    public List<SysMenu> listForId(List<Long> idList) {
       /* return mapper.listForId(idList);*/
        return null;
    }

    @Override
    public List<SysMenu> list() {
        /*return mapper.list();*/
        return null;
    }

    @Override
    public List<SysMenu> listForParentId(Long parentId) {
        /*return mapper.listForParentId(parentId);*/
        return null;
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        /*return mapper.deleteByIds(ids);*/
        return 0;
    }
}
