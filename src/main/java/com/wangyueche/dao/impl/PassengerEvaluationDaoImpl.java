package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.entity.PassengerEvaluation;
import com.wangyueche.bean.entity.PassengerEvaluationExample;
import com.wangyueche.dao.OrderInfoDao;
import com.wangyueche.dao.PassengerEvaluationDao;
import com.wangyueche.mybatis.PassengerEvaluationMapper;
import com.wangyueche.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaojl on 2017/4/17 8:51
 *
 * @author gaojl
 */
@Repository
public class PassengerEvaluationDaoImpl implements PassengerEvaluationDao {
    @Autowired
    private PassengerEvaluationMapper mapper;

    @Autowired
    private OrderInfoDao orderInfoDao;
    /**
     * 乘客评价信息
     *
     * @param page
     * @param rows
     * @param address
     * @param companyId
     * @param orderId
     * @param vehicleNo
     * @param licenseId
     * @param driverPhone
     * @param startDate
     * @param endDate
     * @return
     */
    @Override
    public List<PassengerEvaluation> listForPage(int page, int rows, Integer address, String companyId, String orderId, String vehicleNo, String licenseId, String driverPhone, String startDate, String endDate) {
        PassengerEvaluationExample example = new PassengerEvaluationExample();
        PassengerEvaluationExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(orderId)) {
            criteria.andOrderIdEqualTo(orderId);
        }
        if (StringUtils.hasText(vehicleNo)) {
            //通过车辆号牌查询到订单信息，获取订单号
            List<OrderInfo> list = orderInfoDao.selectByVehicleNo(vehicleNo);
            if (list.size() > 0) {
                List<String> orderIdList = new ArrayList<>();
                for (OrderInfo orderInfo : list) {
                    orderIdList.add(orderInfo.getOrderId());
                }
                criteria.andOrderIdIn(orderIdList);
            }
        }
        if (StringUtils.hasText(licenseId)) {
            //通过驾驶证号牌查询到订单信息，获取订单号
            List<OrderInfo> list = orderInfoDao.selectByLicenseId(licenseId);
            if (list.size() > 0) {
                List<String> orderIdList = new ArrayList<>();
                for (OrderInfo orderInfo : list) {
                    orderIdList.add(orderInfo.getOrderId());
                }
                criteria.andOrderIdIn(orderIdList);
            }
        }
        if (StringUtils.hasText(driverPhone)) {
            //通过驾驶员手机号牌查询到订单信息，获取订单号
            List<OrderInfo> list = orderInfoDao.selectByDriverPhone(driverPhone);
            if (list.size() > 0) {
                List<String> orderIdList = new ArrayList<>();
                for (OrderInfo orderInfo : list) {
                    orderIdList.add(orderInfo.getOrderId());
                }
                criteria.andOrderIdIn(orderIdList);
            }
        }
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            if (startDate.equals(endDate)) {
                long date = DateUtil.parseString(startDate, dateFormat,numFormat );
                criteria.andEvaluateTimeEqualTo(date);
            }
            long start = DateUtil.parseString(startDate, dateFormat, numFormat);
            long end = DateUtil.parseString(endDate, dateFormat, numFormat);
            criteria.andEvaluateTimeBetween(start, end);
        }

        PageHelper.startPage(page, rows);
        List<PassengerEvaluation> list = mapper.selectByExample(example);
        return list;
    }
}
