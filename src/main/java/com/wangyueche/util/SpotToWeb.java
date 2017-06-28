package com.wangyueche.util;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.bean.vo.VehiclepositionJMS;
import com.wangyueche.service.OrbitFilterFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpotToWeb {

	private static Logger logger = LoggerFactory.getLogger(SpotToWeb.class);

	private final static int cutSecondLength = 1200000;// 分段时间间隔
														// 20分钟*60*1000=1200000
	private final static int mincutSecondLength = 600000;// 最小分段时间间隔 5分钟
															//
	private final static int cutDistanceLength = 2000;// 分段距离

	private final static int[] car = new int[] { 30, 60, 100 };

	private final static int[] person = new int[] { 5, 15, 40 };

	/**
	 * 分段 进入数据倒序(大->小)
	 */
	public static List<List<VehiclepositionJMS>> getPartList(List<VehiclepositionJMS> listAll) {
		List<List<VehiclepositionJMS>> rs = new ArrayList<List<VehiclepositionJMS>>();
		List<VehiclepositionJMS> listLast = null;// 最后一段
		VehiclepositionJMS last = null;// 最后一段 的 最后一点
		double lastDistance = 0;
		for (VehiclepositionJMS vehiclePosition : listAll) {
			double thisDistance = 0;
			if (last != null) {
				thisDistance = getDistance(vehiclePosition, last);
			}

			if (last == null || Math.abs(vehiclePosition.getPositionTime() - last.getPositionTime()) > cutSecondLength
					|| (Math.abs(vehiclePosition.getPositionTime() - last.getPositionTime()) > mincutSecondLength && lastDistance > 3
							&& thisDistance > cutDistanceLength && thisDistance > lastDistance * 6)) {
				List<VehiclepositionJMS> listNew = new ArrayList<VehiclepositionJMS>();// 新开一段
				listNew.add(vehiclePosition);

				listLast = listNew;
				rs.add(listNew);
				lastDistance = 0;
			} else {
				listLast.add(vehiclePosition);
				lastDistance = thisDistance;
			}
			last = vehiclePosition;
		}

		OrbitFilterFactory.carFilter(rs);
		return rs;
	}

	public static double getDistance(VehiclepositionJMS uploadPosition, VehiclepositionJMS lastPosition) {
		double distanceAdd = Common.distance(uploadPosition.getLongitude(), uploadPosition.getLatitude(), lastPosition.getLongitude(), lastPosition.getLatitude());// 里程
		return distanceAdd;
	}

	// --------------------------------------------------------------

	/**
	 * 获取每一段的里程，实时计算 数据量大会稀释数据
	 * 
	 * @param list
	 * @return 公里
	 */
	public static double getPartDistance(List<VehiclepositionJMS> list) {
		double ret = 0D;
		int maxPoint = 10 * 60 * 12; // 一段允许的最大数据（按10小时，5S一个点计算）
		int step = 1;
		int maxIndex = list.size() - 1;
		if (list.size() > maxPoint) {
			step = (int) Math.floor(list.size() / maxPoint);
			maxIndex = maxPoint * step;
		}
		VehiclepositionJMS lastVehiclePosition = list.get(0);
		for (int i = step; i <= maxIndex; i += step) {
			VehiclepositionJMS vehiclePosition = list.get(i);
			// if ("A".equals(VehiclePosition.getMode())) {
			ret += getDistance(vehiclePosition, lastVehiclePosition);
			lastVehiclePosition = vehiclePosition;
			// }
		}
		// 不够一个步长的数据
		if (maxIndex < list.size() - 1) {
			for (int i = maxIndex + 1; i < list.size(); i++) {
				VehiclepositionJMS vehiclePosition = list.get(i);
				// if ("A".equals(VehiclePosition.getMode())) {
				ret += getDistance(vehiclePosition, list.get(i - 1));
				// }
			}
		}
		ret = Common.round(ret / 1000, 2);
		return ret;
	}

	/**
	 * 获取每一段的停留时间
	 * 
	 * @param
	 * @return
	 */
//	public static double getPartStay(List<VehiclePosition> list) {
//		double ret = 0D;
//		for (VehiclePosition vehiclePosition : list) {
//			Integer stayed = vehiclePosition.getStayed();
//			if (null != stayed) {
//				ret += stayed;
//			}
//		}
//
//		return ret;
//	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.000");
	}

	// --------------------------------------------------------------
}
