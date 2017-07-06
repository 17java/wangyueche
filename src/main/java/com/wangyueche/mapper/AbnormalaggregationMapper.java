package com.wangyueche.mapper;

import com.wangyueche.bean.entity.Abnormalaggregation;
import com.wangyueche.bean.entity.AbnormalaggregationExample;
import com.wangyueche.util.base.MyBatis;
import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

@MyBatis
public interface AbnormalaggregationMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    int insert(Abnormalaggregation record);

    int insertSelective(Abnormalaggregation record);

    List<Abnormalaggregation> select(@Param("pager") Pager pager,@Param("param") Map<String, Object> args);

    Abnormalaggregation selectByPrimaryKey(Integer id);

    int updateSelective(@Param("record") Abnormalaggregation record, @Param("param") Map<String, Object> args);

    int update(@Param("record") Abnormalaggregation record, @Param("param") Map<String, Object> args);

    int updateByPrimaryKeySelective(Abnormalaggregation record);

    int updateByPrimaryKey(Abnormalaggregation record);
}