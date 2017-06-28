package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.ShareCompany;
import com.wangyueche.bean.entity.ShareCompanyExample;
import java.util.List;

import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface ShareCompanyMapper {
    int countByExample(ShareCompanyExample example);

    int deleteByExample(ShareCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShareCompany record);

    int insertSelective(ShareCompany record);

    List<ShareCompany> selectByExample(ShareCompanyExample example);

    ShareCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShareCompany record, @Param("example") ShareCompanyExample example);

    int updateByExample(@Param("record") ShareCompany record, @Param("example") ShareCompanyExample example);

    int updateByPrimaryKeySelective(ShareCompany record);

    int updateByPrimaryKey(ShareCompany record);
}