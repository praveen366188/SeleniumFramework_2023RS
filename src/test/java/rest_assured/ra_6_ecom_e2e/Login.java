package rest_assured.ra_6_ecom_e2e;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import rest_assured.ra_6_ecom_e2e.pojo.login_pojo.Login_req_pojo;
import rest_assured.ra_6_ecom_e2e.pojo.login_pojo.Login_res_pojo;

import static io.restassured.RestAssured.given;

public class Login {
public static String token;
public static String userId;
    public static void login_to_get_token() {
        RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("Content-Type","application/json").build();
        Login_req_pojo loginPojo = new Login_req_pojo();
        loginPojo.setUserEmail("praveen366188@gmail.com");
        loginPojo.setUserPassword("au*!ZYRZV8S#Jb");
        Login_res_pojo loginResPojo = given().spec(requestSpecification).body(loginPojo).when().post("/api/ecom/auth/login")
                .then().statusCode(200).extract().response().as(Login_res_pojo.class);
        System.out.println(loginResPojo.getToken());
        token=loginResPojo.getToken();
        userId=loginResPojo.getUserId();
        System.out.println(loginResPojo.getMessage());
        System.out.println(loginResPojo.getUserId());


    }
}
