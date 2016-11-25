package examples.static_examples;

public class ExampleClass extends ExampleAbstractClass implements ExampleInterface, ExampleInterface2 {

    public static final float value = 103.7F;

    public ExampleClass() {
    }

    public ExampleClass(int value) {
        setValue((byte) value);
    }

    public void someMethod(String str, int value) {
        // some logic
    }

    public int someMethod(String str) {
        return Integer.parseInt(str);
    }

    public int someMethod() {
        return getValue();
    }

    public String someMethod(ExampleClass exampleClass) {
        return exampleClass.getDateNow();
    }
}