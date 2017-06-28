package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.CreditCompany;
import com.wangyueche.bean.entity.CreditCompanyExample;
import com.wangyueche.dao.CreditCompanyDao;
import com.wangyueche.mybatis.CreditCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/5/23 14:56 .
 */
@Repository
public class CreditCompanyDaoImpl implements CreditCompanyDao {
    @Autowired
    private CreditCompanyMapper mapper;

    @Override
    public List<CreditCompany> list(Integer page, Integer rows, String companyId) {
        CreditCompanyExample example = new CreditCompanyExample();
        CreditCompanyExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }

        PageHelper.startPage(page, rows);
        List<CreditCompany> list = mapper.selectByExample(example);

        return list;
    }
}
