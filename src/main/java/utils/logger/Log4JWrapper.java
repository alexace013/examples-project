package utils.logger;

import lombok.Getter;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import java.io.IOException;

import static java.lang.String.format;
import static java.lang.System.getProperty;
import static org.apache.log4j.Logger.getLogger;

public class Log4JWrapper {

    private static final Logger LOGGER = getLogger(Log4JWrapper.getCurrentClassName());
    private static final String LOG_FILE_NAME = "examples-project.log";
    private static final String USER_DIR = "user.dir";
    private static final String LOG_PATH = "/target/logs/";

    private static String getCurrentClassName() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            return e.getStackTrace()[1].getClassName();
        }
    }

    @Getter
    private enum Log {

        MESSAGE_PATTERN(MessagePattern.MESSAGE_PATTERN.getMessage()),
        TRACE("TRACE" + MESSAGE_PATTERN.getLogPattern()),
        DEBUG("DEBUG" + MESSAGE_PATTERN.getLogPattern()),
        INFO("INFO" + MESSAGE_PATTERN.getLogPattern()),
        WARN("WARN" + MESSAGE_PATTERN.getLogPattern()),
        ERROR("ERROR" + MESSAGE_PATTERN.getLogPattern());

        private String logPattern;

        Log(String log) {
            this.logPattern = log;
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
            final String user_dir = getProperty(USER_DIR);
            LOGGER.addAppender(new FileAppender(layout, user_dir + LOG_PATH + LOG_FILE_NAME));
        } catch (IOException e) {
            error(e.getMessage());
        }
    }

    public static void trace(final String message) {
        LOGGER.trace(format(Log.TRACE.getLogPattern(), message));
        layout();
    }

    public static void debug(final String message) {
        LOGGER.debug(format(Log.DEBUG.getLogPattern(), message));
        layout();
    }

    public static void info(final String message) {
        LOGGER.info(format(Log.INFO.getLogPattern(), message));
        layout();
    }

    public static void warn(final String message) {
        LOGGER.warn(format(Log.WARN.getLogPattern(), message));
        layout();
    }

    public static void error(final String message) {
        LOGGER.error(format(Log.ERROR.getLogPattern(), message));
        layout();
    }
}
