package examples.json_examples.jsonParseExamples;

import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class UtilJSONParse {

    @Nullable
    public static Object jsonReturnParam(String str, String returnParam) throws JSONException {
        JSONObject json = new JSONObject(str);
        String name = json.getString("name");
        int value = json.getInt("value");
        switch (returnParam) {
            case "name":
                return name;
            case "value":
                return value;
            default:
                return null;
        }
    }

}
