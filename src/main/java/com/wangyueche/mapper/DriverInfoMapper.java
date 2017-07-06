package com.wangyueche.mapper;

import com.wangyueche.bean.entity.DriverInfo;
import com.wangyueche.bean.entity.DriverInfoExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface DriverInfoMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int deleteByExample(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<DriverInfo> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    DriverInfo selectByPrimaryKey(Integer id);

}