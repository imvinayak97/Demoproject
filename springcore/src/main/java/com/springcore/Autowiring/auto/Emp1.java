package com.springcore.Autowiring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp1 {

	@Autowired
	@Qualifier("temp2")
	private Address1 address1;

	public Address1 getAddress() {
		return address1;
	}

	public void setAddress(Address1 address1) {
		this.address1 = address1;
	}

	public Emp1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp1(Address1 address) {
		super();
		this.address1 = address1;
	}
	@Override
	public String toString() {
		return "Emp [address=" + address1 + "]";
	}

}
