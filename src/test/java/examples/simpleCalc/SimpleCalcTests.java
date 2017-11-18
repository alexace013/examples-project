package examples.simpleCalc;

import lombok.extern.java.Log;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static java.lang.String.format;

@Log
class SimpleCalcTests {

    private static final Logger LOG = LogManager.getLogger(SimpleCalcTests.class);

    private static CalcControl control;
    private static final int VALUE_2 = 2;
    private static final int VALUE_3 = 3;
    private static final int VALUE_5 = 5;
    private static final int VALUE_6 = 6;
    private static final String NEGATIVE_MESSAGE = "something wrongs";
    private static final String POSITIVE_MESSAGE = NEGATIVE_MESSAGE;
    private static final String CALLED_METHOD_TEXT = "CALLED %s TEST METHOD";

    @BeforeAll
    static void createCalcControl() {
        control = new CalcControl();
    }

    @Test
    void testSumPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        assertEquals(POSITIVE_MESSAGE, VALUE_5, control.sum(VALUE_2, VALUE_3));
    }

    @Test
    void testSumNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_2, control.sum(VALUE_2, VALUE_2));
    }

    @Test
    void testDiffPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        assertEquals(POSITIVE_MESSAGE, VALUE_2, control.difference(VALUE_5, VALUE_3));
    }

    @Test
    void testDiffNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_6, control.difference(VALUE_6, VALUE_5));
    }

    @Test
    void testMultPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        assertEquals(POSITIVE_MESSAGE, VALUE_6, control.multiplication(VALUE_2, VALUE_3));
    }

    @Test
    void testMultNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_2, control.multiplication(VALUE_6, VALUE_3));
    }

    @Test
    void testDivPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        assertEquals(POSITIVE_MESSAGE, VALUE_2, control.division(VALUE_6, VALUE_3));
    }

    @Test
    void testDivNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_6, control.division(VALUE_6, VALUE_2));
    }

}
