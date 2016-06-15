package com.bethinking.service;

public interface InterestRateCalculateService {
	public String doInterestRateCalculate(String deposit, String demandDay, String demandInterestRate);
	
	public String doInterestRateCalculateByTime(String deposit, String depositTimeToYear,
			String timeInterestRate);
	
}
