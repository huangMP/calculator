package com.bethinking.action;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bethinking.util.InterestRateCalculator;

public class InterestRateActionTest {

	@Test
	public void testCalculate() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		InterestRateCalculator ir = (InterestRateCalculator)ctx.getBean("InterestRateCalculator");
		System.out.println(ir.caluateRate("10000", "100", "0.35"));
	}
}
