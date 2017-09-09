package examples.stringsExamples;

import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class StringExamples {

    private static final Logger LOG = Logger.getLogger(StringExamples.class);

    private static final String NOT_ENDS_WITH = "<%s> IS NOT ENDS WITH <%s>";
    private static final String IS_NULL = "TEXT <%s> or ENDS <%s> is NULL!";

    @Nullable
    static String exampleEndsWith(
            final String text,
            final String ends) throws Exception {
        LOG.info(String.format("TEXT: %s", text));
        LOG.info(String.format("ENDS: %s", ends));
        if (text == null || ends == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                LOG.error(String.format(IS_NULL, text, ends));
            }
        }
        assert text != null;
        assert ends != null;
        if (text.endsWith(ends)) {
            return text.subSequence((text.length() - ends.length()),
                    text.length()).toString();
        }
        throw new Exception(String.format(NOT_ENDS_WITH, text, ends));
    }

}
