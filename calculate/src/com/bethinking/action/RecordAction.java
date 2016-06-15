package com.bethinking.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.bethinking.model.Record;
import com.bethinking.service.CalculateBlockService;
import com.bethinking.service.CalculateWayService;
import com.bethinking.service.RecordService;
import com.opensymphony.xwork2.ActionSupport;

@Component("RecordAction")
@Scope("prototype")
public class RecordAction extends ActionSupport implements ServletRequestAware{
	
	private static final long serialVersionUID = 1L;
	HttpServletRequest request;
	RecordService recordService;
	CalculateWayService calculateWayService;
	CalculateBlockService calculateBlockService;


	public String execute() {
		List<Record> recordList = this.recordService.listAll();
		
		for(int i = 0;i<recordList.size();i++){
			Record r = recordList.get(i);
			String calculateWayValue = this.calculateWayService.getCalculateWayValueById( r.getCalculateWay() );
			String calculateBlockValue = this.calculateBlockService.getCalculateBlockValueById( r.getCalculateBlock() );
			r.setCalculateWayValue( calculateWayValue );
			r.setCalculateBlockValue( calculateBlockValue );
		}
		
		request.setAttribute("recordList", recordList);
		
		return SUCCESS;
	}

	public CalculateBlockService getCalculateBlockService() {
		return calculateBlockService;
	}
	@Resource
	public void setCalculateBlockService(CalculateBlockService calculateBlockService) {
		this.calculateBlockService = calculateBlockService;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public RecordService getRecordService() {
		return recordService;
	}
	@Resource
	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}	
	public CalculateWayService getCalculateWayService() {
		return calculateWayService;
	}
	@Resource
	public void setCalculateWayService(CalculateWayService calculateWayService) {
		this.calculateWayService = calculateWayService;
	}
	
}

