package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.DriverPunish;
import com.wangyueche.bean.entity.DriverPunishExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface DriverPunishMapper {
    int countByExample(DriverPunishExample example);

    int deleteByExample(DriverPunishExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DriverPunish record);

    int insertSelective(DriverPunish record);

    List<DriverPunish> selectByExample(DriverPunishExample example);

    DriverPunish selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DriverPunish record, @Param("example") DriverPunishExample example);

    int updateByExample(@Param("record") DriverPunish record, @Param("example") DriverPunishExample example);

    int updateByPrimaryKeySelective(DriverPunish record);

    int updateByPrimaryKey(DriverPunish record);
}