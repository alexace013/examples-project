package examples.collections_examples.list_examples;

import org.apache.log4j.Logger;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListExamples02Test {

    private static final Logger LOG = Logger.getLogger(ListExamples01Test.class);

    private static List<Integer> list = new ArrayList<>();

    @BeforeClass
    public static void setUp() {
        for (int i = 0; i < 100; i++) {
            ListExamples01.addValueIntoList(list, generateRandomValue());
        }
    }

    @After
    public void tearDown() {
        list = null;
    }

    @Test
    public void test01() {
        for (String info : ListExamples01.getInfoAboutList(list)) {
            System.out.println(info);
        }
        System.out.println(String.format("list sum = %d", ListExamples01.sumAllValuesFromList(list)));
        assertTrue(ListExamples01.sumAllValuesFromList(list) != 0);
    }

    @Test
    public void test02() {
        try {
            assertFalse(ListExamples01.sumAllValuesFromList(list) == 0);
        } catch (NullPointerException e) {
            LOG.warn(e);
        }
    }

    @Test
    public void test03() {
        try {
            assertTrue(!ListExamples01.isListEmpty(list));
        } catch (Exception e) {
            LOG.error(e);
        }
    }

    @Test
    public void test04() {
        try {
            ListExamples01.clearList(list);
            assertTrue(ListExamples01.isListEmpty(list));
        } catch (Exception e) {
            LOG.error(e);
        }
    }

    private static int generateRandomValue() {
        return (int) (Math.random() * 100);
    }

}
