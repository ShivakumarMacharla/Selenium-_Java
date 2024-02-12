package com.qa.testscripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class onetest {
	public static WebDriver driver;
	public static String browser = "chrome";
	public static void main(String[] args) throws Exception {
		  String url = "https://www.saucedemo.com/";
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
		}else if(browser.equals("edge")) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
		
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		driver.close();
		
}
}
