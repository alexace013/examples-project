package examples.collections_examples.examples;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static examples.collections_examples.examples.CollectionsExamples.*;

public class CollectionsExamplesTest {

    private static final Logger LOG = Logger.getLogger(CollectionsExamplesTest.class);

    private static final List<String> LIST = Arrays.asList("test1", "test2", "test3", "test4", "test5");

    @Test
    public void positiveCollectionsExamplesCollectionsShuffle() {
        assertTrue(collectionsShuffle(LIST));
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

    @Test
    public void negative01CollectionsExamplesCollectionsShuffle() {
        assertFalse(collectionsShuffle(null));
        String methodName = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName()
                .concat("()");
        LOG.info(String.format("method <%s> passed successful", methodName));
    }

}
