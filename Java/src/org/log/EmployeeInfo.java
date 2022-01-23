package org.log;

public class EmployeeInfo  extends CompanyInfo {
	
public EmployeeInfo(String name) {
	this("srd006@gmail.com", 45698);
	System.out.println("employee name is" + name);
}
public EmployeeInfo(String email , int empId) {
	this(45863.25f);
	System.out.println("employee email:"+email+"Employee Id is:"+ empId);
}
public EmployeeInfo(String Address , byte Age) {
	this(9854671256l);
	System.out.println("employee Address is:"+Address+"\n"+"Employee Age is"+Age);
}
public EmployeeInfo(long mobile) {
	this("Tatabad Coimbatore", 25);
	System.out.println("employee mob no is"+ mobile);
}
public EmployeeInfo(float salary) {
	System.out.println("employee salary is"+salary);
}
public EmployeeInfo(double cheque) {
	this("M");
	System.out.println("employee cheque no is"+ cheque);
}

public EmployeeInfo(char gender) {
	this(1455855655);
	System.out.println("employee gender is"+ gender);
}

public EmployeeInfo() {
 super();
	System.out.println("Default constructor");
}

public static void main(String[] args) {
	EmployeeInfo e = new EmployeeInfo("smith");
}
}




