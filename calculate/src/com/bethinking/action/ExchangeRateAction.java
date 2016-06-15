package com.bethinking.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bethinking.model.ExchangeRate;
import com.bethinking.service.ExchangeRateCalculateService;
import com.bethinking.service.ExchangeRateService;
import com.bethinking.service.RecordService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Component("ExchangeRateAction")
@Scope("prototype")
public class ExchangeRateAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	
	private static final long serialVersionUID = 1L;
	HttpServletRequest request;
	HttpServletResponse response;
	RecordService recordService;
	String currencyId1;
	String currencyId2;
	String input1;
	String input2;

	ExchangeRateService exchangeRateService;
	ExchangeRateCalculateService exchangeRateCalculateService;

	public String execute() {
		HttpSession session = ((HttpServletRequest) request).getSession();
		List<ExchangeRate> exchangeRateList = exchangeRateService.findAll();
		ActionContext.getContext().getSession().put("exchangeRateList", exchangeRateList);
		session.setAttribute("exchangeRateList", exchangeRateList);
		return SUCCESS;
	}

	/*
	 * 计算并返回结果
	 */
	public String executeCalculate() throws IOException {
		String rate1 = exchangeRateService.findRateById(Integer.valueOf(currencyId1));
		String rate2 = exchangeRateService.findRateById(Integer.valueOf(currencyId2));
		if("".equals(input1)){
			input1 = exchangeRateCalculateService.calculateRate( rate1 ,rate2 , input2);
			response.getWriter().print(input1);
		}else{
			input2 = exchangeRateCalculateService.calculateRate( rate2 , rate1 , input1);
			response.getWriter().print(input2);
		}
		return NONE;
	}
	
	public ExchangeRateService getExchangeRateService() {
		return exchangeRateService;
	}
	@Resource
	public void setExchangeRateService(ExchangeRateService exchangeRateService) {
		this.exchangeRateService = exchangeRateService;
	}


	public ExchangeRateCalculateService getExchangeRateCalculateService() {
		return exchangeRateCalculateService;
	}
	@Resource
	public void setExchangeRateCalculateService(
			ExchangeRateCalculateService exchangeRateCalculateService) {
		this.exchangeRateCalculateService = exchangeRateCalculateService;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	
	public String getCurrencyId1() {
		return currencyId1;
	}

	public void setCurrencyId1(String currencyId1) {
		this.currencyId1 = currencyId1;
	}
	
	public String getCurrencyId2() {
		return currencyId2;
	}

	public void setCurrencyId2(String currencyId2) {
		this.currencyId2 = currencyId2;
	}
	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}
}

