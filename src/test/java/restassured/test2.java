package restassured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class test2 {
     @Test
	public void test()
	{
    	 given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.email[1]",equalTo("lindsay.ferguson@reqres.in")).log().all();
    	
	}
	}