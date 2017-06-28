package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.ShareRoute;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.share.ShareRouteVo;
import com.wangyueche.dao.ShareRouteDao;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.service.share.ShareRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/5/15 12:07 .
 */
@Service
public class ShareRouteServiceImpl implements ShareRouteService {
    @Autowired
    private ShareRouteDao dao;

    @Autowired
    private ShareCompanyService companyService;

    @Override
    public EasyUIResult findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String driverName, String driverPhone, String vehicleNo) {
        List<ShareRoute> list = dao.findListByCriteria(page, rows, companyId, routeId, driverName, driverPhone, vehicleNo);
        if (list != null && list.size() > 0) {
            List<ShareRouteVo> voList = new ArrayList<>();
            Map<String, String> map = companyService.listCompanyNames();
            for (ShareRoute route : list) {
                ShareRouteVo vo = new ShareRouteVo(route);
                vo.setCompanyName(map.get(route.getCompanyId()));
                voList.add(vo);
            }
            EasyUIResult result = new EasyUIResult();
            PageInfo<ShareRoute> pageInfo = new PageInfo<>(list);
            result.setTotal(pageInfo.getTotal());
            result.setRows(voList);
            return result;
        }
        return null;
    }
}