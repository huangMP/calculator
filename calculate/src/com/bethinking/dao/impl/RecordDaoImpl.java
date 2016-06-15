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

import com. bethinking.model.Record;
import com. bethinking.dao.RecordDao;

@Component("RecordDao")
public class RecordDaoImpl implements RecordDao{
	
	private HibernateTemplate hibernateTemplate; 
	
	/*
	 *	添加指定数据 
	 */
	public void add( Record r) {
		hibernateTemplate.save(r);
	}

	/*
	 *	查询指定数据 
	 */
	public List<Record> list( Record r ) {
		return null;

	}

	/*
	 *	查询指定数据的Id，找不到返回0
	 */
	public int findId( Record r ) {
		return 0;
		
	}
	
	/*
	 *	查询所有数据 
	 */
	public List<Record> listAll() {
		List<Record> list = hibernateTemplate.find("from Record");
		return list;
	}
	
	/*
	 * 将calculateWay等于“” 的数据全部删除，也就是删除全部数据
	 */
	public void deleteAll(){
		
	}
	
	/*
	 * 将制定数据Record c删除
	 */
	public void delete(Record r) {
		List list = hibernateTemplate.find("from Record r where r.numP = "+r.getNumP()+" and r.numI = "+r.getNumI()+" and r.numN = "+r.getNumN()+" and r.numF = "+r.getNumF()+" and r.calculateWay = "+r.getCalculateWay()+" and r.calculateBlock = "+r.getCalculateBlock()+"");
		System.out.println(list.size());
		System.out.println(list.size());
		System.out.println(list.size());
		System.out.println(list.size());
		for(int i=0;list != null && i<list.size();i++){
			//Record = ;
			hibernateTemplate.delete((Record)list.get(i));
		}
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
