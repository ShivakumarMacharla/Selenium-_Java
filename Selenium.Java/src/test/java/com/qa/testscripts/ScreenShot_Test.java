package com.qa.testscripts;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_Test {

	public static void main(String[] args) throws Exception  {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		
//		TakesScreenshot ts  = ((TakesScreenshot)driver);
//		File srcfile = ts.getScreenshotAs(OutputType.FILE);
//		File dstFile = new File("./Screenshots/img4.png");
//		FileUtils.copyFile(srcfile, dstFile);
		
//		TakesScreenshot ts = ((TakesScreenshot)driver);
//		File srcfile = ts.getScreenshotAs(OutputType.FILE);
//		File dstfile = new File("./Screenshots/img.png");  
//		FileUtils.copyFile(srcfile, dstfile);
		
		System.out.println("Sucessfully printed Screenshot");
		
		//driver.close();
		
		
		
		
		//Screenshot
		File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File(".//Screenshots//img3.png"));
	}

}
