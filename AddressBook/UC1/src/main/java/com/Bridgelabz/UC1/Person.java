package com.Bridgelabz.UC1;

public class Person
{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phno;
	private String email;

	@Override
	public String toString()
	{
		return "Person [firstName: "+firstName+" , "+"lastName: "+lastName+" , "+"address: "+address+" , "+"city: "+city+" , "+
				"state: "+state+" , "+"zip: "+zip+" , "+"phoneNo: "+phno+" , "+"email: "+email+ "]" ;
	}

	public Person(String firstName, String lastName, String address, String city, String state, String zip, String phoneNo, String email)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phno = phno;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoneNo() {
		return phno;
	}
	public void setPhoneNo(String phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}


