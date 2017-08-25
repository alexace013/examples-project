package examples.stringsExamples;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import static examples.stringsExamples.StringEndsWithAndRegexExample.*;

@FixMethodOrder(MethodSorters.JVM)
public class StringEndsWithAndRegexExampleTest {

    private static String TEXT;
    private static String WORD_TEST;
    private static String WORD_WORK;
    private static String REGEX;

    @BeforeClass
    public static void createText() {
        TEXT = "this is the test data for check the correctly work.";
        WORD_TEST = "test";
        WORD_WORK = "work";
        REGEX = " ";
    }

    @Test
    public void positiveTest_isTextContainsWord() {
        assertTrue(isTextContainsWord(TEXT, REGEX, WORD_TEST));
    }

    @Test
    public void negativeTest_isTextContainsWord_01() {
        char charE = 'e';
        char charO = 'o';
        assertFalse(isTextContainsWord(TEXT, REGEX, WORD_TEST.replaceAll(String.valueOf(charE), String.valueOf(charO))));
    }

    @Test
    public void positiveTest_isTextEndsWith() {
        assertTrue(isTextEndsWith(TEXT.substring(0, TEXT.length() - 1), WORD_WORK));
    }

    @Test
    public void negativeTest_isTextEndsWith() {
        assertFalse(isTextEndsWith(TEXT, WORD_WORK));
    }

}
