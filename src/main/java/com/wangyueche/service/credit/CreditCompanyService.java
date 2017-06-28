package com.wangyueche.service.credit;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/5/23 14:51 .
 * 企业征信
 */
public interface CreditCompanyService {
    EasyUIResult list(Integer page, Integer rows, String companyId);

    String showStarStat();

    String showSatisStat();
}
