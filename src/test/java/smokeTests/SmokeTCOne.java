package smokeTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.logging.*;

public class SmokeTCOne {
	private static final Logger LOGGER = Logger.getLogger(SmokeTCOne.class.getName());
	@Test(groups= "XYZ")
	public void smokeOne() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Webdriver initialised");
		System.out.println("one method called");
		driver.get("https://www.youtube.com/");
		System.out.println("Youtube opened !!");
		LOGGER.info("Hello World!");

		
		// test.log(Status.FAIL,"this is failed");
		driver.navigate().refresh();
		System.out.println("Title of page is "+driver.getTitle());
		
		driver.quit();
	}
	
	@Test(groups= "ABC")
	public void smokeTwo() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Webdriver initialised");
		System.out.println("one method called");
		driver.get("https://www.geeksforgeeks.org/");
		System.out.println("geeks4geeks opened !!");
		LOGGER.info("Hello Hey!");

		
		// test.log(Status.FAIL,"this is failed");
		driver.navigate().refresh();
		System.out.println("Title of page is "+driver.getTitle());
		
		driver.quit();
	}
	
	@Test(groups= "ABC")
	public void smokeThree() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Webdriver initialised");
		System.out.println("one method called");
		driver.get("https://www.guru99.com/");
		System.out.println("GURU 99 opened !!");
		
		// test.log(Status.FAIL,"this is failed");
		LOGGER.info("Hello Hi!");

		driver.navigate().refresh();
		System.out.println("Title of page is "+driver.getTitle());
		
		driver.quit();
	}

}
