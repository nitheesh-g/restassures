package restassured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class getandpostexamples {
	//@Test
	public void testget()
	{
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.first_name[0]", equalTo("Michael"));
	}
	@Test
	public void testpost() {
		Map<String, Object> request=new HashMap<String, Object>();
				request.put("name", "Nitheesh");
				request.put("job","testing");
				JSONObject re=new JSONObject(request);
				//System.out.println(re);
				System.out.println(re.toJSONString());
				given().body(re.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
		
		
		
		
	}
	

}
