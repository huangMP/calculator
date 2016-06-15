package com.bethinking.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.bethinking.dao.InterestRateDao;
import com.bethinking.model.ExchangeRate;
import com.bethinking.model.InterestRate;

@Component("InterestRateDao")
public class InterestRateDaoImpl implements InterestRateDao{
	
	private HibernateTemplate hibernateTemplate; 

	public InterestRate selectDemandInterestRate(String rateType) {
		List<InterestRate> list = (List<InterestRate>)hibernateTemplate.find("from InterestRate where interestRateItemSpell = '"+rateType+"'");
		return list.get(0);
	}
	
	public List<InterestRate> selectAllInterestRate() {
		return (List<InterestRate>) hibernateTemplate.find("from InterestRate where id != NULL");
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	
}
