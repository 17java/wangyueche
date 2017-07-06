package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.VehicleTotalMile;
import com.wangyueche.bean.entity.VehicleTotalMileExample;
import com.wangyueche.dao.VehicleTotalMileDao;
import com.wangyueche.mapper.VehicleTotalMileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/4/13 18:03
 *
 * @author gaojl
 */
@Repository
public class VehicleTotalMileDaoImpl implements VehicleTotalMileDao {
    @Override
    public List<VehicleTotalMile> listForPage(int page, int rows, Integer address, String companyId, String vehicleNo) {
        return null;
    }
    /*@Autowired
    private VehicleTotalMileMapper mapper;

    @Override
    public List<VehicleTotalMile> listForPage(int page, int rows, Integer address, String companyId, String vehicleNo) {
        VehicleTotalMileExample example = new VehicleTotalMileExample();
        VehicleTotalMileExample.Criteria criteria = example.createCriteria();
        if (address != null) {
            criteria.andAddressEqualTo(address);
        }
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(vehicleNo)) {
            criteria.andVehicleNoEqualTo(vehicleNo);
        }
        PageHelper.startPage(page, rows);
        List<VehicleTotalMile> list = mapper.selectByExample(example);
        return list;
    }*/
}
