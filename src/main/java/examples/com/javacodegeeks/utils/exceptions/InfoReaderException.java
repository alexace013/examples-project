package examples.com.javacodegeeks.utils.exceptions;

public class InfoReaderException extends Exception {
    public InfoReaderException(final String msg) {
        super(String.format("INFO_READER_EXCEPTION: %s", msg));
    }
}
