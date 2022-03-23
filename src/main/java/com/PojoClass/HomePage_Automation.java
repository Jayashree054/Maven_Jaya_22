package com.PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Automation {

	
	public static WebDriver driver; // null driver
	
//	WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
	
	@FindBy(xpath ="//a[@class='login']")
	private WebElement signIn;


	public HomePage_Automation(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}


	public WebElement getSignIn() {
		return signIn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
