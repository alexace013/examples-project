package examples.simpleCalc.actions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import static java.lang.String.format;

public class MessageBuilder {

    private static final Logger LOG = LogManager.getLogger(MessageBuilder.class);

    @NotNull
    public static String getMessage(final String messageBody,
                                    final String status,
                                    final String mathAction,
                                    final String mathActionResult,
                                    final double valueA,
                                    final double valueB,
                                    final double result) {
        return new StringBuilder()
                .append(format("%s ", messageBody))
                .append(format("%s", status))
                .append(format(" %1$,.2f ", valueA))
                .append(mathAction)
                .append(format(" %1$,.2f ", valueB))
                .append(format("%s ", mathActionResult))
                .append(format("%1$,.2f ", result))
                .toString();
    }

    @NotNull
    public static String getMessage(final String messageBody,
                                    final String status,
                                    final String mathAction,
                                    final String mathActionResult,
                                    final int valueA,
                                    final int valueB,
                                    final int result) {
        return new StringBuilder()
                .append(format("%s ", messageBody))
                .append(format("%s", status))
                .append(format(" %d ", valueA))
                .append(mathAction)
                .append(format(" %d ", valueB))
                .append(format("%s ", mathActionResult))
                .append(format("%d ", result))
                .toString();
    }

}
