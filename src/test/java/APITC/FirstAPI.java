package APITC;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstAPI {
	
	@Test
	public void firstAPI() {
		
		RequestSpecification req = RestAssured
				.given()
				.baseUri("https://dummy.restapiexample.com/api/v1")
				.header("Content-Type","application/json");
		Response res = req
				.when()
				.get("/employee")
				.then()
				.log()
				.all()
				.extract()
				.response();
		
		System.out.println("Sttaus code is "+res.getStatusCode());
		
				
	}

}
