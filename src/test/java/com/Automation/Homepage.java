package com.Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;
import com.Helper_File.FileReadManager;
import com.PojoClass.HomePage_Automation;
import com.PojoClass.LoginPage;
import com.PojoClass.PageObjectManager;

public class Homepage extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	public static void main(String[] args) throws IOException {

	//	driver = getBrowser("chrome");

	//	getUrl("http://automationpractice.com/index.php");
		
		getUrl(FileReadManager.getInstance_FRM().getInstance_CR().getUrl());

		manage();

		

		clickButton(pom.getInstancehp().getSignIn());

		inputText(pom.getInstancelp().getEmail(), "4jayashree054@gmail.com");

		inputText(pom.getInstancelp().getPassword(), "Jaya@123456");

		clickButton(pom.getInstancelp().getSubmit());

		close();
	}

}
