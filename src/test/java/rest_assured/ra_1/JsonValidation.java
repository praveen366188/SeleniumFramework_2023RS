package rest_assured.ra_1;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import rest_assured.files.payload.Payloads;

public class JsonValidation {
    public static void main(String[] args) {
//        1. Print No of courses returned by API
//        2.Print Purchase Amount
//        3. Print Title of the first course
//        4. Print All course titles and their respective Prices
//        5. Print no of copies sold by RPA Course
//        6. Verify if Sum of all Course prices matches with Purchase Amount

        JsonPath jsonPath = new JsonPath(Payloads.mockJSON());
        int total_course_count = jsonPath.getInt("courses.size()");
        System.out.println(total_course_count);
        System.out.println(jsonPath.getString("dashboard.purchaseAmount"));
        System.out.println(jsonPath.getString("courses[0].title"));
        for (int i = 0; i < total_course_count; i++) {

            System.out.println(jsonPath.getString("courses[" + i + "].title") + "->" + jsonPath.getInt("courses[" + i + "].price"));

        }
//        5. Print no of copies sold by RPA Course
        for (int i = 0; i < total_course_count; i++) {

            if (jsonPath.getString("courses[" + i + "].title").equalsIgnoreCase("RPA")) {
                System.out.println("total no of course sold by " + jsonPath.getString("courses[" + i + "].title") + "-> " + jsonPath.getString("courses[" + i + "].copies"));
                break;
            }
        }
        int sum=0;
//        6. Verify if Sum of all Course prices matches with Purchase Amount
        for (int i = 0; i < total_course_count; i++) {
            sum=sum+ jsonPath.getInt("courses[" + i + "].price")*jsonPath.getInt("courses[" + i + "].copies");

        }
        System.out.println(sum);
        Assert.assertEquals(sum,jsonPath.getInt("dashboard.purchaseAmount"));


    }
}
