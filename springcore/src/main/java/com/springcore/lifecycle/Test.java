package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/configueLIFE.xml");

//		Samosa samosa= (Samosa)context.getBean("s1");
//		System.out.println(samosa);
		context.registerShutdownHook();
//		
//		Pepsi p1=(Pepsi) context.getBean("p1");
//		System.out.println(p1); 
		
		Example exeExample=(Example)context.getBean("e1");
		System.out.println(exeExample);
	}

}
