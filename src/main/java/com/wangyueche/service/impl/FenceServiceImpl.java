package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.Fence;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.FenceVo;
import com.wangyueche.mybatis.FenceMapper;
import com.wangyueche.service.FenceService;
import com.wangyueche.dao.FenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangfei on 2017/4/25.
 */
@Service
public class FenceServiceImpl implements FenceService {

    @Autowired
    private FenceDao fenceDao;

    @Autowired
    private FenceMapper mapper;

    @Override
    public EasyUIResult listForPage(int page, int rows, Fence fence) {
        List<Fence> list = fenceDao.listForPage(page, rows,  fence);
        PageInfo<Fence> pageInfo = new PageInfo<Fence>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }

    @Override
    public List<FenceVo> listAll() {
        return fenceDao.listAll();
    }

    @Override
    public Fence findById(int id) {
        Fence fence = fenceDao.findById(id);
        return fence;
    }

    @Override
    public int save(Fence fence) {
        return fenceDao.save(fence);
    }

    @Override
    public int update(Fence fence) {
        return fenceDao.update(fence);
    }

    @Override
    public int changeStatus(Integer id,Integer status) {
        return fenceDao.changeStatus( id,status);
    }

    @Override
    public int deleteById(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

}
