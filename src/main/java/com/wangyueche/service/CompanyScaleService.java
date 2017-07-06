package com.wangyueche.service;

import com.wangyueche.bean.entity.CompanyScale;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyScaleVo;
import com.wangyueche.util.page.Pager;

/**
 * Created by lyq
 *
 * @author lyq
 */
public interface CompanyScaleService {
    CompanyScaleVo selectCompanyScale(String companyId);

    EasyUIResult listForPage(Pager pager, String companyId);
}
