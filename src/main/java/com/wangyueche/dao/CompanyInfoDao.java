package com.wangyueche.dao;

import com.wangyueche.bean.entity.CompanyInfo;

import java.util.List;

/**
 * Created by gaojl on 2017/4/12 13:33
 *
 * @author gaojl
 */
public interface CompanyInfoDao {
    /**
     * 平台信息页面
     * 基本信息查询
     * @param address
     * @param companyId
     * @return
     */
    CompanyInfo selectCompanyInfo(Integer address, String companyId);

    /**
     * 平台基本信息页面
     * @param companyId
     * @param state
     * @return
     */
    CompanyInfo selectByState(String companyId,Integer state);

    /**
     * 平台基本信息页面
     * 网约车平台基本信息列表
     * @param pageCurrent
     * @param pageSize
     * @param companyId
     * @param state
     * @return
     */
    List<CompanyInfo> listForPage(int pageCurrent, int pageSize, String companyId, Integer state);

    CompanyInfo selectByCompanyId(String companyId);

    List<CompanyInfo> list();

    /**
     * 获取平台公司的companyId List
     */
    List<String> getCompanyIdList();
}
