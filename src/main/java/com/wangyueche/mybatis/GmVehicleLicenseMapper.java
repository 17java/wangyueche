package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.GmVehicleLicense;
import com.wangyueche.bean.entity.GmVehicleLicenseExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface GmVehicleLicenseMapper {
    int countByExample(GmVehicleLicenseExample example);

    int deleteByExample(GmVehicleLicenseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GmVehicleLicense record);

    int insertSelective(GmVehicleLicense record);

    List<GmVehicleLicense> selectByExample(GmVehicleLicenseExample example);

    GmVehicleLicense selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GmVehicleLicense record, @Param("example") GmVehicleLicenseExample example);

    int updateByExample(@Param("record") GmVehicleLicense record, @Param("example") GmVehicleLicenseExample example);

    int updateByPrimaryKeySelective(GmVehicleLicense record);

    int updateByPrimaryKey(GmVehicleLicense record);
}