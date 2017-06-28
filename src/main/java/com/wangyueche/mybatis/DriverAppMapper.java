package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.DriverApp;
import com.wangyueche.bean.entity.DriverAppExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface DriverAppMapper {
    int countByExample(DriverAppExample example);

    int deleteByExample(DriverAppExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DriverApp record);

    int insertSelective(DriverApp record);

    List<DriverApp> selectByExample(DriverAppExample example);

    DriverApp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DriverApp record, @Param("example") DriverAppExample example);

    int updateByExample(@Param("record") DriverApp record, @Param("example") DriverAppExample example);

    int updateByPrimaryKeySelective(DriverApp record);

    int updateByPrimaryKey(DriverApp record);
}