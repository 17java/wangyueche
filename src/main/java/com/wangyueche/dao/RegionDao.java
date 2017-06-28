package com.wangyueche.dao;

import com.wangyueche.bean.entity.RegionInfo;

import java.util.List;

/**
 * Created by gaojl on 2017/4/22 21:59
 * 区域标识
 * @author gaojl
 */
public interface RegionDao {
    /**
     * 通过区域名称查询
     * @param regionName 区域名称
     * @return
     */
    List<RegionInfo> selectByRegionName(String regionName);

    /**
     * 通过区域代码查询
     * @param regionCode
     * @return
     */
    RegionInfo selectByRegionCode(String regionCode);

    /**
     * 通过父级区域代码查询
     * @param parentCode
     * @return
     */
    List<RegionInfo> selectByParentCode(String parentCode);

}
