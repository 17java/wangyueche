package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.RegionInfo;
import com.wangyueche.bean.entity.RegionInfoExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface RegionInfoMapper {
    int countByExample(RegionInfoExample example);

    int deleteByExample(RegionInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegionInfo record);

    int insertSelective(RegionInfo record);

    List<RegionInfo> selectByExample(RegionInfoExample example);

    RegionInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegionInfo record, @Param("example") RegionInfoExample example);

    int updateByExample(@Param("record") RegionInfo record, @Param("example") RegionInfoExample example);

    int updateByPrimaryKeySelective(RegionInfo record);

    int updateByPrimaryKey(RegionInfo record);
}