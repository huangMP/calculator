package com.bethinking.service;

/**
 * 房贷计算Service层接口
 */
public interface LoanRateService {
	//计算得到每月月供参考
	public String getMonthlyAmount(String loanMoney,String loanTime,String loanType);
	
	//计算得到支付利息
	public String getInterestPayment(String loanMoney,String loanTime,String loanType);
	
	//计算得到还款总额
	public String geTotalDueAmount(String loanMoney,String loanTime,String loanType);
}