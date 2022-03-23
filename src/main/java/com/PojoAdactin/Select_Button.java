package com.PojoAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Button {

	public static WebDriver driver; // null driver

	@FindBy(id = "radiobutton_0")
	private WebElement radio;

	@FindBy(id = "continue")
	private WebElement con;

	public Select_Button(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCon() {
		return con;
	}

}
