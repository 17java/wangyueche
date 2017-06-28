package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SysOrganization;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.SysOrganizationVo;
import com.wangyueche.service.OrganizationService;
import com.wangyueche.dao.OrganizationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/20.
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationDao dao;

    @Override
    public SysOrganization query(long id) {
        return dao.selectById(id);
    }

    @Override
    public SysOrganization queryByOrganizationName(String organizationName) {
        return dao.selectByOrganizationName(organizationName);
    }

    @Override
    public int save(SysOrganization sysOrganization) {
        return dao.insert(sysOrganization);
    }

    @Override
    public int update(SysOrganization sysOrganization) {
        return dao.update(sysOrganization);
    }

    @Override
    public int delete(long id) {
        return dao.deleteById(id);
    }

   /* @Override
    public Result<Page<SysOrganization>> listForPage(int pageCurrent, int pageSize, String date, String search) {
        Result<Page<SysOrganization>> result = new Result<>();
        if (pageCurrent < 1){
            result.setErrMsg("pageCurrent有误");
            return result;
        }
        if (pageSize < 1){
            result.setErrMsg("pageSize有误");
            return result;
        }
        Page<SysOrganization> resultData = dao.listForPage(pageCurrent,pageSize,date,search);
        result.setErrCode(0);
        result.setStatus(true);
        result.setErrMsg("查询成功");
        result.setResultData(resultData);
        return result;
    }*/

    /**
     * 根据组织名称和组织负责人来查询 by Gaojl 2017-04-06 07:26:59
     * @param pageCurrent
     * @param pageSize
     * @param orgName
     * @param orgLeaderName
     * @return
     *
     */
    @Override
    public EasyUIResult listForPage(int pageCurrent, int pageSize, String orgName, String orgLeaderName) {
        List<SysOrganizationVo> list = dao.listForPage(pageCurrent, pageSize, orgName, orgLeaderName);
        PageInfo<SysOrganizationVo> pageInfo = new PageInfo<>(list);

        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }

    @Override
    public List<SysOrganization> listForId(List<Long> idList) {
        return dao.listForId(idList);
    }

    @Override
    public List<SysOrganization> list() {
        return dao.list();
    }

    /**
     * 多选删除
     *
     * @param ids
     * @return
     */
    @Override
    public int deleteByIds(List<Long> ids) {
        return dao.deletByIds(ids);
    }
}
