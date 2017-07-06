package com.wangyueche.mapper;

import com.wangyueche.bean.entity.ShareRoute;
import com.wangyueche.bean.entity.ShareRouteExample;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.base.MyBatis;
import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface ShareRouteMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<ShareRoute> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    ShareRoute selectByPrimaryKey(Integer id);

}