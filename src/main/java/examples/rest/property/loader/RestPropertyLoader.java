package examples.rest.property.loader;

import examples.rest.property.RestProperty;
import utils.logger.Log4JWrapper;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;

public final class RestPropertyLoader {

    private static final String[] PROPERTIES_FILES = {RestProperty.DATA.getProperty()};
    private static Map propertiesMap = Collections.emptyMap();

    public static synchronized String getProperty(final String property) {
        if (property.isEmpty()) {
            dataLoad();
        }
        return String.valueOf(propertiesMap.get(property));
    }

    private static void dataLoad() {
        final Properties properties = new Properties();
        try {
            for (String property : PROPERTIES_FILES) {
                properties.load(RestPropertyLoader.class.getResourceAsStream(property));
                propertiesMap = properties;
            }
        } catch (IOException e) {
            Log4JWrapper.error(e.toString());
        }
    }
}