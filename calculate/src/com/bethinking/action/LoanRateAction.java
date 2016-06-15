package com.bethinking.action;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bethinking.service.LoanRateService;
import com.bethinking.service.impl.LoanRateServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

@Component("LoanRateAction")
@Scope("prototype")
public class LoanRateAction  extends ActionSupport implements ServletRequestAware,ServletResponseAware{

	HttpServletRequest request;
	HttpServletResponse response;
	
	private String loanType;
	private String loanMoney;
	private String loanTime;

	LoanRateService loanRateService ;

	public String execute() {
		return SUCCESS;
	}

	public void calculate() throws IOException{
		System.out.println("loanType+"+loanType);
		System.out.println("loanMoney+"+loanMoney);
		System.out.println("loanTime+"+loanTime);
		String monthlyAmount = loanRateService.getMonthlyAmount(loanMoney, loanTime, loanType);
		String interestPayment = loanRateService.getInterestPayment(loanMoney, loanTime, loanType);
		String totalDueAmount = loanRateService.geTotalDueAmount(loanMoney, loanTime, loanType);
		DecimalFormat df = new DecimalFormat("0.000");
		response.getWriter().print( df.format(Double.valueOf(monthlyAmount)) +","+ df.format(Double.valueOf(interestPayment)) +","+ df.format(Double.valueOf(totalDueAmount)) );
	}
	
	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanMoney() {
		return loanMoney;
	}

	public void setLoanMoney(String loanMoney) {
		this.loanMoney = loanMoney;
	}

	public String getLoanTime() {
		return loanTime;
	}

	public void setLoanTime(String loanTime) {
		this.loanTime = loanTime;
	}
	
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public LoanRateService getLoanRateService() {
		return loanRateService;
	}
	@Resource
	public void setLoanRateService(LoanRateService loanRateService) {
		this.loanRateService = loanRateService;
	}

}
