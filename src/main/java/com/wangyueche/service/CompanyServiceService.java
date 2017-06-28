package com.wangyueche.service;

import com.wangyueche.bean.entity.CompanyService;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyServiceVo;

/**
 * Created by gaojl on 2017/4/12 13:48
 *
 * @author gaojl
 */
public interface CompanyServiceService {
    CompanyServiceVo selectCompanyService(String companyId);

    EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String serviceName, Integer state);
}
