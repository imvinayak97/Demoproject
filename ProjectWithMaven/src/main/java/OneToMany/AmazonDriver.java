package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AmazonDriver {

	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Amazon a= new Amazon();
		a.setAid(101);
		a.setName("Mobile");
		
		Item i =new Item();
		i.setI_id(2001);
		i.setIname("Mi");
		i.setPrice(1000.23);
		
		i.setAmazon(a);
		Item i1 =new Item();
		i1.setI_id(1002);
		i1.setIname("IQOO");
		i1.setPrice(10013.23);
		i1.setAmazon(a);
		List <Item> t =new ArrayList();
		
		t.add(i);
		t.add(i1);
		
		a.setItem(t);
		
		Session session =factory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		session.save(a);
//		session.save(i);
//		session.save(i1);
		
		Amazon q=session.get(Amazon.class,101);
		System.out.println(q.getAid());
		System.out.println(q.getItem().size());
//		
		
		for (Item  p : q.getItem()) {
			
			System.out.println(p.getIname());
			System.out.println(p.getPrice());
		}
		 
		transaction.commit();
		session.close();
		factory.close();
	}
	
}
