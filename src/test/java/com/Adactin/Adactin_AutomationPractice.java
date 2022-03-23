package com.Adactin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Adactin_Helper_File.FileReaderManager1;
import com.BaseClass.Base_Class;

import com.PojoAdactin.Book_Hotel;
import com.PojoAdactin.Login;
import com.PojoAdactin.PageObjectManager_1;
import com.PojoAdactin.Search_Hotel;
import com.PojoAdactin.Select_Button;


public class Adactin_AutomationPractice extends Base_Class {
	
	public static WebDriver driver = Base_Class.getBrowser("Chrome");
	public static PageObjectManager_1 pom = new PageObjectManager_1(driver);
	public static Logger log = Logger.getLogger(Adactin_AutomationPractice.class);
	
	public static void main(String[] args) throws InterruptedException, IOException {

		
		PropertyConfigurator.configure("log4j.properties");
		
//		getUrl("http://adactinhotelapp.com/index.php");
		
		
		getUrl(FileReaderManager1.getInstance_FRM1().getInstance_CR1().getUrl());
		
		log.info("Url Launch");
		
         manage();
    
         //Login
      
		inputText(pom.getInstance_l().getUsername(), particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx",1 ,6));
			
		inputText(pom.getInstance_l().getPassword(), particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 2, 6));
		
		sleep(3000);

		clickButton(pom.getInstance_l().getLogin());

		log.info("Crendentials Entered in field and clicked");
		
		// Search hotel
		
		
		log.info("navigated to search hotel");
			
         dropDown(pom.getInstance_sh().getLocation(), "ByValue",particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 6,6));
		
		sleep(1000);
	
		dropDown(pom.getInstance_sh().getHotel(), "ByValue", particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 7, 6));
		
		
		sleep(1000);
		
		dropDown(pom.getInstance_sh().getRoom(), "VisibleText", particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 8, 6));
		
		sleep(1000);
		
		dropDown(pom.getInstance_sh().getNum(), "ByValue",particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 9, 6));
		
		sleep(1000);
		
		clear(pom.getInstance_sh().getFdate());
		
		inputText(pom.getInstance_sh().getFdate(),FileReaderManager1.getInstance_FRM1().getInstance_CR1().getFdate());
		
		sleep(1000);
		
	     clear(pom.getInstance_sh().getEdate());
		
		inputText(pom.getInstance_sh().getEdate(), FileReaderManager1.getInstance_FRM1().getInstance_CR1().getEdate());
		
		sleep(1000);

		
		dropDown(pom.getInstance_sh().getAdult(), "ByValue",particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 12, 6));
		
		sleep(1000);

		
         dropDown(pom.getInstance_sh().getChild(), "ByValue",particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 13, 6));
		
		sleep(3000);
	
		clickButton(pom.getInstance_sh().getSearch());
		
		sleep(3000);
		
		

		log.info("Credentials entered in Search hotel field");
		
		

		// Select Button
		
		
		log.info("navigated to Select hotel");
		
		clickButton(pom.getInstance_sb().getRadio());
		
		sleep(2000);

		clickButton(pom.getInstance_sb().getCon());
		
		sleep(3000);
		
		log.info("Selected the product");
		
		//book a hotel
	
		log.info("navigated to booking");
				
		inputText(pom.getInstance_bh().getFname(), particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 19, 6));
		
		sleep(1000);
		
		inputText(pom.getInstance_bh().getLname(), particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 20, 6));
		
		sleep(1000);
		
		inputText(pom.getInstance_bh().getAdd(), particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 21, 6));
		
		sleep(1000);
		
		inputText(pom.getInstance_bh().getCard(), FileReaderManager1.getInstance_FRM1().getInstance_CR1().getCard());
		
		sleep(1000);
		
		dropDown(pom.getInstance_bh().getCardtype(), "ByValue", particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 24,6));
		
        sleep(1000);
		
		dropDown(pom.getInstance_bh().getExpmonth(), "ByValue", particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 25,6));
		
         sleep(1000);

		dropDown(pom.getInstance_bh().getExpyear(), "ByValue", particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 26, 6));
		
		sleep(1000);
		
		inputText(pom.getInstance_bh().getCcv(), particularCellData("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Adactin_Testcases.xlsx", 27, 6));
		
		sleep(2000);
	
		clickButton(pom.getInstance_bh().getBook());
		
		sleep(10000);
		
		log.info("Entered Credentials in fiels and submitted");
		
		//Scroll Down
		
		
		javascript(0, 1500);
		

		TakesScreenshot sn = (TakesScreenshot) driver; // higher to lower -> narrowing(type casting)

		File source = sn.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Screenshot\\adactin.png");

		FileUtils.copyFile(source, destination);

	
		
		close();

	}


}
