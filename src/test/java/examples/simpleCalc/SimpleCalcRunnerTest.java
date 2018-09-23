package examples.simpleCalc;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        SimpleCalcIntegerTest.class,
        SimpleCalcDoubleTest.class
})
public class SimpleCalcRunnerTest {
}
