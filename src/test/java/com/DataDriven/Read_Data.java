package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void particular_Cell_Data() throws IOException {

		System.out.println("=====Partivular Cell Data====");

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Maven_Jaya\\DD.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(2);

		Cell c = r.getCell(1);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			String cellValue = c.getStringCellValue();

			System.out.println(cellValue);

		}

		else if (type.equals(CellType.NUMERIC)) {

			double cellValue = c.getNumericCellValue();

			int value = (int) cellValue;

			System.out.println(value);

		}

		wb.close();

	}

	public static void all_data() throws IOException {

		System.out.println("=====All Data===");
		
		
		File f = new File("C:\\Users\\DELL\\Desktop\\DD.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i); // i represents row index

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j); // jrepresents column index

				CellType type = c.getCellType();

				if (type.equals(CellType.STRING)) {

					String cellvalue = c.getStringCellValue();

					System.out.println(cellvalue);

				}

				else if (type.equals(CellType.NUMERIC)) {

					double cellvalue = c.getNumericCellValue();

					int value = (int) cellvalue;

					String v = Integer.toString(value);

					System.out.println(v);
				}

			}
		}

		wb.close();
		
	}

	public static void main(String[] args) throws IOException {

		particular_Cell_Data();

		all_data();
	}

}
