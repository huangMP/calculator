package com.bethinking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bethinking.dao.ExchangeRateDao;
import com.bethinking.model.ExchangeRate;
import com.bethinking.service.ExchangeRateService;

@Component("ExchangeRateService")
public class ExchangeRateServiceImpl implements ExchangeRateService{
	
	ExchangeRateDao exchangeRateDao;

	public String findRateById(int id) {
		ExchangeRate exchangeRate = exchangeRateDao.findById(id);
		if(exchangeRate != null){
			return exchangeRate.getRate().trim();
		}
		return null;
	}
	
	public ExchangeRateDao getExchangeRateDao() {
		return exchangeRateDao;
	}
	
	@Resource
	public void setExchangeRateDao(ExchangeRateDao exchangeRateDao) {
		this.exchangeRateDao = exchangeRateDao;
	}

	public List<ExchangeRate> findAll() {
		return this.exchangeRateDao.findAll();
	}

}
