package Base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class NewBase {
	
	
	static public  WebDriver driver;
	static public ExtentHtmlReporter htmlReporter;
	static public ExtentReports extent;
    //helps to generate the logs in the test report.
	static public ExtentTest test;
   
	
//	protected static ThreadLocal<WebDriver> driver1 = new ThreadLocal<WebDriver>();
//	hi
//	public static  void setDriver() {
////		WebDriverManager.chromedriver().setup();
//		driver1.set(new ChromeDriver());
//	}
//	
//	public static WebDriver getDriver()
//	{
//		return driver1.get();
//	}
//	
//	public static void closeBrowser()
//	{
//		driver1.get().close();
//		driver1.remove();
//	}
	
	
	@BeforeTest
    public void startReport() {
        // initialize the HtmlReporter
		driver = new ChromeDriver();
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/ExtendReport.html");
 
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
 
 
        //configuration items to change the look and feel
        //add content, manage tests etc
        //htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Simple Automation Report");
        htmlReporter.config().setReportName("Test Report");
       // htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }
	
//	@BeforeClass
//	public void driverSetup() {
//		 NewBase.setDriver();
//		 driver = NewBase.getDriver();
//	}
	
	 @AfterMethod
	    public void getResult(ITestResult result) throws Exception {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL,result.getThrowable());
	            String screenshotPath = NewBase.getScreenhot(driver,result.getName());
	            test.fail("Test Case failed check screenshot below "+test.addScreenCaptureFromPath(screenshotPath));
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, result.getTestName());
	        }
	        else {
	            test.log(Status.SKIP, result.getTestName());
	        }
	    }
	 
	 public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception {
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
	                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
			String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
			return destination;
		}
	 
	    @AfterTest
	    public void tearDown() {
	        //to write or update test information to reporter
	        extent.flush();
	    }

}
