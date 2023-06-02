package APITC;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DummyAPI {
	
	
	@Test
	public void abc() {
		
		RequestSpecification req = RestAssured
				.given()
				.log()
				.all()
				.baseUri("https://rahulshettyacademy.com")
				.queryParam("key", "qaclick123")
				.body("{\r\n"
						+ "  \"location\": {\r\n"
						+ "    \"lat\": -38.383494,\r\n"
						+ "    \"lng\": 33.427362\r\n"
						+ "  },\r\n"
						+ "  \"accuracy\": 50,\r\n"
						+ "  \"name\": \"Frontline house\",\r\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
						+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
						+ "  \"types\": [\r\n"
						+ "    \"shoe park\",\r\n"
						+ "    \"shop\"\r\n"
						+ "  ],\r\n"
						+ "  \"website\": \"http://google.com\",\r\n"
						+ "  \"language\": \"French-IN\"\r\n"
						+ "}\r\n"
						+ "");
		
		Response res = req
				.when()
				.log()
				.all()
				.post("/maps/api/place/add/json")
				.then()
				.extract()
				.response();
		
		System.out.println("RESPONSE IS "+res.asString());
		
		
				
	}

}
