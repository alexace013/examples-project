package examples.static_examples;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TestStaticExamples {

    private static final Logger log = Logger.getLogger(TestStaticExamples.class);
    private ExampleClass exampleClass = new ExampleClass();
    private static int time;

    @Test
    public void test01() {
        assertEquals(102, ExampleClass.valueAbstract);
    }

    @Test
    public void test02() {
        exampleClass = new ExampleClass(58);
        assertEquals(102, ExampleClass.valueAbstract);
    }

    @Test
    public void test03() {
        log.info(exampleClass.getValue());
        log.info(exampleClass.someMethod());
        assertEquals(exampleClass.getValue(), exampleClass.someMethod());
    }

    @Test
    public void test04() {
        time = getTime();
        String date = exampleClass.someMethod(exampleClass);
        System.out.println(date);
        log.info(String.format("time was installed %s", time));
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date1 = new Date();
        assertEquals(date, date1.toString());
    }

    @Test
    public void test05() {
        log.info(String.format("FLOAT value = %s DOUBLE value = %s",
                ExampleClass.value, ExampleClass.value3));
        assertTrue(ExampleClass.value == ExampleClass.value3);
    }

    @Test
    public void test06() {
        assertFalse(ExampleClass.value > ExampleClass.value2);
    }

    private int getTime() {
        int data = exampleClass.someMethod("1000");
        return data;
    }

}
