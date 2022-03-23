package com.Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Base_Class;

public class Automation_Practice extends Base_Class{

	
		public static void main(String[] args) throws InterruptedException, IOException {
			
			
			driver = getBrowser("chrome");
			sleep(3000);
			
			getUrl("http://automationpractice.com/index.php");
			
			manage();
			
		//	Dimension resize = new Dimension(800,800);
		//	driver.manage().window().setSize(resize);
			
			dimension(800,800);
			
		    sleep(3000);
			
			manage();
			
			WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
			
			clickButton(women);
			
			
			WebElement img = driver.findElement(By.xpath("//img[@title='Blouse']"));
		
			
			clickButton(img);
			
			sleep(3000);
			
			driver.switchTo().frame(0);
			
			WebElement quantity = driver.findElement(By.xpath("//input[@name='qty']"));
			quantity.clear();
	
			
			inputText(quantity, "2");
			
			
			WebElement size = driver.findElement(By.id("group_1"));
			
			clickButton(size);
			
			
			dropDown(size, "ByValue","2");
			
		     sleep(1000);
			
			WebElement color = driver.findElement(By.xpath("//a[@title='White']"));
		
			
			clickButton(color);
			
			WebElement addchart = driver.findElement(By.xpath("//button[@name='Submit']"));
		
			
			clickButton(addchart);
			
		     sleep(2000);
			
			driver.switchTo().defaultContent();
			
			WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		
			
			clickButton(proceed);
			
		     sleep(2000);
			
			WebElement pro = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		
			
			clickButton(pro);
			
			sleep(2000);
			
			//sign in
			
			WebElement email = driver.findElement(By.id("email_create"));
		//	email.sendKeys("4jayashree054@gmail.com");
			
			inputText(email, "4jayashree054@gmail.com");
			
			sleep(1000);
			
			WebElement create = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
			
			clickButton(create);
			
			sleep(4000);
			
			//Address detail
			
			WebElement radio = driver.findElement(By.id("uniform-id_gender2"));
		
			
			clickButton(radio);
			
			sleep(1000);
			
			WebElement firstname = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		
			
			inputText(firstname, "Jayashree");
			
			WebElement lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		
			
			inputText(lastname, "Ragavan");
			
			WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		
			
			inputText(password, "Jaya@123456");
			
			WebElement days = driver.findElement(By.xpath("//select[@name='days']"));
		
			dropDown(days, "ByValue", "5");
			
			sleep(1000);
			
			WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
		
			
			dropDown(month, "ByValue","8");
			
		    sleep(1000);
			
			WebElement year = driver.findElement(By.xpath("//select[@name='years']"));
			
			dropDown(year, "ByValue","1990");
			
		     sleep(1000);
			
			WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
		
			
			inputText(company, "Greens");
			
			WebElement add1 = driver.findElement(By.xpath("//input[@name='address1']"));
		
			
			inputText(add1, "Tiruvallur");
			
			WebElement add2 = driver.findElement(By.xpath("//input[@name='address2']"));
		
			
			inputText(add2, "Chennai");
			
			WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		
			
			inputText(city, "Chennai");
			
			WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
			
			dropDown(state, "ByValue","14");
			
			WebElement postcode = driver.findElement(By.xpath("//input[@name='postcode']"));
		
			
			inputText(postcode, "00039");
			
			WebElement add3 = driver.findElement(By.xpath("//textarea[@name='other']"));
		
			
			inputText(add3, "hjgdfuy");
			
			WebElement home = driver.findElement(By.xpath("//input[@name='phone']"));
		
			
			inputText(home, "98765432310");
			
			WebElement mobile = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
			
			inputText(mobile, "9876343102");
			
			WebElement alias = driver.findElement(By.xpath("//input[@name='alias']"));
			
			inputText(alias, "Chennai");
			
			sleep(2000);
			
			WebElement register = driver.findElement(By.xpath("//button[@name='submitAccount']"));
			
			clickButton(register);
			
		     sleep(3000);
			
			WebElement address = driver.findElement(By.xpath("//button[@name='processAddress']"));
		
			
			clickButton(address);
			
			//shipping
			
			WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
			
			clickButton(checkbox);
			
			sleep(2000);
			
			WebElement process = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		
			
			clickButton(process);
			
			sleep(2000);
			
			WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		
			
			clickButton(payment);
			
			sleep(2000);
			
			WebElement submit1 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		
			
			clickButton(submit1);
			
			//ScrollDown
			
			org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
			
			js.executeScript("window.scroll(0,1500)","");
			
			TakesScreenshot sn = (TakesScreenshot) driver;
			
			File source = sn.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\Screenshot\\automation.png");
			
			FileUtils.copyFile(source, destination);
			
			sleep(3000);		
		
			close();
			
			
		}

}
