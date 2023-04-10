package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java ?");

		Answer a1 = new Answer();
		a1.setAnswerId(343);
		a1.setAnswer1("Java is programming lang");
		q1.setAnswer(a1);
		a1.setQuestion2(q1);

		Question q2 = new Question();
		q2.setQuestionId(242);
		q2.setQuestion("What is collecton FrameWork");

		Answer a2 = new Answer();
		a2.setAnswerId(344);
		a2.setAnswer1("api work with object");
		q2.setAnswer(a2);
		a2.setQuestion2(q2);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

//		session.save(q1);
//		session.save(q2);
		// session.save(a1);
		// session.save(a2);

		tx.commit();

		// fetching
		Question question = session.get(Question.class, 1212);
		System.out.println(question.getQuestion());
		System.out.println(question.getAnswer().getAnswer1());
		session.close();
		factory.close();

	}
}
