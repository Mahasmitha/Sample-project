package org.phone;

public class PhoneInfo {

	private void phoneName() {
     System.out.println("phone name is oneplus");
	}
	private void phoneImeiNumber() {
		System.out.println("phone imei number is 123456789"); 
	}
	private void camera() {
		System.out.println("camera is 128mp");
	}
	private void storage() {
		System.out.println("storage is 256gb");
	}
	private void osName() {
        System.out.println("osname is andriod");
	}
	public static void main(String[] args) {
		PhoneInfo samsung = new PhoneInfo();
		
		samsung.phoneName();
		samsung.phoneImeiNumber();
		samsung.camera();
		samsung.storage();
		samsung.osName();	
	}
    
   }
