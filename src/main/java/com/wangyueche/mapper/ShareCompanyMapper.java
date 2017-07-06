package com.wangyueche.mapper;

import com.wangyueche.bean.entity.ShareCompany;
import com.wangyueche.bean.entity.ShareCompanyExample;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.base.MyBatis;
import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface ShareCompanyMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    List<ShareCompany> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    ShareCompany selectByPrimaryKey(Integer id);

}