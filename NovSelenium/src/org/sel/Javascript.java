package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\NovSelenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.greenstech.in/selenium-course-content.html");
	
	//create obj fr js
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,2000)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-2000) ");
	
	Thread.sleep(3000);
	WebElement text = driver.findElement(By.xpath("//h3[text()='Selenium Certification Training']"));
	js.executeScript("arguments[0].scrollIntoView(true)",text);
	
	Thread.sleep(3000);
	WebElement scroll = driver.findElement(By.xpath("//div[text() = 'Join our Demo Classes']"));
	js.executeScript("arguments[0].scrollIntoView(false)",scroll);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
