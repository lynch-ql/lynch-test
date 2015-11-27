package com.tsinghuabigdata.service;

import com.tsinghuabigdata.model.User;
/**
 * @Title: UserService.java
 * @Package com.tsinghuabigdata.service
 * @Description: 用户管理
 * @author wanglin@tsinghuabigdata.com
 * @date 2015-11-20
 */
public interface UserService {
	/**
	 * @Description: 注册新用户 
	 * @return void  
	 * @throws
	 * @author wanglin@tsinghuabigdata.com
	 * @date 2015-11-20
	 */
	boolean registerUser(User user);
	
	/**
	 * @Description: 更新用户 
	 * @return boolean  
	 * @throws
	 * @author wanglin@tsinghuabigdata.com
	 * @date 2015-11-20
	 */
	boolean updateUser(User user);
}
