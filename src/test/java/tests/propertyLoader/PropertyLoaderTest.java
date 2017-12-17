package tests.propertyLoader;

import org.junit.Ignore;
import org.junit.Test;
import utils.logger.Log4JWrapper;
import utils.propertyLoader.PropertyLoaderPrototype;

public class PropertyLoaderTest {

    @Test
    public void negativeTest01() {
        Log4JWrapper.info("negative test");
        PropertyLoaderPrototype.setProperties("failed.properties");
    }

    @Ignore
    @Test
    public void testPropertyErrorText() {
        Log4JWrapper.info(PropertyLoaderPrototype.getPropertyLoadErrorText());
    }

}
