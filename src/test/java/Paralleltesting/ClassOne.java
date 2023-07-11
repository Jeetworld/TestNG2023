package Paralleltesting;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;



public class ClassOne {
	
//	  private static ExtentReports extent = ExtentManager.createInstance();
//	    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	
	
	@Test
	public void OneMethod() throws InterruptedException {
		int i =9;
		WebDriver driver = new ChromeDriver();
		System.out.println("one method called");
		driver.get("https://www.google.co.in/");
//		Thread.sleep(8000);
//		String title = driver.getTitle();
//		String URL = driver.getCurrentUrl();
//		System.out.println(" title is "+title+" URL is "+URL);
//		test.get().pass("this is one method");
//		test.get().pass("this is second line ");
//		test.get().info("dd");
		driver.quit();
		
	}
	
//	@Test
//	public void TwoMethod() throws InterruptedException {
//		int i =10;
//		WebDriver driver = new EdgeDriver();
//		System.out.println("Two method called");	
//		driver.get("https://www.Youtube.com/");
//		Thread.sleep(8000);
//		String title = driver.getTitle();
//		String URL = driver.getCurrentUrl();
//		System.out.println(" title is "+title+" URL is "+URL);
//		driver.quit();
//		
//	}
	
	@Test
	public void ThreeMethod() {
		
		System.out.println("Three method called");
	}

}
