package com.wangyueche.service;

import com.wangyueche.bean.entity.SysOrganization;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.Result;
import com.wangyueche.bean.vo.SysOrganizationVo;
import com.wangyueche.util.base.Page;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/20.
 */
public interface OrganizationService {

   SysOrganization query(long id);

    SysOrganization queryByOrganizationName(String organizationName);

    int save(SysOrganization sysOrganization);

    int update(SysOrganization sysOrganization);

    int delete(long id);

    List<SysOrganization> listForId(List<Long> idList);

    List<SysOrganization> list();

    EasyUIResult listForPage(int pageCurrent, int pageSize, String orgName, String orgLeaderName);

    /**
     * 多选删除
     * @param ids
     * @return
     */
    int deleteByIds(List<Long> ids);
}
