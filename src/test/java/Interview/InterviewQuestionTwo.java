package Interview;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class InterviewQuestionTwo {
	//https://mocki.io/v1/2648dd48-61f8-4b8e-8abe-9b178f0b1220
	@Test
	public void interview() {
		
		RequestSpecification req = RestAssured
				.given()
				.baseUri("https://mocki.io")
				.header("Content-Type","Application/json");
		
		Response res = req
				.when()
				.get("/v1/2648dd48-61f8-4b8e-8abe-9b178f0b1220")
				.then()
				.log()
				.all()
				
				.extract()
				.response();
		System.out.println("OUTPUT IS "+res.asString());
		
		JsonPath js = new JsonPath(res.asString());
		System.out.println("full outpit is "+js.get("hsn[0]"));
		
		
			Assert.assertEquals(((String) js.get("hsn[0]")).length()  ,8);
			Assert.assertEquals(((String) js.get("hsn[1]")).length()  ,8);
			Assert.assertEquals(((String) js.get("hsn[2]")).length()  ,8);
			
		
			
		
		
		
		
		
	}

}
