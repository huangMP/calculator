package com.bethinking.dao;

import com.bethinking.model.User;

public interface UserDao {
	public User findByUserName(String userName);

	public void save(User user);
}
