package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.CompanyInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.mapper.CompanyInfoMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Override
    public CompanyInfo selectCompanyInfo(Integer address, String companyId) {
        ArgGen args = new ArgGen();
        args.addPositive("address", address)
                .addNotEmpty("companyId", companyId);
        List<CompanyInfo> list = companyInfoMapper.select(new Pager(),args.getArgs());
        if (list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public CompanyInfo selectByState(String companyId, Integer state) {
        ArgGen args = new ArgGen();
        args.addPositive("state",state)
            .addNotEmpty("companyId", companyId);
        List<CompanyInfo> list = companyInfoMapper.select(new Pager(),args.getArgs());
        if (list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(Pager pager, String companyId, Integer state) {
        ArgGen args = new ArgGen();
        args.addPositive("state",state)
            .addNotEmpty("companyId", companyId);
        List<CompanyInfo> list = companyInfoMapper.select(new Pager(), args.getArgs());
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
        List<CompanyInfo> list = companyInfoMapper.list(new Pager());
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
