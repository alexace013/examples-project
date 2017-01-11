package utils;

import com.jayway.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.RestAssured.get;

public class Rest {

    public String getRequest(String url, String parameter) throws JSONException {
        Response response = get(url);
        JSONArray jsonResponse = new JSONArray(response.asString());
        return jsonResponse.getJSONObject(0).getString(parameter);
    }

    public String getRequest(String url, int index, String parameter) throws JSONException {
        Response response = get(url);
        JSONArray jsonResponse = new JSONArray(response.asString());
        return jsonResponse.getJSONObject(index).getString(parameter);
    }

}
