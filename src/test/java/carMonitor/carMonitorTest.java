package carMonitor;

import com.wangyueche.bean.entity.DriverPosition;
import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.bean.vo.DistrictsVo;
import com.wangyueche.bean.vo.PositionVo;
import com.wangyueche.bean.vo.Result;
import com.wangyueche.service.CarMonitorService;
import com.wangyueche.service.mongodb.SpotMongoDao;
import com.wangyueche.util.JsonUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
({"/applicationContext-core.xml"}) //加载配置文件
public class carMonitorTest {

    @Resource
    private SpotMongoDao spotMongoDao;

    @Autowired
    CarMonitorService carMonitorService;

    @Test
    public void testAdd() {


//        List<VehiclePosition> list =  spotMongoDao.findCellByTime("012345678900002",Long.parseLong("1487240006460"));
//        System.out.println("list============>"+list.size());
    	
    	
    	
//聚合县
    	
//    	for(int i =0;i<10;i++){
    		
//    		Map<String,List<DistrictsVo>>districts = carMonitorService.districts("340100","");
//        	for (Entry<String, List<DistrictsVo>> entry : districts.entrySet()) {
//                System.out.println("districts===================>"+entry.getKey()+entry.getValue());
//                for(DistrictsVo vo : entry.getValue()){
//                	System.out.println(vo.getAdcode()+"car--"+vo.getCarNum()+"driver--"+vo.getDriverNum()+"order--"+vo.getOrderNum());
//                }
//                
//            }
    		
    		
//    	}
    	
    	
    	
//县车辆s
//    	Map<String,List<PositionVo>>  carDistricts = carMonitorService.carDistricts("340104");
//    	for (Entry<String, List<PositionVo>> entry : carDistricts.entrySet()) {
//    		 System.out.println("carDistricts===================>"+entry.getKey()+entry.getValue());
//             for(PositionVo vo : entry.getValue()){
//             	System.out.println(vo.getVehicleNo()+"positions====>"+vo.getPosition());
//             }
//	    }
    	

//车辆实时定位
//    	PositionVo v = carMonitorService.position("340104","皖AS7P19");
//    	System.out.println("车辆实时定位==========>"+v.getVehicleNo()+v.getPosition().getLat()+v.getPosition().getDriverName());
//    	
//    	
//
//        Map<String, Object> getPark =  carMonitorService.getPark("皖AS7P19", "1391874742", "1791875743");   
//        for(Entry<String, Object> entry : getPark.entrySet()){
//        	System.out.println("getPark===================>"+entry.getValue());
//        }
        
        Map<String, Object> getTrack = carMonitorService.getTrack("皖AS7P19", "1391874742", "1791875743","1");  

        for(Entry<String, Object> entry : getTrack.entrySet()){
        	System.out.println("getTrack===================>"+entry.getValue());
        }
        
        
    }










}
