package examples.generics_examples;

public class SomeGeneric<U> {

    private U unknown;
    private static int count = 0;

    public SomeGeneric(U unknown) {
        this.unknown = unknown;
        count++;
    }

    public U getUnknown() {
        return unknown;
    }

    public static int getCount() {
        return count;
    }

}
