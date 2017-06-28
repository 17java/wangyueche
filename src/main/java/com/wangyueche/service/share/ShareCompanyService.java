package com.wangyueche.service.share;

import com.wangyueche.bean.vo.EasyUIResult;

import java.util.Map;

/**
 * Created by gaojl on 2017/5/15 11:11 .
 * 合乘公司信息
 */
public interface ShareCompanyService {
    EasyUIResult findListByCriteria(Integer page, Integer rows, String companyId, Integer state);

    Map listCompanyNames();
}
