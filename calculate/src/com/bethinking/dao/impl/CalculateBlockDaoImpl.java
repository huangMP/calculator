package com.bethinking.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.bethinking.model.CalculateBlock;
import com.bethinking.dao.CalculateBlockDao;

@Component("CalculateBlockDao")
public class CalculateBlockDaoImpl implements CalculateBlockDao{
	
	private HibernateTemplate hibernateTemplate; 

	/*
	 *	查询指定数据的Id
	 */
	public List<CalculateBlock> findById(int id) {
		List<CalculateBlock> cwList = hibernateTemplate.find("from CalculateBlock c where c.id="+ id +"");
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
