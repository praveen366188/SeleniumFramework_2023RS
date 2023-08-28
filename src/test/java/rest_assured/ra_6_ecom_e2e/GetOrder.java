package rest_assured.ra_6_ecom_e2e;

import com.mysql.cj.log.Log;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class GetOrder {
    public static void get_order(){
        RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
                .addQueryParam("id",CreateOrder.order_id)
                .addHeader("authorization", Login.token).build();

       String response= given().spec(requestSpecification).when().get("/api/ecom/order/get-orders-details")
                .then().statusCode(200).extract().response().asString();
//        RestAssured.baseURI="https://rahulshettyacademy.com";
//       Response response= given().header("Authorization", Login.token)
//               .queryParam("id",AddProduct.product_id).header("Content-Type", "application/json").when().get("/api/ecom/order/get-orders-details")
//                .then().statusCode(200).extract().response();
        System.out.println(response);
    }
}
