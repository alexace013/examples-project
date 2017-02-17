package examples.patterns.builder.expections;

public class IncorrectSexException extends Exception {

    public IncorrectSexException(String message) {
        super(String.format("IncorrectSexException: < %s >", message));
    }

}
