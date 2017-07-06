package com.wangyueche.service;

import com.wangyueche.bean.entity.CompanyInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

import java.util.HashMap;

/**
 * @author lyq
 */
public interface CompanyInfoService {

    CompanyInfo selectCompanyInfo(Integer address, String companyId);

    CompanyInfo selectByState(String companyId,Integer state);

    EasyUIResult listForPage(Pager pager, String companyId, Integer state);

    HashMap<String, String> idWithName();
}
