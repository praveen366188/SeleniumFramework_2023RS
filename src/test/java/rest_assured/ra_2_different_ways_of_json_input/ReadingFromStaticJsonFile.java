package rest_assured.ra_2_different_ways_of_json_input;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import rest_assured.ra_1.CommonMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class ReadingFromStaticJsonFile {
@Test
    public void test001() throws IOException, InterruptedException {
    RestAssured.baseURI="http://216.10.245.166";
    String response= given().body(Files.readAllBytes(Paths.get("C:\\Users\\Admin\\IdeaProjects\\SeleniumFrameword\\src\\test\\java\\rest_assured\\ra_2\\test_payload.json"))).
            when().post("Library/Addbook.php")
            .then().statusCode(200).extract().response().asString();

    String msg=CommonMethods.returnJsonObjString(response,"Msg");
    String id=CommonMethods.returnJsonObjString(response,"ID");
    System.out.println(id);
    System.out.println(msg);
    Thread.sleep(2000);
    RestAssured.baseURI="http://216.10.245.166";
    response= given().body(delete_book_payload(id)).when().post("/Library/DeleteBook.php")
            .then().statusCode(200).extract().response().asString();

    msg=CommonMethods.returnJsonObjString(response,"msg");
    System.out.println(msg);

}

    public String delete_book_payload(String id){
        return "{\n" +
                " \n" +
                "\"ID\" : \""+id+"\"\n" +
                " \n" +
                "} \n";
    }


}
