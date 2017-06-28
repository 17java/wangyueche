package com.wangyueche.dao;

import com.wangyueche.bean.entity.CompanyPermit;

import java.util.List;

/**
 * Created by gaojl on 2017/4/12 13:38
 *
 * @author gaojl
 */
public interface CompanyPermitDao {
    /**
     * 平台信息页面
     * 平台公司经营许可查询
     * @param address
     * @param companyId
     * @return
     */
    CompanyPermit selectCompanyPermit(Integer address, String companyId);

    /**
     * 平台经营许可信息页面
     * 网约车平台公司经营许可列表
     * @param pageCurrent
     * @param pageSize
     * @param address
     * @param companyId
     * @param state
     * @return
     */
    List<CompanyPermit> listForPage(int pageCurrent, int pageSize, Integer address, String companyId, String state);
}
