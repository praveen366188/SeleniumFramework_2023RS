package rest_assured.ra_2_different_ways_of_json_input;

import io.restassured.RestAssured;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import rest_assured.ra_1.CommonMethods;

import static io.restassured.RestAssured.given;

public class JsonWithDataProvider {
    @Test(dataProvider = "getData", invocationCount = 2)
    public void test01(String isbn,String aisle){
        RestAssured.baseURI="http://216.10.245.166";
        String response= given().body(add_book_payload(isbn,aisle)).when().post("Library/Addbook.php")
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


    @DataProvider
    public Object[][] getData(){
        return new Object[][] {{"ab2cc","212"},{"ab3cc","212"},{"ab4cc","212"},
                {"ab12cc","212"},{"1ab3cc","212"},{"ab14c1c","212"},
                {"ab22cc","212"},{"ab33cc","212"},{"ab44cc","212"}
        ,{"a6b2cc","212"},{"7ab3cc","212"},{"ab48cc","212"}};
    }


}
