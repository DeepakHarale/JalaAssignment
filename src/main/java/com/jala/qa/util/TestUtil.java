package com.jala.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.prefs.InvalidPreferencesFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.base.TestBase;

public class TestUtil  {
	ChromeDriver driver;
	static Workbook book;
	static Sheet sheet;
	public static String TESTDATA_SHEET_PATH= "C:\\Users\\Sarvadnya\\eclipse-workspace\\JalaAcadamyTest\\src\\main\\java\\com\\jala\\qa\\testdata\\EmployeeData.xlsx";
	String sheetname = "Sheet1";
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPICIT_WAIT =10;
	
	
//	################################################## Created By 2D Array###########################################
	
	public static Object [][] getTestData(String sheetname) throws EncryptedDocumentException, IOException{
		FileInputStream file = null; 
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			 book = WorkbookFactory.create(file);
					
		}catch(InvalidPropertiesFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		 sheet = book.getSheet(sheetname);
		 Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		 for(int i=0; i<sheet.getLastRowNum(); i++) {
			 for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				 data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			 }
		 }
		 return data;
	}
	


}
