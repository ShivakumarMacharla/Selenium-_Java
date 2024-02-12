package com.qa.testscripts;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_browsers {
	
	private WebDriver driver ;
	private String URL = "http://www.facebook.com/";
	     String browser = "chrome";
	    @Parameters("browser")
		@BeforeTest
		public void lanchApp(String browser) {
	    	
	    	if(browser.equalsIgnoreCase("firefox")){
	    		System.out.println("FireFox browser is executing");
	    		driver = new FirefoxDriver();
	    		driver.get(URL);
	    		driver.manage().window().maximize();
	    		}
	    	else if(browser.equalsIgnoreCase("chrome")) {
	    		System.out.println("Chrome browser is executing");
	    		driver = new ChromeDriver();
	    		driver.get(URL);
	    		driver.manage().window().maximize();
	    	    }
	    	else if(browser.equalsIgnoreCase("ie")) {
	    		System.out.println("internet browser is executing");
	    		driver = new InternetExplorerDriver();
	    		driver.get(URL);
	    		driver.manage().window().maximize();
	    		}
	    	else {
	    		throw new IllegalArgumentException("The browser type is Undefined");
	    	}
			
	}
	      @Test
           public void Action(WebDriver driver) {
        	  
        	 WebElement userName = (WebElement) driver.findElements(By.id("email"));
        	 userName.sendKeys("shiva");
        	 WebElement password = (WebElement) driver.findElement(By.id("pass"));
        	 password.sendKeys("kumar");
        	 driver.findElement(By.name("login")).click();
        	}
          @AfterTest
          public void last() {
        	  driver.close();
          }
}
