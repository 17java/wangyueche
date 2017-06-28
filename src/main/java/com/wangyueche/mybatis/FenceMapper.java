package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.Fence;
import com.wangyueche.bean.entity.FenceExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface FenceMapper {
    int countByExample(FenceExample example);

    int deleteByExample(FenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fence record);

    int insertSelective(Fence record);

    List<Fence> selectByExampleWithBLOBs(FenceExample example);

    List<Fence> selectByExample(FenceExample example);

    Fence selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fence record, @Param("example") FenceExample example);

    int updateByExampleWithBLOBs(@Param("record") Fence record, @Param("example") FenceExample example);

    int updateByExample(@Param("record") Fence record, @Param("example") FenceExample example);

    int updateByPrimaryKeySelective(Fence record);

    int updateByPrimaryKeyWithBLOBs(Fence record);

    int updateByPrimaryKey(Fence record);
}