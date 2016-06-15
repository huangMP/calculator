package com.bethinking.util;

import java.math.BigDecimal;

public class BigDecimalNumberUtil {
	
	public BigDecimal getBigDecimalNumber(String number){
		BigDecimal bigNumber;
		if(null == number){
			bigNumber = new BigDecimal("");
		}else{
			bigNumber = new BigDecimal(number);
		}
		return bigNumber;
	} 
}
