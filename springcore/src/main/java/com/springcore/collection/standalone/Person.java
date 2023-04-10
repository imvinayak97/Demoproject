package com.springcore.collection.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.core.convert.Property;

public class Person {

	private List<String> friends;
	private Map<String, Integer> feestructure;
	private Properties property;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	

	

}
