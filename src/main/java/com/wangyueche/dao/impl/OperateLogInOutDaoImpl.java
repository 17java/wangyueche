package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.OperateLogInOut;
import com.wangyueche.bean.entity.OperateLogInOutExample;
import com.wangyueche.dao.OperateLogInOutDao;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/4/14 15:25
 *
 * @author gaojl
 */
@Repository
public class OperateLogInOutDaoImpl implements OperateLogInOutDao {
    @Override
    public List<OperateLogInOut> listForPage(int page, int rows, Integer address, String companyId, String startDate, String endDate, String licenseId, String vehicleNo) {
        return null;
    }
   /* @Autowired
    private OperateLogInOutMapper mapper;

    @Override
    public List<OperateLogInOut> listForPage(int page, int rows, Integer address, String companyId, String startDate, String endDate, String licenseId, String vehicleNo) {
        OperateLogInOutExample example = new OperateLogInOutExample();
        OperateLogInOutExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(licenseId)) {
            criteria.andLicenseIdEqualTo(licenseId);
        }
        if (StringUtils.hasText(vehicleNo)) {
            criteria.andVehicleNoEqualTo(vehicleNo);
        }

        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            if (startDate.equals(endDate)) {
                long date = DateUtil.parseString(startDate, dateFormat,numFormat );
                criteria.andLoginTimeEqualTo(date);
            }
            long start = DateUtil.parseString(startDate, dateFormat, numFormat);
            long end = DateUtil.parseString(endDate, dateFormat, numFormat);
            criteria.andLoginTimeGreaterThanOrEqualTo(start);
            criteria.andLogoutTimeLessThanOrEqualTo(end);
        }
        PageHelper.startPage(page, rows);
        List<OperateLogInOut> list = mapper.selectByExample(example);
        return list;
    }*/
}
