package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.CompanyPermit;
import com.wangyueche.bean.entity.CompanyPermitExample;
import com.wangyueche.dao.CompanyPermitDao;
import com.wangyueche.mybatis.CompanyPermitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/4/12.
 */
@Repository
public class CompanyPermitDaoImpl implements CompanyPermitDao {

    @Autowired
    private CompanyPermitMapper mapper;

    @Override
    public CompanyPermit selectCompanyPermit(Integer address, String companyId) {
        CompanyPermitExample example = new CompanyPermitExample();
        CompanyPermitExample.Criteria criteria = example.createCriteria();
        if (address != null) {
            criteria.andAddressEqualTo(address);
        }
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        List<CompanyPermit> list = mapper.selectByExample(example);
        if (list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<CompanyPermit> listForPage(int pageCurrent, int pageSize, Integer address, String companyId, String state) {
        CompanyPermitExample example = new CompanyPermitExample();
        CompanyPermitExample.Criteria criteria = example.createCriteria();
        if (address != null) {
            criteria.andAddressEqualTo(address);
        }
        if (StringUtils.hasText(companyId)){
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(state)) {
            criteria.andStateEqualTo(state);
        }
        PageHelper.startPage(pageCurrent,pageSize);
        List<CompanyPermit> list = mapper.selectByExample(example);
        return list;
    }
}
