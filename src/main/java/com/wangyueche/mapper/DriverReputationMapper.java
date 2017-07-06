package com.wangyueche.mapper;

import com.wangyueche.bean.entity.DriverReputation;
import com.wangyueche.bean.entity.DriverReputationExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface DriverReputationMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<DriverReputation> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    DriverReputation selectByPrimaryKey(Integer id);

}