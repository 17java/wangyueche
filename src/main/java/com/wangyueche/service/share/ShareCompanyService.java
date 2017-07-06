package com.wangyueche.service.share;

import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.util.page.Pager;

import java.util.Map;

/**
 * Created by lyq
 * 合乘公司信息
 */
public interface ShareCompanyService {

    EasyUIResult findListByCriteria(Pager pager, String companyId, Integer state);

    Map listCompanyNames();
}
