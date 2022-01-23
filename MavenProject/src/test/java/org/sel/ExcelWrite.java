package org.sel;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelWrite {
public static void main(String[] args) throws IOException {

	WebDriverManager.chromedriver().setup();	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	WebElement searchbox = driver.findElement(By.name("q"));
	searchbox.sendKeys("iphone13pro",Keys.ENTER);
	
  List<WebElement> alliphones = driver.findElements(By.xpath("//span[text()='iphone13pro']"));
	
	for (int i = 0; i <alliphones.size(); i++) {
		WebElement x = alliphones.get(i);
	   
		String text = x.getText();
	    System.out.println(text);
	
	
	File f = new File("C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\MavenProject\\Testdata\\Writingexcel.xlsx.xlsx");
	
	Workbook w = new XSSFWorkbook();
	
	Sheet createSheet = w.createSheet("Test");
	
	Row createRow = createSheet.createRow(i);
	
	Cell createCell = createRow.createCell(0);
	
	createCell.setCellValue(text);
	
	FileOutputStream stream = new FileOutputStream(f);
	
	w.write(stream);
	
	
	
	
	
	
	}
	
		
	
	
}
 	
	
}
