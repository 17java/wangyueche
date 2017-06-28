package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.DictInfo;
import com.wangyueche.bean.entity.DictInfoExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface DictInfoMapper {
    int countByExample(DictInfoExample example);

    int deleteByExample(DictInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictInfo record);

    int insertSelective(DictInfo record);

    List<DictInfo> selectByExample(DictInfoExample example);

    DictInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictInfo record, @Param("example") DictInfoExample example);

    int updateByExample(@Param("record") DictInfo record, @Param("example") DictInfoExample example);

    int updateByPrimaryKeySelective(DictInfo record);

    int updateByPrimaryKey(DictInfo record);
}