package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import freemarker.ext.jsp.TaglibFactory.ClearMetaInfTldSource;

public class Base_Class {
	
	 
	public static WebDriver driver; // Null Driver
	
	public static String value;
	
	public static WebDriver getBrowser(String browser) {
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			 driver = new ChromeDriver();

				
		}
		
		
		else if(browser.equalsIgnoreCase("FIREFOX")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "");

		     driver = new ChromeDriver();

		}
			
		return driver;	

	}
	
	
	public static void manage() {
		
		driver.manage().window().maximize();

	}
	
	
	public static void inputText(WebElement element,String value) {
		
		//username.sendKeys("jayashree054");
		
		element.sendKeys(value);	

	}
	
	
	public static void clickButton(WebElement element) {
		
		//login.click();
		
		element.click();

	}
	
	
	public static void getUrl(String url) {
		
	//	driver.get("http://adactinhotelapp.com/index.php");
		
         driver.get(url);
		
	}
	
	// parameters 1)WebElement 2)Type 3)Value
	
	public static void dropDown(WebElement element, String type, String value) {
		
		Select s = new Select(element);
		
		if(type.equalsIgnoreCase("VisibleText")) {
			
			s.selectByVisibleText(value);
		}
		
		else if(type.equalsIgnoreCase("ByValue")) {
			
			s.selectByValue(value);
		}
		
		else if(type.equalsIgnoreCase("ByIndex")) {
			
			int byIndex_Value = Integer.parseInt(value);  // string to integer conversion
			s.selectByIndex(byIndex_Value);
		}

	}
	
	public static void close() {
		
		driver.close();

	}
	
	public static void sleep(int value) throws InterruptedException {
		
		try {
			Thread.sleep(value);
		}
		catch(InterruptedException e) {
			System.out.println("Exception Occurs");
		}
		
	}
	
	
	public static void clear(WebElement element) {
		//reference_name.clear();
		try {
		element.clear();
		}
		catch(Exception e){
			System.out.println("Exception occurs");
		}
		
	}
	
	public static void dimension(int width, int height) {
		
		try {
			Dimension resize = new Dimension(width,height);
			driver.manage().window().setSize(resize);
			}
		catch(Exception e)
		{
			System.out.println("Exception Occurs");
		}
		

	}
	
	public static void javascript(int i, int j) {
		
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll("+i , j+")","");
			
		}
		catch(Exception e) {
			System.out.println("Exception occurs!");
		}
		
		

	}
	
	
	public static String particularCellData(String path, int row_value, int cell_value) throws IOException{

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s =wb.getSheetAt(0);

		Row r = s.getRow(row_value);

		Cell c = r.getCell(cell_value);

		CellType type = c.getCellType();

		if(type.equals(CellType.STRING)){

		 value = c.getStringCellValue();

		}

		else if(type.equals(CellType.NUMERIC)){

		double d = c.getNumericCellValue();

		int v = (int) d;
		
        value = String.valueOf(v);
      		
		}
		
		wb.close();
		return value;
		}

}
