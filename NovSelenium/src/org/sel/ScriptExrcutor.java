package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptExrcutor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\NovSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//create obj fr js
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement username = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','smith')",username);
		
		WebElement pass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value', '1234')",pass);
		Thread.sleep(3000);
		
	//	WebElement buttonlogin = driver.findElement(By.name("login"));
	//	js.executeScript("arguments[0].click()",buttonlogin);
	//	Thread.sleep(3000);
		
		js.executeScript("arguments[0].setAttribute('style','background:green;"+"border:solid 2px red');",pass);
		
		
		
		//9("arguments[0].setAttribute('style',background:green;"+"border:solid2px red,)"),
		
		
		
		
		
		
		
		
}}
