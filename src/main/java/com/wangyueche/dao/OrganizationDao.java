package com.wangyueche.dao;

import com.wangyueche.bean.entity.SysOrganization;
import com.wangyueche.bean.vo.SysOrganizationVo;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/20.
 */
public interface OrganizationDao {

    SysOrganization selectById(long id);

    SysOrganization selectByOrganizationName(String organizationName);

    int insert(SysOrganization sysOrganization);

    int update(SysOrganization sysOrganization);

    int deleteById(long id);

    List<SysOrganization> listForId(List<Long> idList);

    List<SysOrganization> list();

    List<SysOrganizationVo> listForPage(int pageCurrent, int pageSize, String orgName, String orgLeaderName);

    /**
     * 根据多个ID删除数据 Gaojl 2017-04-06 14:19:15
     * @param ids
     * @return
     */
    int deletByIds(List<Long> ids);

}
