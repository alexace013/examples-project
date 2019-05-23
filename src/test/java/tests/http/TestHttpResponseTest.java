package tests.http;

import org.apache.http.HttpStatus;
import org.junit.Test;
import utils.http.HttpUtil;

import java.io.IOException;

import static org.junit.Assert.*;
import static java.lang.System.out;

public class TestHttpResponseTest {

    private static int response;

    @Test
    public void testHttpUtil_response_200() {
        try {
            response = HttpUtil.getResponseCode("http://www.testurl.com/");
            assertEquals(HttpStatus.SC_OK, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.printf("response %s", response);
    }

    @Test
    public void testHttpUtil_response_404() {
        try {
            response = HttpUtil.getResponseCode("http://www.testurl.com/main");
            assertEquals(HttpStatus.SC_NOT_FOUND, response);
        } catch (IOException e) {

        }
        out.printf("response %s", response);
    }

}
