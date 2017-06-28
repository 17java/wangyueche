package com.wangyueche.dao;

import java.util.List;

import com.wangyueche.bean.entity.RegionInfo;

/**
 * Created by zhangfei on 2017/4/12.
 */
public interface CarMonitorDao {
    public List<RegionInfo> districts(String code);

    public int initFence(String code, String fences);
}
