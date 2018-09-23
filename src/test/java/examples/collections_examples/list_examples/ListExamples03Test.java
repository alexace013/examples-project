package examples.collections_examples.list_examples;

import examples.collections_examples.list_examples.exceptions.FindWordIsNotPresentInTheString;
import examples.collections_examples.list_examples.exceptions.ListIsNotCreateException;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import utils.propertyLoader.PropertyLoader;

import static org.junit.Assert.*;

public class ListExamples03Test {

    private static ListExamples02 listExamples02;
    private static String TEST_DATA;
    private static final Logger LOG = Logger.getLogger(ListExamples03Test.class);

    @BeforeClass
    public static void preCondition() {
        listExamples02 = new ListExamples02();
        TEST_DATA = PropertyLoader.loadText("listExamples02TestText01");
    }

    @Test
    public void test01() throws FindWordIsNotPresentInTheString, ListIsNotCreateException {
        String word = "test";
        listExamples02.addWordsInTheList(TEST_DATA, word);
        for (String str : listExamples02.getList()) {
            LOG.info(str);
        }
        int worldsListSize = listExamples02.countTheWordFromTheList(word);
        LOG.info(String.format("found '%d' words in the list", worldsListSize));
        assertTrue(worldsListSize > 0);
    }

}
