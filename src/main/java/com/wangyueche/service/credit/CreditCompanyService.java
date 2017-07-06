package com.wangyueche.service.credit;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

/**
 * Created by lyq
 * 企业征信
 */
public interface CreditCompanyService {
    EasyUIResult list(Pager pager, String companyId);

    String showStarStat();

    String showSatisStat();
}
