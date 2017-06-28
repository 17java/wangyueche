package com.wangyueche.mybatis;

import com.wangyueche.bean.entity.ShareRoute;
import com.wangyueche.bean.entity.ShareRouteExample;
import java.util.List;

import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface ShareRouteMapper {
    int countByExample(ShareRouteExample example);

    int deleteByExample(ShareRouteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShareRoute record);

    int insertSelective(ShareRoute record);

    List<ShareRoute> selectByExample(ShareRouteExample example);

    ShareRoute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShareRoute record, @Param("example") ShareRouteExample example);

    int updateByExample(@Param("record") ShareRoute record, @Param("example") ShareRouteExample example);

    int updateByPrimaryKeySelective(ShareRoute record);

    int updateByPrimaryKey(ShareRoute record);
}