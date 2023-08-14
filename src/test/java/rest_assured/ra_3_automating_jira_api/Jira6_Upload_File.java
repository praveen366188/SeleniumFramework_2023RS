package rest_assured.ra_3_automating_jira_api;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Jira6_Upload_File {
    public static void upload_file(SessionFilter sessionFilter,String id){
        RestAssured.baseURI = "http://localhost:8080";

        given().header("X-Atlassian-Token","no-check").filter(sessionFilter)
                .pathParam("key",id).header("Content-Type","multipart/form-data")
                .multiPart("file",new File("src/test/java/rest_assured/ra_3_automating_jira_api/jira.txt")).when().
                post("rest/api/2/issue/{key}/attachments").then().log().all().statusCode(200);




    }


}
