package carMonitor;

import com.wangyueche.bean.entity.VehiclePosition;
import com.wangyueche.service.cache.PositionCache;
import com.wangyueche.util.JsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangfei on 2017/4/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
        ({"/applicationContext-core.xml"}) //加载配置文件
public class CacheTest {


     @Autowired
     PositionCache positionCache;


    @Test
    public void testAdd() {
        Map<String, String> map = new HashMap<String, String>();

        VehiclePosition v = new VehiclePosition();
        v.setCompanyId("123");
        v.setVehicleNo("京A256987");
        map.put("京A256987",JsonUtil.obj2Str(v));
        positionCache.setPosition("000001",map);

        Map<String, VehiclePosition> res = positionCache.getPositionByCode("000001");



        System.out.println("-------------------------------------"+positionCache.getPosition("000001","京A256987"));
    }

}
