package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.DriverInfo;
import com.wangyueche.bean.entity.DriverInfoExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface DriverInfoMapper {
    int countByExample(DriverInfoExample example);

    int deleteByExample(DriverInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DriverInfo record);

    int insertSelective(DriverInfo record);

    List<DriverInfo> selectByExample(DriverInfoExample example);

    DriverInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DriverInfo record, @Param("example") DriverInfoExample example);

    int updateByExample(@Param("record") DriverInfo record, @Param("example") DriverInfoExample example);

    int updateByPrimaryKeySelective(DriverInfo record);

    int updateByPrimaryKey(DriverInfo record);
}