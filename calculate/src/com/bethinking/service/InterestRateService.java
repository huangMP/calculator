package com.bethinking.service;

import java.util.List;

import com.bethinking.model.InterestRate;

public interface InterestRateService {
	public InterestRate getDemandInterestRate(String rateType);
	public List<InterestRate> getAllInterestRate();
	
}
