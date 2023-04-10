package com.springcore.stereoTYpe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereoTYpe/configueSTEREO.xml");
		Student student=con.getBean("student",Student.class);
		//Student student=con.getBean("student1",Student.class);
		
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		
		
		//Scope
		Student student1=con.getBean("student",Student.class);
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		
		Teacher teacher=con.getBean("t1",Teacher.class);
		Teacher teacher1=con.getBean("t1",Teacher.class);
		System.out.println(teacher.hashCode());
		System.out.println(teacher1.hashCode());

	}

}
