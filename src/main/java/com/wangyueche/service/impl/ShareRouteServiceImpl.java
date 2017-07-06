package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SharePay;
import com.wangyueche.bean.entity.ShareRoute;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.share.ShareRouteVo;
import com.wangyueche.dao.ShareRouteDao;
import com.wangyueche.mapper.SharePayMapper;
import com.wangyueche.mapper.ShareRouteMapper;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.service.share.ShareRouteService;
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
public class ShareRouteServiceImpl implements ShareRouteService {
    @Autowired
    private ShareRouteMapper mapper;

    @Autowired
    private ShareCompanyService companyService;

    @Override
    public EasyUIResult findListByCriteria(Pager pager, String companyId, String routeId, String driverName, String driverPhone, String vehicleNo) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId",companyId)
                .addNotEmpty("routeId",routeId)
                .addNotEmpty("driverName",driverName)
                .addNotEmpty("driverPhone",driverPhone)
                .addNotEmpty("vehicleNo",vehicleNo);
        List<ShareRoute> list = mapper.select(pager.setSorts(SharePayMapper.ORDERBY), argGen.getArgs());

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
