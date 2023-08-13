package rest_assured.ra_2_different_ways_of_json_input;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import rest_assured.ra_1.CommonMethods;

import static io.restassured.RestAssured.*;

public class DynamicJsonExample {
    @Test
    public void test01(){
        RestAssured.baseURI="http://216.10.245.166";
        String response= given().body(add_book_payload("jfdl","234")).when().post("Library/Addbook.php")
                .then().statusCode(200).extract().response().asString();

        String msg=CommonMethods.returnJsonObjString(response,"Msg");
        String id=CommonMethods.returnJsonObjString(response,"ID");
        System.out.println(id);
        System.out.println(msg);
        RestAssured.baseURI="http://216.10.245.166";
         response= given().body(delete_book_payload(id)).when().post("/Library/DeleteBook.php")
                .then().statusCode(200).extract().response().asString();

         msg=CommonMethods.returnJsonObjString(response,"msg");
        System.out.println(msg);

    }
    public String add_book_payload(String isbn,String aisle)
    {

        return "{\n" +
                "\n" +
                "\"name\":\"Learn Appium Automation with Java\",\n" +
                "\"isbn\":\""+isbn+"\",\n" +
                "\"aisle\":\""+aisle+"\",\n" +
                "\"author\":\"John foe\"\n" +
                "}\n";
    }
    public String delete_book_payload(String id){
        return "{\n" +
                " \n" +
                "\"ID\" : \""+id+"\"\n" +
                " \n" +
                "} \n";
    }


}
