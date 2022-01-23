package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsframes {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\NovSelenium\\driver\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	WebElement frame = driver.findElement(By.xpath("//frame ids"));
	
	driver.switchTo().frame(frame);
	
	WebElement frame1 = driver.findElement(By.id("f1"));
	frame.sendKeys("java");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
