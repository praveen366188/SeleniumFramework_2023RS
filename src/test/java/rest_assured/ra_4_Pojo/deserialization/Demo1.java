package rest_assured.ra_4_Pojo.deserialization;

import io.restassured.RestAssured;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Demo1 {

    public static void main(String[] args) {
        // Deserialization is the reverse process of serialization;
        // it converts the formatted data (JSON or XML) back into Java objects.
        RestAssured.baseURI = "https://reqres.in";
        ListOfResource listOfResource = given().header("Content-Type", "application/json").when().get("/api/unknown")
                .then().statusCode(200).extract().response().as(ListOfResource.class);
//        System.out.println(given().header("Content-Type", "application/json").when().get("/api/unknown")
//                .then().statusCode(200).extract().response().asString());
        System.out.println(listOfResource.getPage());
        System.out.println(listOfResource.getPer_page());
        System.out.println(listOfResource.getTotal());
        System.out.println(listOfResource.getTotal_pages());
        List<Data> listOfResourceData = listOfResource.getData();
        for (Data l :
                listOfResourceData) {
            System.out.println("-----");
            System.out.println( l.getId());
            System.out.println(l.getName());
            System.out.println(l.getColor());
            System.out.println(l.getYear());
            System.out.println(l.getPantone_value());
        }
        Support support= listOfResource.getSupport();
        System.out.println(support.getText());
        System.out.println(support.getUrl());

    }
}
