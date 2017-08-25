package examples.predicate_examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.function.Predicate;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimplePredicateExampleTest {

    private static final String TEXT_TEST_01 = "test";
    private static final String TEXT_TEST_02 = TEXT_TEST_01.replaceFirst("t", "T");
    private static final String TEXT_TEST_03 = "tesT";

    Predicate<String> isTextContainsWordTest = new Predicate<String>() {
        @Override
        public boolean test(String expectedWord) {
            return expectedWord.equals(TEXT_TEST_01);
        }
    };

    @Test
    public void simplePredicatePositiveTest() {
        assertTrue(isTextContainsWordTest.test(TEXT_TEST_01));
    }

    @Test
    public void simplePredicateNegativeTest01() {
        assertFalse(isTextContainsWordTest.test(TEXT_TEST_02));
    }

    @Test
    public void simplePredicateNegativeTest02() {
        assertFalse(isTextContainsWordTest.test(TEXT_TEST_03));
    }

}
