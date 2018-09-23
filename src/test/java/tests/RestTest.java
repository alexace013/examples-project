package tests;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.junit.Test;
import utils.Rest;

import static org.junit.Assert.assertEquals;

public class RestTest {

    private Rest rest = new Rest();
    private int index = 0;
    private static final Logger log = Logger.getLogger(RestTest.class);

    @Test
    public void getRequestFindCapital() throws JSONException {
        String url = "http://restcountries.eu/rest/v1/name/norway";
        String parameter = "capital";
        String expectedResult = "Oslo";
        String actualResult = rest.getRequest(url, index, parameter);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getRequestFindRegion() throws JSONException {
        String url = "http://restcountries.eu/rest/v1/name/usa";
        String parameter = "region";
        String expectedResult = "Americas";
        String actualResult = rest.getRequest(url, parameter);
        assertEquals(expectedResult, actualResult);
    }

}
