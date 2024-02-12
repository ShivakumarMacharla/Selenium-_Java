package com.qa.testscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class DataDrivenFromExcell {

	public static void main(String[] args) throws IOException  {

		FileInputStream file = new FileInputStream(".//  Resources//data1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1"); //providing sheet name
     
		//   XSSFSheet sheet = workbook.getSheetAt(0); // providing sheet by index
        
		int row_count =  sheet.getLastRowNum();
		
		int col_count = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<row_count;i++) {
			
			XSSFRow current_Row = sheet.getRow(i); //focussed on current row
			
			for(int j=0;j<col_count;j++) {
				
			String value = current_Row.getCell(j).toString(); //read the value from cell
			System.out.print(" " + value);		
			}
			 System.out.println();
			
		}
	    	
	
	}

}
