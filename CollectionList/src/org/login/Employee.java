package org.login;

import java.util.ArrayList;
import java.util.List;

public class Employee {
public static void main(String[] args) {
	
	//List objRef = new ArrayList();
	
	List<Integer> li =new ArrayList<>();
	
	//add the values on list
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(40);
	li.add(50);
	li.add(60);
	
	System.out.println(li);
	
	List<Integer> l2 = new ArrayList<>();
	
	//to add values from li to l2
	l2.addAll(li);
	System.out.println(l2);
	
	l2.add(60);
	l2.add(70);
	l2.add(10);
	l2.add(10);
	l2.add(5);
	l2.add(30);
	
	System.out.println(l2);
	
	//to get common value
	l2.retainAll(li);
	System.out.println(l2);
	
	//to remove common value
	
	l2.removeAll(li);
	System.out.println(l2);
	
	
}
}
