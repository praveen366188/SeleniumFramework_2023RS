package rest_assured.ra_4_Pojo.serialization;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();
        googleMap.setAccuracy(20);
        googleMap.setName("praveen");
        googleMap.setPhone_number("8124447027");
        googleMap.setAddress("I-603 100 main");
        googleMap.setWebsite("www.google.com/");
        googleMap.setLanguage("Marathi");
        Location location = new Location();
        location.setLng(1276.12F);
        location.setLat(1231.23F);
        googleMap.setLocation(location);
        List<String> l=new ArrayList<>(Arrays.asList("NONO","HOHO"));
        googleMap.setTypes(l);
        RestAssured.baseURI="https://rahulshettyacademy.com";
        Response response = RestAssured.given().queryParam("key", "qaclick123")
                .body(googleMap).log().all()
                .when().post("/maps/api/place/add/json");
        System.out.println(response.body().toString());
        System.out.println(response.statusCode());

    }


}
