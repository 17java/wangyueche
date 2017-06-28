package com.wangyueche.dao.impl;

import com.github.pagehelper.PageHelper;
import com.wangyueche.bean.entity.CompanyInfoExample;
import com.wangyueche.bean.entity.SysPermission;
import com.wangyueche.bean.entity.SysPermissionExample;
import com.wangyueche.dao.PermissionDao;
import com.wangyueche.mybatis.SysPermissionMapper;
import com.wangyueche.util.base.SqlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Repository
public class PermissionDaoImpl implements PermissionDao {

	@Autowired
	private SysPermissionMapper mapper;

	@Override
	public SysPermission selectById(long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(SysPermission sysPermission) {
		Date date = new Date();
		sysPermission.setCreateTime(date);
		sysPermission.setUpdateTime(date);
		return mapper.insertSelective(sysPermission);
	}

	@Override
	public int update(SysPermission sysPermission) {
		sysPermission.setUpdateTime(new Date());
		return mapper.updateByPrimaryKeySelective(sysPermission);
	}

	@Override
	public int deleteById(long id) {
		return mapper.deleteByPrimaryKey(id);
	}

    /**
     * 新增于  2017年4月5日10:16:53 By Gaojl
     * @param pageCurrent 当前页
     * @param pageSize 页面记录数大小
     * @param permCondition 权限名称查询条件
     * @param permName 权限名称
     * @param permValue 权限值
     * @return
     */
	@Override
	public List<SysPermission> listForPage(int pageCurrent, int pageSize, String permCondition, String permName, String permValue) {
		SysPermissionExample example = new SysPermissionExample();
		SysPermissionExample.Criteria criteria= example.createCriteria();
		//如果查询权限名称
        if (StringUtils.hasText(permName)) {
			criteria.andPermissionNameLike(SqlUtil.like(permName));
        }
        //如果查询权限值
        if (StringUtils.hasText(permValue)) {
            criteria.andPermissionValueLike(SqlUtil.like(permValue));
        }
        //设置分页
        int totalCount = mapper.countByExample(example);
        pageSize = SqlUtil.checkPageSize(pageSize);
        pageCurrent = SqlUtil.checkPageCurrent(totalCount, pageSize, pageCurrent);
        int totalPage = SqlUtil.countTotalPage(totalCount, pageSize);

		PageHelper.startPage(pageCurrent, pageSize);
		//处理查询结果
        List<SysPermission> list = mapper.selectByExample(example);
        return list;
	}

    /**
     * 新增 2017-04-05 15:11:04 By Gaojl
     * 删除多选
     * @param ids
     * @return
     */
    @Override
    public int deleteByIds(List<Long> ids) {
        SysPermissionExample example = new SysPermissionExample();
        SysPermissionExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return mapper.deleteByExample(example);
    }

    @Override
	public List<SysPermission> listForId(List<Long> idList) {
		SysPermissionExample example = new SysPermissionExample();
		SysPermissionExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(idList);
		return mapper.selectByExample(example);
	}

	@Override
	public List<SysPermission> list() {
		SysPermissionExample example = new SysPermissionExample();
		return mapper.selectByExample(example);
	}

	@Override
	public List<SysPermission> listByUserId(Long userId) {
		return mapper.selectByUserId(userId);
	}

	/**
	 * 根据父节点查询权限
	 *
	 * @param parentId
	 * @return
	 */
	@Override
	public List<SysPermission> slectByParentId(Long parentId) {
		SysPermissionExample example = new SysPermissionExample();
		SysPermissionExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<SysPermission> list = mapper.selectByExample(example);
		return list;
	}
}
