package com.bethinking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com. bethinking.util.Calculator;
import com.bethinking.service.CalculateWayService;
import com. bethinking.service.RecordService;
import com.bethinking.model.CalculateWay;
import com. bethinking.model.Record;
import com.bethinking.dao.CalculateWayDao;
import com. bethinking.dao.RecordDao;

@Component("CalculateWayService")
public class CalculateWayServiceImpl implements CalculateWayService{
	
	CalculateWayDao calculateWayDao;

	public String getCalculateWayValueById(int id) {
		if(this.calculateWayDao.findById(id).size()>0)
			return this.calculateWayDao.findById(id).get(0).getCalculateWayValue();
		return null;
	}
	
	@Resource
	public void setCalculateWayDao(CalculateWayDao calculateWayDao) {
		this.calculateWayDao = calculateWayDao;
	}
	public CalculateWayDao getCalculateWayDao() {
		return calculateWayDao;
	}

}
