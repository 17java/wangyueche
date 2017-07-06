package carMonitor;

import com.wangyueche.bean.entity.Fence;
import com.wangyueche.service.FenceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
({"/applicationContext-core.xml"}) //加载配置文件
public class FenceTest {

    @Resource
    FenceService fenceService;


    @Test
    public void testAdd() {

        Fence fence = new Fence();

        fence.setId(20);
        fence.setStatus(1);
        fence.setName("名称1");
        fence.setPurpose("用途1");
        fence.setShape(0);
        fence.setRemark("备注1");
        fenceService.update(fence);

//        fenceService.changeStatus();


    }










}
