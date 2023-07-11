package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
//import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCaseOne {

//	  ExtentHtmlReporter htmlReporter;
//	  
//	    ExtentReports extent;
//	    //helps to generate the logs in the test report.
//	    ExtentTest test;
//	    
//	    @BeforeTest
//	    public void startReport() {
//	        // initialize the HtmlReporter
//	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
//	 
//	        //initialize ExtentReports and attach the HtmlReporter
//	        extent = new ExtentReports();
//	        extent.attachReporter(htmlReporter);
//	 
//	 
//	        //configuration items to change the look and feel
//	        //add content, manage tests etc
//	        htmlReporter.config().setChartVisibilityOnOpen(true);
//	        htmlReporter.config().setDocumentTitle("Simple Automation Report");
//	        htmlReporter.config().setReportName("Test Report");
//	        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//	        htmlReporter.config().setTheme(Theme.STANDARD);
//	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//	    }
	

	    
	@Test
	public void testCaseMethodOne() {
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
