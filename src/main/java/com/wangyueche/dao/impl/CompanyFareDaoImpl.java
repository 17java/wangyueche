package com.wangyueche.dao.impl;

import com.wangyueche.bean.entity.CompanyFare;
import com.wangyueche.dao.CompanyFareDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/4/12.
 */
@Repository
public class CompanyFareDaoImpl implements CompanyFareDao {
    @Override
    public List<CompanyFare> listForPage(int pageCurrent, int pageSize, Integer address, String companyId, String fareType, Integer state) {
        return null;
    }

   /* @Autowired
    private CompanyFareMapper mapper;





    @Override
    public List<CompanyFare> listForPage(int pageCurrent, int pageSize, Integer address, String companyId, String fareType, Integer state) {
        CompanyFareExample example = new CompanyFareExample();
        CompanyFareExample.Criteria criteria = example.createCriteria();
        if (address != null) {
            criteria.andAddressEqualTo(address);
        }
        if (StringUtils.hasText(companyId)) {
            criteria.andCompanyIdEqualTo(companyId);
        }
        if (StringUtils.hasText(fareType)) {
            criteria.andFareTypeEqualTo(fareType);
        }
        if (state != null) {
            criteria.andStateEqualTo(state);
        }

        PageHelper.startPage(pageCurrent, pageSize);
        List<CompanyFare> list = mapper.selectByExample(example);

        return list;
    }*/
}
