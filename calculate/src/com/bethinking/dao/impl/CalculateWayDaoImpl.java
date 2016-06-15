package com.bethinking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bethinking.model.CalculateBlock;
import com.bethinking.model.CalculateWay;
import com. bethinking.model.Record;
import com.bethinking.dao.CalculateWayDao;
import com. bethinking.dao.RecordDao;

@Component("CalculateWayDao")
public class CalculateWayDaoImpl implements CalculateWayDao{
	
	private HibernateTemplate hibernateTemplate; 

	/*
	 *	查询指定数据的Id
	 */
	public List<CalculateWay> findById(int id) {
		List<CalculateWay> cwList = hibernateTemplate.find("from CalculateWay c where c.id="+ id +"");
		return cwList;
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
