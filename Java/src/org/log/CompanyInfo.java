package org.log;

public class CompanyInfo { //parent class
public CompanyInfo(String name) {
	this(154515515l);
	System.out.println("Company name is"+ name);
}
public CompanyInfo(String email, int id) {
	this("maha");
	System.out.println("company email "+email+"company Id is"+id);
}
public CompanyInfo(float salary) {
	this("hani007@gmail.com", 456);
	System.out.println("employee salary is"+salary);
}
 public CompanyInfo(long mob) {
	System.out.println("company mob number is"+mob);
}
public CompanyInfo() {
	this(45896.2f);
	System.out.println("default constructor");
}


















}
