package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class misc  {
	WebDriver d;
	@Test
	public void throwKeyword() {
		
		try {
		 d = new ChromeDriver();
		d.findElement(By.xpath("//er[@fsf='ffs']")).clear();
		}
		catch(Exception e) {
			System.out.println("lo ji exception agyi"+ e.getMessage());
		}
	}
}
