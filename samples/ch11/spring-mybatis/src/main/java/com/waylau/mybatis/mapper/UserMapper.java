/**
 * Welcome to https://waylau.com
 */
package com.waylau.mybatis.mapper;

import com.waylau.mybatis.domain.User;

/**
 * User Mapper.
 * 
 * @since 1.0.0 2018年12月19日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface UserMapper {
	
	int createUser(User user);
	
	User getUser(Long userId);

	int updateUser(User user);

}
