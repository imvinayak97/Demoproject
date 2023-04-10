package com.springcore.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/SPEL/configueSPEL.xml");

		Demo d1=con.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		//2nd way
//		SpelExpressionParser temp = new SpelExpressionParser();
//		Expression expression = temp.parseExpression("22+22+11");
//		System.out.println(expression.getValue());
	}

}
