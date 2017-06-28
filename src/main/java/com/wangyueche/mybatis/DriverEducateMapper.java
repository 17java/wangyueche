package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.DriverEducate;
import com.wangyueche.bean.entity.DriverEducateExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface DriverEducateMapper {
    int countByExample(DriverEducateExample example);

    int deleteByExample(DriverEducateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DriverEducate record);

    int insertSelective(DriverEducate record);

    List<DriverEducate> selectByExample(DriverEducateExample example);

    DriverEducate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DriverEducate record, @Param("example") DriverEducateExample example);

    int updateByExample(@Param("record") DriverEducate record, @Param("example") DriverEducateExample example);

    int updateByPrimaryKeySelective(DriverEducate record);

    int updateByPrimaryKey(DriverEducate record);
}