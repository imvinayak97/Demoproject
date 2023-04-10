package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
//		Student student=session.get(Student.class, 102);
//		Student student1=session.get(Student.class, 102);
//		System.out.println(student);
//		System.out.println(student1);
		
		Student student2=session.load(Student.class, 10);
		System.out.println(student2);
		session.close();
		factory.close();
	}
}
