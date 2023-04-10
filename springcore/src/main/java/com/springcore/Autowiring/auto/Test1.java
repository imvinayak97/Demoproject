package com.springcore.Autowiring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Autowiring/auto/configueAUTO1.xml");
		
		Emp1 e1=context.getBean("emp", Emp1.class);
		System.out.println(e1);
	}
}
