package org.sel;



import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestingMaven {
public static void main(String[] args) throws IOException   {
	
	File f = new File("C:\\Users\\HARINI NETHRIN\\eclipse-workspace\\MavenProject\\Testdata\\12.CITI_Template_2020.xlsx");
	
	FileInputStream stream = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(stream);
	
	Sheet sheet = w.getSheet("Onboarding Template");
	
	Row row = sheet.getRow(1);
	
	Cell cell = row.getCell(2);
	
	String stringCellValue = cell.getStringCellValue();
	
	System.out.println(stringCellValue);
	
	
	
	
	//C:\Users\HARINI NETHRIN\eclipse-workspace\MavenProject\Testdata
	
	
	//C:\Users\HARINI NETHRIN\eclipse-workspace\MavenProject\Testdata\12.CITI_Template_2020.xlsx
	
}
}
