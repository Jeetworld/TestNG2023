package sanityTests;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.ScreenCapture;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import Base.NewBase;
import junit.framework.Assert;

import org.openqa.selenium.TakesScreenshot;

public class SanityTCOne extends NewBase {

	
	ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest test;
     
    @BeforeClass
    public void config()
    {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/MyOwnReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }
	@Test
	public void sanityOne() {
		test = extent.createTest("logsGeneration");
        test.log(Status.INFO,"createTest() method will return the ExtentTest object");
        test.log(Status.INFO, "I am in actual Test");
        test.log(Status.INFO, "We can write the actual test logic in this Test");
		WebDriver driver = new ChromeDriver();
		System.out.println("Webdriver initialised");
		System.out.println("one method called");
		driver.get("https://www.linkedin.com/feed/");
		System.out.println("Linkedin Opened !!");
		
		// test.log(Status.FAIL,"this is failed");
		driver.navigate().refresh();
		System.out.println("Title of page is "+driver.getTitle());
		//Assert.assertEquals(driver.getTitle(), "ABC");
		
		 test.log(Status.INFO, MarkupHelper.createLabel("*************** Using Labels ***************", ExtentColor.RED));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 1", ExtentColor.BLUE));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 2", ExtentColor.BLUE));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 3", ExtentColor.BLUE));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 4", ExtentColor.BLUE));
	       // test.log(Status.FAIL, "this is failed");
		driver.quit();
	}
	
	
	

	
	 @AfterClass
	    public void tearDown(ITestResult result)
	    {
	        extent.flush();
	    }
	
	
}
