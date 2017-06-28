package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.SharePay;
import com.wangyueche.bean.entity.SharePayExample;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatis
public interface SharePayMapper {
    int countByExample(SharePayExample example);

    int deleteByExample(SharePayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SharePay record);

    int insertSelective(SharePay record);

    List<SharePay> selectByExample(SharePayExample example);

    SharePay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SharePay record, @Param("example") SharePayExample example);

    int updateByExample(@Param("record") SharePay record, @Param("example") SharePayExample example);

    int updateByPrimaryKeySelective(SharePay record);

    int updateByPrimaryKey(SharePay record);
}