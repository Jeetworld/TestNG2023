package Practise;


import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import Base.NewBase;

//@Listeners(TestListener.class)
//@Listeners(AnnotationTransformer.class)
public class ListenersPractise extends NewBase {
	
	@Test
	public void methodOne() throws Exception {
		
		System.out.println("this is method one");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		throw new Exception("this is exception !!");
	}
	
	@Test
	public void methodtwo() {
		
		System.out.println("this is method two");
	}

}
