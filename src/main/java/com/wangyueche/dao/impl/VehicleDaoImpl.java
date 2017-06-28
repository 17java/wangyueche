package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.VehicleInfo;
import com.wangyueche.bean.entity.VehicleInfoExample;
import com.wangyueche.dao.VehicleDao;
import com.wangyueche.mybatis.VehicleInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Gavin on 2017/4/12.
 */
@Repository
public class VehicleDaoImpl implements VehicleDao{
    @Autowired
    private VehicleInfoMapper mapper;

    @Override
    public VehicleInfo selectVehicle(Integer address, String companyId, String vehicleNo) {
        VehicleInfoExample example = new VehicleInfoExample();
        VehicleInfoExample.Criteria criteria = example.createCriteria();
        if (address != null) {
            criteria.andAddressEqualTo(address);
        }
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(vehicleNo)) {
            criteria.andVehicleNoEqualTo(vehicleNo);
        }

        List<VehicleInfo> resultData = mapper.selectByExample(example);
        if (resultData.size() < 1) {
            return null;
        }
        return resultData.get(0);
    }

    @Override
    public List<VehicleInfo> listForPage(int pageCurrent, int pageSize, Integer address, String companyId,String vehicleNo, Integer state) {
        VehicleInfoExample example = new VehicleInfoExample();
        VehicleInfoExample.Criteria criteria = example.createCriteria();
        if (address!=null) {
            criteria.andAddressEqualTo( address);
        }
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(vehicleNo)) {
            criteria.andVehicleNoEqualTo(vehicleNo);
        }
        if (state != null) {
            criteria.andStateEqualTo(state);
        }
        PageHelper.startPage(pageCurrent,pageSize);
        List<VehicleInfo> list = mapper.selectByExample(example);

        return list;
    }

    @Override
    public List<VehicleInfo> selectByAddress(Integer address) {
        VehicleInfoExample example = new VehicleInfoExample();
        VehicleInfoExample.Criteria criteria = example.createCriteria();
        if (address != null) {
            criteria.andAddressEqualTo(address);
        }
        return mapper.selectByExample(example);
    }

    @Override
    public long getTotalVehicle() {
        VehicleInfoExample example = new VehicleInfoExample();
        long totalVehicle = mapper.countByExample(example);
        return totalVehicle;
    }

    @Override
    public long getCompanyTotalVehicle(String companyId) {
        VehicleInfoExample example = new VehicleInfoExample();
        VehicleInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(companyId);
        long companyTotalVehicle = mapper.countByExample(example);
        return companyTotalVehicle;
    }

    @Override
    public long getCompanyTotalScaleVehicle(String companyId) {
        return 0;
    }
}
