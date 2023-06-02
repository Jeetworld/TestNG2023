package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
	@BeforeSuite
	public void driverSetUp() {
		
		 driver = new ChromeDriver();
		// test.
	}

}
