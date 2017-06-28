package com.wangyueche.biz;

import com.wangyueche.bean.entity.SysOrganization;
import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.SysOrganizationVo;
import com.wangyueche.service.OrganizationService;
import com.wangyueche.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/20.
 */
@Component
public class OrganizationBiz {

    @Autowired
    private OrganizationService service;

    @Autowired
    private UserService userService;

    public EasyUIResult listForPage(int pageCurrent, int pageSize, String orgName, String orgLeaderName) {
        /*Result<Page<SysOrganizationVo>> resultVo = new Result<>();
        Result<Page<SysOrganization>> result = service.listForPage(pageCurrent,pageSize,date,search);
        if (result.isStatus()){
            ArrayList<SysOrganizationVo> resultData = new ArrayList<>();
            SysOrganizationVo sysOrganizationVo;
            for (SysOrganization sysOrganization : result.getResultData().getList()){
                sysOrganizationVo = new SysOrganizationVo(sysOrganization);
                Result<SysUser> resultUser = userService.query(sysOrganization.getUserId());
                if (resultUser.isStatus()){
                    sysOrganizationVo.setSysUser(resultUser.getResultData());
                }
                resultData.add(sysOrganizationVo);
            }
            Page<SysOrganizationVo> page = new Page<>(result.getResultData().getTotalCount(),result.getResultData().getTotalPage(),result.getResultData().getPageCurrent(),result.getResultData().getPageSize(),resultData);
            resultVo.setErrCode(0);
            resultVo.setStatus(true);
            resultVo.setErrMsg("查询成功");
            resultVo.setResultData(page);
            return resultVo;
        }
        return resultVo;*/
        return service.listForPage(pageCurrent, pageSize, orgName, orgLeaderName);
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
