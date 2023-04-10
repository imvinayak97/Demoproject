package com.springcore.javaConfigueNoxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcore.javaConfigueNoxml")
public class JavaConfigue {

	@Bean
	public Samosa test() {
		return new Samosa();
	}
	@Bean(name={"student","con","dcd"})
	public Student getStudent() {
		
		Student st=new Student(test());
		return st;
	}
	
	
}
