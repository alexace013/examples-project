package com.gmail.alexace013.simple.calc.utils;

import com.gmail.alexace013.simple.calc.exception.PropertyReaderUtilException;
import lombok.Getter;
import org.apache.log4j.*;

import java.io.IOException;

import static com.gmail.alexace013.simple.calc.utils.PropertyReaderUtil.getPropertyParameter;

public class Log4JWrapper {

    private static final Logger LOGGER = Logger.getLogger(Log4JWrapper.class.getName());
    private static final String LOG_4_J_WRAPPER_PROPERTIES = "/log4JWrapper.properties";
    private static final String LOG_FILE_NAME = "calc.app.log";
    private static final String USER_DIR = "user.dir";
    private static final String LOG_PATH = "log.path";

    @Getter
    private enum Log {

        MESSAGE_PATTERN(MessagePattern.MESSAGE_PATTERN.getMessage()),
        TRACE("TRACE" + MESSAGE_PATTERN.getLog()),
        DEBUG("DEBUG" + MESSAGE_PATTERN.getLog()),
        INFO("INFO" + MESSAGE_PATTERN.getLog()),
        WARN("WARN" + MESSAGE_PATTERN.getLog()),
        ERROR("ERROR" + MESSAGE_PATTERN.getLog());

        private String log;

        Log(String log) {
            this.log = log;
        }

        @Getter
        private enum MessagePattern {

            MESSAGE_PATTERN(": %s");

            private String message;

            MessagePattern(String message) {
                this.message = message;
            }

        }

    }

    private static void layout() {
        Layout layout = new PatternLayout(PatternLayout.TTCC_CONVERSION_PATTERN);
        try {
            final String userDir = System.getProperty(USER_DIR);
            final String logPath = getPropertyParameter(LOG_4_J_WRAPPER_PROPERTIES, "log.path");
            LOGGER.addAppender(new FileAppender(layout, userDir + logPath + LOG_FILE_NAME));
        } catch (IOException | PropertyReaderUtilException e) {
            error(e.getMessage());
        }
    }

    public static void trace(String message) {
        LOGGER.trace(String.format(Log.DEBUG.getLog(), message));
        layout();
    }

    public static void debug(String message) {
        LOGGER.debug(String.format(Log.TRACE.getLog(), message));
        layout();
    }

    public static void info(String message) {
        LOGGER.info(String.format(Log.INFO.getLog(), message));
        layout();
    }

    public static void warn(String message) {
        LOGGER.warn(String.format(Log.WARN.getLog(), message));
        layout();
    }

    public static void error(String message) {
        LOGGER.error(String.format(Log.ERROR.getLog(), message));
        layout();
    }
}
