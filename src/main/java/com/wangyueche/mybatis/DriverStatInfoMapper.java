package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.DriverStatInfo;
import com.wangyueche.bean.entity.DriverStatInfoExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface DriverStatInfoMapper {
    int countByExample(DriverStatInfoExample example);

    int deleteByExample(DriverStatInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DriverStatInfo record);

    int insertSelective(DriverStatInfo record);

    List<DriverStatInfo> selectByExample(DriverStatInfoExample example);

    DriverStatInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DriverStatInfo record, @Param("example") DriverStatInfoExample example);

    int updateByExample(@Param("record") DriverStatInfo record, @Param("example") DriverStatInfoExample example);

    int updateByPrimaryKeySelective(DriverStatInfo record);

    int updateByPrimaryKey(DriverStatInfo record);
}