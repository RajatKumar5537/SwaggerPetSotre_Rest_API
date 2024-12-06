package API.Endpoint;

/*
 Base URL - https://petstore.swagger.io/
 
 POST- https://petstore.swagger.io/v2/user
 GET - https://petstore.swagger.io/v2/user/{username}
 PUT - https://petstore.swagger.io/v2/user/{username}
 DELETE - https://petstore.swagger.io/v2/user/{username}
 
*/
public class Routes {

	public static String baseURL = "https://petstore.swagger.io/v2/";

	// User Module
	public static String post_URL = baseURL + "user";
	public static String get_URL = baseURL + "user/{username}";
	public static String put_URL = baseURL + "user/{username}";
	public static String delete_URL = baseURL + "user/{username}";

	
//	Store Module
	
//		Here we will create Store module's URL
	
//	Pet Module
	
//		Here we will create Pet module's URL
}
