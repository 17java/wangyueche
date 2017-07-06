package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.Abnormalaggregation;
import com.wangyueche.bean.entity.AbnormalaggregationExample;
import com.wangyueche.dao.AbnormalAggServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhangfei on 2017/4/26.
 */
@Repository
public class AbnormalAggServiceDaoImpl implements AbnormalAggServiceDao {
    @Override
    public List<Abnormalaggregation> listForPage(int pageCurrent, int pageSize, Abnormalaggregation abnormalaggregation) {
        return null;
    }

    @Override
    public List<Abnormalaggregation> listAll() {
        return null;
    }

    @Override
    public Abnormalaggregation findById(int id) {
        return null;
    }

    @Override
    public int save(Abnormalaggregation abnormalaggregation) {
        return 0;
    }

    @Override
    public int update(Abnormalaggregation abnormalaggregation) {
        return 0;
    }

    @Override
    public int changeStatus(Integer id, Integer status) {
        return 0;
    }

    @Override
    public int getNum(Integer id) {
        return 0;
    }

    /*@Autowired
    AbnormalaggregationMapper abnormalaggregationMapper;

        @Override
        public List<Abnormalaggregation> listForPage(int pageCurrent, int pageSize, Abnormalaggregation abnormalaggregation) {
            AbnormalaggregationExample example = new AbnormalaggregationExample();
            AbnormalaggregationExample.Criteria criteria = example.createCriteria();

            if (abnormalaggregation.getName() != null && !"".equals(abnormalaggregation.getName().trim())){
                criteria.andNameLike("%"+abnormalaggregation.getName()+"%");
            }

            if (abnormalaggregation.getStatus() != null){
                criteria.andStatusEqualTo(abnormalaggregation.getStatus());
            }

            PageHelper.startPage(pageCurrent,pageSize);
            List<Abnormalaggregation> list = abnormalaggregationMapper.selectByExample(example);
            return list;
       }

    @Override
    public List<Abnormalaggregation> listAll() {
        AbnormalaggregationExample example = new AbnormalaggregationExample();
        AbnormalaggregationExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        List<Abnormalaggregation> list = abnormalaggregationMapper.selectByExample(example);
        *//*
        List<AbnormalaggregationVo> res = new ArrayList<AbnormalaggregationVo>();
        for(Abnormalaggregation f : list){
            AbnormalaggregationVo vo = new AbnormalaggregationVo();
            vo.setId(f.getId());
            vo.setLat(f.getLat());
            vo.setLng(f.getLng());
            vo.setMemo(f.getMemo());
            vo.setName(f.getName());
            res.add(vo);
        }*//*
        return list;
    }

    @Override
    public Abnormalaggregation findById(int id) {
        return abnormalaggregationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(Abnormalaggregation abnormalaggregation) {
        return abnormalaggregationMapper.insert(abnormalaggregation);
    }

    @Override
    public int update(Abnormalaggregation abnormalaggregation) {
        Abnormalaggregation old = abnormalaggregationMapper.selectByPrimaryKey(abnormalaggregation.getId());
        if(abnormalaggregation.getName() != null){
            old.setName(abnormalaggregation.getName());
        }

        if(abnormalaggregation.getFirstNum() != null) {
            old.setFirstNum(abnormalaggregation.getFirstNum());
        }
        if(abnormalaggregation.getLat() != null) {
            old.setLat(abnormalaggregation.getLat());
        }
        if(abnormalaggregation.getLng() !=null ){
            old.setLng(abnormalaggregation.getLng());
        }

        if(abnormalaggregation.getMemo() !=null ){
            old.setMemo(abnormalaggregation.getMemo());
        }

        if(abnormalaggregation.getRadius() !=null ){
            old.setRadius(abnormalaggregation.getRadius());
        }

        if(abnormalaggregation.getSecNum() !=null ){
            old.setSecNum(abnormalaggregation.getSecNum());
        }

        if(abnormalaggregation.getThrNum() !=null ){
            old.setThrNum(abnormalaggregation.getThrNum());
        }

        old.setStatus(1);
        return abnormalaggregationMapper.updateByPrimaryKey(old);
    }

    @Override
    public int changeStatus(Integer id,Integer status) {
        Abnormalaggregation old = abnormalaggregationMapper.selectByPrimaryKey(id);
        old.setStatus(status);
        return abnormalaggregationMapper.updateByPrimaryKey(old);
    }

    @Override
    public int getNum(Integer id) {
//        return abnormalaggregationMapper.selectByPrimaryKey(id);
        return 0;
    }*/
}
