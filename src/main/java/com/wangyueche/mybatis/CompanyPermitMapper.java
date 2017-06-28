package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.CompanyPermit;
import com.wangyueche.bean.entity.CompanyPermitExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface CompanyPermitMapper {
    int countByExample(CompanyPermitExample example);

    int deleteByExample(CompanyPermitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyPermit record);

    int insertSelective(CompanyPermit record);

    List<CompanyPermit> selectByExample(CompanyPermitExample example);

    CompanyPermit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyPermit record, @Param("example") CompanyPermitExample example);

    int updateByExample(@Param("record") CompanyPermit record, @Param("example") CompanyPermitExample example);

    int updateByPrimaryKeySelective(CompanyPermit record);

    int updateByPrimaryKey(CompanyPermit record);
}