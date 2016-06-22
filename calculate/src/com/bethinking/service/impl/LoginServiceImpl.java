package com.bethinking.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bethinking.dao.UserDao;
import com.bethinking.model.User;
import com.bethinking.service.LoginService;

@Component("LoginService")
public class LoginServiceImpl implements LoginService{

	private UserDao userDao;
	
	public User findByUserName(String userName) {
		User user = userDao.findByUserName(userName);
		if(user != null){
			return user;
		}
		return null;
	}

	public UserDao getUserDao() {
		return userDao;
	}
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void saveUser(User user) {
		userDao.save(user);
	}
	
}
