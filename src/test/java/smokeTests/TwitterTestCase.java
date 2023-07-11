package smokeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwitterTestCase {
	
	@Test
	public void twitterLogin() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Webdriver initialised");
		System.out.println("one method called");
		driver.get("https://www.linkedin.com/feed/");
		System.out.println("Linkedin Opened !!");
		
		// test.log(Status.FAIL,"this is failed");
		driver.navigate().refresh();
		System.out.println("Title of page is "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "DUmmy");
		driver.quit();
	}
	
	@Test
	public void twitterHomepage() throws Exception {
		System.out.println("Twiter Homepage trying to open");
		throw new Exception("Intentially failed !1");
		//driver.quit();
	}
	
	@Test
	public void twitterUpdateStatus() {
		System.out.println("twiter updated status method executed ");
	}
	
	@Test
	public void twitterDeleteStatus() {
		System.out.println("twiter deleted method executed");
	}

}
