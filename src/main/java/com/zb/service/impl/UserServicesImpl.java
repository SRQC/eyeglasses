package com.zb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zb.dao.UserMapper;
import com.zb.entity.User;
import com.zb.entity.UserExample;
import com.zb.service.UserServices;

@Service("userServices")
@Transactional
public class UserServicesImpl implements UserServices{
	
	@Resource
	private UserMapper userMapper;
	
	public List<User> selectByExample() {
		// TODO Auto-generated method stub
		
		UserExample example = new UserExample();
		
		return userMapper.selectByExample(example);
	}

	public int seave() {
		// TODO Auto-generated method stub
		return 0;
	}

}
