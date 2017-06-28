package com.wangyueche.service;

import com.wangyueche.bean.vo.EasyUIResult;

/**
 * Created by gaojl on 2017/6/1 9:20 .
 * 报警信息
 */
public interface AlarmInfoService {
    EasyUIResult list(Integer page, Integer rows, String type, String startDate, String endDate);
}
