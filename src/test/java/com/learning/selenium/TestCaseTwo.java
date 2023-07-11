package com.learning.selenium;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.NewBase;

public class TestCaseTwo extends NewBase {
	
	@Test
	public void login() {
		test = extent.createTest("Logs Generation for Lambda first");
		driver.get("https://www.lambdatest.com/");
		test.log(Status.INFO, "this is lambda test case");
	}
	
	@Test
	public void homepage() {
		test = extent.createTest("Logs Generation for Lambda Second");
		//driver.get("https://www.lambdatest.com/");
		test.log(Status.INFO, "this is lambda two test case");
	}
	
	@Test
	public void profilePage() {
		test = extent.createTest("Logs Generation for Lambda Third");
		//driver.get("https://www.lambdatest.com/");
		test.log(Status.INFO, "this is lambda third test case");
	}

}
