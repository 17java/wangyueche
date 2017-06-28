package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.Gbt2260;
import com.wangyueche.bean.entity.Gbt2260Example;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface Gbt2260Mapper {
    int countByExample(Gbt2260Example example);

    int deleteByExample(Gbt2260Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gbt2260 record);

    int insertSelective(Gbt2260 record);

    List<Gbt2260> selectByExample(Gbt2260Example example);

    Gbt2260 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gbt2260 record, @Param("example") Gbt2260Example example);

    int updateByExample(@Param("record") Gbt2260 record, @Param("example") Gbt2260Example example);

    int updateByPrimaryKeySelective(Gbt2260 record);

    int updateByPrimaryKey(Gbt2260 record);
}