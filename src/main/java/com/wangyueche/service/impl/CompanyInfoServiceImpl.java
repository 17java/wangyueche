package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CompanyInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.dao.CompanyInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gaoshiwei on 2017/4/12.
 */
@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    private CompanyInfoDao dao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public CompanyInfo selectCompanyInfo(Integer address, String companyId) {
        return dao.selectCompanyInfo(address, companyId);
    }

    @Override
    public CompanyInfo selectByState(String companyId, Integer state) {
        return dao.selectByState(companyId, state);
    }

    @Override
    public EasyUIResult listForPage(int page, int rows, String companyId, Integer state) {
        List<CompanyInfo> list = dao.listForPage(page, rows, companyId, state);
        PageInfo<CompanyInfo> pageInfo = new PageInfo<>(list);

        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }

    @Override
    public HashMap<String, String> idWithName() {
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        try {
            HashMap hashMap = (HashMap) hash.entries("company_name");
            if (hashMap != null && hashMap.size() > 0) {
                return hashMap;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<CompanyInfo> list = dao.list();
        if (list.size() > 0) {
            HashMap<String, String> map = new HashMap<>();
            for (CompanyInfo info : list) {
                map.put(info.getCompanyId(), info.getCompanyName());
            }
            //数据存到缓存中
            try {
                hash.putAll("company_name",map);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return map;
        }
        return null;
    }
}
