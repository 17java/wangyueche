package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyPayVo;
import com.wangyueche.util.page.Pager;

/**
 * @author lyq
 */
public interface CompanyPayService {
    CompanyPayVo selectCompanyPay(String companyId);

    EasyUIResult listForPage(Pager pager, String companyId, Integer state);
}
