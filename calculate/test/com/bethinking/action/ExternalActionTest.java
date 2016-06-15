package com.bethinking.action;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bethinking.model.Record;
import com.bethinking.service.CalculateService;
import com.bethinking.service.impl.CalculateServiceImpl;
import com.bethinking.util.Calculator;

public class ExternalActionTest {
/*
	@Test
	public void testExecuteCalculate() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ExternalAction ea = (ExternalAction)ctx.getBean("ExternalAction");
		CalculateServiceImpl cs = new CalculateServiceImpl();
		
		Calculator c = new Calculator();
		cs.setCalculator(c);
		
		
		Record r = new Record("6","7","5","","1","1");
		
		ea.setCalculateService(cs);
		ea.setRecord(r);
		
		ea.executeCalculate();
	}
*/
}