package org.phone;

public class InternalStorage {
private void processorName() {
	System.out.println("processor name");
}
	
	private void ramSize() {
		System.out.println("ram size");

	}
	
	public static void main(String[] args) {
		
		ExternalStorage a=new ExternalStorage();
		a.size();
		
		InternalStorage b=new InternalStorage();
		b.processorName();
		b.ramSize();
		
	}
	
}
