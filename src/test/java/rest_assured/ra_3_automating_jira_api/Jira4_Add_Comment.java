package rest_assured.ra_3_automating_jira_api;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import static io.restassured.RestAssured.given;

public class Jira4_Add_Comment {

    public static void add_comment(SessionFilter sessionFilter, String id, String comment) {
        RestAssured.baseURI = "http://localhost:8080";
       String response= given().body(get_add_comment_payload("comment added")).header("Content-Type","application/json").filter(sessionFilter)
                .when().post("/rest/api/2/issue/"+id+"/comment").then()
                .statusCode(201).extract().response().asString();

    }

    public static String get_add_comment_payload(String comment){
        return "{\n" +
                "    \"body\": \""+comment+"\",\n" +
                "    \"visibility\": {\n" +
                "        \"type\": \"role\",\n" +
                "        \"value\": \"Administrators\"\n" +
                "    }\n" +
                "}";
    }
}

