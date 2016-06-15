package com.bethinking.dao;

import java.util.List;

import com.bethinking.model.InterestRate;


public interface InterestRateDao {
	public InterestRate selectDemandInterestRate(String rateType);
	public List<InterestRate> selectAllInterestRate();
	
}
