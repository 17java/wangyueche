package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CompanyFare;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.CompanyFareVo;
import com.wangyueche.mapper.CompanyFareMapper;
import com.wangyueche.service.CompanyFareService;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by lyq on 2017/4/12.
 */
@Service
public class CompanyFareServiceImpl implements CompanyFareService {

    @Autowired
    private CompanyFareMapper companyFareMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(Pager pager, Integer address, String companyId, String fareType, Integer state) {
        ArgGen args = new ArgGen();
        args.addPositive("state",state)
            .addNotEmpty("companyId", companyId)
            .addPositive("address", address)
            .addNotEmpty("fareType", fareType);
        pager.setSorts(CompanyFareMapper.ORDERBY);
        List<CompanyFare> list = companyFareMapper.select(pager, args.getArgs());

        List<CompanyFareVo> voList = new ArrayList<>();
        if (list.size() > 0) {//如果查询结果有数据
            //得到comapnyid和companyName对应的map
            Map<String, String> map = infoService.idWithName();
            for (CompanyFare fare : list) {
                CompanyFareVo vo = new CompanyFareVo(fare);
                vo.setCompanyName(map.get(fare.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<CompanyFare> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
