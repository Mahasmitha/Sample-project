package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
   public static void main(String[] args) {
	
	   //configure the browser
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARINI NETHRIN\\Downloads");
	   
	   //InterfaceName RefName = new ClassName();
	  WebDriver driver = new ChromeDriver();
	   
	   
	  driver.get("https://www.amazon.in/");
	  
	  //to maximize the window
	  driver.manage().window().maximize();
	  
	  
	  
	  
}
	
	
	
	
}
