package com.wangyueche.mapper;

import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.util.base.MyBatis;
import com.wangyueche.util.page.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by lyq
 */
@MyBatis
public interface VehicleBeyondOperateMapper {

    String[] ORDERBY = {"id"};

    List<OperateDepartArrive> list(@Param("pager") Pager pager,@Param("param") Map<String, Object> args);

}
