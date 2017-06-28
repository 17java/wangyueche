package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.ShareCompany;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.dao.ShareCompanyDao;
import com.wangyueche.service.share.ShareCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/5/15 11:12 .
 */
@Service
public class ShareCompanyServiceImpl implements ShareCompanyService{
    @Autowired
    private ShareCompanyDao dao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public EasyUIResult findListByCriteria(Integer page, Integer rows, String companyId, Integer state) {
        List<ShareCompany> companies = dao.findListByCriteria(page, rows, companyId, state);
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
        List<ShareCompany> list = dao.select();
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
