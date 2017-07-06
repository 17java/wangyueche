package com.wangyueche.service;

import com.wangyueche.bean.entity.RegionInfo;

import java.util.List;
import java.util.Map;

/**
 *
 * @author lyq
 */
public interface RegionService {

    List<RegionInfo> listForCode(String regionCode);

    Map<Integer, String> listRegionIdWithName(String regionCode);

}
