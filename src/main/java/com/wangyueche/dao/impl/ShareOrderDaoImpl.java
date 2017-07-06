package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.ShareOrder;
import com.wangyueche.bean.entity.ShareOrderExample;
import com.wangyueche.dao.ShareOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by gaojl on 2017/5/15 11:42 .
 */
@Repository
public class ShareOrderDaoImpl implements ShareOrderDao {
    @Override
    public List<ShareOrder> findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String orderId) {
        return null;
    }
    /*@Autowired
    private ShareOrderMapper mapper;

    @Override
    public List<ShareOrder> findListByCriteria(Integer page, Integer rows, String companyId, String routeId, String orderId) {
        ShareOrderExample example = new ShareOrderExample();
        ShareOrderExample.Criteria criteria = example.createCriteria();

        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(routeId)) {
            criteria.andRouteIdEqualTo(routeId);
        }
        if (StringUtils.hasText(orderId)) {
            criteria.andOrderIdEqualTo(orderId);
        }

        PageHelper.startPage(page, rows);
        List<ShareOrder> list = mapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            return list;
        }
        return null;
    }*/
}
