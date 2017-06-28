package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.Fence;
import com.wangyueche.bean.entity.FenceExample;
import com.wangyueche.bean.vo.FenceVo;
import com.wangyueche.dao.FenceDao;
import com.wangyueche.mybatis.FenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangfei on 2017/4/25.
 */
@Repository
public class FenceDaoImpl implements FenceDao {


    @Autowired
    FenceMapper fenceMapper;

    @Override
    public List<Fence> listForPage(int pageCurrent, int pageSize, Fence fence) {

        FenceExample example = new FenceExample();
        FenceExample.Criteria criteria = example.createCriteria();

        if (fence.getName() != null && !"".equals(fence.getName().trim())){
            criteria.andNameLike("%"+fence.getName()+"%");
        }

        if (fence.getNumber() != null && !"".equals(fence.getNumber().trim())){
            criteria.andNumberLike("%"+fence.getNumber()+"%");
        }

        if (fence.getStatus() != null){
            criteria.andStatusEqualTo(fence.getStatus());
        }

        PageHelper.startPage(pageCurrent,pageSize);
        List<Fence> list = fenceMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<FenceVo> listAll() {
        FenceExample example = new FenceExample();
        FenceExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        List<Fence> list = fenceMapper.selectByExample(example);
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
        return fenceMapper.selectByPrimaryKey(id);
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
//
        return fenceMapper.updateByPrimaryKey(old);
    }

    @Override
    public int changeStatus(Integer id,Integer status) {
        Fence old = fenceMapper.selectByPrimaryKey(id);
        old.setStatus(status);
        return fenceMapper.updateByPrimaryKey(old);
    }
}
