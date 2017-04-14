package examples.stringsExamples;

import org.junit.Test;

import static org.junit.Assert.*;
import static examples.stringsExamples.StringSplitExample.getValue;

public class StringSplitExampleTest {

    @Test
    public void test01() {
        assertEquals(getValue("145,784USD"), 145784);
    }

    @Test
    public void test02() {
        assertEquals(getValue("7,145USD"), 7146);
    }

    @Test
    public void test03() {
        assertEquals(getValue("test798,12EUR"), 79812);
    }

}
