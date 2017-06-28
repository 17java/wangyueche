package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.ShareOrder;
import com.wangyueche.bean.entity.ShareOrderExample;
import java.util.List;

import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface ShareOrderMapper {
    int countByExample(ShareOrderExample example);

    int deleteByExample(ShareOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShareOrder record);

    int insertSelective(ShareOrder record);

    List<ShareOrder> selectByExample(ShareOrderExample example);

    ShareOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShareOrder record, @Param("example") ShareOrderExample example);

    int updateByExample(@Param("record") ShareOrder record, @Param("example") ShareOrderExample example);

    int updateByPrimaryKeySelective(ShareOrder record);

    int updateByPrimaryKey(ShareOrder record);
}