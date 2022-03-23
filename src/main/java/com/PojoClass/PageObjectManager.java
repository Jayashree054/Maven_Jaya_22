package com.PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

	
	public static WebDriver driver;
	
	private HomePage_Automation hp;
	
	private LoginPage lp;
	
	
	public PageObjectManager(WebDriver driver2) {
	
		this.driver = driver2;
		
		PageFactory.initElements(driver,this);
		
	}

	
	
	//public WebElement getSignIn()

	public HomePage_Automation getInstancehp() {
		
		  hp = new HomePage_Automation(driver);
		 
		  return hp;
	}
	
	
	
	public LoginPage getInstancelp() {
		
		 lp = new LoginPage(driver);
		 
		return lp;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
