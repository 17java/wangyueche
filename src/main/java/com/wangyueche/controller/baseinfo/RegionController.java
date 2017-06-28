package com.wangyueche.controller.baseinfo;

import com.wangyueche.bean.entity.RegionInfo;
import com.wangyueche.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by gaojl on 2017/4/22 22:45
 * 查找区域代码
 * @author gaojl
 */
@Controller
@RequestMapping(value = "/region",method = RequestMethod.GET)
public class RegionController {
    @Autowired
    private RegionService service;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<RegionInfo> list() {
        //340100 合肥市区域编码
        return service.listForCode("340100");
    }

}
