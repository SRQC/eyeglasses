package com.zb.service;

import java.util.List;

import com.zb.entity.User;
import com.zb.entity.UserExample;

public interface UserServices {
	
	List<User> selectByExample();
	
	public int seave();
}
