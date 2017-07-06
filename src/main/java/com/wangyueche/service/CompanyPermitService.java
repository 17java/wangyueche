package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyPermitVo;
import com.wangyueche.util.page.Pager;

/**
 * @author lyq
 */
public interface CompanyPermitService {
    CompanyPermitVo selectCompanyPermit(Integer address, String companyId);

    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String state);
}
