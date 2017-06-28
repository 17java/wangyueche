package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.OperateLogInOut;
import com.wangyueche.bean.entity.OperateLogInOutExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface OperateLogInOutMapper {
    int countByExample(OperateLogInOutExample example);

    int deleteByExample(OperateLogInOutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OperateLogInOut record);

    int insertSelective(OperateLogInOut record);

    List<OperateLogInOut> selectByExample(OperateLogInOutExample example);

    OperateLogInOut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OperateLogInOut record, @Param("example") OperateLogInOutExample example);

    int updateByExample(@Param("record") OperateLogInOut record, @Param("example") OperateLogInOutExample example);

    int updateByPrimaryKeySelective(OperateLogInOut record);

    int updateByPrimaryKey(OperateLogInOut record);
}