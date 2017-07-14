package com.wangyueche.service.impl;

import com.wangyueche.bean.entity.RegionInfo;
import com.wangyueche.mapper.RegionInfoMapper;
import com.wangyueche.service.RegionService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lyq
 */
@Service
public class RegionServiceImpl implements RegionService{
    @Autowired
    private RegionInfoMapper regionInfoMapper;

    @Override
    public List<RegionInfo> listForCode(String regionCode) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("regionCode",regionCode);
        Pager pager = new Pager().max();
        pager.setSorts(RegionInfoMapper.ORDERBY);
        List<RegionInfo> list = regionInfoMapper.select(pager, argGen.getArgs());
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    @Override
    public Map<Integer, String> listRegionIdWithName(String regionCode) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("parentCode",regionCode);
        Pager pager = new Pager().max();
        pager.setSorts(RegionInfoMapper.ORDERBY);
        List<RegionInfo> list = regionInfoMapper.select(pager, argGen.getArgs());
        RegionInfo hefeiInfo = selectByRegionCode(regionCode);
        list.add(hefeiInfo);
        Map<Integer, String> map = new HashMap<>();
        for (RegionInfo info : list) {
            map.put(Integer.parseInt(info.getRegionCode()), info.getRegionName());
        }
        return map;
    }

    private RegionInfo selectByRegionCode(String regionCode){
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("regionCode",regionCode);
        Pager pager = new Pager().max();
        pager.setSorts(RegionInfoMapper.ORDERBY);
        List<RegionInfo> list = regionInfoMapper.select(pager, argGen.getArgs());
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
