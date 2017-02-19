package examples.patterns.builder.expections;

public class IncorrectAgeException extends Exception {

    public IncorrectAgeException(String message) {
        super(String.format("IncorrectAgeException : < %s >", message));
    }

}
