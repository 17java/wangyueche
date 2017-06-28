package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.PassengerEvaluation;
import com.wangyueche.bean.entity.PassengerEvaluationExample;
import com.wangyueche.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface PassengerEvaluationMapper {
    int countByExample(PassengerEvaluationExample example);

    int deleteByExample(PassengerEvaluationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PassengerEvaluation record);

    int insertSelective(PassengerEvaluation record);

    List<PassengerEvaluation> selectByExample(PassengerEvaluationExample example);

    PassengerEvaluation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PassengerEvaluation record, @Param("example") PassengerEvaluationExample example);

    int updateByExample(@Param("record") PassengerEvaluation record, @Param("example") PassengerEvaluationExample example);

    int updateByPrimaryKeySelective(PassengerEvaluation record);

    int updateByPrimaryKey(PassengerEvaluation record);
}