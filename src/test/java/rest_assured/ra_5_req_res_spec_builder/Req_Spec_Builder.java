package rest_assured.ra_5_req_res_spec_builder;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import rest_assured.files.payload.Payloads;
import rest_assured.ra_1.CommonMethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Req_Spec_Builder {

    public static void main(String[] args) {
        /*
         * create a place and verify its created and store the place id POST call
         * using the place id get the place GET call
         * using the place id update the place and verify the address PUT call
         * using get call and verify the updated address GET call
         * delete the place that we created and verify the status code
         * using the place id and get the place and verify the 404 error code - get call - negative test case
         * */
//        create a place and verify its created and store the place id POST call
        RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123")
                .addHeader("Content-Type", "application/json").build();

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().spec(req)
                .body(Payloads.getPostPayloadAddPlace()).when().post("/maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("status", equalTo("OK")).extract().response().asString();

        String place_id = CommonMethods.returnJsonObjString(response, "place_id");
        System.out.println(place_id);
//        using the place id get the place GET call

        response = given().spec(req).queryParam("place_id", place_id)
                .when().get("/maps/api/place/get/json")
                .then().statusCode(200).extract().response().asString();

//        using the place id update the place and verify the address PUT call

        response = given().spec(req).body("{\n" +
                        "    \"place_id\": \"" + place_id + "\",\n" +
                        "    \"address\": \"70 praveenkumar walk, USA\",\n" +
                        "    \"key\": \"qaclick123\"\n" +
                        "}")
                .when().put("/maps/api/place/update/json")
                .then().statusCode(200).extract().response().asString();

        String msg = CommonMethods.returnJsonObjString(response, "msg");
        Assert.assertEquals(msg, "Address successfully updated");

        response = given().spec(req).queryParam("place_id", place_id)
                .when().get("/maps/api/place/get/json")
                .then().statusCode(200).extract().response().asString();

        String address = CommonMethods.returnJsonObjString(response, "address");
        Assert.assertEquals(address, "70 praveenkumar walk, USA");


        given().body("{\n" +
                        "    \"place_id\": \"" + place_id + "\"\n" +
                        "}").when().delete("/maps/api/place/delete/json")
                .then().statusCode(200);


        response = given().spec(req).queryParam("place_id", place_id)
                .when().get("/maps/api/place/get/json")
                .then().statusCode(404).extract().response().asString();
        msg = CommonMethods.returnJsonObjString(response, "msg");
        Assert.assertEquals(msg, "Get operation failed, looks like place_id  doesn't exists");
        System.out.println(response);

    }

}
