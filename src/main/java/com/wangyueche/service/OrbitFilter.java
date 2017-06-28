package com.wangyueche.service;

import java.util.List;

import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.bean.vo.VehiclepositionJMS;

/**
 * 轨迹过滤
 * @author XieHaiSheng
 *
 */
public interface OrbitFilter {
	
	boolean valid(List<VehiclepositionJMS> orbit);
	
	Integer getOrder();
	
	
}
