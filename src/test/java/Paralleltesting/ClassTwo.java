package Paralleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassTwo {
	
	@Test
	public void OneMethod() throws InterruptedException {
		int i =9;
		WebDriver driver = new ChromeDriver();
		System.out.println("one method called");
		driver.get("https://www.facebook.com/");
		Thread.sleep(8000);
		String title = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println(" title is "+title+" URL is "+URL);
	}

}
