package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.CompanyScale;
import com.wangyueche.bean.entity.CompanyScaleExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface CompanyScaleMapper {
    int countByExample(CompanyScaleExample example);

    int deleteByExample(CompanyScaleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyScale record);

    int insertSelective(CompanyScale record);

    List<CompanyScale> selectByExample(CompanyScaleExample example);

    CompanyScale selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyScale record, @Param("example") CompanyScaleExample example);

    int updateByExample(@Param("record") CompanyScale record, @Param("example") CompanyScaleExample example);

    int updateByPrimaryKeySelective(CompanyScale record);

    int updateByPrimaryKey(CompanyScale record);
}