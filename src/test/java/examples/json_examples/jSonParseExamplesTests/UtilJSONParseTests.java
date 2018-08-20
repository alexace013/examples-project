package examples.json_examples.jSonParseExamplesTests;

import examples.json_examples.jsonParseExamples.UtilJSONParse;
import org.apache.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UtilJSONParseTests {

    private static final Logger log = Logger.getLogger(UtilJSONParseTests.class);
    private static final String STR_JSON = "{ \"name\": \"Test\", \"value\": 0 }";

    @Test
    public void testName_01() {
        String name = (String) UtilJSONParse.jsonReturnParam(STR_JSON, "name");
        log.info(String.format("name: %s", name));
        assertEquals("Test", name);
    }

    @Test
    public void testValue_02() {
        int value;
        if (UtilJSONParse.jsonReturnParam(STR_JSON, "value") != null) {
            value = Integer.parseInt(UtilJSONParse.jsonReturnParam(STR_JSON, "value").toString());
        } else {
            value = -1;
            fail("value is null");
        }
        log.info(String.format("value = %d", value));
        assertEquals(0, value);
    }

    @Test
    public void testValue_03() {
        int value;
        if (UtilJSONParse.jsonReturnParam(STR_JSON, "null") != null) {
            value = Integer.parseInt(UtilJSONParse.jsonReturnParam(STR_JSON, "value").toString());
        } else {
            value = -1;
            fail("there is no such parameter in json file");
        }
        log.info(String.format("value = %d", value));
        assertEquals(0, value);
    }

    @Test
    public void testValue_04() {
        int value;
        if (UtilJSONParse.jsonReturnParam(STR_JSON, "null") != null) {
            value = Integer.parseInt(UtilJSONParse.jsonReturnParam(STR_JSON, "value").toString());
        } else {
            value = -1;
            try {
                fail("there is no such parameter in json file");
            } catch (AssertionError e) {
                log.error(e);
            }
        }
        log.info(String.format("value = %d", value));
        assertEquals(0, value);
    }

}
