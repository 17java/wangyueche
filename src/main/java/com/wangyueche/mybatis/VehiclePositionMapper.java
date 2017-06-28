package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.bean.entity.VehiclePositionExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface VehiclePositionMapper {
    int countByExample(VehiclePositionExample example);

    int deleteByExample(VehiclePositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VehiclePosition record);

    int insertSelective(VehiclePosition record);

    List<VehiclePosition> selectByExample(VehiclePositionExample example);

    VehiclePosition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehiclePosition record, @Param("example") VehiclePositionExample example);

    int updateByExample(@Param("record") VehiclePosition record, @Param("example") VehiclePositionExample example);

    int updateByPrimaryKeySelective(VehiclePosition record);

    int updateByPrimaryKey(VehiclePosition record);
}