package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.DriverInfo;
import com.wangyueche.bean.entity.DriverInfoExample;
import com.wangyueche.dao.DriverInfoDao;
import com.wangyueche.mapper.DriverInfoMapper;
import com.wangyueche.util.base.SqlUtil;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by lyq
 *
 * @author lyq
 */
@Repository
public class DriverInfoDaoImpl implements DriverInfoDao {
    @Override
    public DriverInfo selectDriverInfo(Integer address, String companyId, String licenseId, String driverPhone) {
        return null;
    }

    @Override
    public List<DriverInfo> listForPage(int pageCurrent, int pageSize, Integer address, String companyId, String licenseId, String driverName, Integer state) {
        return null;
    }

    @Override
    public DriverInfo selectByDriverPhone(String driverPhone) {
        return null;
    }
   /* @Autowired
    private DriverInfoMapper mapper;

    *//**
     * 综合信息——驾驶员信息——基本信息
     *
     * @param address     归属区划id
     * @param companyId   公司标识
     * @param licenseId   驾驶证号
     * @param driverPhone 驾驶员手机号
     * @return
     *//*
    @Override
    public DriverInfo selectDriverInfo(Integer address, String companyId, String licenseId, String driverPhone) {
        ArgGen args = new ArgGen();
        args.addPositive("address",address)
            .add("companyId",companyId)
            .add("licenseId",licenseId)
            .add("driverPhone",driverPhone);
        Pager pager = new Pager();
        pager.setSorts(DriverInfoMapper.ORDERBY);
        List<DriverInfo> list = mapper.selectByExample(pager, args.getArgs());
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    *//**
     * 基本信息——基础信息——驾驶员信息
     *
     * @param page
     * @param pageSize
     * @param companyId
     * @param state
     * @return
     *//*
    @Override
    public List<DriverInfo> listForPage(int page, int pageSize, Integer address,String companyId,String licenseId,String driverName,Integer state) {
        ArgGen args = new ArgGen();
        args.addPositive("address",address)
                .add("companyId",companyId)
                .add("licenseId",licenseId)
                .add("driverName",driverName)
                .addPositive("state",state);
        Pager pager = new Pager(page,pageSize);
        pager.setSorts(DriverInfoMapper.ORDERBY);

        List<DriverInfo> list = mapper.selectByExample(pager, args.getArgs());
        return list;
    }

    *//**
     * 通过手机号查找驾驶员信息
     *
     * @param driverPhone
     * @return
     *//*
    @Override
    public DriverInfo selectByDriverPhone(String driverPhone) {
        ArgGen args = new ArgGen();
        args.add("driverPhone", driverPhone);
        Pager pager = new Pager();
        pager.setSorts(DriverInfoMapper.ORDERBY);
        pager.max();
        List<DriverInfo> list = mapper.selectByExample(pager, args.getArgs());
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }*/
}
