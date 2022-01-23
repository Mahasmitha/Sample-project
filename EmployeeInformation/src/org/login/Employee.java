package org.login;

public class Employee extends Company {
   private void Empinfo(String name) {
	System.out.println("emp name is"+name);
   }
private void Empinfo(String email ,int landline) {
	System.out.println("emp email is"+email+'\t'+"emp landline is"+landline);
   }
	private void empinfo(float salary) {
		System.out.println("emp salary is"+salary);
	}
	private void empinfo(long mobile) {
		System.out.println("emp mob no is"+mobile);
	}
	private void empinfo(int age) {
		System.out.println("emp age is"+age);
	}
	private void empinfo(int atmpin,char grade) {
		System.out.println("emp atmpin is"+atmpin+"\t"+"emp grade is"+grade);
   }
	private void empinfo(char gender, String address) {
		System.out.println("emp gender is"+gender+"\n"+"emp address is"+address);
	}
	private void empinfo(long aadhar,String dept) {
		System.out.println("emp aadhar is"+aadhar+"\n"+"emp dept is"+dept);
   }
	
    
	public static void main(String[] args) {
		Employee e = new Employee();
	
    e.Empinfo("smith");
    e.Empinfo("sugan007@gmail.com", 7896532);
    e.empinfo(45893.25f);
    e.empinfo(4589632455l);
    e.empinfo(25);
    e.empinfo(6565, 'A');
    e.empinfo('F', "kr nagar ganapathy");
    e.empinfo(45666664684845l, "biochem");
    e.Empinfo("krish");
    e.Empinfo("kris05@gmail.com", 458962);
    e.empinfo(458.25f);
    e.empinfo(4589632458l);
    e.empinfo(45);
    e.empinfo(6599, 'B');
    e.empinfo('M', "RS puram Coimbatore");
    e.empinfo(66655644654l, "java");
    
    
    
    
    
    }
	
	
	
	
	
	
	
	
	
		
	}

	
	
	

