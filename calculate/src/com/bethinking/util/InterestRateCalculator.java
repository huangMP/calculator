package com.bethinking.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.springframework.stereotype.Component;

@Component("InterestRateCalculator")
public class InterestRateCalculator {

	public String caluateRate(String deposit, String demandDay,
			String demandInterestRate) {
		BigDecimal big_deposit = new BigDecimal(deposit);
		double dayInterestRate = Double.parseDouble(demandInterestRate)/(36000);
		BigDecimal result = big_deposit.multiply(new BigDecimal(dayInterestRate)).multiply(new BigDecimal(demandDay));
		DecimalFormat df = new DecimalFormat("0.000"); 
		BigDecimal total = result.add(big_deposit);
		return df.format(result.doubleValue())+","+df.format(total.doubleValue());
	}
	
	public String caluateTimeRate(String deposit, String depositTimeToYear,
			String timeInterestRate) {
		BigDecimal big_deposit = new BigDecimal(deposit);
		BigDecimal big_depositTimeToYear = new BigDecimal(depositTimeToYear);
		BigDecimal big_timeInterestRate = new BigDecimal(timeInterestRate).divide(new BigDecimal("100"));
		BigDecimal result = big_deposit.multiply(big_timeInterestRate).multiply(big_depositTimeToYear);
		DecimalFormat df = new DecimalFormat("0.000"); 
		BigDecimal total = result.add(big_deposit);
		return df.format(result.doubleValue())+","+df.format(total.doubleValue());
	}
	
	
}
