package com.gmail.alexace013.simple.calc.utils;

import com.gmail.alexace013.simple.calc.exception.PropertyReaderUtilException;

import java.io.IOException;
import java.util.Properties;

import static com.gmail.alexace013.simple.calc.logger.Log4JWrapper.error;

public class PropertyReaderUtil {

    public static String getPropertyParameter(final String property,
                                              final String parameter)
            throws PropertyReaderUtilException {
        Properties properties = new Properties();
        try {
            properties.load(PropertyReaderUtil.class.getResourceAsStream(property));
        } catch (IOException e) {
            error(e.getMessage());
        }
        if (parameter != null) {
            return properties.getProperty(parameter);
        }
        throw new PropertyReaderUtilException("property parameter is null");
    }
}
