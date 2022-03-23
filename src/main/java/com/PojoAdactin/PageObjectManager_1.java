package com.PojoAdactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager_1 {
	
	
public static WebDriver driver;    // null driver
	
	
	
	private Login l;
	
	private Search_Hotel sh;
	
    private	Select_Button sb;
	
	private Book_Hotel bh;
	
	
	public PageObjectManager_1(WebDriver driver2) {
		
		
		this.driver = driver2;
		PageFactory.initElements(driver,this);
		
	}

	public Login getInstance_l() {
		
		 l =new Login(driver);
		 
		 return l;
		
	}
	
	public Search_Hotel getInstance_sh() {
		
		 sh = new Search_Hotel(driver);
		
		 return sh;
	}
	
	
	public Select_Button getInstance_sb() {
		
		 sb = new Select_Button(driver);
		 
		 return sb;
		
	}
	
	
	public Book_Hotel getInstance_bh() {
		
		 bh = new Book_Hotel(driver);
		 
		 return bh;
	}
	
	
		
	


}
