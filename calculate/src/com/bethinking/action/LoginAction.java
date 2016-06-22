package com.bethinking.action;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bethinking.model.User;
import com.bethinking.service.LoanRateService;
import com.bethinking.service.LoginService;
import com.bethinking.service.impl.LoanRateServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

@Component("LoginAction")
@Scope("prototype")
public class LoginAction  extends ActionSupport implements ServletRequestAware,ServletResponseAware{

	HttpServletRequest request;
	HttpServletResponse response;
	
	private User user;

	LoginService loginService ;

	public String execute() {
		return SUCCESS;
	}

	public String login(){
		if( !(user.getUserName() == null || "".equals(user.getUserName()) || user.getPassword() == null || "".equals(user.getPassword()) )){
			User databaseUser = loginService.findByUserName(user.getUserName() );
			if( databaseUser != null ){
				if( user.getPassword().equals(databaseUser.getPassword()) && user.getUserName().equals( databaseUser.getUserName() ) ){
					request.getSession().setAttribute("existUser", user);
					request.getSession().setAttribute("loginError", "");
					return "loginSuccess";
				}
			}
		}
		request.getSession().setAttribute("loginError", "用户名或密码书写不正确");
		return "loginError";
	}
	
	public String logout(){
		request.getSession().setAttribute("existUser", null);
		request.getSession().setAttribute("loginError", "");
		return "logout";
	}
	
	public String register(){
		return "register";
	}
	
	public String doRegister(){
		if( !(user.getUserName() == null || "".equals(user.getUserName()) || user.getPassword() == null || "".equals(user.getPassword()) )){
			user.setAddTime(new Date().toLocaleString());
			request.getSession().setAttribute("loginError", "恭喜您注册成功");
			loginService.saveUser(user);
			return "registerSuccess";
		}
		request.getSession().setAttribute("existUser", null);
		request.getSession().setAttribute("loginError", "用户名或密码书写不正确");
		return "registerError";
	}
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LoginService getLoginService() {
		return loginService;
	}
	@Resource
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
