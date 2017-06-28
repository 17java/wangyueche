package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.Abnormalaggregation;
import com.wangyueche.bean.vo.baseinfo.AbnormalagVo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.mybatis.AbnormalaggregationMapper;
import com.wangyueche.service.AbnormalAggService;
import com.wangyueche.service.cache.AbnormalagCache;
import com.wangyueche.dao.AbnormalAggServiceDao;
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
    public EasyUIResult listForPage(int page, int rows, Abnormalaggregation abnormalaggregation) {
        List<Abnormalaggregation> list = abnormalAggServiceDao.listForPage(page, rows,  abnormalaggregation);
        PageInfo<Abnormalaggregation> pageInfo = new PageInfo<Abnormalaggregation>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }

    @Override
    public List<Abnormalaggregation> listAll() {
        return abnormalAggServiceDao.listAll();
    }

    @Override
    public Abnormalaggregation findById(int id) {
        Abnormalaggregation abnormalaggregation = abnormalAggServiceDao.findById(id);
        return abnormalaggregation;
    }

    @Override
    public int save(Abnormalaggregation abnormalaggregation) {
        abnormalaggregation.setStatus(1);
        return abnormalAggServiceDao.save(abnormalaggregation);
    }

    @Override
    public int update(Abnormalaggregation abnormalaggregation) {
        return abnormalAggServiceDao.update(abnormalaggregation);
    }

    @Override
    public int changeStatus(Integer id, Integer status) {
        return abnormalAggServiceDao.changeStatus( id,status);
    }

    @Override
    public List<AbnormalagVo> getNum() {

        List<AbnormalagVo> res = new ArrayList<AbnormalagVo>();
        //查询所有的围栏
        List<Abnormalaggregation> list = abnormalAggServiceDao.listAll();
        //遍历围栏组装数据
        for(Abnormalaggregation vo : list){
            AbnormalagVo v = new AbnormalagVo();
            //該围栏内的车辆数
            int num = abnormalagCache.getAbnormalagNum(String.valueOf(vo.getId()));
            v.setId(vo.getId());
            v.setNum(num);
            Abnormalaggregation a = abnormalAggServiceDao.findById(vo.getId());
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
