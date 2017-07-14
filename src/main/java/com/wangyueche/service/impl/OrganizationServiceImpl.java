package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SysOrganization;
import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.bean.vo.SysOrganizationVo;
import com.wangyueche.mapper.SysOrganizationMapper;
import com.wangyueche.service.OrganizationService;
import com.wangyueche.service.UserService;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyq
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private SysOrganizationMapper mapper;

    @Autowired
    private UserService userService;

    @Override
    public SysOrganization query(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public SysOrganization queryByOrganizationName(String organizationName) {
        ArgGen argGen = new ArgGen();
        argGen.addNotEmpty("organizationName",organizationName);
        List<SysOrganization> list = mapper.select(new Pager().max().setSorts(SysOrganizationMapper.ORDERBY), argGen.getArgs());
        if (list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public int save(SysOrganization sysOrganization) {
        return mapper.insert(sysOrganization);
    }

    @Override
    public int update(SysOrganization sysOrganization) {
        return mapper.updateByPrimaryKeySelective(sysOrganization);
    }

    @Override
    public int delete(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据组织名称和组织负责人来查询 by lyq
     * @param pager
     * @param orgName
     * @param orgLeaderName
     * @return
     *
     */
    @Override
    public EasyUIResult listForPage(Pager pager, String orgName, String orgLeaderName) {
        ArgGen argGen = new ArgGen();
        argGen.addLike("orgName", orgName);

        if (StringUtils.isNotBlank(orgLeaderName)) {
            //通过负责人姓名查找用户信息
            List<SysUser> userList = userService.selectByName(orgLeaderName);
            //把符合姓名的用户的id并放入集合中
            List<Long> userIdList = new ArrayList<>();
            for(SysUser user : userList) {
                userIdList.add(user.getId());
            }
            if (userIdList.size() < 1) {
                List<SysOrganizationVo> vos = new ArrayList<>();
                return null;
            }
            if (userIdList.size() > 0) {
               // argGen.addIn("userIds", userIdList);
            }
        }

        pager.setSorts(SysOrganizationMapper.ORDERBY);
        List<SysOrganization> list = mapper.select(pager, argGen.getArgs());
        PageInfo<SysOrganization> pageInfo = new PageInfo(list);
        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }

    @Override
    public List<SysOrganization> listForId(List<Long> idList) {
        return mapper.selectByIds(idList);
    }

    @Override
    public List<SysOrganization> list() {
        ArgGen argGen = new ArgGen();
        return mapper.select(new Pager().max().setSorts(SysOrganizationMapper.ORDERBY), argGen.getArgs());
    }

    /**
     * 多选删除
     *
     * @param ids
     * @return
     */
    @Override
    public int deleteByIds(List<Long> ids) {
        ArgGen argGen = new ArgGen();
        int count = 0;
        if (!CollectionUtils.isEmpty(ids)) {
            for (long id : ids){
                if (mapper.deleteByPrimaryKey(id) == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
