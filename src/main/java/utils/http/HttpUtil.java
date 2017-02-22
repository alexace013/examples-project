package utils.http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {

    private static URL url;
    private static HttpURLConnection connection;

    /**
     * Get the response code from a page
     *
     * @param page page URL
     * @return response code
     * @throws IOException
     */
    public static int getResponseCode(String page) throws IOException {
        url = new URL(page);
        connection = (HttpURLConnection) url.openConnection();
        return connection.getResponseCode();
    }

}
