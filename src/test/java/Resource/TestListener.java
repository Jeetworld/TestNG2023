package Resource;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Base.BaseClass;
import Report.ExtentManager;

public class TestListener extends BaseClass implements ITestListener {
	 //Extent Report Declarations
    private static ExtentReports extent = ExtentManager.createInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    
    @Override
    public synchronized void onStart(ITestContext context) {
        System.out.println("Extent Reports Version 3 Test Suite started!");
        
    }
    @Override
    public synchronized void onFinish(ITestContext context) {
        System.out.println(("Extent Reports Version 3  Test Suite is ending!"));
        extent.flush();
    }
    @Override
    public synchronized void onTestStart(ITestResult result) {
        System.out.println((result.getMethod().getMethodName() + " started!"));
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
        test.set(extentTest);
    }
    @Override
    public synchronized void onTestSuccess(ITestResult result) {
        System.out.println((result.getMethod().getMethodName() + " passed!"));
        test.get().pass("Test passed");
        
    }
    @Override
    public synchronized void onTestFailure(ITestResult result) {
    	File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(f, new File("D:\\Learning\\Automation Learning Notes\\abc.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("YO MAN THIS IS CALLED FROM ONTESTFAILURE METHOD OF ITESTLISTENER!!");
    
    	// ExtentTestManager.getTest().addScreenCaptureFromBase64String(getBase64Screenshot());
    	//test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
        System.out.println((result.getMethod().getMethodName() + " failed!"));
        test.get().fail(result.getThrowable());
    }
    @Override
    public synchronized void onTestSkipped(ITestResult result) {
        System.out.println((result.getMethod().getMethodName() + " skipped!"));
        test.get().skip(result.getThrowable());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println(("onTestFailedButWithinSuccessPercentage for " + result.getMethod().getMethodName()));
    }
}
