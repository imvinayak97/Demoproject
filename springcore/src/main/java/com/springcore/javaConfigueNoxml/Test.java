package com.springcore.javaConfigueNoxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigue.class);

		Student student=context.getBean("firstStudent",Student.class);
		//Student student=context.getBean("getStudent",Student.class);
		//Student student=context.getBean("student",Student.class);
		
		System.out.println(student);
		student.study();
	}

}
