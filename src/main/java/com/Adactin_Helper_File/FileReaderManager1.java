package com.Adactin_Helper_File;

import java.io.IOException;

public class FileReaderManager1 {

	
	//private
	
	private FileReaderManager1() {
		
	}
	
	
	//static
	
	public static FileReaderManager1 getInstance_FRM1() {
		
		FileReaderManager1 helper = new FileReaderManager1();
		return helper;
	}
	
	//non static
	
	public Configuration1_Reader getInstance_CR1() throws IOException {
		
		Configuration1_Reader reader = new Configuration1_Reader();
		
		return reader;

	}
}
