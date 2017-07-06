package com.wangyueche.mapper;

import com.wangyueche.bean.entity.VehicleInfo;
import com.wangyueche.bean.entity.VehicleInfoExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import java.util.Map;

import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface VehicleInfoMapper {

    String[] ORDERBY = {"id"};

    int count(@Param("param") Map<String, Object> args);

    int delete(@Param("param") Map<String, Object> args);

    int deleteByPrimaryKey(Integer id);

    int insert(VehicleInfo record);

    int insertSelective(VehicleInfo record);

    List<VehicleInfo> select(@Param("pager") Pager pager, @Param("param") Map<String, Object> args);

    VehicleInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleInfo record, @Param("param") Map<String, Object> args);

    int updateByExample(@Param("record") VehicleInfo record, @Param("param") Map<String, Object> args);

    int updateByPrimaryKeySelective(VehicleInfo record);

    int updateByPrimaryKey(VehicleInfo record);
}