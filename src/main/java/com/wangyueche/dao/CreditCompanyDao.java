package com.wangyueche.dao;

import com.wangyueche.bean.entity.CreditCompany;

import java.util.List;

/**
 * Created by gaojl on 2017/5/23 14:55 .
 */
public interface CreditCompanyDao {
    List<CreditCompany> list(Integer page, Integer rows, String companyId);
}
