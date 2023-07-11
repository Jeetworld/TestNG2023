package com.learning.selenium;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


import Base.NewBase;
import junit.framework.Assert;

public class TestCaseOne extends NewBase{
	
	@Test
	public void methodOne() {
		test = extent.createTest("Logs Generation for Test Case One");
		 test.log(Status.INFO,"Execution Started for Test MethodOne() ");
        //test.log(Status.INFO,"createTest() method will return the ExtentTest object");
        test.log(Status.INFO, "I am in  Test Case One");
       // test.log(Status.INFO, "We can write the actual test logic in this Test");
		 
		System.out.println("Webdriver initialised");
		System.out.println("one method called");
		driver.get("https://www.linkedin.com/feed/");
		System.out.println("Linkedin Opened !!");
		
		// test.log(Status.FAIL,"this is failed");
		driver.navigate().refresh();
		System.out.println("Title of page is "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "ABC");
		
		 test.log(Status.INFO, MarkupHelper.createLabel("*************** Using Labels ***************", ExtentColor.RED));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 1", ExtentColor.BLUE));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 2", ExtentColor.BLUE));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 3", ExtentColor.BLUE));
	        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 4", ExtentColor.BLUE));
	        test.log(Status.INFO,"Execution Completed for Test MethodOne() ");
	       // test.log(Status.FAIL, "this is failed");
		
	}
	
	@Test
	public void methodTwo() {
		 test.log(Status.INFO,"Execution Started for Test MethodTwo() ");
		test = extent.createTest("Logs Generation for Test Case Two");
		test.log(Status.INFO,"I am in Test Case Two");
        //test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 1", ExtentColor.BLUE));
        driver.get("https://www.browserstack.com/guide/selenium-3-vs-selenium-4");
        driver.navigate().refresh();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.browserstack.com/");
        driver.navigate().refresh();
        test.log(Status.INFO,"Execution Completed for Test MethodTwo() ");
       // test.log(Status.FAIL, MarkupHelper.createLabel("This is Test Logger 3", ExtentColor.BLUE));
        
	
	}

}
