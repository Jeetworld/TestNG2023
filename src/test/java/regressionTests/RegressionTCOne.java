package regressionTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegressionTCOne {

	
	@Test
	public void regressionOne() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Webdriver initialised");
		System.out.println("one method called");
		driver.get("https://www.google.co.in/");
		System.out.println("google opened !!");
		
		// test.log(Status.FAIL,"this is failed");
		driver.navigate().refresh();
		System.out.println("Title of page is "+driver.getTitle());
		
		driver.quit();
	}
}
