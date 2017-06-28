package com.wangyueche.service.share;

import com.wangyueche.bean.vo.share.ShareOperateStat;

import java.util.List;

/**
 * Created by gaojl on 2017/5/16 16:46 .
 * 合乘营运统计信息
 */
public interface ShareOperateStatService {
    String listStat(String companyId, String startDate, String endDate);
}
