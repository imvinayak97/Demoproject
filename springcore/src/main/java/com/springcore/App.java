package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configue.xml");
    	Student st=(Student)context.getBean("student1");
    	Student st2=(Student)context.getBean("student2");
    	Student st3=(Student)context.getBean("student3");
    	System.out.println(st);
    	System.out.println(st2);
    	System.out.println(st3);
    	
    	
    }
}
