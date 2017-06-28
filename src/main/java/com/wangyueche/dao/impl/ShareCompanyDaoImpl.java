package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.ShareCompany;
import com.wangyueche.bean.entity.ShareCompanyExample;
import com.wangyueche.dao.ShareCompanyDao;
import com.wangyueche.mybatis.ShareCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/5/15 11:00 .
 */
@Repository
public class ShareCompanyDaoImpl implements ShareCompanyDao {
    @Autowired
    private ShareCompanyMapper mapper;

    @Override
    public List<ShareCompany> findListByCriteria(Integer page, Integer rows, String companyId, Integer state) {
        ShareCompanyExample example = new ShareCompanyExample();
        ShareCompanyExample.Criteria criteria = example.createCriteria();

        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (state != null) {
            criteria.andStateEqualTo(state);
        }

        PageHelper.startPage(page, rows);
        List<ShareCompany> list = mapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }

    @Override
    public List<ShareCompany> select() {
        ShareCompanyExample example = new ShareCompanyExample();
        List<ShareCompany> list = mapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }
}
