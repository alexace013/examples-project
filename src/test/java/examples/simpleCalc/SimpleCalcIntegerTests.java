package examples.simpleCalc;

import examples.simpleCalc.actions.MessageBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static examples.simpleCalc.actions.MathAction.*;
import static org.junit.Assert.*;
import static java.lang.String.format;

class SimpleCalcIntegerTests {

    private static final Logger LOG = LogManager.getLogger(SimpleCalcIntegerTests.class);

    private static CalcControl control;
    private static final int VALUE_2 = 2;
    private static final int VALUE_3 = 3;
    private static final int VALUE_5 = 5;
    private static final int VALUE_6 = 6;
    private static final String NEGATIVE_MESSAGE = "something wrongs";
    private static final String POSITIVE_MESSAGE = NEGATIVE_MESSAGE;
    private static final String CALLED_METHOD_TEXT = "CALLED %s TEST METHOD";
    private static final java.lang.String TEXT_POSITIVE = "POSITIVE TEST";
    private static final java.lang.String TEXT_NEGATIVE = "NEGATIVE TEST";
    private static final java.lang.String TEXT_SUM = "SUM:";
    private static final java.lang.String TEXT_DIFF = "DIFFERENCE:";
    private static final java.lang.String TEXT_MULT = "MULTIPLICATION:";
    private static final java.lang.String TEXT_DIV = "DIVISION:";

    @BeforeAll
    static void createCalcControl() {
        control = new CalcControl();
    }

    @DisplayName(TEXT_SUM + TEXT_POSITIVE)
    @Test
    void testSumPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_SUM,
                        TEXT_POSITIVE,
                        PLUS.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_2,
                        VALUE_3,
                        VALUE_5
                )
        );
        assertEquals(POSITIVE_MESSAGE, VALUE_5, control.sum(VALUE_2, VALUE_3));
    }

    @DisplayName(TEXT_SUM + TEXT_NEGATIVE)
    @Test
    void testSumNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_SUM,
                        TEXT_NEGATIVE,
                        PLUS.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_2,
                        VALUE_2,
                        VALUE_2
                )
        );
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_2, control.sum(VALUE_2, VALUE_2));
    }

    @DisplayName(TEXT_DIFF + TEXT_POSITIVE)
    @Test
    void testDiffPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_DIFF,
                        TEXT_POSITIVE,
                        MINUS.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_5,
                        VALUE_3,
                        VALUE_2
                )
        );
        assertEquals(POSITIVE_MESSAGE, VALUE_2, control.difference(VALUE_5, VALUE_3));
    }

    @DisplayName(TEXT_DIFF + TEXT_NEGATIVE)
    @Test
    void testDiffNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_DIFF,
                        TEXT_NEGATIVE,
                        MINUS.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_6,
                        VALUE_5,
                        VALUE_6
                )
        );
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_6, control.difference(VALUE_6, VALUE_5));
    }

    @DisplayName(TEXT_MULT + TEXT_POSITIVE)
    @Test
    void testMultPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_MULT,
                        TEXT_POSITIVE,
                        MULT.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_2,
                        VALUE_3,
                        VALUE_6
                )
        );
        assertEquals(POSITIVE_MESSAGE, VALUE_6, control.multiplication(VALUE_2, VALUE_3));
    }

    @DisplayName(TEXT_MULT + TEXT_NEGATIVE)
    @Test
    void testMultNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_MULT,
                        TEXT_NEGATIVE,
                        MULT.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_6,
                        VALUE_3,
                        VALUE_2
                )
        );
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_2, control.multiplication(VALUE_6, VALUE_3));
    }

    @DisplayName(TEXT_DIV + TEXT_POSITIVE)
    @Test
    void testDivPositive() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_DIV,
                        TEXT_POSITIVE,
                        DIV.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_6,
                        VALUE_3,
                        VALUE_2
                )
        );
        assertEquals(POSITIVE_MESSAGE, VALUE_2, control.division(VALUE_6, VALUE_3));
    }

    @DisplayName(TEXT_DIV + TEXT_NEGATIVE)
    @Test
    void testDivNegative() {
        LOG.info(format(CALLED_METHOD_TEXT,
                Thread.currentThread().getStackTrace()[1].getMethodName()));
        LOG.debug(MessageBuilder
                .getMessage(TEXT_DIV,
                        TEXT_NEGATIVE,
                        DIV.getMathAction(),
                        RESULT.getMathAction(),
                        VALUE_6,
                        VALUE_2,
                        VALUE_6
                )
        );
        assertNotEquals(NEGATIVE_MESSAGE, VALUE_6, control.division(VALUE_6, VALUE_2));
    }

}
