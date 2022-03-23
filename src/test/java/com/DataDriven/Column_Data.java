package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Column_Data {

	

	public static void particular_Column_Data() throws IOException {
		
		System.out.println("----Particular Column Data---");

		File f = new File("C:\\Users\\DELL\\Desktop\\DD.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);

			Cell c = r.getCell(1);

			CellType type = c.getCellType();

			if (type.equals(CellType.STRING)) {

				String value = c.getStringCellValue();

				System.out.println(value);

			}

			else if (type.equals(CellType.NUMERIC)) {

				double d = c.getNumericCellValue();

				int v = (int) d;
				String value = Integer.toString(v);

				System.out.println(value);
			}
		}
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		particular_Column_Data();
		
	}

}
