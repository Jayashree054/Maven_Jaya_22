package com.PojoAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public static WebDriver driver;   // null driver
	
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(name="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement num;
	
	@FindBy(id="datepick_in")
	private WebElement fdate;
	
	@FindBy(id="datepick_out")
	private WebElement edate;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	

	public Search_Hotel(WebDriver driver2) {
		
		this.driver =driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNum() {
		return num;
	}

	public WebElement getFdate() {
		return fdate;
	}

	public WebElement getEdate() {
		return edate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}


	
	
	
}
