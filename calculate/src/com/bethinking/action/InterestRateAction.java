package com.bethinking.action;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bethinking.model.InterestRate;
import com.bethinking.service.InterestRateCalculateService;
import com.bethinking.service.InterestRateService;
import com.opensymphony.xwork2.ActionSupport;

@Component("InterestRateAction")
@Scope("prototype")
public class InterestRateAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private HttpServletResponse response;

	private InterestRateService interestRateService;
	private InterestRateCalculateService interestRateCalculateService;
	
	private String type;
	
	private String demandInterestRate;
	
	private String interest;
	
	public String execute() {
		if("demand".equals(type)) {
			demandInterestRate = interestRateService.getDemandInterestRate("huoqicunkuan").getInterestRate();
			return "demand";
		} else {
			demandInterestRate = interestRateService.getDemandInterestRate("huoqicunkuan").getInterestRate();
			List<InterestRate> interestRateList = interestRateService.getAllInterestRate();
			interestRateList.remove(0);
			this.request.getSession().setAttribute("interestRateList", interestRateList);
			return "time";
		}
	}

	/**
	 * 定期存款
	 */
	public void timeDeposit() throws IOException {
		String interest = interestRateCalculateService.doInterestRateCalculateByTime(request.getParameter("deposit"), request.getParameter("depositTimeToYear"), request.getParameter("interestRate"));
		response.getWriter().print(interest);
	}
	
	/**
	 * 活期存款
	 * 接受参数：
	 * 1.存款总额（deposit）
	 * 2.存款期限（天）（demandDay）
	 * 3.利率（interestRate）
	 * 返回参数：
	 * 1.利息（interest）
	 * 2.本息合计（totalCount）
	 * 实现步骤：
	 * 1.向InterestService拿到活期存款的利率值
	 * 2.通过InterestCalculateService计算出利息
	 * 		前台需要的值1.利息，2.本息合计
	 * 
	 */
	public void demandDeposit() throws IOException {
		demandInterestRate = interestRateService.getDemandInterestRate("huoqicunkuan").getInterestRate();
		interest = interestRateCalculateService.doInterestRateCalculate(request.getParameter("deposit"),request.getParameter("demandDay"),demandInterestRate);
		response.getWriter().print(interest);
	}
	
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	
	@Resource
	public void setInterestRateService(InterestRateService interestRateService) {
		this.interestRateService = interestRateService;
	}

	@Resource
	public void setInterestRateCalculateService(
			InterestRateCalculateService interestRateCalculateService) {
		this.interestRateCalculateService = interestRateCalculateService;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDemandInterestRate() {
		return demandInterestRate;
	}

	public void setDemandInterestRate(String demandInterestRate) {
		this.demandInterestRate = demandInterestRate;
	}
	
}

