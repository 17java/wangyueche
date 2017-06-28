package com.wangyueche.service;

import com.wangyueche.bean.entity.CompanyScale;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyScaleVo;

/**
 * Created by gaojl on 2017/4/12 13:49
 *
 * @author gaojl
 */
public interface CompanyScaleService {
    CompanyScaleVo selectCompanyScale(String companyId);

    EasyUIResult listForPage(int page, int rows, String companyId);
}
