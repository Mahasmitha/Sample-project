package org.samplee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowLaunch {
   public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
	  
  WebDriver driver =new ChromeDriver();
	driver.get("http://www.greenstech.in/selenium-course-content.html");   
	   
	 driver.manage().window().maximize();  
	   
	WebElement text = driver.findElement(By.xpath("//strong[text()='Selenium Training Course in Chennai']"));
	   String text2 = text.getText();
	  System.out.println(text2); 
	
	  WebElement paratext = driver.findElement(By.xpath("//strong[contains(text(),'Selenium Training Course in Chennai')]"));  
	  String text3 = paratext.getText();
	   System.out.println(text3);
	   
	   WebElement text1 = driver.findElement(By.xpath("//span[contains(@class,'address-align')]"));
	   String text4 = text1.getText();
	   System.out.println(text4);
	   
	   
}
	
	
	
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
