package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.PassengerInfo;
import com.wangyueche.bean.entity.PassengerInfoExample;
import com.wangyueche.dao.PassengerInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author lyq
 */
@Repository
public class PassengerInfoDaoImpl implements PassengerInfoDao {
    @Override
    public List<PassengerInfo> listForPage(int page, int rows, String companyId, String passengerName, String passengerPhone) {
        return null;
    }
    /*@Autowired
    private PassengerInfoMapper mapper;

    @Override
    public List<PassengerInfo> listForPage(int page, int rows, String companyId, String passengerName, String passengerPhone) {
        PassengerInfoExample example = new PassengerInfoExample();
        PassengerInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(passengerName)) {
            criteria.andPassengerNameEqualTo(passengerName);
        }
        if (StringUtils.hasText(passengerPhone)) {
            criteria.andPassengerPhoneEqualTo(passengerPhone);
        }

        PageHelper.startPage(page, rows);
        List<PassengerInfo> list = mapper.selectByExample(example);
        return list;
    }*/
}
