package com.spring.springorm.dao;


import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.springorm.entities.Student;

public class Studentdao {

	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public int insert(Student student) {
		
		Integer  i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}



	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
