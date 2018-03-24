package utils.propertyLoader;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import utils.annotations.AnnotationReader;
import utils.annotations.Only4Test;
import utils.logger.Log4JWrapper;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class PropertyLoaderPrototype implements Serializable {

    private static final String MESSAGE_PART_1 = "!!!";
    private static final String MESSAGE_PART_2 = "  *   *   *   *   *   ";
    private static final String MESSAGE_TEXT = "PROPERTY %s HAVE SOME PROBLEMS";
    private static final String PROPERTY_LOAD_ERROR = "PROPERTIES AREN'T LOADED";
    private static final Properties PROPERTIES = new Properties();
    private static Map propertiesMap = new HashMap<>();

    public PropertyLoaderPrototype(final String... properties) {
        for (String property : properties) {
            try {
                PROPERTIES.load(PropertyLoaderPrototype.class.getResourceAsStream(property));
            } catch (IOException e) {
                Log4JWrapper.error(e.getMessage());
            }
        }
    }

    public static void setProperties(final String... properties) {
        loadProperties(properties);
    }

    @Only4Test(text = "4 TEST ONLY", version = 0.02)
    @Contract(pure = true)
    public static String getPropertyLoadErrorText() {
        Log4JWrapper.debug(AnnotationReader
                .getAnnotationOnly4TestMessageText(
                        PropertyLoaderPrototype.class));
        return PROPERTY_LOAD_ERROR;
    }

    public static void main(String[] args) {
        System.out.println(getPropertyLoadErrorText());
    }

    public String getParamAsString(final String param) {
        return PROPERTIES.getProperty(param);
    }

    @NotNull
    public Integer getParamAsIntegerValue(final String param) {
        return Integer.parseInt(getParamAsString(param));
    }

    private static void loadProperties(final String... properties) {
        if (properties.length >= 1) {
            try {
                for (String propertyName : properties) {
                    PROPERTIES.load(PropertyLoaderPrototype.class.getResourceAsStream(propertyName));
                    propertiesMap = PROPERTIES;
                }
            } catch (IOException | NullPointerException e) {
                if (e instanceof NullPointerException) {
                    Log4JWrapper.debug(String.format("properties is %s", ((NullPointerException) e).getMessage()));
                    Log4JWrapper.error(((NullPointerException) e).getMessage());
                } else {
                    for (String propertyName : properties) {
                        Log4JWrapper.error(getErrorMessageText(propertyName));
                    }
                }
            }
        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                Log4JWrapper.error(PROPERTY_LOAD_ERROR);
            }
        }
    }

    private static String getErrorMessageText(final String propertyName) {
        return String.format(new StringBuilder()
                .append(MESSAGE_PART_1)
                .append(MESSAGE_PART_2)
                .append(MESSAGE_TEXT)
                .append(MESSAGE_PART_2)
                .append(MESSAGE_PART_1)
                .toString(), propertyName);
    }

}
