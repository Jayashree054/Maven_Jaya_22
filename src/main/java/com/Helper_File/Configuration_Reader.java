package com.Helper_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\src\\main\\java\\com\\Helper_File\\Configuration.Properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}

	public String getUrl() {

		String url_auto = p.getProperty("Url");

		return url_auto;

	}

}
