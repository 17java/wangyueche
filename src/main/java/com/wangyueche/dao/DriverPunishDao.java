package com.wangyueche.dao;

import com.wangyueche.bean.entity.DriverPunish;

import java.util.List;

/**
 * Created by gaojl on 2017/4/14 16:30
 *
 * @author gaojl
 */
public interface DriverPunishDao {
    /**
     * 驾驶员处罚信息
     * @param page
     * @param rows
     * @param address
     * @param companyId
     * @param licenseId
     * @param startDate
     * @param endDate
     * @return
     */
    List<DriverPunish> listForPage(int page, int rows, Integer address, String companyId, String licenseId, String startDate, String endDate);
}
