package com.wangyueche.controller.baseinfo;

import com.wangyueche.bean.entity.Fence;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.FenceVo;
import com.wangyueche.bean.vo.StateCode;
import com.wangyueche.service.FenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * Created by zhangfei on 2017/4/25.
 * 围栏控制类
 */
@Controller
@RequestMapping(value="/fence" ,method = RequestMethod.POST)
public class FenceController {

    @Autowired
    FenceService fenceService;

    @ResponseBody
    @RequestMapping(value = "/list")
    public EasyUIResult listPages(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "rows",defaultValue = "10") int rows,Fence fence){
        EasyUIResult result = fenceService.listForPage(page, rows,fence);
        if (result != null){
            return result;
        }
        return new EasyUIResult();
    }

    @ResponseBody
    @RequestMapping(value = "/listAll")
    public List<FenceVo> listAll(){
        List<FenceVo> list = fenceService.listAll();
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/findById")
    public Fence findById(int id){
        Fence fence = fenceService.findById(id);
        return  fence;
    }

    @ResponseBody
    @RequestMapping(value = "/save")
    public int save(Fence fence){
        int result = fenceService.save(fence);
        return  result;
    }

    @ResponseBody
    @RequestMapping(value = "/update")
    public int update(Fence fence){
        int result = fenceService.update(fence);
        return  result;
    }

    @ResponseBody
    @RequestMapping(value = "/changeStatus")
    public int changeStatus(Integer id,Integer status){
        int result = fenceService.changeStatus( id,status);
        return  result;
    }

    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(@RequestParam(value = "id") Integer id) {
        Integer result = fenceService.deleteById(id);
        if (result > 0) {
            return StateCode.SUCEESS;
        }
        return StateCode.ERROR;
    }

}
