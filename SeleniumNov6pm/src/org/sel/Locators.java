package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\SeleniumNov6pm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement textresume = driver.findElement(By.xpath("//div[@id= 'heading201']"));
	textresume.click();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
