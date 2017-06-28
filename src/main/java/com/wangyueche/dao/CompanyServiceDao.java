package com.wangyueche.dao;

import com.wangyueche.bean.entity.CompanyService;

import java.util.List;

/**
 * Created by gaojl on 2017/4/12 13:41
 *
 * @author gaojl
 */
public interface CompanyServiceDao {
    /**
     * 平台信息页面
     * 平台服务机构查询
     * @param companyId
     * @return
     */
    CompanyService selectCompanyService(String companyId);

    /**
     * 平台服务机构页面
     * 网约车平台服务机构列表
     * @param pageCurrent
     * @param pageSize
     * @param address
     * @param companyId
     * @param serviceName
     * @param state
     * @return
     */
    List<CompanyService> listForPage(int pageCurrent, int pageSize, Integer address, String companyId, String serviceName, Integer state);
}
