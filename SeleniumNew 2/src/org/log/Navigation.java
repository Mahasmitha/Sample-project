package org.log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Navigation {
public static void main(String[] args) {
	
System.setProperty("webdriver.ie.driver","C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\SeleniumNew 2\\driver\\IEDriverServer.exe");

	WebDriver driver = new InternetExplorerDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();	
	
	
	
	
	
 }
 }
