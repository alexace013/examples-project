package examples.simpleCalc;

import examples.simpleCalc.actions.MessageBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import static examples.simpleCalc.actions.MathAction.*;

class SimpleCalcDoubleTests {

    public SimpleCalcDoubleTests() {
    }

    private static final Logger LOG = LogManager.getLogger(SimpleCalcDoubleTests.class);

    private static CalcControl control;
    private static final double VALUE_2_25 = 2.25d;
    private static final double VALUE_3_75 = 3.75d;
    private static final double VALUE_1_5 = 1.5d;
    private static final double VALUE_6_0 = 6.0d;
    private static final double VALUE_DELTA = 0.5d;
    private static final String NEGATIVE_MESSAGE = "something wrongs";
    private static final String POSITIVE_MESSAGE = NEGATIVE_MESSAGE;
    private static final String CALLED_METHOD_TEXT = "CALLED %s TEST METHOD";
    private static final String TEXT_POSITIVE = "POSITIVE TEST";
    private static final String TEXT_NEGATIVE = "NEGATIVE TEST";
    private static final String TEXT_SUM = "SUM:";
    private static final String TEXT_DIFF = "DIFFERENCE:";
    private static final String TEXT_MULT = "MULTIPLICATION:";
    private static final String TEXT_DIV = "DIVISION:";

    @BeforeAll
    static void createCalcControl() {
        control = new CalcControl();
    }

    @Test
    void testSumPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_SUM,
                        TEXT_POSITIVE,
                        PLUS.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_2_25,
                        VALUE_3_75,
                        VALUE_6_0
                )
        );
        assertEquals(POSITIVE_MESSAGE, VALUE_6_0, control.sum(VALUE_2_25, VALUE_3_75), VALUE_DELTA);
    }

    @Test
    void testSumNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_SUM,
                        TEXT_NEGATIVE,
                        PLUS.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_2_25,
                        VALUE_3_75,
                        VALUE_6_0
                )
        );
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_2_25, control.sum(VALUE_2_25, VALUE_2_25));
    }

    @Test
    void testDiffPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_DIFF,
                        TEXT_POSITIVE,
                        MINUS.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_3_75,
                        VALUE_2_25,
                        VALUE_1_5
                )
        );
        assertEquals(VALUE_1_5, control.difference(VALUE_3_75, VALUE_2_25), VALUE_DELTA);
    }

    @Test
    void testDiffNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_DIFF,
                        TEXT_NEGATIVE,
                        MINUS.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_6_0,
                        VALUE_1_5,
                        VALUE_6_0
                )
        );
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_6_0, control.difference(VALUE_6_0, VALUE_1_5));
    }

    @Test
    void testMultPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        double pow = Math.pow(VALUE_6_0, control.sum(VALUE_1_5, VALUE_DELTA));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_MULT,
                        TEXT_POSITIVE,
                        MULT.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_6_0,
                        VALUE_6_0,
                        pow
                )
        );
        assertEquals(pow, control.multiplication(VALUE_6_0, VALUE_6_0), VALUE_DELTA);
    }

    @Test
    void testMultNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_MULT,
                        TEXT_NEGATIVE,
                        MULT.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_6_0,
                        VALUE_3_75,
                        VALUE_2_25
                )
        );
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_2_25, control.multiplication(VALUE_6_0, VALUE_3_75));
    }

    @Test
    void testDivPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_DIV,
                        TEXT_NEGATIVE,
                        MULT.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_6_0,
                        VALUE_3_75,
                        VALUE_2_25
                )
        );
        assertEquals(control.sum(VALUE_6_0, VALUE_6_0), control.division(VALUE_6_0, VALUE_DELTA), VALUE_DELTA);
    }

    @Test
    void testDivNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_MULT,
                        TEXT_NEGATIVE,
                        MULT.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_6_0,
                        VALUE_2_25,
                        VALUE_6_0
                )
        );
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_6_0, control.division(VALUE_6_0, VALUE_2_25));
    }

}
