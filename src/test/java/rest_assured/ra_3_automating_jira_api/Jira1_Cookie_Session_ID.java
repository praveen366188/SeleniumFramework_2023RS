package rest_assured.ra_3_automating_jira_api;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import static io.restassured.RestAssured.*;

public class Jira1_Cookie_Session_ID {

    public static SessionFilter create_session(){
        SessionFilter sessionFilter=new SessionFilter();
        RestAssured.baseURI="http://localhost:8080";
        String response=given().header("Content-Type","application/json").body("{ \"username\": \"praveen366188\", \"password\": \"Jira@5432\" }")
                .filter(sessionFilter).when().post("/rest/auth/1/session")
                .then().statusCode(200).extract().response().asString();
        System.out.println(response);
        return sessionFilter;

    }

}
