package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.ShareRoute;
import com.wangyueche.bean.entity.ShareRouteExample;
import com.wangyueche.dao.ShareRouteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/5/15 11:37 .
 */
@Repository
public class ShareRouteDaoImpl implements ShareRouteDao {
    @Override
    public List<ShareRoute> findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String driverName, String driverPhone, String vehicleNo) {
        return null;
    }
    /*@Autowired
    private ShareRouteMapper mapper;

    @Override
    public List<ShareRoute> findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String driverName, String driverPhone, String vehicleNo) {
        ShareRouteExample example = new ShareRouteExample();
        ShareRouteExample.Criteria criteria = example.createCriteria();

        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(routeId)) {
            criteria.andRouteIdEqualTo(routeId);
        }
        if (StringUtils.hasText(driverName)) {
            criteria.andDriverNameEqualTo(driverName);
        }
        if (StringUtils.hasText(driverPhone)) {
            criteria.andDriverPhoneEqualTo(driverPhone);
        }
        if (StringUtils.hasText(vehicleNo)) {
            criteria.andVehicleNoEqualTo(vehicleNo);
        }

        PageHelper.startPage(page, rows);
        List<ShareRoute> list = mapper.selectByExample(example);

        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }*/
}
