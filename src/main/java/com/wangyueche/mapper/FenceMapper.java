package com.wangyueche.mapper;

import com.wangyueche.bean.entity.Fence;
import com.wangyueche.bean.entity.FenceExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface FenceMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    int insert(Fence record);

    int insertSelective(Fence record);

    List<Fence> selectByExampleWithBLOBs(@Param("param") Map<String, Object> args);

    List<Fence> selectByExample(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    Fence selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fence record, @Param("param") Map<String, Object> args);

    int updateByExampleWithBLOBs(@Param("record") Fence record, @Param("param") Map<String, Object> args);

    int updateByExample(@Param("record") Fence record, @Param("param") Map<String, Object> args);

    int updateByPrimaryKeySelective(Fence record);

    int updateByPrimaryKeyWithBLOBs(Fence record);

    int updateByPrimaryKey(Fence record);
}