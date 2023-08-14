package rest_assured.ra_3_automating_jira_api;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import static io.restassured.RestAssured.given;

public class Jira5_DeleteIssue {

    public static void delete_issue(SessionFilter sessionFilter,String id){
        RestAssured.baseURI="http://localhost:8080";
        given().filter(sessionFilter).when().delete("/rest/api/2/issue/"+id+"")
                .then().assertThat().statusCode(204);

    }

}
