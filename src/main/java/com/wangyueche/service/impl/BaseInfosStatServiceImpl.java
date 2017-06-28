package com.wangyueche.service.impl;

import com.wangyueche.bean.entity.CompanyInfo;
import com.wangyueche.bean.entity.CompanyInfoExample;
import com.wangyueche.bean.entity.DriverInfoExample;
import com.wangyueche.bean.entity.VehicleInfoExample;
import com.wangyueche.bean.vo.statistics.BaseInfoStat;
import com.wangyueche.mybatis.*;
import com.wangyueche.service.BaseInfoStatService;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by gaojl on 2017/5/11 16:27 .
 */
@Service
public class BaseInfosStatServiceImpl implements BaseInfoStatService{
    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Autowired
    private VehicleInfoMapper vehicleInfoMapper;

    @Autowired
    private DriverInfoMapper driverInfoMapper;

    @Autowired
    private OrderStatVoMapper orderStatVoMapper;

    @Autowired
    private VehicleOperateStatMapper operateStatMapper;

    @Override
    public BaseInfoStat list() {
        BaseInfoStat stat = new BaseInfoStat();
        stat.setCompanyCount(companyInfoMapper.countByExample(new CompanyInfoExample()));
        stat.setDriverCount(driverInfoMapper.countByExample(new DriverInfoExample()));
        stat.setVehicleCount(vehicleInfoMapper.countByExample(new VehicleInfoExample()));


        Calendar calendar = Calendar.getInstance();

        //获取当前小时，用于echart类目轴
        Integer hour = calendar.get(Calendar.HOUR_OF_DAY);

        //获取当前时间long型数字，用于数据库查询
        Date date = calendar.getTime();
        String dateString = DateUtil.sdf.format(date);
        Long current = Long.parseLong(dateString);

        //获取当前年月日
        Long base = current / 1000000;

        stat.setOrderRealTime(orderStatVoMapper.listIndexInfo(null, base * 1000000, (base + 1) * 10000 - 1));
        stat.setVehicleRealTime(operateStatMapper.selectVehicleCount(null, base * 1000000, (base + 1) * 10000 - 1));;
        return stat;
    }
}
