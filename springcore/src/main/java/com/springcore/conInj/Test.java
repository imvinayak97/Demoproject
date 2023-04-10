package com.springcore.conInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/conInj/configueCons.xml");
	
	Person p1=(Person)context.getBean("person");
	System.out.println(p1);
	Addition add1=(Addition)context.getBean("add");
	//System.out.println(add1);
	add1.doSum();
	}

}
