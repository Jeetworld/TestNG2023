package Interview;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import Base.NewBase;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

public class BrokenLinks extends NewBase{
		
	@Test
	public void checkTheBrokenLink() {
		driver.get("https://www.selenium.dev/");
		driver.navigate().refresh();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("size of all links :: "+list.size());
		for(WebElement ele : list) {
			//System.out.println("urls :: "+ele.getAttribute("href"));
			verifyTheLink(ele.getAttribute("href"));
		}
	}
	
	public static void verifyTheLink(String url) {
		ResponseSpecification response = new ResponseSpecBuilder()
				 .expectStatusCode(200)
				.expectResponseTime(Matchers.lessThan(15000L))
				 .build();
		
		System.out.println("URL :: "+url);
		int expectedStatusCode = 200;
		Response res = RestAssured
				.given()
				.when()
				.get(url)
				.then()
				.spec(response)
				.extract()
				.response();
		System.out.println("STATUSCODE :: "+res.getStatusCode());
		if(res.getStatusCode()>=400 || res.getStatusCode()>=500) {
			System.out.println("links is NOT valid");
		}
		else
			System.out.println("link is  valid");
				
	}
	
}
