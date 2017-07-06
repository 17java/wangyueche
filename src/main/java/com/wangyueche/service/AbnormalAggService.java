package com.wangyueche.service;

import com.wangyueche.bean.entity.Abnormalaggregation;
import com.wangyueche.bean.vo.baseinfo.AbnormalagVo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.AbnormalaggregationVo;
import com.wangyueche.util.page.Pager;

import java.util.List;

/**
 * Created by zhangfei on 2017/4/26.
 */
public interface AbnormalAggService {


    EasyUIResult listForPage(Pager pager, Abnormalaggregation abnormalaggregation);

    List<Abnormalaggregation> listAll();

    Abnormalaggregation findById(int id);

    int save(Abnormalaggregation abnormalaggregation);

    int update(Abnormalaggregation abnormalaggregation);

    int changeStatus(Integer id,Integer status);

    List<AbnormalagVo> getNum();

    int deleteById(Integer id);

}
