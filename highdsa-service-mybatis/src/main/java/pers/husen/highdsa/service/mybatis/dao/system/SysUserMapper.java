package pers.husen.highdsa.service.mybatis.dao.system;

import java.util.List;

import pers.husen.highdsa.common.entity.po.system.SysUser;

/**
 * @Desc 系统 用户 SQL映射
 *
 * @Author 何明胜
 *
 * @Created at 2018年3月29日 下午3:19:33
 * 
 * @Version 1.0.8
 */
public interface SysUserMapper {
	/**
	 * 根据主键删除
	 * 
	 * @param userId
	 * @return
	 */
	int deleteByPrimaryKey(Long userId);

	/**
	 * 插入新的用户
	 * 
	 * @param sysUser
	 * @return
	 */
	int insert(SysUser sysUser);

	/**
	 * 根据id查询
	 * 
	 * @param userId
	 * @return
	 */
	SysUser selectUserByUserId(Long userId);

	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	List<SysUser> selectAll();

	/**
	 * 根据userId更新记录
	 * 
	 * @param sysUser
	 * @return
	 */
	int updateByUserId(SysUser sysUser);

	/**
	 * 根据用户名查找用户信息
	 * 
	 * @param userName
	 * @return
	 */
	SysUser selectUserByUserName(String userName);

	/**
	 * 根据用户名查找角色集合
	 * 
	 * @param userName
	 * @return
	 */
	SysUser selectRolesByUserName(String userName);

	/**
	 * 根据用户名查找权限集合
	 * 
	 * @param userName
	 * @return
	 */
	SysUser selectPermissionsByUserName(String userName);
}