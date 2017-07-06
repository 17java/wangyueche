package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.CompanyScale;
import com.wangyueche.bean.entity.CompanyScaleExample;
import com.wangyueche.dao.CompanyScaleDao;
import com.wangyueche.mapper.CompanyScaleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/4/12.
 */
@Repository
public class CompanyScaleDaoImpl implements CompanyScaleDao {
    @Override
    public CompanyScale selectCompanyScale(String companyId) {
        return null;
    }

    @Override
    public List<CompanyScale> listForPage(int pageCurrent, int pageSize, String companyId) {
        return null;
    }

   /* @Autowired
    private CompanyScaleMapper mapper;

    @Override
    public CompanyScale selectCompanyScale(String companyId) {
        CompanyScaleExample example = new CompanyScaleExample();
        CompanyScaleExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        List<CompanyScale> list = mapper.selectByExample(example);
        if (list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<CompanyScale> listForPage(int pageCurrent, int pageSize, String companyId) {
        CompanyScaleExample example = new CompanyScaleExample();
        CompanyScaleExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        PageHelper.startPage(pageCurrent,pageSize);
        List<CompanyScale> list = mapper.selectByExample(example);
        return list;
    }*/
}
