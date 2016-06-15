package com.bethinking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bethinking.dao.InterestRateDao;
import com.bethinking.dao.impl.InterestRateDaoImpl;
import com.bethinking.model.InterestRate;
import com.bethinking.service.InterestRateService;

@Component("InterestRateService")
public class InterestRateServiceImpl implements InterestRateService{

	private InterestRateDao interestRateDao;
	
	public InterestRate getDemandInterestRate(String rateType) {
		InterestRate demandInterestRate = interestRateDao.selectDemandInterestRate(rateType);
		return demandInterestRate;
	}
	
	public List<InterestRate> getAllInterestRate() {
		return interestRateDao.selectAllInterestRate();
	}
	
	@Resource
	public void setInterestRateDao(InterestRateDao interestRateDao) {
		this.interestRateDao = interestRateDao;
	}

	
}
