package examples.parameterized_examples;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import static java.lang.System.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParametersTest {

    private String value;
    private static boolean flag = true;

    public ParametersTest(String value) {
        this.value = value;
    }

    @Parameters
    public static Object[] data() {
        return new Object[]{
                "testValue1",
                "testValue2"};
    }

    @Ignore
    @Test
    public void valueTest01() {
        String testValue = value;
        if (flag) {
            out.println(testValue);
            assertEquals(testValue, "testValue1");
            flag = false;
        } else {
            out.println(testValue);
            assertEquals(testValue, "testValue2");
        }
    }

}
