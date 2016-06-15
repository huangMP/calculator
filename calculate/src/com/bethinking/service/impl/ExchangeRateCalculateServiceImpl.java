package com.bethinking.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bethinking.model.ExchangeRate;
import com.bethinking.service.ExchangeRateCalculateService;
import com.bethinking.util.ExchangeRateCalculator;

@Component("ExchangeRateCalculateService")
public class ExchangeRateCalculateServiceImpl implements ExchangeRateCalculateService {
	
	ExchangeRateCalculator exchangeRateCalculator ;

	public ExchangeRateCalculator getExchangeRateCalculator() {
		return exchangeRateCalculator;
	}
	@Resource
	public void setExchangeRateCalculator(
			ExchangeRateCalculator exchangeRateCalculator) {
		this.exchangeRateCalculator = exchangeRateCalculator;
	}

	public String calculateRate(String r1, String r2,String principal) {
		return exchangeRateCalculator.calculate(r1, r2, principal);
	}
}
