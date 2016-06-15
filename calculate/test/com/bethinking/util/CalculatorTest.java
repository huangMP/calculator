package com.bethinking.util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com. bethinking.util.Calculator;

/*public class CalculatorTest {
	
	
	 * 构造函数:calculate(numP, numI, numN, numF, calculateWay,calculateBlock);
	 * numP是存入本金
	 * numI是存入年限
	 * numN是存入年限
	 * numF是终值ֵ
	 * calculateWay: 0 是求本金   1 是求终值   2 是求年利率 3 求存入年限    4 求等额还款
	 * calculateBlock: 1 是单利计算      2 是复利计算
	 * 
	
	@Test
	//对正常情况的检测
	//不会抛出任何异常
	public void testCalculate(){
		Calculator c=new Calculator();
		int answer=Integer.valueOf(c.simpleCalculate("1", "2", "3", "", "1"));
		assertThat(answer,is(27));
	}
	
	@Test (expected=java.lang.NumberFormatException.class)
	//对没输入情况的检测
	//抛出NumberFormatException，数字格式异常
	public void testCalculate1(){
		Calculator c=new Calculator();
		int answer0=Integer.valueOf(c.simpleCalculate("", "2","3", "27","1"));
		int answer1=Integer.valueOf(c.simpleCalculate("1", "", "3", "", "1"));
		int answer2=Integer.valueOf(c.simpleCalculate("", "2", "", "", "1"));
		int answer3=Integer.valueOf(c.simpleCalculate("1", "2", "", "", "1"));
		assertThat(answer0,is(27));
		assertThat(answer1,is(27));
		assertThat(answer2,is(27));
		assertThat(answer3,is(27));
	}

	@Test (expected=java.lang.NullPointerException.class)
	//对没输入情况的检测
	//抛出NullPointerException，空指针异常
	public void testCalculate2(){
		Calculator c=new Calculator();
		int answer0=Integer.valueOf(c.simpleCalculate(null, "2", "3", "", "1"));
		int answer1=Integer.valueOf(c.simpleCalculate("1", null, "3", "", "1"));
		int answer2=Integer.valueOf(c.simpleCalculate("1", "2", null, "", "1"));
		int answer3=Integer.valueOf(c.simpleCalculate("1", "2", "3", "", null));
		int answer4=Integer.valueOf(c.simpleCalculate("1", "2", "3", null, "1"));
		assertThat(answer0,is(27));
		assertThat(answer1,is(27));
		assertThat(answer2,is(27));
		assertThat(answer3,is(27));
		assertThat(answer4,is(27));
	}
	
	@Test
	public void test(){
		System.out.println(Math.pow(2,1.0/2));
	}
	
}
*/