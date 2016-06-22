package com.bethinking.service;

import com.bethinking.model.User;

public interface LoginService {
	
	public User findByUserName(String userName);
	public void saveUser(User user);

}
