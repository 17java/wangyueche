package com.wangyueche.mybatis;

import com.wangyueche.bean.vo.share.ShareOperateStat;
import com.wangyueche.util.base.MyBatis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gaojl on 2017/5/16 15:23 .
 * 合乘车辆营运统计信息
 */
@MyBatis
public interface ShareOperateStatMapper {
    List<ShareOperateStat> listStat(@Param("companyId") String companyId, @Param("startDate") Long startDate, @Param("endDate") Long endDate);
}
