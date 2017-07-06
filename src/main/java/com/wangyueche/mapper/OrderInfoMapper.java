package com.wangyueche.mapper;

import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.entity.OrderInfoExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface OrderInfoMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<OrderInfo> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    OrderInfo selectByPrimaryKey(Integer id);

}