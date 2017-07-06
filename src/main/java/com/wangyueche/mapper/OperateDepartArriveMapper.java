package com.wangyueche.mapper;

import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.bean.entity.OperateDepartArriveExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface OperateDepartArriveMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<OperateDepartArrive> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    OperateDepartArrive selectByPrimaryKey(Integer id);

}