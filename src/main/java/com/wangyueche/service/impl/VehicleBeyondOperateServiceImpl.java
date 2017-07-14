package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.OperateDepartArrive;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.OperatePayVo;
import com.wangyueche.mapper.VehicleBeyondOperateMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.VehicleBeyondOperateService;
import com.wangyueche.util.DateUtil;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by lyq
 */
@Service
public class VehicleBeyondOperateServiceImpl implements VehicleBeyondOperateService {
    @Autowired
    private VehicleBeyondOperateMapper vehicleBeyondOperateMapper;

    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult list(Pager pager, String vehicleNo, String startDate, String endDate) {
        pager.setSorts(VehicleBeyondOperateMapper.ORDERBY);
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("vehicleNo", vehicleNo)
                .add("state", " begin_beyond_operate = 1 OR end_beyond_operate = 1 ");
        Long start = null;
        Long end = null;
        if (StringUtils.hasText(startDate) && StringUtils.hasText(endDate)) {
            String dateFormat = "yyyy-MM-dd HH:mm:ss";
            String numFormat = "yyyyMMddHHmmss";
            start = DateUtil.parseString(startDate, dateFormat, numFormat);
            end = DateUtil.parseString(endDate, dateFormat, numFormat);
            if (null != start && null != end){
                argGen.add("timeCon"," order_match_time between "+start+" and "+end);
            }
        }
        List<OperateDepartArrive> list = vehicleBeyondOperateMapper.list(pager, argGen.getArgs());
        List<OperatePayVo> voList = new ArrayList<>();
        if (list.size() > 0) {
            Map<String, String> map = infoService.idWithName();
            for (OperateDepartArrive info : list) {
                OperatePayVo vo = new OperatePayVo(info);
                vo.setCompanyName(map.get(info.getCompanyId()));
                voList.add(vo);
            }
        }

        PageInfo<OperateDepartArrive> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setRows(voList);
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}
