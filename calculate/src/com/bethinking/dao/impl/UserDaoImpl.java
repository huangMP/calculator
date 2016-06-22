package com.bethinking.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bethinking.dao.UserDao;
import com.bethinking.model.User;

@Component("UserDao")
public class UserDaoImpl implements UserDao{
	
	private HibernateTemplate hibernateTemplate; 

	public User findByUserName(String userName) {
		List<User> list = hibernateTemplate.find("from User u where u.userName = '"+userName+"'");
		if( list.size() != 0){
			return list.get(0);
		}
		return null;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void save(User user) {
		hibernateTemplate.save(user);
	}
}
