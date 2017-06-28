package com.wangyueche.dao;

import com.wangyueche.bean.entity.AlarmInformations;

import java.util.List;

/**
 * Created by gaojl on 2017/6/1 8:28 .
 */
public interface AlarmInfoDao {
    List<AlarmInformations> list(Integer page, Integer rows, String type, String startDate, String endDate);
}
