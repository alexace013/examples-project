package examples.stringsExamples;

import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

class StringExamples {

    private static final Logger LOG = Logger.getLogger(StringExamples.class);

    private static final String NOT_ENDS_WITH = "<%s> IS NOT ENDS WITH <%s>";
    private static final String NOT_STARTS_WITH = "<%s> IS NOT STARTS WITH <%s>";
    private static final String IS_NULL = "TEXT <%s> or ENDS <%s> is NULL!";

    @Nullable
    static String exampleEndsWith(
            final String text,
            final String ends) throws Exception {
        LOG.info(String.format("TEXT: %s", text));
        LOG.info(String.format("ENDS: %s", ends));
        isParametersNull(text, ends);
        if (text.endsWith(ends)) {
            return text.subSequence((text.length() - ends.length()),
                    text.length()).toString();
        }
        throw new Exception(String.format(NOT_ENDS_WITH, text, ends));
    }

    @Nullable
    static String exampleStartsWith(final String text, final String starts) throws Exception {
        LOG.info(String.format("TEXT: %s", text));
        LOG.info(String.format("STARTS: %s", starts));
        isParametersNull(text, starts);
        if (text.startsWith(starts)) {
            return text.subSequence(0, starts.length()).toString();
        }
        throw new Exception(String.format(NOT_STARTS_WITH, text, starts));
    }

    private static void isParametersNull(final String param1, final String param2) {
        if (param1 == null || param2 == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                LOG.error(String.format(IS_NULL, param1, param2));
            }
        }
        assert param1 != null;
        assert param2 != null;
    }

}
