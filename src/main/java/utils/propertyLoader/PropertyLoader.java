package utils.propertyLoader;

import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    private static final String PROPERTY_FILE = "/testDataText.properties";

    public static String loadText(String name) {
        Properties properties = new Properties();
        try {
            properties.load(PropertyLoader.class.getResourceAsStream(PROPERTY_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value = "";
        if (name != null) {
            value = properties.getProperty(name);
        }
        return value;

    }

}
