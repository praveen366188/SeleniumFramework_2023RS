package rest_assured.ra_6_ecom_e2e;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import rest_assured.ra_6_ecom_e2e.pojo.add_product.Add_Product_Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class AddProduct {
    public static String product_id;
    public static void add_product(){
        RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
                addHeader("Authorization",Login.token).build();

        RequestSpecification add_product=given().log().all().spec(requestSpecification).
                param("productName","helmet").
                param("productAddedBy",Login.userId).
                param("productCategory","mechanical").
                param("productSubCategory","accessories").
                param("productPrice","1350").
                param("productDescription","Bike Helmet").
                param("productFor","men").
                multiPart("productImage",new File("src/test/java/rest_assured/ra_6_ecom_e2e/motorcycle_helmets_PNG9630-min.png"));
   Add_Product_Response response=add_product.when().post("/api/ecom/product/add-product").then().statusCode(201)
        .extract().response().as(Add_Product_Response.class);
        System.out.println(response.getMessage());
product_id=response.getProductId();
        System.out.println(product_id);

    }
}
