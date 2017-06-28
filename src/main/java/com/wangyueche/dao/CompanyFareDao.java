package com.wangyueche.dao;

import com.wangyueche.bean.entity.CompanyFare;

import java.util.List;

/**
 * Created by gaojl on 2017/4/12 13:37
 *
 * @author gaojl
 */
public interface CompanyFareDao {
    /**
     * 平台运价信息页面
     * 运价信息列表
     * @param pageCurrent
     * @param pageSize
     * @param address
     * @param companyId
     * @param fareType
     * @param state
     * @return
     */
    List<CompanyFare> listForPage(int pageCurrent, int pageSize, Integer address, String companyId, String fareType, Integer state);
}
