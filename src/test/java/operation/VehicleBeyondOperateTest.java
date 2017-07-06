package operation;

import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.dao.VehicleBeyondOperateDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by gaojl on 2017/5/10 9:36 .
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-core.xml")
public class VehicleBeyondOperateTest {
    @Autowired
    private VehicleBeyondOperateDao dao;

    @Test
    public void listTest() {//测试分页
        List<OperateDepartArrive> list = dao.list(1, 20, "", null, null);
        System.out.println(list.get(0).getCompanyId());
    }
}
