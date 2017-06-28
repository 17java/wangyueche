package com.wangyueche.dao;

import com.wangyueche.bean.entity.CompanyScale;

import java.util.List;

/**
 * Created by gaojl on 2017/4/12 13:39
 *
 * @author gaojl
 */
public interface CompanyScaleDao {
    /**
     * 平台信息页面
     * 平台公司营运规模查询
     * @param companyId
     * @return
     */
    CompanyScale selectCompanyScale(String companyId);

    /**
     * 平台营运规模信息页面
     * 网约车平台营运规模列表
     * @param pageCurrent
     * @param pageSize
     * @param companyId
     * @return
     */
    List<CompanyScale> listForPage(int pageCurrent, int pageSize, String companyId);
}
