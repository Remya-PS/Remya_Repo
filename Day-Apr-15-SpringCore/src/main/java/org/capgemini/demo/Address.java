package org.capgemini.demo;

public class Address {
	
	private String doorNo;
	private String stName;
	private String city;
	
	public Address(){}
	public Address(String doorNo, String stName, String city) {
		super();
		this.doorNo = doorNo;
		this.stName = stName;
		this.city = city;
	}
	
	public void bean_Init(){
		System.out.println("Bean Initialized -Address");
	}
	
	
	
	public void bean_Destroy(){
		System.out.println("Bean Destroyed -Address");
	}
	
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", stName=" + stName + ", city=" + city + "]";
	}
	
	
	
	
	

}
