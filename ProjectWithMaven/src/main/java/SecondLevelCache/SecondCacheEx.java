package SecondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.ProjectWithMaven.Student;


public class SecondCacheEx {

	public static void main(String[] args) {
		 //EhcacheRegionFactory
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session1 = factory.openSession();

		Student student1=session1.get(Student.class, 10);
		session1.close();

		Session session2 = factory.openSession();
		Student student2=session2.get(Student.class, 10);
		
		session2.close();
	}
}
