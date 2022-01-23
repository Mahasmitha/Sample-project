package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		
	//configure the browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\SeleniumNew\\driver\\chromedriver.exe");
	
	 //to launch the browser	
	WebDriver driver = new ChromeDriver();	
	driver.get("https://www.amazon.in/");
		
	//to maximize the window
	driver.manage().window().maximize();	
		
    String title = driver.getTitle();
	System.out.println(title);	
	
	String currentUrl = driver.getCurrentUrl();	
	System.out.println(currentUrl);	
		
	driver.quit();	
			
	}
	
}
