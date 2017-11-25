package com.gmail.alecace013.simple.calc.tests.logger;

import com.gmail.alexace013.simple.calc.logger.Log4JWrapper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Log4JWrapperTest {

    @Test
    public void testTrace() {
        Log4JWrapper.trace("trace test");
    }

    @Test
    public void testDebug() {
        Log4JWrapper.debug("debug test");
    }

    @Test
    public void testInfo() {
        Log4JWrapper.info("info test");
    }

    @Test
    public void testWarn() {
        Log4JWrapper.warn("warn test");
    }

    @Test
    public void testError() {
        Log4JWrapper.error("error test");
    }

}
