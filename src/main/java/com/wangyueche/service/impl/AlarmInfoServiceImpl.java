package com.wangyueche.service.impl;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.service.AlarmInfoService;
import org.springframework.stereotype.Service;

/**
 * Created by lyq
 * 告警信息列表展示
 */
@Service
public class AlarmInfoServiceImpl implements AlarmInfoService {
    //@Autowired
    //private AlarmInfoDao dao;

    @Override
    public EasyUIResult list(Integer page, Integer rows, String type, String startDate, String endDate) {
       /* List<AlarmInformations> list = dao.list(page, rows, type, startDate, endDate);
        EasyUIResult result = new EasyUIResult();
        PageInfo<AlarmInformations> pageInfo = new PageInfo<>(list);
        result.setRows(pageInfo.getList());
        result.setTotal(pageInfo.getTotal());
        return result;*/
        return null;
    }
}
