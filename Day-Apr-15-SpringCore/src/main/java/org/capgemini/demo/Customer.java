package org.capgemini.demo;

public class Customer {
	
	private int custId;
	private String custName;
	private String contact;
	
	private Address address;

	
	public Customer(){
		
		System.out.println("No-Arg Constructor");
	}
	
	
	//Constructor using Fields
	public Customer(int custId, String custName, String contact, Address address) {
		super();
		System.out.println("Full-Arg Constructor");
		this.custId = custId;
		this.custName = custName;
		this.contact = contact;
		this.address = address;
	}

	public void bean_Init(){
		System.out.println("Bean Initialized");
	}
	
	
	
	public void bean_Destroy(){
		System.out.println("Bean Destroyed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		System.out.println("Set Customer Value : " + custName);
		this.custName = custName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", contact=" + contact + ", address=" + address
				+ "]";
	}
	
	
	

}
