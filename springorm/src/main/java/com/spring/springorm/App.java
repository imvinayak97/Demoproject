package com.spring.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springorm.dao.Studentdao;
import com.spring.springorm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Studentdao studentdao = context.getBean("studentDao",Studentdao.class);
        
        Student student=new Student(232,"Vinayak","Mumbai");
        int r=studentdao.insert(student);
        System.out.println("done "+r);
    }
}
