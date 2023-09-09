package rest_assured.ra_1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import rest_assured.files.payload.Payloads;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo_Test_1 {

    public static void main(String[] args) {

        RestAssured.baseURI="https://rahulshettyacademy.com";
       String response= given().queryParam("key","qaclick123").header("Content-Type","application/json")
               .log().all().body(Payloads.getPostPayloadAddPlace()).when().post("/maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("status",equalTo("OK")).extract().response().asString();
        System.out.println(response);

        JsonPath jsonPath=new JsonPath(response);
        String place_id=jsonPath.getString("place_id");
        System.out.println(place_id);

    }

}
