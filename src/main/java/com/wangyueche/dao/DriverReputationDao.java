package com.wangyueche.dao;

import com.wangyueche.bean.entity.DriverReputation;

import java.util.List;

/**
 * Created by gaojl on 2017/4/14 16:34
 *
 * @author gaojl
 */
public interface DriverReputationDao {
    /**
     * 驾驶员信誉信息
     * @param page
     * @param rows
     * @param address
     * @param companyId
     * @param licenseId
     * @param startDate
     * @param endDate
     * @return
     */
    List<DriverReputation> listForPage(int page, int rows, Integer address, String companyId, String licenseId, String startDate, String endDate);
}
