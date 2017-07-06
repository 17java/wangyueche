package com.wangyueche.service.share;

import com.wangyueche.bean.vo.share.ShareOperateStat;

import java.util.List;

/**
 * Created by lyq
 * 合乘营运统计信息
 */
public interface ShareOperateStatService {
    String listStat(String companyId, String startDate, String endDate);
}
