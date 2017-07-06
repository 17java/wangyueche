package operation;

import com.wangyueche.service.statistics.VehicleOrderTakingSerivce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gaojl on 2017/5/11 9:39 .
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-core.xml")
public class VehicleOrderTakingTest {
    @Autowired
    private VehicleOrderTakingSerivce serivce;

    @Test
    public void listBarTest() {
        serivce.listBarStat("", null, null,"bar");
    }
}
