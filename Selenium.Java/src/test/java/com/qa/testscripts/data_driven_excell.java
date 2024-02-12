package com.qa.testscripts;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data_driven_excell {

	public static void main(String[] args) throws IOException {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://demo.guru99.com/test/newtours/");
	
	FileInputStream file = new FileInputStream(".//Resources//data2.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheet("sheet1");
	
	int noOfrow = sheet.getLastRowNum(); 
	
	for(int row =1;row<= noOfrow;row++) {
		XSSFRow current_row = sheet.getRow(row);
		
		String First_Name = current_row.getCell(0).toString();
		String Last_Name = current_row.getCell(1).toString();
		String phone = current_row.getCell(2).toString();
		String country = current_row.getCell(3).toString();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		
		driver.findElement(By.name("firstName")).sendKeys(First_Name);
		driver.findElement(By.name("lastName")).sendKeys(Last_Name);
		driver.findElement(By.name("phone")).sendKeys(phone);
		
		
		Select drop_country = new Select(driver.findElement(By.name("country")));
		drop_country.selectByVisibleText(country);
		
		
		
	}
	
	

	}

}
