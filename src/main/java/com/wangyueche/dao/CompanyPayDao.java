package com.wangyueche.dao;

import com.wangyueche.bean.entity.CompanyPay;

import java.util.List;

/**
 * Created by gaojl on 2017/4/12 13:35
 *
 * @author gaojl
 */
public  interface CompanyPayDao {
    /**
     * 平台信息页面
     * 平台公司支付信息
     * @param companyId
     * @return
     */
    CompanyPay selectCompanyPay(String companyId);

    /**
     * 平台支付信息页面
     * 网约车平台公司支付信息列表
     * @param pageCurrent
     * @param pageSize
     * @param companyId
     * @param state
     * @return
     */
    List<CompanyPay> listForPage(int pageCurrent, int pageSize, String companyId, Integer state);
}
