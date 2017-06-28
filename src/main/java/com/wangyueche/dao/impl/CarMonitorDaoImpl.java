package com.wangyueche.dao.impl;

import com.wangyueche.bean.entity.*;
import com.wangyueche.dao.CarMonitorDao;
import com.wangyueche.mybatis.FenceMapper;
import com.wangyueche.mybatis.RegionInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by zhangfei on 2017/4/12.
 */
@Repository
public class CarMonitorDaoImpl implements CarMonitorDao {


    @Autowired
    RegionInfoMapper regionInfoMapper;


    @Autowired
    private FenceMapper fenceMapper;

//    @Resource
//    private MongoTemplate mongoTemplate;


    @Override
    public List<RegionInfo> districts(String code) {
        RegionInfoExample example = new RegionInfoExample();
        RegionInfoExample.Criteria criteria = example.createCriteria();
        if (StringUtils.hasText(String.valueOf(code))){
            criteria.andParentCodeEqualTo(code);
        }
        return regionInfoMapper.selectByExample(example);
    }

    @Override
    public int initFence(String code, String fences) {
        Fence f = new Fence();
        f.setName("合肥区县围栏");
        f.setSpots(fences);
        f.setRemark(code);
        return fenceMapper.insert(f);
    }


//    public void saveOrUpdate(Spot en) {
//        mongoTemplate.insert(en);
//    }
//
//    /**
//     * 查询某时间段的轨迹(状态列表,点列表)
//     */
//    public List<Spot> getTrack(String deviceSn, Long begin, Long end) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("deviceSn").is(deviceSn).andOperator(Criteria.where("receive").gte(begin),Criteria.where("receive").lte(end)));
//        query.with(new Sort(Sort.Direction.DESC, "receive"));
//        return mongoTemplate.find(query, Spot.class);
//    }
//
//    public List<Spot> getTrackGps(String deviceSn, Long begin, Long end) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("deviceSn").is(deviceSn).andOperator(Criteria.where("receive").gte(begin),Criteria.where("receive").lte(end)));
//        query.with(new Sort(Sort.Direction.DESC, "receive"));
//        return mongoTemplate.find(query, Spot.class);
//    }
//
//    public List<Spot> getTrackEph(String deviceSn, Long begin, Long end) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("deviceSn").is(deviceSn).andOperator(Criteria.where("receive").gte(begin),Criteria.where("receive").lte(end)));
//        query.addCriteria(Criteria.where("mode").is("E"));
//        query.with(new Sort(Sort.Direction.DESC, "receive"));
//        return mongoTemplate.find(query, Spot.class);
//    }
//
//    public List<Spot> getTrackSpeed(String deviceSn, Long begin, Long end, double speed) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("deviceSn").is(deviceSn).andOperator(Criteria.where("receive").gte(begin),Criteria.where("receive").lte(end)));
//        query.addCriteria(Criteria.where("speed").lte(speed));
//        query.with(new Sort(Sort.Direction.DESC, "receive"));
//        return mongoTemplate.find(query, Spot.class);
//    }
//
//    public void updateSpotMode(String mode, String deviceSn, Long receive) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("deviceSn").is(deviceSn));
//        query.addCriteria(Criteria.where("receive").is(receive));
//        mongoTemplate.updateFirst(query, new Update().set("mode", mode), Spot.class);
//    }
//
//    public Spot getSpot(String deviceSn, Long receive) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("deviceSn").is(deviceSn));
//        query.addCriteria(Criteria.where("receive").is(receive));
//        return mongoTemplate.findOne(query, Spot.class);
//    }
//
//    public void deleteSpot(String deviceSn, Long begin, Long end) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("deviceSn").is(deviceSn).andOperator(Criteria.where("receive").gte(begin),Criteria.where("receive").lte(end)));
//        mongoTemplate.remove(query, Spot.class);
//    }
//
//    public List<Spot> getTrackMaxSpeed(String deviceSn, Long begin, Long end) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("deviceSn").is(deviceSn).andOperator(Criteria.where("receive").gte(begin),Criteria.where("receive").lte(end)));
//        query.with(new Sort(Sort.Direction.DESC, "speed"));
//        Spot findOne = mongoTemplate.findOne(query, Spot.class);
//        if(findOne  == null){
//            return null;
//        }
//
//        query = new Query();
//        query.addCriteria(Criteria.where("deviceSn").is(deviceSn).andOperator(Criteria.where("receive").gte(begin),Criteria.where("receive").lte(end)));
//        query.addCriteria(Criteria.where("speed").is(findOne.getSpeed()));
//        return mongoTemplate.find(query, Spot.class);
//    }
//
//    public List<Spot> getCurrentSpot(String deviceSn){
//        Query query=new Query();
//        query.addCriteria(Criteria.where("deviceSn").is(deviceSn));
//        //q = new BasicQuery("{}").with(new Sort(new Sort.Order(Sort.Direction.DESC, "age"))).limit(1);
//        query.with(new Sort(Sort.Direction.DESC, "receive")).limit(1);
//        return mongoTemplate.find(query, Spot.class);
//    }
//
//
//    public double sumSpeedTest(String sn, Long begin, Long end) {
//        Criteria gte = Criteria.where("deviceSn").is(sn).andOperator(Criteria.where("receive").gte(begin),Criteria.where("receive").lte(end));
//
//        GroupOperation sum = Aggregation.group("deviceSn").sum("speed").as("speed");
//        MatchOperation match = Aggregation.match(gte);
//        Aggregation aggregation = Aggregation.newAggregation(match,sum);
//
//        AggregationResults<Spot> ar = mongoTemplate.aggregate(aggregation, "spot",Spot.class);
//        List<Spot> list = ar.getMappedResults();
//        double total = 0;
//        if (list.size() > 0) {
//            total  = list.get(0).getSpeed();
//        }
//        return total;
//    }
//
//
//    public MongoTemplate getMongoTemplate() {
//        return mongoTemplate;
//    }
//
//    public void setMongoTemplate(MongoTemplate mongoTemplate) {
//        this.mongoTemplate = mongoTemplate;
//    }




}
