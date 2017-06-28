package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.GmCompanyBusinessLicense;
import com.wangyueche.bean.entity.GmCompanyBusinessLicenseExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface GmCompanyBusinessLicenseMapper {
    int countByExample(GmCompanyBusinessLicenseExample example);

    int deleteByExample(GmCompanyBusinessLicenseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GmCompanyBusinessLicense record);

    int insertSelective(GmCompanyBusinessLicense record);

    List<GmCompanyBusinessLicense> selectByExampleWithBLOBs(GmCompanyBusinessLicenseExample example);

    List<GmCompanyBusinessLicense> selectByExample(GmCompanyBusinessLicenseExample example);

    GmCompanyBusinessLicense selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GmCompanyBusinessLicense record, @Param("example") GmCompanyBusinessLicenseExample example);

    int updateByExampleWithBLOBs(@Param("record") GmCompanyBusinessLicense record, @Param("example") GmCompanyBusinessLicenseExample example);

    int updateByExample(@Param("record") GmCompanyBusinessLicense record, @Param("example") GmCompanyBusinessLicenseExample example);

    int updateByPrimaryKeySelective(GmCompanyBusinessLicense record);

    int updateByPrimaryKeyWithBLOBs(GmCompanyBusinessLicense record);

    int updateByPrimaryKey(GmCompanyBusinessLicense record);
}