package com.wangyueche.dao;


import com.wangyueche.bean.entity.SysUser;
import java.util.List;

/**
 * Created by gaoshiwei on 2017/3/30.
 * 用户Dao
 */
public interface UserDao {
	
	SysUser selectUser(String userno, String password);

	SysUser selectByUserNo(String userno);

	int insert(SysUser user);

	int update(SysUser user);

	int deleteById(Long id);

	List<SysUser> listForPage(int pageCurrent, int pageSize, Long organizationId, String name, String staffNo,String organizationName);

	SysUser select(long id);

	SysUser selectByOrganizationId(long id);

	List<SysUser> listForId(List<Long> uidList);

	/**
	 *
	 * @param name
	 * @param equalsOrLikes true为精确查询，false为模糊查询
	 * @return
	 */
	List<SysUser> selectByName(String name, boolean equalsOrLikes);

	List<SysUser> list();

	int deleteByIds(List<Long> ids);

	/**
	 * 根据负责人姓名和邮箱查询用户
	 * @param name
	 * @param email
	 * @return
	 */
	List<SysUser> selectByNameEmail(String name, String email);
}
