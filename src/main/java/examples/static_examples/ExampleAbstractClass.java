package examples.static_examples;

import java.util.Date;

public abstract class ExampleAbstractClass {

    public static byte valueAbstract = 102;
    private static Date date;

    public String getDateNow() {
        date = new Date();
        return date.toString();
    }

    protected abstract void someMethod(String str, int value);

    abstract int someMethod();

    public byte getValue() {
        return valueAbstract;
    }

    public void setValue(byte newValue) {
        valueAbstract = newValue;
    }

}
