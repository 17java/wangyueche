package com.wangyueche.controller.baseinfo;

import java.util.List;

import com.wangyueche.bean.vo.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangyueche.bean.entity.Abnormalaggregation;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.baseinfo.AbnormalagVo;
import com.wangyueche.service.AbnormalAggService;

/**
 * Created by zhangfei on 2017/4/26.
 * 异常聚集报警
 */
@Controller
@RequestMapping(value = "/abnormal",method = RequestMethod.POST)
public class AbnormalAggController {

    @Autowired
    AbnormalAggService abnormalAggService;

    @ResponseBody
    @RequestMapping(value = "/list")
    public EasyUIResult listPages(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "rows",defaultValue = "10") int rows, Abnormalaggregation abnormalaggregation){
        EasyUIResult result = abnormalAggService.listForPage(page, rows,abnormalaggregation);
        if (result != null){
            return result;
        }
        return new EasyUIResult();
    }

    @ResponseBody
    @RequestMapping(value = "/listAll")
    public List<Abnormalaggregation> listAll(){
        List<Abnormalaggregation> list = abnormalAggService.listAll();
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/findById")
    public Abnormalaggregation findById(int id){
        Abnormalaggregation fence = abnormalAggService.findById(id);
        return  fence;
    }

    @ResponseBody
    @RequestMapping(value = "/save")
    public int save(Abnormalaggregation abnormalaggregation){
        int result = abnormalAggService.save(abnormalaggregation);
        return  result;
    }

    @ResponseBody
    @RequestMapping(value = "/update")
    public int update(Abnormalaggregation abnormalaggregation){
        int result = abnormalAggService.update(abnormalaggregation);
        return  result;
    }

    //删除传状态位为0
    @ResponseBody
    @RequestMapping(value = "/changeStatus")
    public int changeStatus(Integer id,Integer status){
        int result = abnormalAggService.changeStatus( id,status);
        return  result;
    }

    //鼠标放到围栏显示，车辆数和报警级别
    @ResponseBody
    @RequestMapping(value = "/getNum")
    public List<AbnormalagVo> getNum(){
        List<AbnormalagVo> vos  = abnormalAggService.getNum();
        return  vos;
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public String delete(Integer id) {
        Integer result = abnormalAggService.deleteById(id);
        if (result > 0) {
            return StateCode.SUCEESS;
        }
        return StateCode.ERROR;
    }

}
