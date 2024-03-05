package rest_assured.PracticeFeb2;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.*;


public class GetPlace {
    public static void main(String[] args) {
        RestAssured.baseURI="https://rahulshettyacademy.com";
        Response response=given().queryParam("key","qaclick123").queryParam("place_id","a324d7f004d4921aabea60ea32c9d576")
                .when().get("/maps/api/place/get/json").then().extract().response();
        System.out.println(response.asString());
        Assert.assertEquals(response.statusCode(),200);
        JsonPath jsonPath=new JsonPath(response.asString());
        Assert.assertEquals(jsonPath.getString("location.latitude"),"-38.383494");
        Assert.assertEquals(jsonPath.getString("location.longitude"),"33.427362");
        Assert.assertEquals(jsonPath.getString("accuracy"),"50");
        Assert.assertEquals(jsonPath.getString("name"),"Frontline house");
        Assert.assertEquals(jsonPath.getString("phone_number"),"(+91) 8124447027");
        Assert.assertEquals(jsonPath.getString("address"),"70 Tejal Ashok Praveenkumar, USA");
        Assert.assertEquals(jsonPath.getString("types"),"shoe park,shop");
        Assert.assertEquals(jsonPath.getString("website"),"http://google.com");
        Assert.assertEquals(jsonPath.getString("language"),"French-IN");






    }
}
