package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.javatpoint.com/selenium-webdriver-running-test-on-chrome-browser");
		 Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("scrollBy(0,500)");	
	}

}
