package examples.lambda_examples;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static examples.lambda_examples.LambdaExamplesWithList.*;

public class LambdaExamplesWithListTest {

    private static final Logger LOG = Logger.getLogger(LambdaExamplesWithListTest.class);

    private static final List<String> STRING_LIST = Arrays.asList("text", "test", "for", "example", "before", "java8");
    private static final String EXPECTED_TEXT = "before, example, for, java8, test, text";
    private List<String> resultList;

    @Test
    public void positiveLambdaExamplesWithListGetSortingStringListBeforeJava8() {
        LOG.info(String.format("list before sorting: %s", STRING_LIST));
        resultList = getSortingStringListBeforeJava8(STRING_LIST);
        LOG.info(String.format("list afret soring: %s", resultList));
        assertEquals(Arrays.asList(EXPECTED_TEXT.split(", ")), resultList);
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void positiveLambdaExamplesWithListGetSortingStringListAfterJava8() {
        LOG.info(String.format("list before sorting: %s", STRING_LIST));
        resultList = getSortingStringListAfterJava8(STRING_LIST);
        LOG.info(String.format("list afret soring: %s", resultList));
        assertEquals(Arrays.asList(EXPECTED_TEXT.split(", ")), resultList);
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

}
