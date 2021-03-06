package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SharePay;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.share.SharePayVo;
import com.wangyueche.mapper.SharePayMapper;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.service.share.SharePayService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by lyq
 */
@Service
public class SharePayServiceImpl implements SharePayService {
    @Autowired
    private SharePayMapper mapper;

    @Autowired
    private ShareCompanyService companyService;

    @Override
    public EasyUIResult findListByCriteria(Pager pager, String companyId, String routeId, String orderId, String driverPhone, String vehicleNo) {

        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId",companyId)
                .addNotEmpty("routeId",routeId)
                .addNotEmpty("orderId",orderId)
                .addNotEmpty("driverPhone",driverPhone)
                .addNotEmpty("vehicleNo",vehicleNo);

        List<SharePay> list = mapper.select(pager.setSorts(SharePayMapper.ORDERBY), argGen.getArgs());
        if (list != null && list.size() > 0) {
            List<SharePayVo> voList = new ArrayList();
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
