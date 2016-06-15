package com.bethinking.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bethinking.model.Record;
import com.bethinking.service.CalculateService;
import com.bethinking.util.Calculator;

@Component("calculateService")
public class CalculateServiceImpl implements CalculateService{
	
	private Calculator calculator = new Calculator();
	
	public Record calculate(Record record){
		return this.calculator.calculate(record);
	}

	public Calculator getCalculator() {
		return calculator;
	}
	@Resource
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
}
