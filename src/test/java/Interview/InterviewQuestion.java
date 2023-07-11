package Interview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class InterviewQuestion {
	
	@Test
	public void testOne() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id='login-button']")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@class='product_sort_container']"));
		Select sc = new Select(dropdown);
		sc.selectByIndex(3);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='inventory_item_price']"));
		//list.get(0).getText();
		//System.out.println("First value is "+list.get(0).getText());
		
		ArrayList list1 = new ArrayList();
		
		for(int i =0; i<list.size()-1; i++) {
			
			String str = list.get(i).getText();
			String result = str.replaceAll("[^0-9]", "");
			//list1.add(result);
			System.out.println("Value without dollar "+result);
		}
		
		System.out.println("Results are "+list1);
		
		
		
		
	}

}
