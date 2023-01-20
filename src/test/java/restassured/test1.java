package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test1 {
	
	
	@Test
	public void test()
	{
		 
		Response res= RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusLine());
		int code=res.getStatusCode();
		
		Assert.assertEquals(code, 201);
		
	}

}
