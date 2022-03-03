package com.qa.opencart.Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	
	
	
	public static Workbook book;
	public static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName) {
		
		Object[][] data=null;
		try {
			
			String path="C:\\Users\\LENOVO\\eclipse-workspace\\com.qa.opencart\\src\\main\\java\\com\\qa\\opencart\\testData\\TestData.xlsx";
			
			FileInputStream ip=new FileInputStream(path);
			
		book=WorkbookFactory.create(ip);
		sheet=book.getSheet(sheetName);
		
		data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
			for(int i=0;i<sheet.getLastRowNum();i++) {
				for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
					data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return data;
	}

}
