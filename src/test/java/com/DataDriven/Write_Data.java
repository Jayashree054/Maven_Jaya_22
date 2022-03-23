package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
     File f = new File("C:\\Users\\DELL\\Desktop\\Write.xlsx");
     
     FileInputStream fis = new FileInputStream(f);
     
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("User_Data").createRow(0).createCell(0).setCellValue("Name");
		
		wb.getSheet("User_Data").getRow(0).createCell(1).setCellValue("Mark");
		
		wb.getSheet("User_Data").createRow(1).createCell(0).setCellValue("SV");
		
		wb.getSheet("User_Data").getRow(1).createCell(1).setCellValue("56");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("Write Successfully");
		
	}
}
				
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


