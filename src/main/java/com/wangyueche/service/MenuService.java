package com.wangyueche.service;

import com.wangyueche.bean.entity.SysMenu;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.Result;
import com.wangyueche.util.base.Page;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/4/5.
 */
public interface MenuService {

    SysMenu query(long id);

    int save(SysMenu sysMenu);

    int update(SysMenu sysMenu);

    int delete(long id);

    EasyUIResult listForPage(int pageCurrent, int pageSize, String date, String search);

    List<SysMenu> listForId(List<Long> idList);

    List<SysMenu> list();

    List<SysMenu> listForParentId(Long parentId);

    int deleteByIds(List<Long> ids);
}
