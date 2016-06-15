package com.bethinking.action;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.bethinking.service.CalculateService;
import com. bethinking.service.RecordService;
import com. bethinking.model.Record;
import com.opensymphony.xwork2.ActionSupport;

@Component("ExternalAction")
@Scope("prototype")
public class ExternalAction extends ActionSupport implements
		ServletRequestAware,ServletResponseAware{

	private HttpServletRequest request;
	private HttpServletResponse response;
	private RecordService recordService;
	private CalculateService calculateService;
	
	private Record record;
	

	@Override
	public String execute() throws Exception {
		HttpSession session = request.getSession();
		Record record = (Record) session.getAttribute("record");
		if (record == null) {
			record = new Record();
		}
		record.setCalculateBlock(1);
		record.setCalculateWay(1);
		record.setNumP("");
		record.setNumI("");
		record.setNumN("");
		record.setNumF("");
		session.setAttribute("record", record);
		return "simpleInterest";
	}
	
	/*
	 * 跳转到单利计算器页面
	 */
	public String simpleInterest() {
		HttpSession session = request.getSession();
		Record record = (Record) session.getAttribute("record");
		if (record == null) {
			record = new Record();
		}
		record.setCalculateBlock(1);
		record.setCalculateWay(1);
		record.setNumP("");
		record.setNumI("");
		record.setNumN("");
		record.setNumF("");
		session.setAttribute("record", record);
		return "simpleInterest";
	}

	/*
	 * 跳转到复利计算器页面
	 */
	public String compoundInterest(){
		HttpSession session = request.getSession();
		Record record = (Record) session.getAttribute("record");
		if (record == null) {
			record = new Record();
		}
		record.setCalculateBlock(1);
		record.setCalculateWay(1);
		record.setNumP("");
		record.setNumI("");
		record.setNumN("");
		record.setNumF("");
		session.setAttribute("record", record);
		return "compoundInterest";
	}
	
	/*
	 * 执行计算器的计算功能，给ajax返回答案
	 */
	public String calculate() throws IOException{
		System.out.println("Action");
		Record answer = calculateService.calculate(record);
		recordService.save(answer);
		if( 1 ==answer.getCalculateWay()){
			response.getWriter().print(answer.getNumF());
		}else if( 0 == answer.getCalculateWay() || 4 == answer.getCalculateWay() ){
			response.getWriter().print(answer.getNumP());
		}else if(2 == answer.getCalculateWay()){
			response.getWriter().print(answer.getNumI());
		}else if(3 == answer.getCalculateWay()){
			response.getWriter().print(answer.getNumN());
		}
		return NONE;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public RecordService getRecordService() {
		return recordService;
	}

	@Resource
	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}

	public CalculateService getCalculateService() {
		return calculateService;
	}
	@Resource
	public void setCalculateService(CalculateService calculateService) {
		this.calculateService = calculateService;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
}
