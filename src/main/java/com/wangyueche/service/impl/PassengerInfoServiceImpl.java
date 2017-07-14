package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.PassengerInfo;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.operation.PassengerInfoVo;
import com.wangyueche.mapper.PassengerInfoMapper;
import com.wangyueche.service.CompanyInfoService;
import com.wangyueche.service.PassengerInfoService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lyq
 */
@Service
public class PassengerInfoServiceImpl implements PassengerInfoService {
    @Autowired
    private PassengerInfoMapper passengerInfoMapper;
    @Autowired
    private CompanyInfoService infoService;

    @Override
    public EasyUIResult listForPage(Pager pager, String companyId, String passengerName, String passengerPhone) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("companyId",companyId)
                .addNotEmpty("passengerName",passengerName)
                .addNotEmpty("passengerPhone",passengerPhone);
        pager.setSorts(PassengerInfoMapper.ORDERBY);
        List<PassengerInfo> list = passengerInfoMapper.select(pager, argGen.getArgs());
        List<PassengerInfoVo> voList = new ArrayList<>();
        if (list.size() >0) {
            Map<String, String> map = infoService.idWithName();
            for (PassengerInfo info : list) {
                PassengerInfoVo vo = new PassengerInfoVo(info);
                vo.setCompanyName(map.get(info.getCompanyId()));
                voList.add(vo);
            }
        }
        PageInfo<PassengerInfo> pageInfo = new PageInfo<>(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(voList);
        return result;
    }
}
