package com.qa.testscripts;

import java.io.File;
import java.io.FileInputStream;


import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataReadingFromExcell {
	WebDriver driver =null;

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		FileInputStream file = new FileInputStream(".//Resources//data2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int NoOfRow = sheet.getLastRowNum();
	    System.out.println("NoOfRow"+NoOfRow);
		for(int row =3;row<=NoOfRow;row++) {
			XSSFRow current_row = sheet.getRow(row);
			


			//contact information
			String First_Name = current_row.getCell(0).toString();
			String Last_Name = current_row.getCell(1).toString();
			String Phone = current_row.getCell(2).toString();
			String Email = current_row.getCell(3).toString();
			
			//Mailing information
			String Address = current_row.getCell(4).toString();
			String City = current_row.getCell(5).toString();
			String State = current_row.getCell(6).toString();
			String Postal_Code = current_row.getCell(7).toString();
			String Country = current_row.getCell(8).toString();
			
			//User Information
			String User_Name = current_row.getCell(9).toString();
			String Password = current_row.getCell(10).toString();
			String con_pws = current_row.getCell(11).toString();
			
			////contact information
			driver.findElement(By.name("firstName")).sendKeys(First_Name);
			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.id("userName")).sendKeys(Email);
			
			//Mailing information
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(Postal_Code);
			
			//dropDown
			Select drop_country = new Select(driver.findElement(By.name("country")));
			drop_country.selectByVisibleText(Country);
			
			//User Information
            driver.findElement(By.name("email")).sendKeys(User_Name);
            driver.findElement(By.name("password")).sendKeys(Password);
            driver.findElement(By.name("confirmPassword")).sendKeys(con_pws);
            
			//submit
			driver.findElement(By.name("submit")).click();
			Screenshot sc = new Screenshot();
			sc.getScreenshot( driver);
			System.out.println("sucessfully registered"+row);
			driver.close();
			driver.quit();
		}
		
//		driver.close();
//        driver.quit();
        file.close();
	}

}


class Screenshot {
	public void getScreenshot(WebDriver driver) throws Exception {
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File dstfile = new File("./Screenshots/img1.png");
		FileUtils.copyFile(srcfile, dstfile);
	}
}
