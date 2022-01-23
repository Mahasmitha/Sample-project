package org.sel;


import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingExcel {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\MavenProject\\Testdata\\Maven Excel.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(stream);
	Sheet sheet = w.getSheet("Sheet1");		
	
    for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	Row row = sheet.getRow(i);

    for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
	
		int cellType = cell.getCellType();
		
		if (cellType==1) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
			
		 else {

			double numericCellValue = cell.getNumericCellValue(); 
			 
			long l = (long)numericCellValue;
			System.out.println(l);
			 
			//double Firstname = cell.getNumericCellValue();
			
			//String Firstname = cell.getStringCellValue();
			
			//String Firstname = row.getCell(0).getStringCellValue();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			WebDriverManager.chromedriver().setup(); 
			WebDriver driver = new ChromeDriver(); 
		//	 
			driver.get("https://demoqa.com/automation-practice-form"); 
			 
			 driver.findElement(By.id("Firstname")).sendKeys("1236");
			 
		}
		
		
		
		
		
	//	String stringCellValue = cell.getStringCellValue();
  // System.out.println(stringCellValue);
    
   
    } 
    }
	
}
}
