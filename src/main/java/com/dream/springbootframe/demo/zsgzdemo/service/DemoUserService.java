package com.dream.springbootframe.demo.zsgzdemo.service;

import com.dream.springbootframe.demo.zsgzdemo.entity.DemoUser;

import java.util.List;
import java.util.Map;


/**
 * 
 * @author Dream
 * 2018年1月31日
 *
 *
 */
public interface DemoUserService {

	/**
	 * 增
	 */
	int addUser(DemoUser user);
	
	/**
	 * 删
	 */
	int deleteUser(String id);
	
	/**
	 * 改
	 */
	int updateUser(DemoUser user);
	
	/**
	 * 查list
	 */
	List<Map<String, Object>> selectAllUser();
	
	/**
	 * 查find
	 */
	DemoUser selectFindOneUserByIdOrName(DemoUser user);

}