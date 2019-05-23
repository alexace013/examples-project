package tests.propertyLoader;

import static utils.logger.Log4JWrapper.info;

import org.junit.Ignore;
import org.junit.Test;
import utils.propertyLoader.PropertyLoaderPrototype;

public class PropertyLoaderTest {

    @Test
    public void negativeTest01() {
        info("negative test");
        PropertyLoaderPrototype.setProperties("failed.properties");
    }

    @Ignore
    @Test
    public void testPropertyErrorText() {
        info(PropertyLoaderPrototype.getPropertyLoadErrorText());
    }

}
