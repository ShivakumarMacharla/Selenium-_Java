package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement from  = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/img"));
	    WebElement to = driver.findElement(By.id("trash"));
	    
	    Actions act = new Actions(driver);
	    act.dragAndDrop(from, to).build().perform();	 
	    
	    //Screenshot
	    
	    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot,new File("./Screenshot/dragAndDrop.1.png"));
	    
	
	}

}
