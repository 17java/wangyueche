package com.wangyueche.service.impl;

import java.util.List;
import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.bean.vo.VehiclepositionJMS;
import com.wangyueche.service.OrbitFilter;
import com.wangyueche.util.Common;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
/**
 * 通过角度过滤
 * 放射状漂移
 *
 */
@Service
public  class OrbitAngleFilter implements OrbitFilter {
	
	private static Logger logger = LoggerFactory.getLogger(OrbitAngleFilter.class);
	
	private int order=1;
	
	private float angle=30F; 

	
	/**
	 * 余弦公式法
	 * @param pointO
	 * @param pointS
	 * @param pointM
	 * @return ∠som
	 *   B = Math.acos((a*a + c*c - b*b)/(2*a*c));   
	 */
	private static double angle(VehiclepositionJMS pointS, VehiclepositionJMS pointO, VehiclepositionJMS pointM)
	{
		double om=getDistance(pointO,pointM);
		double sm=getDistance(pointS,pointM);
		double os=getDistance(pointO,pointS);
		double som = Math.acos((om*om + os*os - sm*sm)/(2.0*os*om)); 
		return Math.toDegrees(som);
	}
	
	
	private static double getDistance(VehiclepositionJMS uploadPosition, VehiclepositionJMS lastPosition) {
		double distanceAdd = Common.distance(uploadPosition.getLongitude(),
				uploadPosition.getLatitude(), lastPosition.getLongitude(), lastPosition.getLatitude());// 里程
		return distanceAdd;
	}
	
	
	
	/**
	 * 向量夹角余弦
	 * @param pointO
	 * @param pointS
	 * @param pointM
	 * @return cos∠som
	 *  AB=(b.x-a.x, b.y-a.y)  
       AC=(c.x-a.x, c.y-a.y)  
       cosA = (AB*AC)/(|AB|*|AC|)   
	 */
	private static double cos(VehiclepositionJMS pointS,VehiclepositionJMS pointO,VehiclepositionJMS pointM)
	{
		double molecule=0;
		double denominator=0;

	    double vSx=pointS.getLongitude()-pointO.getLongitude();
		double vSy=pointS.getLatitude()-pointO.getLatitude();

		double vMx=pointM.getLongitude()-pointO.getLongitude();
		double vMy=pointM.getLatitude()-pointO.getLatitude();

	    molecule=vSx*vMx+vSy*vMy;

	    denominator=(vSx*vSx+vSy*vSy)*(vMx*vMx+vMy*vMy);

		 molecule/=Math.sqrt(denominator);

		 if(molecule<-1.0){
			 molecule=-1.0;
		 }else if(molecule>1.0){
			 molecule=1.0;
		 }

		  double angle=Math.cos(molecule);
		  return angle;
	}
	
	
	public boolean valid(List<VehiclepositionJMS> orbit) {
		
		//过滤掉小于3个点的轨迹
		if (orbit.size() <3) {
			return  false;
		}
	    
		int count=0;
		
		for(int i=2;i<orbit.size();i++){
			double  d=angle(orbit.get(i-2),orbit.get(i-1),orbit.get(i));
			if(d<=angle){
				count++;
			}
		}
		
		if(count<orbit.size()/2){
			return  true;
		}else{
			return false;
		}
		
		
	}

	
	public Integer getOrder() {
		return this.order;
	}
	
	
	public void setOrder(int order) {
		this.order = order;
	}


	public void setAngle(float angle) {
		this.angle = angle;
	}
	
	
	

	
}
