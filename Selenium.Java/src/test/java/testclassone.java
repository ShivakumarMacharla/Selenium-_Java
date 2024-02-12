import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclassone {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");

	}

}
