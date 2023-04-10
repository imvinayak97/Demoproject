package com.tut.ProjectWithMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project started" );
        
        Configuration cfg =new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        //SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        //System.out.println(factory);
        
        //creating Student
        
        Student student=new Student();
        student.setId(102);
        student.setName("Akash");
        student.setCity("Virar");
        
        Address address=new Address();
        address.setStreet("Strret 1");
        address.setCity("Mumbai");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(11.1);
        //Reading img
        FileInputStream stream=new FileInputStream("src/main/java/_DSC0686.jpg");
        byte [] data =new byte[stream.available()];
        address.setImage(data);
        
        
        Session session= factory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(student);
        session.save(address);
        tx.commit();
        session.close();
        System.out.println("done");
        
    }
}
