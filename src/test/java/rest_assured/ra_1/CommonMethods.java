package rest_assured.ra_1;

import io.restassured.path.json.JsonPath;

public class CommonMethods {
    public static String returnJsonObjString(String response, String key){

        return new JsonPath(response).getString(key);
    }
}
