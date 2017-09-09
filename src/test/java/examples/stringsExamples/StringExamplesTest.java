package examples.stringsExamples;

import org.apache.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import static examples.stringsExamples.StringExamples.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringExamplesTest {

    private static final Logger LOG = Logger.getLogger(StringExamples.class);

    private static final String TEXT = "This is the test text";
    private static final String ENDS = "ext";
    private static final String ENDS_2 = "exc";
    private static final String STARTS = "Thi";
    private static final String STARTS_2 = "The";

    @Test
    public void positiveTestStringExamplesEndsWith() throws Exception {
        assertEquals(exampleEndsWith(TEXT, ENDS), ENDS);
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void negativeTest01StringExamplesEndsWith() {
        try {
            assertNotEquals(exampleEndsWith(TEXT, ENDS_2), ENDS);
            String methodName = Thread.currentThread()
                    .getStackTrace()[1]
                    .getMethodName()
                    .concat("()");
            LOG.info(String.format("method <%s> passed successful", methodName));
        } catch (Exception e) {
            LOG.error(e);
        }
    }

    @Test
    public void negativeTest02StringExamplesEndsWith() throws Exception {
        assertNotEquals(exampleEndsWith(TEXT, ENDS), ENDS_2);
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void negativeTest03StringExamplesEndsWith() throws Exception {
        try {
            assertEquals(exampleEndsWith(null, ENDS), ENDS);
        } catch (AssertionError e) {
            LOG.error(e.getStackTrace()[0]);
            LOG.error(e.getStackTrace()[1]);
        }
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void negativeTest04StringExamplesEndsWith() throws Exception {
        try {
            assertEquals(exampleEndsWith(TEXT, null), ENDS);
        } catch (AssertionError e) {
            LOG.error(e.getStackTrace()[0]);
            LOG.error(e.getStackTrace()[1]);
        }
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void negativeTest05StringExamplesEndsWith() throws Exception {
        try {
            assertEquals(exampleEndsWith(TEXT, ENDS), null);
        } catch (AssertionError e) {
            for (int i = 0; i < e.getStackTrace().length; i++) {
                LOG.error(e.getStackTrace()[i]);
            }
        }
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void positiveTestStringExamplesStartsWith() throws Exception {
        assertEquals(exampleStartsWith(TEXT, STARTS), STARTS);
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void negativeTest01StringExamplesStartsWith() {
        try {
            assertNotEquals(exampleStartsWith(TEXT, STARTS_2), STARTS);
            String methodName = Thread.currentThread()
                    .getStackTrace()[1]
                    .getMethodName()
                    .concat("()");
            LOG.info(String.format("method <%s> passed successful", methodName));
        } catch (Exception e) {
            LOG.error(e);
        }
    }

    @Test
    public void negativeTest02StringExamplesStartsWith() throws Exception {
        assertNotEquals(exampleStartsWith(TEXT, STARTS), STARTS_2);
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void negativeTest03StringExamplesStartsWith() throws Exception {
        try {
            assertEquals(exampleStartsWith(null, STARTS), STARTS);
        } catch (AssertionError e) {
            LOG.error(e.getStackTrace()[0]);
            LOG.error(e.getStackTrace()[1]);
        }
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void negativeTest04StringExamplesStartsWith() throws Exception {
        try {
            assertEquals(exampleStartsWith(TEXT, null), STARTS);
        } catch (AssertionError e) {
            LOG.error(e.getStackTrace()[0]);
            LOG.error(e.getStackTrace()[1]);
        }
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void negativeTest05StringExamplesStartsWith() throws Exception {
        try {
            assertEquals(exampleStartsWith(TEXT, STARTS), null);
        } catch (AssertionError e) {
            for (int i = 0; i < e.getStackTrace().length; i++) {
                LOG.error(e.getStackTrace()[i]);
            }
        }
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

}
