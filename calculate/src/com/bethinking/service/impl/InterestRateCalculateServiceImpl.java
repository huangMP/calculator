package com.bethinking.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bethinking.model.InterestRate;
import com.bethinking.service.InterestRateCalculateService;
import com.bethinking.util.InterestRateCalculator;

@Component("InterestRateCalculateService")
public class InterestRateCalculateServiceImpl implements InterestRateCalculateService{

	private InterestRateCalculator interestRateCalculator;
	
	public String doInterestRateCalculate(String deposit, String demandDay,
			String demandInterestRate) {
		
		return interestRateCalculator.caluateRate(deposit,demandDay,demandInterestRate);
	}


	public String doInterestRateCalculateByTime(String deposit,
			String depositTimeToYear, String timeInterestRate) {
		return interestRateCalculator.caluateTimeRate(deposit, depositTimeToYear, timeInterestRate);
	}
	
	
	@Resource
	public void setInterestRateCalculator(
			InterestRateCalculator interestRateCalculator) {
		this.interestRateCalculator = interestRateCalculator;
	}



}
