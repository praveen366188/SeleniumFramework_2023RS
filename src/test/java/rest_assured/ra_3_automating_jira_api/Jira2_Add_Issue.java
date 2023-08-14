package rest_assured.ra_3_automating_jira_api;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import static io.restassured.RestAssured.given;

public class Jira2_Add_Issue {

    public static String add_issue(SessionFilter sessionFilter) {
        RestAssured.baseURI = "http://localhost:8080";
        String response = given().header("Content-Type", "application/json").body(get_add_issue_payload())
                .filter(sessionFilter).when().post("/rest/api/2/issue")
                .then().statusCode(201).extract().response().asString();
        return response;


    }

    public static String get_add_issue_payload() {
        return "{\n" +
                "    \"fields\": {\n" +
                "        \"project\": {\n" +
                "            \"key\": \"PRAV\"\n" +
                "        },\n" +
                "        \"summary\": \"Debit card Defect\",\n" +
                "        \"description\": \"The fields that can be set on create, in either the fields parameter or the update parameter.\",\n" +
                "        \"issuetype\": {\n" +
                "            \"name\": \"Bug\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

}
