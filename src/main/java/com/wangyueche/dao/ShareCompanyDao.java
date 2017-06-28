package com.wangyueche.dao;

import com.wangyueche.bean.entity.ShareCompany;

import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/5/15 10:57 .
 */
public interface ShareCompanyDao {
    List<ShareCompany> findListByCriteria(Integer page, Integer rows, String companyId, Integer state);

    List<ShareCompany> select();
}
