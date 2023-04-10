package com.hql;

import java.util.Arrays;
import java.util.List;


import org.hibernate.query.*

;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.ProjectWithMaven.Student;

public class HQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Configuration cfg =new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session s=factory.openSession();
        
//       // String query="from Student where city='mumbai'";
//        String query="from Student where city=:x";
//       // String query="from Student as s where s.city=:x and s.name=:p";
//        Query q=s.createQuery(query);
//        q.setParameter("x", "mumbai");
//       List <Student> list= q.list();
//        
//       for(Student student:list) {
//    	   System.out.println(student.getName());
//       }
//       
       Transaction transaction=s.beginTransaction();
       
       //delete query
//       String query2="delete from Student s where s.city=:c";
//       Query q2=s.createQuery(query2);
//       q2.setParameter("c", "mumbai");
//      int r= q2.executeUpdate();
//      System.out.println(r);
//      transaction.commit();
       
       //update query
//       Query q2=s.createQuery("update Student set city=:c where name=:n");
//       q2.setParameter("c", "Delhi");
//       q2.setParameter("n", "Peter");
//       int r=q2.executeUpdate();
//       System.out.println(r);
//       transaction.commit();
       
       //join query
      Query q3= s.createQuery("select q.name,q.aid,a.price from Amazon as q INNER JOIN q.item as a");
       
      List <Object[]>list3=q3.getResultList();
      
      for(Object [] arr:list3) {
    	  System.out.println(Arrays.toString(arr));
      }
        s.close();
        factory.close();
	}

}
