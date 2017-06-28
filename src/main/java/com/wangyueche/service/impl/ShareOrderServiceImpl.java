package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.ShareOrder;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.share.ShareOrderVo;
import com.wangyueche.dao.ShareOrderDao;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.service.share.ShareOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/5/15 12:01 .
 */
@Service
public class ShareOrderServiceImpl implements ShareOrderService {
    @Autowired
    private ShareOrderDao dao;

    @Autowired
    private ShareCompanyService companyService;
    @Override
    public EasyUIResult findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String orderId) {
        List<ShareOrder> list = dao.findListByCriteria(page, rows, companyId, routeId, orderId);
        if (list != null && list.size() > 0) {
            Map<String, String> map = companyService.listCompanyNames();
            List<ShareOrderVo> voList = new ArrayList<>();
            for (ShareOrder order : list) {
                ShareOrderVo vo = new ShareOrderVo(order);
                vo.setCompanyName(map.get(order.getCompanyId()));
                voList.add(vo);
            }
            EasyUIResult result = new EasyUIResult();
            PageInfo<ShareOrder> pageInfo = new PageInfo<>(list);
            result.setTotal(pageInfo.getTotal());
            result.setRows(voList);
            return result;
        }
        return null;
    }
}
