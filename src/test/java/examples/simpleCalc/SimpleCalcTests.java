package examples.simpleCalc;

import lombok.extern.java.Log;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

@Log
class SimpleCalcTests {

    private static CalcControl control;
    private static final int VALUE_2 = 2;
    private static final int VALUE_3 = 3;
    private static final int VALUE_5 = 5;
    private static final int VALUE_6 = 6;
    private static final String NEGATIVE_MESSAGE = "something wrongs";
    private static final String POSITIVE_MESSAGE = NEGATIVE_MESSAGE;

    @BeforeAll
    static void createCalcControl() {
        control = new CalcControl();
    }

    @Test
    void testSumPositive() {
        log.info(SimpleCalcTests.class.getMethods()[0].getName());
        assertEquals(POSITIVE_MESSAGE, VALUE_5, control.sum(VALUE_2, VALUE_3));
    }

    @Test
    void testSumNegative() {
        log.info(SimpleCalcTests.class.getMethods()[0].getName());
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_2, control.sum(VALUE_2, VALUE_2));
    }

    @Test
    void testDiffPositive() {
        log.info(SimpleCalcTests.class.getMethods()[0].getName());
        assertEquals(POSITIVE_MESSAGE, VALUE_2, control.difference(VALUE_5, VALUE_3));
    }

    @Test
    void testDiffNegative() {
        log.info(SimpleCalcTests.class.getMethods()[0].getName());
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_6, control.difference(VALUE_6, VALUE_5));
    }

    @Test
    void testMultPositive() {
        log.info(SimpleCalcTests.class.getMethods()[0].getName());
        assertEquals(POSITIVE_MESSAGE, VALUE_6, control.multiplication(VALUE_2, VALUE_3));
    }

    @Test
    void testMultNegative() {
        log.info(SimpleCalcTests.class.getMethods()[0].getName());
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_2, control.multiplication(VALUE_6, VALUE_3));
    }

    @Test
    void testDivPositive() {
        log.info(SimpleCalcTests.class.getMethods()[0].getName());
        assertEquals(POSITIVE_MESSAGE, VALUE_2, control.division(VALUE_6, VALUE_3));
    }

    @Test
    void testDivNegative() {
        log.info(SimpleCalcTests.class.getMethods()[0].getName());
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_6, control.division(VALUE_6, VALUE_2));
    }

}
