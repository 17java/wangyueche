package com.wangyueche.service.impl;

import java.util.List;

import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.bean.vo.VehiclepositionJMS;
import com.wangyueche.service.CarOrbitFilter;
import com.wangyueche.util.SpotToWeb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrbitDistanceFilter extends CarOrbitFilter {
	
	private static Logger logger = LoggerFactory.getLogger(OrbitDistanceFilter.class);
	
	
	private int order=1;
	
	private float minDistance=0.4F;
	
	private int minSeconds=60*3;
	
	
	public boolean valid(List<VehiclepositionJMS> orbit) {
		double distance= SpotToWeb.getPartDistance(orbit);
		if(distance<=minDistance){
			return false;
		}else{
			if(orbit.size()>1){
				long time=Math.abs(orbit.get(orbit.size()-1).getPositionTime()-orbit.get(0).getPositionTime());
				logger.debug("orbit time:"+time);
			}
			return true;
		}
		
		
	}

	
	public void setMinDistance(float minDistance) {
		this.minDistance = minDistance;
	}
	
	
	public void setMinSeconds(int minSeconds) {
		this.minSeconds = minSeconds;
	}

	
	public Integer getOrder() {
		return order;
	}

}
