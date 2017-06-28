package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyPermitVo;

/**
 * Created by gaojl on 2017/4/12 13:48
 *
 * @author gaojl
 */
public interface CompanyPermitService {
    CompanyPermitVo selectCompanyPermit(Integer address, String companyId);

    EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String state);
}
