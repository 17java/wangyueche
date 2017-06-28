package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.CompanyInfo;
import com.wangyueche.bean.entity.CompanyInfoExample;
import com.wangyueche.dao.CompanyInfoDao;
import com.wangyueche.mybatis.CompanyInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoshiwei on 2017/4/12.
 */
@Repository
public class CompanyInfoDaoImpl implements CompanyInfoDao {

    @Autowired
    private CompanyInfoMapper mapper;

    @Override
    public CompanyInfo selectCompanyInfo(Integer address, String companyId) {
        CompanyInfoExample example = new CompanyInfoExample();
        CompanyInfoExample.Criteria criteria = example.createCriteria();
        if (address != null) {
            criteria.andAddressEqualTo(address);
        }
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        List<CompanyInfo> list = mapper.selectByExample(example);
        if (list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public CompanyInfo selectByState(String companyId, Integer state) {
        CompanyInfoExample example = new CompanyInfoExample();
        CompanyInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (state != null) {
            criteria.andStateEqualTo(state);
        }
        List<CompanyInfo> list = mapper.selectByExample(example);
        if (list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<CompanyInfo> listForPage(int pageCurrent, int pageSize, String companyId, Integer state) {
        CompanyInfoExample example = new CompanyInfoExample();
        CompanyInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)){
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (state!=null){
            criteria.andStateEqualTo(state);
        }
        PageHelper.startPage(pageCurrent,pageSize);
        List<CompanyInfo> list = mapper.selectByExample(example);

        return list;
    }

    @Override
    public CompanyInfo selectByCompanyId(String companyId) {
        CompanyInfoExample example = new CompanyInfoExample();
        CompanyInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        List<CompanyInfo> list = mapper.selectByExample(example);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<CompanyInfo> list() {
        CompanyInfoExample example = new CompanyInfoExample();
        return mapper.selectByExample(example);
    }

    /**
     * 获取
     * @return
     */
    @Override
    public List<String> getCompanyIdList() {
        List<String> companyIdList = new ArrayList<>();
        CompanyInfoExample example = new CompanyInfoExample();
        List<CompanyInfo> list = mapper.selectByExample(example);
        for (CompanyInfo companyInfo:list){
            companyIdList.add(companyInfo.getCompanyId());
        }
        return companyIdList;
    }
}
