package com.wangyueche.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.Abnormalaggregation;
import com.wangyueche.bean.vo.baseinfo.AbnormalagVo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.mapper.AbnormalaggregationMapper;
import com.wangyueche.service.AbnormalAggService;
import com.wangyueche.service.cache.AbnormalagCache;
import com.wangyueche.dao.AbnormalAggServiceDao;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangfei on 2017/4/26.
 */
@Service
public class AbnormalAggServiceImpl implements AbnormalAggService {

    @Autowired
    AbnormalAggServiceDao abnormalAggServiceDao;

    @Autowired
    AbnormalagCache abnormalagCache;

    @Autowired
    private AbnormalaggregationMapper mapper;

    @Override
    public EasyUIResult listForPage(Pager pager, Abnormalaggregation abnormalaggregation) {

        ArgGen argGen = new ArgGen();
        argGen.addLike("name",abnormalaggregation.getName())
                .addPositive("status", abnormalaggregation.getStatus());
        pager.max().setSorts(AbnormalaggregationMapper.ORDERBY);
        List<Abnormalaggregation> list = mapper.select(pager, argGen.getArgs());
        PageInfo<Abnormalaggregation> pageInfo = new PageInfo<Abnormalaggregation>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }

    @Override
    public List<Abnormalaggregation> listAll() {
        ArgGen argGen = new ArgGen();
        return mapper.select(new Pager().max().setSorts(AbnormalaggregationMapper.ORDERBY),argGen.getArgs());
    }

    @Override
    public Abnormalaggregation findById(int id) {
        Abnormalaggregation abnormalaggregation = mapper.selectByPrimaryKey(id);
        return abnormalaggregation;
    }

    @Override
    public int save(Abnormalaggregation abnormalaggregation) {
        abnormalaggregation.setStatus(1);
        return mapper.insert(abnormalaggregation);
    }

    @Override
    public int update(Abnormalaggregation abnormalaggregation) {
        return mapper.updateByPrimaryKey(abnormalaggregation);
    }

    @Override
    public int changeStatus(Integer id, Integer status) {
        Abnormalaggregation old = mapper.selectByPrimaryKey(id);
        old.setStatus(status);
        return mapper.updateByPrimaryKey(old);
    }

    @Override
    public List<AbnormalagVo> getNum() {

        List<AbnormalagVo> res = new ArrayList<AbnormalagVo>();
        //查询所有的围栏
        List<Abnormalaggregation> list = mapper.select(new Pager().max().setSorts(AbnormalaggregationMapper.ORDERBY),new ArgGen().getArgs());
        //遍历围栏组装数据
        for(Abnormalaggregation vo : list){
            AbnormalagVo v = new AbnormalagVo();
            //該围栏内的车辆数
            int num = abnormalagCache.getAbnormalagNum(String.valueOf(vo.getId()));
            v.setId(vo.getId());
            v.setNum(num);
            Abnormalaggregation a = mapper.selectByPrimaryKey(vo.getId());
            //围栏级别
            if(num < a.getFirstNum()){
                v.setLevel(1);
            }
            if(num > a.getSecNum() && num<a.getFirstNum()){
                v.setLevel(2);
            }
            if(num > a.getThrNum()){
                v.setLevel(3);
            }
            res.add(v);
        }
        return  res;
    }

    @Override
    public int deleteById(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }
}
