package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleAutomation {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}
	
	@Test
	public void methodOne() {
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	driver.switchTo().frame(1);
	//https://www.wwp.northeastern.edu/outreach/seminars/intro_2017-02/presentations/xslt/xml_and_xpath_14.xhtml
	List<WebElement> ele = driver.findElements(By.xpath("//*[@aria-label='Google apps']//ul/li//div//following-sibling::span"));
	System.out.println("size is "+ele.size());
	for(WebElement ele1 : ele) {
		
		System.out.println("Suggestions are ::"+ele1.getText());
	}
	
	
	}
}
