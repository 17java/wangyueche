package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.ShareOrder;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.share.ShareOrderVo;
import com.wangyueche.mapper.ShareOrderMapper;
import com.wangyueche.mapper.SharePayMapper;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.service.share.ShareOrderService;
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
public class ShareOrderServiceImpl implements ShareOrderService {

    @Autowired
    private ShareOrderMapper mapper;

    @Autowired
    private ShareCompanyService companyService;
    @Override
    public EasyUIResult findListByCriteria(Pager pager, String companyId, String routeId, String orderId) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId", companyId)
                .addNotEmpty("routeId",routeId)
                .addNotEmpty("orderId",orderId);
        List<ShareOrder> list = mapper.select(pager.setSorts(SharePayMapper.ORDERBY), argGen.getArgs());
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
