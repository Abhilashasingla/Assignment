package RestAPI.Example;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteData {
	@Test 
	public void DeleteEmployeeData() {
		  RestAssured.baseURI= "http://dummy.restapiexample.com";
		  String response=given().log().all().header("Content-Type","application/json")
				  .when().delete("public/api/v1/delete/2")
				  .then().assertThat().statusCode(200).body("scope",equalTo("APP"))
				  .header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();		  
		  System.out.println(response);
	  }
}
