package com.Adactin_Helper_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.github.fge.msgsimple.bundle.PropertiesBundle;

public class Configuration1_Reader {

	public static Properties p;
	
	public Configuration1_Reader() throws IOException {
		
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\src\\main\\java\\com\\Adactin_Helper_File\\Configuration1.Properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		 p = new Properties();
		
		p.load(fis);
	}
	
	
	public  String getUrl() {
		
		String url_auto = p.getProperty("Url");
		
		return url_auto;
		
	}
	
	public String getFdate() {
		
		String fdate_auto = p.getProperty("Fdate");
		
		return fdate_auto;
	}
	
	
	public String getEdate() {
		
		String edate_auto = p.getProperty("Edate");
		
		return edate_auto;
	}
	
	
	public String getCard() {
		
		String card_auto = p.getProperty("Card");
		
		return card_auto;
	}
	
	
	
	
}
