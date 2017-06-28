package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyPayVo;

/**
 * Created by gaojl on 2017/4/12 13:47
 *
 * @author gaojl
 */
public interface CompanyPayService {
    CompanyPayVo selectCompanyPay(String companyId);

    EasyUIResult listForPage(int page, int rows, String companyId, Integer state);
}
