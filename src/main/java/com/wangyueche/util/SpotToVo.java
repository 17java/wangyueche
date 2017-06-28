package com.wangyueche.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.bean.vo.SpotAddrVo;
import com.wangyueche.bean.vo.VehiclepositionJMS;


public class SpotToVo{
	
	public static List<Map<String, Object>> listSav(List<List<VehiclepositionJMS>> rsPart) {
		List<Map<String, Object>> rsPartBeginEnd = new ArrayList<Map<String, Object>>();
		for (List<VehiclepositionJMS> list2 : rsPart) {
			Map<String, Object> line = new HashMap<String,Object>();
			List<SpotAddrVo> beginEnd = new ArrayList<SpotAddrVo>();
			SpotAddrVo sav1 = SpotToVo.spot2Vo(list2.get(0));
			beginEnd.add(sav1);
			SpotAddrVo sav2 = SpotToVo.spot2Vo(list2.get(list2.size() - 1));
			beginEnd.add(sav2);
			double distance = SpotToWeb.getPartDistance(list2);
			line.put("distance", Common.round(distance, 1));
			line.put("unit", "公里");
			line.put("states", beginEnd);
			rsPartBeginEnd.add(line);
		}
		return rsPartBeginEnd;
	}
	
	public static List<List<SpotAddrVo>> listSavOld(List<List<VehiclepositionJMS>> rsPart) {
		List<List<SpotAddrVo>> rsPartBeginEnd = new ArrayList<List<SpotAddrVo>>();
		for (List<VehiclepositionJMS> list2 : rsPart) {
			List<SpotAddrVo> beginEnd = new ArrayList<SpotAddrVo>();
			SpotAddrVo sav1 = SpotToVo.spot2Vo(list2.get(0));
			beginEnd.add(sav1);
			SpotAddrVo sav2 = SpotToVo.spot2Vo(list2.get(list2.size() - 1));
			beginEnd.add(sav2);
			rsPartBeginEnd.add(beginEnd);
		}
		return rsPartBeginEnd;
	}

	public static List<List<VehiclePosition>> listSopt(List<List<VehiclePosition>> rsPart) {
		List<List<VehiclePosition>> rsPartBeginEnd = new ArrayList<List<VehiclePosition>>();
		for (List<VehiclePosition> list2 : rsPart) {
			List<VehiclePosition> beginEnd = new ArrayList<VehiclePosition>();
			beginEnd.add(list2.get(0));
			beginEnd.add(list2.get(list2.size() - 1));
			rsPartBeginEnd.add(beginEnd);
		}
		return rsPartBeginEnd;
	}
	
	public static SpotAddrVo spot2Vo(VehiclepositionJMS spot) {
		SpotAddrVo sav = new SpotAddrVo();
		String addr ="";
		if(Language.en_US.equals(LanguageUtil.get())){
//			addr = GeoMapUtil.getAddrByGoogle(spot.getLongitude(),spot.getLatitude(), null);
		}else{
//			addr = GeoMapUtil.getAddrByBaidu(spot.getLongitude(), spot.getLatitude());
		}
		sav.setAddr(addr);
		sav.setLat(spot.getLatitude());
		sav.setLng(spot.getLongitude());
		sav.setReceive(spot.getPositionTime());
		return sav;
	}




}
