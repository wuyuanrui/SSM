package com.wyr.service.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wyr.mapper.UserMapper;
import com.wyr.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	
	@Override
	
	public void add(String name) {
		userMapper.add(name);
		int i=1/0;//业务层出错了
		System.out.println("OK");
	}

}
