package statistics;

import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.bean.entity.OrderInfo;
import com.wangyueche.bean.entity.OrderInfoExample;
import com.wangyueche.bean.vo.statistics.OrderStatVo;
import com.wangyueche.mybatis.OperateDepartArriveMapper;
import com.wangyueche.mybatis.OrderInfoMapper;
import com.wangyueche.mapper.OrderStatVoMapper;
import com.wangyueche.service.statistics.OrderStatService;
import com.wangyueche.util.JsonUtil;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by gaojl on 2017/5/11 18:09 .
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-core.xml")
public class OrderInfoStatTest {
    @Autowired
    private OrderStatService service;

    @Autowired
    private OrderStatVoMapper mapper;

    //@Autowired
    //private OperateDepartArriveMapper arriveMapper;

    //@Autowired
    //private OrderInfoMapper orderInfoMapper;

    @Test
    public void listIndexInfoTest() {
        service.listIndexInfo();
    }

    @Test
    public void listtest() {
       // OperateDepartArrive a = arriveMapper.selectByPrimaryKey(273);
        //System.out.println(JsonUtil.toJson(a));

    }

    @Test
    public void pwd() {
        OrderInfoExample example = new OrderInfoExample();
        OrderInfoExample.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo("jahah");
       // List<OrderInfo> list = orderInfoMapper.selectByExample(example);
        //System.out.println(list.size() < 1);
    }
}
