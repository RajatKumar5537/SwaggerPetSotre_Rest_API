package API.Endpoint;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import API_Payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UserEndPoint {

	public static Response createUser(User payload) {
		
		Response response = given()
			.contentType(ContentType.JSON)
			.contentType(ContentType.JSON)
			.body(payload)
		.when()
			.post(Routes.post_URL);
		
		return response;
	}
	
	public static Response getUser(String userName) {
		
		Response response = given()
			.pathParam("username", userName)
		.when()
			.get(Routes.get_URL);
		
		return response;
	}
	
	public static Response putUser(String userName, User payload) {
		Response response = given()	
				.contentType(ContentType.JSON)
				.contentType(ContentType.JSON)
				.pathParam("username", userName)
				.body(payload)
			.when()
				.put(Routes.put_URL);
		return response;
	}
	
	public static Response deleteUser(String userName) {
		Response response = given()
				.pathParam("username", userName)
			.when()
				.delete(Routes.delete_URL);
		return response;
	}
}
