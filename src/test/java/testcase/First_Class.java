package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First_Class {
	WebDriver d;
	@Test
	public void setup() {
		 d = new ChromeDriver();
	}

}
