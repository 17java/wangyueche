package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/4/12 13:47
 *
 * @author gaojl
 */
public interface CompanyFareService {
    EasyUIResult listForPage(int page, int rows, Integer address, String companyId, String fareType, Integer state);
}
