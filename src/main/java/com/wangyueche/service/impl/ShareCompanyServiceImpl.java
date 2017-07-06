package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.ShareCompany;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.dao.ShareCompanyDao;
import com.wangyueche.mapper.ShareCompanyMapper;
import com.wangyueche.service.share.ShareCompanyService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lyq
 */
@Service
public class ShareCompanyServiceImpl implements ShareCompanyService{
    @Autowired
    private ShareCompanyMapper mapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public EasyUIResult findListByCriteria(Pager pager, String companyId, Integer state) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId",companyId)
                .addPositive("state",state);
        List<ShareCompany> companies = mapper.select(pager.setSorts(ShareCompanyMapper.ORDERBY), argGen.getArgs());
        if (companies != null && companies.size() > 0) {
            PageInfo<ShareCompany> pageInfo = new PageInfo<>(companies);
            EasyUIResult result = new EasyUIResult();
            result.setTotal(pageInfo.getTotal());
            result.setRows(pageInfo.getList());
            return result;
        }
        return null;
    }

    @Override
    public Map listCompanyNames() {
        HashOperations hash = redisTemplate.opsForHash();
        try {
            Map hashMap = hash.entries("share_company_name");
            if (hashMap != null && hashMap.size() > 0) {
                return hashMap;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArgGen argGen = new ArgGen();
        List<ShareCompany> list = mapper.select(new Pager().max().setSorts(ShareCompanyMapper.ORDERBY), argGen.getArgs());
        if (list != null && list.size() > 0) {
            Map<String, String> map = new HashMap<>();
            for (ShareCompany company : list) {
                map.put(company.getCompanyId(), company.getCompanyName());
            }
            try {
                hash.putAll("share_company_name", map);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return map;
        }
        return null;
    }
}
