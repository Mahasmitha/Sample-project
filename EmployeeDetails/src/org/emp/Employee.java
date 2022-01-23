package org.emp;

public class Employee {
    private void employeeId() {
		System.out.println("employee id");

	}
     private void employeeName() {
		System.out.println("employee name");
	   }
	    private void employeeDob() {
		System.out.println("employee dob");
	   }
		private void employeePhone() {
			System.out.println("employee phone");
		}
		private void employeeEmail() {
			System.out.println("employee email");
		}
		private void employeeAddress() {
		   System.out.println("employee address");
		}
		public static void main(String[] args) {
		
		//classname	objname = new classname();
		Employee a = new Employee();	
			
		a.employeeId();
		a.employeeName();
		a.employeeDob();
		a.employeePhone();
		a.employeeEmail();
		a.employeeAddress();
		
		}
		
	
	
	
	
}
