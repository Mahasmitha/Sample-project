package org.company;

public class CompanyInfo {

	private void companyName() {
		System.out.println("company name is");

	}
	private void companyId() {
       System.out.println("company id is");

	}
	
	private void companyAddress() {
		System.out.println("company address is");

	}
	
	public static void main(String[] args) {
		
		//classname objname=new classname();
		CompanyInfo a=new CompanyInfo();
		
		a.companyName();
		a.companyId();
		a.companyAddress();
		
	}
	
    }
