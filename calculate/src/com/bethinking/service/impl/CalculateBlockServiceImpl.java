package com.bethinking.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com. bethinking.util.Calculator;
import com.bethinking.service.CalculateBlockService;
import com.bethinking.service.CalculateWayService;
import com. bethinking.service.RecordService;
import com.bethinking.model.CalculateWay;
import com. bethinking.model.Record;
import com.bethinking.dao.CalculateBlockDao;
import com.bethinking.dao.CalculateWayDao;
import com. bethinking.dao.RecordDao;

@Component("CalculateBlockService")
public class CalculateBlockServiceImpl implements CalculateBlockService{
	
	CalculateBlockDao calculateBlockDao;
	
	@Resource
	public void setCalculateBlockyDao(CalculateBlockDao calculateBlockDao) {
		this.calculateBlockDao = calculateBlockDao;
	}
	public CalculateBlockDao getCalculateWayDao() {
		return calculateBlockDao;
	}

	public String getCalculateBlockValueById(int id) {
		if(this.calculateBlockDao.findById(id).size()>0)
			return this.calculateBlockDao.findById(id).get(0).getCalculateBlockValue();
		return null;
	}

}
