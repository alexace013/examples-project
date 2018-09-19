package utils.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import utils.projectPropertiesLoader.Property;
import utils.propertyLoader.PropertyLoaderPrototype;

@Getter
@AllArgsConstructor
public enum Test {
    TEST(new PropertyLoaderPrototype(
            Property.TEST.getProperty())
            .getParamAsString("test.value"));
    private String testValue;
}