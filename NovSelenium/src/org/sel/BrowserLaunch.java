package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {
   public static void main(String[] args) {
	
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\NovSelenium\\driver\\geckodriver.exe");
	
	 WebDriver driver = new FirefoxDriver();
	 
	 
	 driver.get("https://www.facebook.com/");
	 
	 
	 
	 
	 
}
	
	
	
}
