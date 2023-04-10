package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	
	Student student=new Student();
	student.setId(201);
	student.setName("Vinayak");
	student.setCity("Mumbai");
	
	Certificate certificate=new Certificate();
	certificate.setCourse("Java");
	certificate.setDuration("2 months");
	student.setCerti(certificate);
	
	Student student1=new Student();
	student1.setId(202);
	student1.setName("Shreesha");
	student1.setCity("Thane");
	
	Certificate certificate1=new Certificate();
	certificate1.setCourse("Hibernate");
	certificate1.setDuration("1.5 months");
	student1.setCerti(certificate1);
	
	Session session =factory.openSession();
	Transaction transaction=session.beginTransaction();
	
	session.save(student);
	session.save(student1);
	transaction.commit();
	session.close();
	factory.close();
	
	}
	
}

