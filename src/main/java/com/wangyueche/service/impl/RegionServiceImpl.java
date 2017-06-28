package com.wangyueche.service.impl;

import com.wangyueche.bean.entity.RegionInfo;
import com.wangyueche.service.RegionService;
import com.wangyueche.dao.RegionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gaojl on 2017/4/22 22:30
 *
 * @author gaojl
 */
@Service
public class RegionServiceImpl implements RegionService{
    @Autowired
    private RegionDao dao;

    @Override
    public List<RegionInfo> listForCode(String regionCode) {
        //找出合肥市瞎属区域
        //List<RegionInfo> list = dao.selectByParentCode(regionCode);
        //修改于 2017-04-27 12:05:11
        List<RegionInfo> list = new ArrayList<>();
        RegionInfo hefeiInfo = dao.selectByRegionCode(regionCode);
        list.add(hefeiInfo);
        return list;
    }

    @Override
    public Map<Integer, String> listRegionIdWithName(String regionCode) {
        //找出合肥市瞎属区域
        List<RegionInfo> list = dao.selectByParentCode(regionCode);
        RegionInfo hefeiInfo = dao.selectByRegionCode(regionCode);
        list.add(hefeiInfo);
        Map<Integer, String> map = new HashMap<>();
        for (RegionInfo info : list) {
            map.put(Integer.parseInt(info.getRegionCode()), info.getRegionName());
        }
        return map;
    }
}
