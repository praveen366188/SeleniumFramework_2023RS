package rest_assured.ra_3_automating_jira_api;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Jira3_Get_Issue {

    public static int getIssue(SessionFilter sessionFilter,String id) {
        RestAssured.baseURI = "http://localhost:8080";

        Response response = given().filter(sessionFilter).when().get("/rest/api/2/issue/"+id+"")
                .then().extract().response();

        return response.statusCode();


    }

}
