package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyServiceVo;
import com.wangyueche.util.page.Pager;

/**
 *
 * @author lyq
 */
public interface CompanyServiceService {
    CompanyServiceVo selectCompanyService(String companyId);

    EasyUIResult listForPage(Pager pager, Integer address, String companyId, String serviceName, Integer state);
}
