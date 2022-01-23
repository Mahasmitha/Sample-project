package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {

	private void employeeName() {
		System.out.println("employee name");
	}
	public static void main(String[] args) {
		
	Employee a=new Employee();
	a.employeeName();	
		
	Company b=new Company();
	b.companyName();
	
	Client c=new Client();	
	c.clientName();	
		
	Project d=new Project();	
	d.projectName();
		
		
		
	}
	
	}
