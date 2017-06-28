package com.wangyueche.service.mongodb;

import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.bean.vo.Spot;
import com.wangyueche.bean.vo.VehiclepositionJMS;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class SpotMongoDao{

	@Resource
	private MongoTemplate mongoTemplate;

	public void saveOrUpdate(Spot en) {
		try {
			mongoTemplate.insert(en);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateStayTime(int stayed, String deviceSn, Long time) {
		Query query = new Query();
		query.addCriteria(Criteria.where("deviceSn").is(deviceSn));
		query.addCriteria(Criteria.where("receive").is(time));
		mongoTemplate.updateFirst(query, new Update().set("stayed", stayed), Spot.class);
	}

	public List<Spot> listByTime(String deviceSn, long start) {
		Query query = new Query();
		query.addCriteria(Criteria.where("deviceSn").is(deviceSn));
		query.addCriteria(Criteria.where("receive").gte(start));
		query.with(new Sort(Direction.ASC, "receive"));
		return mongoTemplate.find(query, Spot.class);
	}
	
	public List<VehiclePosition> findCellByTime(String deviceSn, Long start) {
		Query query = new Query();
		query.addCriteria(Criteria.where("vehicleNo").is("d"));
		return mongoTemplate.find(query, VehiclePosition.class);
	}

	//根据车牌号 从mongodb查定位信息
	public List<VehiclepositionJMS> findPositionByVehicleNo(String vehicleNo, Long begin, Long end) {
		Query query = new Query();
		System.out.println("vehicleNo===============》"+vehicleNo);
//		query.addCriteria(Criteria.where("vehicleNo").is(vehicleNo));
		query.addCriteria(Criteria.where("vehicleNo").is(vehicleNo).andOperator(Criteria.where("positionTime").gte(begin),Criteria.where("positionTime").lte(end)));
//		query.with(new Sort(Direction.DESC, "positionTime"));
		return mongoTemplate.find(query, VehiclepositionJMS.class);
	}

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public void delete(String deviceSn, Long start, Long end) {
		Query query = new Query();
		query.addCriteria(Criteria.where("deviceSn").is(deviceSn).andOperator(Criteria.where("receive").gte(start),Criteria.where("receive").lte(end)));
		mongoTemplate.remove(query, Spot.class);
	}


}
