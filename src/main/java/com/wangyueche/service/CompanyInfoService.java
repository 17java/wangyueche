package com.wangyueche.service;

import com.wangyueche.bean.entity.CompanyInfo;
import com.wangyueche.bean.vo.EasyUIResult;

import java.util.HashMap;

/**
 * Created by gaojl on 2017/4/12 13:46
 *
 * @author gaojl
 */
public interface CompanyInfoService {

    CompanyInfo selectCompanyInfo(Integer address, String companyId);

    CompanyInfo selectByState(String companyId,Integer state);

    EasyUIResult listForPage(int page, int rows, String companyId, Integer state);

    HashMap<String, String> idWithName();
}
