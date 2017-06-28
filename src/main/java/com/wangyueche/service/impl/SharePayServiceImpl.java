package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SharePay;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.share.SharePayVo;
import com.wangyueche.dao.SharePayDao;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.service.share.SharePayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/5/15 12:04 .
 */
@Service
public class SharePayServiceImpl implements SharePayService {
    @Autowired
    private SharePayDao dao;

    @Autowired
    private ShareCompanyService companyService;

    @Override
    public EasyUIResult findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String orderId, String driverPhone, String vehicleNo) {
        List<SharePay> list = dao.findListByCriteria(page, rows, companyId, routeId, orderId, driverPhone, vehicleNo);
        if (list != null && list.size() > 0) {
            List<SharePayVo> voList = new ArrayList<>();
            Map<String, String> map = companyService.listCompanyNames();
            for (SharePay pay : list) {
                SharePayVo vo = new SharePayVo(pay);
                vo.setCompanyName(map.get(pay.getCompanyId()));
                voList.add(vo);
            }
            EasyUIResult result = new EasyUIResult();
            PageInfo<SharePay> pageInfo = new PageInfo<>(list);
            result.setTotal(pageInfo.getTotal());
            result.setRows(voList);
            return result;
        }
        return null;
    }
}
