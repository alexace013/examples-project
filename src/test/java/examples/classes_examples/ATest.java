package examples.classes_examples;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ATest {

    private static final Logger log = Logger.getLogger(ATest.class);
    private A a;

    @Before
    public void start() {
        a = new C();
    }

    @Ignore
    @Test
    public void test_1() {
        log.info(a.getText());
        assertEquals("result examples.classes_examples.A", a.getText());
    }

    @Test
    public void test_2() {
        a = new B();
        log.info(a.getText());
        assertEquals("result examples.classes_examples.B", a.getText());
    }

    @Test
    public void test_3() {
        log.info(a.getText());
        assertEquals("result examples.classes_examples.C", a.getText());
    }

}
