package examples.collections_examples.list_examples.exceptions;

public class ListIsNotCreateException extends Exception {

    public ListIsNotCreateException() {
    }

    public ListIsNotCreateException(String message) {
        super(String.format("%s: %s", ListIsNotCreateException.class.getCanonicalName(), message));
    }

}
