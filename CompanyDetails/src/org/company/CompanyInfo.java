package org.company;

public class CompanyInfo {
    private void companyname() {
    System.out.println("company name is wipro");
   }

	private void companyId() {
     System.out.println("company id is 567");
	}
	
	private void companyAddress() {
		System.out.println("company address is cbe");
	}
	
	public static void main(String[] args) { 
		
		//classname objname=new classname();
		CompanyInfo cts= new CompanyInfo();
		
		cts.companyname();
		cts.companyId();
		cts.companyAddress();	
		}
	
    }
