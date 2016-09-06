package com.ibm.read;

import java.io.Serializable;

public class Customer implements Serializable{

	private String custName;
	private String adress;
	
	public Customer(String custName, String adress) {
		this.custName = custName;
		this.adress = adress;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}	
	
}
