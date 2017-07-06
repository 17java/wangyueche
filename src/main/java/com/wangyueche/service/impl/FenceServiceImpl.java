package com.wangyueche.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.Fence;
import com.wangyueche.bean.entity.FenceExample;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.FenceVo;
import com.wangyueche.mapper.FenceMapper;
import com.wangyueche.service.FenceService;
import com.wangyueche.dao.FenceDao;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangfei on 2017/4/25.
 */
@Service
public class FenceServiceImpl implements FenceService {

    @Autowired
    private FenceMapper fenceMapper;

    @Override
    public EasyUIResult listForPage(Pager pager, Fence fence) {
        ArgGen argGen = new ArgGen();
        argGen.addLike("name", fence.getName())
              .addLike("number", fence.getNumber())
              .addPositive("status", fence.getStatus());
        pager.setSorts(FenceMapper.ORDERBY).max();
        List<Fence> list = fenceMapper.selectByExample(pager, argGen.getArgs());
        PageInfo<Fence> pageInfo = new PageInfo<Fence>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }

    @Override
    public List<FenceVo> listAll() {

        ArgGen argGen = new ArgGen();
        argGen.addPositive("status", 1);
        Pager pager = new Pager();
        pager.max();
        pager.setSorts(FenceMapper.ORDERBY);
        List<Fence> list = fenceMapper.selectByExample(pager, argGen.getArgs());
        List<FenceVo> res = new ArrayList<FenceVo>();

        for(Fence f : list){
            FenceVo vo = new FenceVo();
            vo.setName(f.getName());
            vo.setId(f.getId());
            vo.setRadius(f.getRadius());
            vo.setShape(f.getShape());
            vo.setSpots(f.getSpots());
            vo.setNumber(f.getNumber());
            vo.setPurpose(f.getPurpose());
            vo.setRemark(f.getRemark());
            res.add(vo);
        }
        return res;
    }

    @Override
    public Fence findById(int id) {
        Fence fence = fenceMapper.selectByPrimaryKey(id);
        return fence;
    }

    @Override
    public int save(Fence fence) {
        fence.setStatus(1);
        return fenceMapper.insert(fence);
    }

    @Override
    public int update(Fence fence) {
        Fence old = fenceMapper.selectByPrimaryKey(fence.getId());

        if(fence.getRemark() != null){
            old.setRemark(fence.getRemark());
        }
        if(fence.getName() != null){
            old.setName(fence.getName());
        }
        if(fence.getNumber() != null){
            old.setNumber(fence.getNumber());
        }
        if(fence.getShape() != null){
            old.setShape(fence.getShape());
        }
        if(fence.getPurpose() !=null ){
            old.setPurpose(fence.getPurpose());
        }
        if(fence.getRadius() !=null ){
            old.setRadius(fence.getRadius());
        }
        //更新时间
        old.setEndtime(new Date());
        old.setStatus(1);
        return fenceMapper.updateByPrimaryKey(old);
    }

    @Override
    public int changeStatus(Integer id,Integer status) {
        Fence old = fenceMapper.selectByPrimaryKey(id);
        old.setStatus(status);
        return fenceMapper.updateByPrimaryKey(old);
    }

    @Override
    public int deleteById(Integer id) {
        return fenceMapper.deleteByPrimaryKey(id);
    }

}
