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

@Component("IndexAction")
@Scope("prototype")
public class IndexAction extends ActionSupport{
	
	public String execute() {
		return "success";
	}

}

