package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.CreditCompany;
import com.wangyueche.bean.entity.CreditCompanyExample;
import java.util.List;

import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface CreditCompanyMapper {
    int countByExample(CreditCompanyExample example);

    int deleteByExample(CreditCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CreditCompany record);

    int insertSelective(CreditCompany record);

    List<CreditCompany> selectByExample(CreditCompanyExample example);

    CreditCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CreditCompany record, @Param("example") CreditCompanyExample example);

    int updateByExample(@Param("record") CreditCompany record, @Param("example") CreditCompanyExample example);

    int updateByPrimaryKeySelective(CreditCompany record);

    int updateByPrimaryKey(CreditCompany record);
}