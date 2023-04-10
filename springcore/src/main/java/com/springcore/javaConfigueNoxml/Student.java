package com.springcore.javaConfigueNoxml;

import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {

	private Samosa samosa;
	
	
	public Student(Samosa test) {
		super();
		this.samosa = samosa;
	}


	


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void study() {
		this.samosa.display();
		System.out.println("Student doing study");
	}
}
