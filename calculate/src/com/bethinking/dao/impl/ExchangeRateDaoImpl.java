package com.bethinking.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bethinking.dao.ExchangeRateDao;
import com.bethinking.model.ExchangeRate;

@Component("ExchangeRateDao")
public class ExchangeRateDaoImpl implements ExchangeRateDao{
	
	private HibernateTemplate hibernateTemplate; 

	public ExchangeRate findById(int id) {
		List<ExchangeRate> list = hibernateTemplate.find("from ExchangeRate where id = "+id+"");
		if(list.size()!=0){
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

	public List<ExchangeRate> findAll() {
		return (List<ExchangeRate>) hibernateTemplate.find("from ExchangeRate where id != NULL");
	}
}
