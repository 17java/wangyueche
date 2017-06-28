package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.DriverReputation;
import com.wangyueche.bean.entity.DriverReputationExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface DriverReputationMapper {
    int countByExample(DriverReputationExample example);

    int deleteByExample(DriverReputationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DriverReputation record);

    int insertSelective(DriverReputation record);

    List<DriverReputation> selectByExample(DriverReputationExample example);

    DriverReputation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DriverReputation record, @Param("example") DriverReputationExample example);

    int updateByExample(@Param("record") DriverReputation record, @Param("example") DriverReputationExample example);

    int updateByPrimaryKeySelective(DriverReputation record);

    int updateByPrimaryKey(DriverReputation record);
}