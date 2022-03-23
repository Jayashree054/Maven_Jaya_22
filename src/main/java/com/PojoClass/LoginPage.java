package com.PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;

	// WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	// WebElement password =
	// driver.findElement(By.xpath("//input[@name='passwd']"));
	// WebElement sumbit =
	// driver.findElement(By.xpath("//button[@name='SubmitLogin']"));

	@FindBy(xpath = "//input[@name='email']")

	private WebElement email;

	@FindBy(xpath = "//input[@name='passwd']")

	private WebElement password;

	@FindBy(xpath = "//button[@name='SubmitLogin']")

	private WebElement submit;

	public LoginPage(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
