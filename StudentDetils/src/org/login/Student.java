package org.login;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
     
	System.out.println("Enter student id");	
	short studentId = s.nextShort();
		System.out.println("student id is "+ studentId);	
		
		System.out.println("Enter student Name");	
		String studentName = s.next();
		System.out.println("student name is "+studentName);
		
		System.out.print("Enter the mark1: ");
		short mark1 = s.nextShort();
		
		System.out.print("Enter the mark2: ");
		short mark2 = s.nextShort();
		
		System.out.print("Enter the mark3: ");
		short mark3 = s.nextShort();
		
		System.out.print("Enter the mark4: ");
		short mark4 = s.nextShort();
		
		System.out.print("Enter the mark5: ");
		short mark5 = s.nextShort();
		
		int sum = mark1+mark2+mark3+mark4+mark5;
				int avg =  (mark1+mark2+mark3+mark4+mark5)/5;

		System.out.println("sum is " +sum);
		System.out.println("avg is "+avg);
	}
	
}
