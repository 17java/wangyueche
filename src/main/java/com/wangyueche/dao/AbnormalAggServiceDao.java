package com.wangyueche.dao;

import com.wangyueche.bean.entity.Abnormalaggregation;

import java.util.List;

/**
 * Created by zhangfei on 2017/4/26.
 */
public interface AbnormalAggServiceDao {

    List<Abnormalaggregation> listForPage(int pageCurrent, int pageSize, Abnormalaggregation abnormalaggregation);

    List<Abnormalaggregation> listAll();

    Abnormalaggregation findById(int id);

    int save(Abnormalaggregation abnormalaggregation);

    int update(Abnormalaggregation abnormalaggregation);

    int changeStatus(Integer id,Integer status);

    int getNum(Integer id);

}
