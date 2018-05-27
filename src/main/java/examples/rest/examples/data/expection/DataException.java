package examples.rest.examples.data.expection;

public class DataException extends Exception {

    private static final String EXCEPTION_TXT = "<DATA EXCEPTION>:\n<<%s>>";

    public DataException(final String message) {
        super(String.format(EXCEPTION_TXT, message));
    }

}
