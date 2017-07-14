package com.wangyueche.service.impl;

import com.github.pagehelper.PageInfo;
import com.wangyueche.bean.entity.SysUser;
import com.wangyueche.bean.vo.EasyUIResult;
import com.wangyueche.mapper.SysUserMapper;
import com.wangyueche.service.UserService;
import com.wangyueche.util.Base64Util;
import com.wangyueche.util.page.ArgGen;
import com.wangyueche.util.page.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser login(String userno, String password) {
        ArgGen args = new ArgGen();
        args.addNotEmpty("userno", userno)
                .addNotEmpty("password", Base64Util.encrypt(password));
        Pager pager = new Pager();
        pager.setSorts(SysUserMapper.ORDERBY);
        List<SysUser> result = sysUserMapper.select(pager, args.getArgs());
        if (result.size() > 0) {
            SysUser user = result.get(0);
            user.setPassword(password);
            return user;
        }
        return null;
    }

    @Override
    public SysUser queryByUserNo(String userno) {
        ArgGen args = new ArgGen();
        args.add("userno", userno);
        List<SysUser> result = sysUserMapper.select(new Pager().setSorts(SysUserMapper.ORDERBY), args.getArgs());
        if (result.size() > 0) {
            return result.get(0);
        }
        return null;
    }

    @Override
    public int save(SysUser sysUser) {
        ArgGen args = new ArgGen();
        args.add("userno", sysUser.getUserNo());
        List<SysUser> result = sysUserMapper.select(new Pager().setSorts(SysUserMapper.ORDERBY), args.getArgs());
        SysUser user = null;
        if (result.size() > 0) {
            user = result.get(0);
        }
        int resultNum = -1;
        if (user == null) {
            Date date = new Date();
            String password = Base64Util.encrypt(sysUser.getPassword());
            sysUser.setPassword(password);
            sysUser.setCreateTime(date);
            sysUser.setUpdateTime(date);
            resultNum = sysUserMapper.insert(sysUser);
        }
        return resultNum;
    }

    @Override
    public int update(SysUser sysUser) {
        sysUser.setUpdateTime(new Date());
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public int delete(long id) {
        int resultNum = sysUserMapper.deleteByPrimaryKey(id);
        return resultNum;
    }

    @Override
    public SysUser queryByOrganizationId(long organizationId) {
        ArgGen args = new ArgGen();
        args.add("organizationId", organizationId);
        List<SysUser> list = sysUserMapper.select(new Pager(), args.getArgs());
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public EasyUIResult listForPage(Pager pager, Long organizationId, String name, String staffNo, String organizationName) {
        ArgGen args = new ArgGen();
        args.addPositive("organizationId", organizationId)
                .addNotEmpty("name", name)
                .addNotEmpty("staffNo", staffNo)
                .addNotEmpty("organizationName", organizationName);
        List<SysUser> list = sysUserMapper.select(pager.setSorts(SysUserMapper.ORDERBY), args.getArgs());

        PageInfo<SysUser> pageInfo = new PageInfo<>(list);

        EasyUIResult result = new EasyUIResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(pageInfo.getList());
        return result;
    }

    @Override
    public SysUser query(long id) {
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(id);
        return sysUser;
    }

    @Override
    public List<SysUser> listForId(List<Long> uidList) {
        return sysUserMapper.selectByIds(uidList);
    }

    @Override
    public List<SysUser> selectByName(String name) {
        ArgGen args = new ArgGen();
        args.add("name", name);
        List<SysUser> list = sysUserMapper.select(new Pager(), args.getArgs());
        return list;
    }

    @Override
    public List<SysUser> list() {
        ArgGen args = new ArgGen();
        List<SysUser> list = sysUserMapper.select(new Pager(), args.getArgs());
        return list;
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        int count = 0;
        for (Long id : ids) {
            int num = sysUserMapper.deleteByPrimaryKey(id);
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    /**
     * 根据负责人姓名和邮箱查询负责人
     *
     * @param name
     * @param email
     * @return
     */
    @Override
    public List<SysUser> selectByNameEmail(String name, String email) {
        ArgGen args = new ArgGen();
        args.add("name", name)
                .add("email", email);
        List<SysUser> list = sysUserMapper.select(new Pager(), args.getArgs());
        return list;
    }
}
