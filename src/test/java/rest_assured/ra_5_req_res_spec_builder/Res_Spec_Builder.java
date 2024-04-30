package rest_assured.ra_5_req_res_spec_builder;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import rest_assured.files.payload.Payloads;
import rest_assured.ra_1.CommonMethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Res_Spec_Builder {

    public static void main(String[] args) {
        /*
         * Create a place and verify its creation, then store the place ID
         * Perform a GET call using the place ID
         * Update the place using the place ID and verify the address
         * Perform another GET call to verify the updated address
         * Delete the place and verify the status code
         * Perform a GET call using the place ID to verify a 404 error - negative test case
         */

        // Creating Request Specification
        RequestSpecification reqSpec = new RequestSpecBuilder()
                .setBaseUri("https://rahulshettyacademy.com")
                .addQueryParam("key", "qaclick123")
                .addHeader("Content-Type", "application/json")
                .build();

        // Creating Response Specification
        ResponseSpecification resSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();

        RestAssured.baseURI = "https://rahulshettyacademy.com";

        // POST request to create a place and verify its creation
        String response = given().spec(reqSpec)
                .body(Payloads.getPostPayloadAddPlace())
                .when().post("/maps/api/place/add/json")
                .then().assertThat().spec(resSpec).body("status", equalTo("OK")).extract().response().asString();

        String placeId = CommonMethods.returnJsonObjString(response, "place_id");
        System.out.println("Place ID: " + placeId);

        // GET request using the place ID
        response = given().spec(reqSpec)
                .queryParam("place_id", placeId)
                .when().get("/maps/api/place/get/json")
                .then().spec(resSpec).extract().response().asString();
        System.out.println("Response for GET request: " + response);

        // PUT request to update the place and verify the address
        response = given().spec(reqSpec).body("{\n" +
                        "    \"place_id\": \"" + placeId + "\",\n" +
                        "    \"address\": \"70 praveenkumar walk, USA\",\n" +
                        "    \"key\": \"qaclick123\"\n" +
                        "}")
                .when().put("/maps/api/place/update/json")
                .then().spec(resSpec).extract().response().asString();

        String msg = CommonMethods.returnJsonObjString(response, "msg");
        Assert.assertEquals(msg, "Address successfully updated");
        System.out.println("Address successfully updated.");

        // GET request to verify the updated address
        response = given().spec(reqSpec)
                .queryParam("place_id", placeId)
                .when().get("/maps/api/place/get/json")
                .then().spec(resSpec).extract().response().asString();
        System.out.println("Response for GET request after update: " + response);

        // DELETE request to delete the place
        given().body("{\n" +
                        "    \"place_id\": \"" + placeId + "\"\n" +
                        "}").when().delete("/maps/api/place/delete/json")
                .then().spec(resSpec);
        System.out.println("Place deleted successfully.");

        // GET request to verify 404 error - negative test case
        response = given().spec(reqSpec)
                .queryParam("place_id", placeId)
                .when().get("/maps/api/place/get/json")
                .then().statusCode(404).extract().response().asString();
        msg = CommonMethods.returnJsonObjString(response, "msg");
        Assert.assertEquals(msg, "Get operation failed, looks like place_id  doesn't exists");
        System.out.println("Response for GET request after deletion: " + response);
    }
}
