package com.wangyueche.biz;

import com.wangyueche.bean.entity.SysOrganization;
import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.SysOrganizationVo;
import com.wangyueche.service.OrganizationService;
import com.wangyueche.service.UserService;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lyq
 */
@Component
public class OrganizationBiz {

    @Autowired
    private OrganizationService service;

    @Autowired
    private UserService userService;

    public EasyUIResult listForPage(int pageCurrent, int pageSize, String orgName, String orgLeaderName) {
        Pager pager = new Pager(pageCurrent,pageSize);
        return service.listForPage(pager, orgName, orgLeaderName);
    }

    public SysOrganizationVo query(long id) {
        SysOrganization sysOrganization = service.query(id);
        SysOrganizationVo sysOrganizationVo = new SysOrganizationVo(sysOrganization);
        SysUser sysUser = userService.query(sysOrganization.getUserId());
        sysOrganizationVo.setSysUser(sysUser);
        return sysOrganizationVo;
    }

    @Transactional
    public int save(SysOrganization sysOrganization) {
        return service.save(sysOrganization);
    }

    public int delete(long id) {
        return service.delete(id);
    }

    public int update(SysOrganization sysOrganization) {
        return service.update(sysOrganization);
    }

    public int deleteByIds(List<Long> ids) {
        return service.deleteByIds(ids);
    }

}
