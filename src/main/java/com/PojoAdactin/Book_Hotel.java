package com.PojoAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	
	public static WebDriver driver;   // null driver
	
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement card;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement ccv;
	
	@FindBy(id="book_now")
	private WebElement book;

	
	
	
	public Book_Hotel(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
