package com.bethinking.util;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component("exchangeRateCalculator")
public class ExchangeRateCalculator {
	/*
	 * rate1    和    rate2 是汇率    principal是rate1的本金   
	 * 返回 rate2对应的终值
	 */
	public String calculate(String rate1,String rate2,String principal){
		BigDecimal r1 = new BigDecimal(rate1);
		BigDecimal r2 = new BigDecimal(rate2);
		BigDecimal p = new BigDecimal(principal);
		return p.multiply(r1.divide(r2, 4 ,BigDecimal.ROUND_HALF_UP)).toString();
	}

}
