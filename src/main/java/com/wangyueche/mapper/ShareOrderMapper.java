package com.wangyueche.mapper;

import com.wangyueche.bean.entity.ShareOrder;
import com.wangyueche.bean.entity.ShareOrderExample;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.base.MyBatis;
import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface ShareOrderMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<ShareOrder> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    ShareOrder selectByPrimaryKey(Integer id);

}