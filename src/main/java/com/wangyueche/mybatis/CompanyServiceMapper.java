package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.CompanyService;
import com.wangyueche.bean.entity.CompanyServiceExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface CompanyServiceMapper {
    int countByExample(CompanyServiceExample example);

    int deleteByExample(CompanyServiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyService record);

    int insertSelective(CompanyService record);

    List<CompanyService> selectByExample(CompanyServiceExample example);

    CompanyService selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyService record, @Param("example") CompanyServiceExample example);

    int updateByExample(@Param("record") CompanyService record, @Param("example") CompanyServiceExample example);

    int updateByPrimaryKeySelective(CompanyService record);

    int updateByPrimaryKey(CompanyService record);
}