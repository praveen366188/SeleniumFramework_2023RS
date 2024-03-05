package java_practice.practice;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RestAssuredEndToEnd {

    public static String getCreateUserBody(){
        return "{\n" +
                "    \"name\": \"praveen\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
    }
    public static void main(String[] args) {

        RestAssured.baseURI="https://reqres.in/";





        Response response=given().body(getCreateUserBody()).when().post("/api/users")
                .then().statusCode(201).extract().response();
        System.out.println(response.asString());
        System.out.println("body->"+response.getBody().asString());
        System.out.println("getContentType->"+response.getContentType());
        System.out.println("status code->"+response.getStatusCode());
        JsonPath jsonPath=new JsonPath(response.asString());
//        String id=jsonPath.getString("id");

        response=given().header("Content-Type","application/json").when().get("/api/users/2")
                .then().extract().response();
        System.out.println(response.getBody().asString());

        response=given().header("Content-Type","application/json").body("{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"2342432423\"\n" +
                "}").when().post("/api/login")
                .then().extract().response();
        System.out.println("----->"+response.getBody());
        System.out.println(response.getTime());


    }

}
