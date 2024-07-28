package rest_assured.ra_4_Pojo.deserial;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Demo1 {
    public static void main(String[] args) {
        List<Coffee> a= given().when().get("https://api.sampleapis.com/beers/ale").then().extract().response().as(AllCoffees.class).getCoffee();
//        System.out.println(allCoffees.getCoffee().get(1));


    }
}
