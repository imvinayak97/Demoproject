package com.MANYTOMANY;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class driver {

	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		EMp e1=new EMp();
		e1.setEid(34);
		e1.setName("Ram");
		
		EMp e2=new EMp();
		e2.setEid(35);
		e2.setName("Shyam");
		
		Project p1=new Project();
		p1.setPid(1212);
		p1.setProjectName("Library management system");
			
		Project p2=new Project();
		p2.setPid(1412);
		p2.setProjectName("CHATBOT");
		
		
		List <EMp> list1=new ArrayList<EMp>();
		list1.add(e1);
		list1.add(e2);
		
		List <Project> list2=new ArrayList<Project>();
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.seteMps(list1);
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(e1);
		
		session.save(e2);
		session.save(p1);
		session.save(p2);
		transaction.commit();
		session.close();
		factory.close();
	}
}
