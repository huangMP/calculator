package com.bethinking.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.bethinking.service.LoanRateService;

/**
 * 房贷计算Service层实现
 */
@Component("LoanRateService")
public class LoanRateServiceImpl implements LoanRateService {
	
	//计算得到每月月供参考
	public String getMonthlyAmount(String loanMoney,String loanTime,String loanType){
		//每月月供额=贷款本金×月利率×(1＋月利率)＾还款月数〕÷〔(1＋月利率)＾还款月数-1)
		double result;
		if("0".equals(loanType)){
			double loanRate = 0.049;
			result = Double.valueOf(loanMoney) * 10000 * Double.valueOf(loanRate) * Math.pow(1+Double.valueOf(loanRate),Double.valueOf(loanTime)*12) / ( Math.pow(1+Double.valueOf(loanRate),Double.valueOf(loanTime)*12) - 1);
		}else{
			double loanRate = 0.325;
			result = Double.valueOf(loanMoney) * 10000 * Double.valueOf(loanRate) * Math.pow(1+Double.valueOf(loanRate),Double.valueOf(loanTime)*12) / ( Math.pow(1+Double.valueOf(loanRate),Double.valueOf(loanTime)*12) - 1);
		}
		return Double.toString(result);
	}
	
	//计算得到支付利息
	public String getInterestPayment(String loanMoney,String loanTime,String loanType){
		//总利息=还款月数×每月月供额-贷款本金
		double monthlyAmount = Double.valueOf( getMonthlyAmount(loanMoney,loanTime,loanType) );
		double result = Double.valueOf(loanTime) * 12 * monthlyAmount - Double.valueOf(loanMoney)*10000;
		return Double.toString(result);
	}
	
	//计算得到还款总额
	public String geTotalDueAmount(String loanMoney,String loanTime,String loanType){
		double monthlyAmount = Double.valueOf( getMonthlyAmount(loanMoney,loanTime,loanType) );
		double result = Double.valueOf(loanTime) * 12 * monthlyAmount ;
		return Double.toString(result);
	}
}

/*
	等额本息还款法:
	每月月供额=〔贷款本金×月利率×(1＋月利率)＾还款月数〕÷〔(1＋月利率)＾还款月数-1〕
	每月应还利息=贷款本金×月利率×〔(1+月利率)^还款月数-(1+月利率)^(还款月序号-1)〕÷〔(1+月利率)^还款月数-1〕
	每月应还本金=贷款本金×月利率×(1+月利率)^(还款月序号-1)÷〔(1+月利率)^还款月数-1〕
	总利息=还款月数×每月月供额-贷款本金
*/
