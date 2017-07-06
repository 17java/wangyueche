package carMonitor;

import com.wangyueche.bean.entity.Abnormalaggregation;
import com.wangyueche.service.AbnormalAggService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
({"/applicationContext-core.xml"}) //加载配置文件
public class AbbirnakAggTest {

    @Autowired
    AbnormalAggService abnormalAggService;

    @Test
    public void testAdd() {

        Abnormalaggregation a = new Abnormalaggregation();
        a.setRadius(1.12);
        a.setLng(12.12);
        a.setLat(12.33);
        a.setFirstNum(100);
        a.setSecNum(200);
        a.setThrNum(300);

        abnormalAggService.save(a);


    }










}
