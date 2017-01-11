package examples.classes_examples;

public class A {

    public A() {
        getText();
    }

    protected String getText() {
        return String.format("result %s",
                getClass().getCanonicalName());
    }

}

class B extends A {

    public B() {
        getText();
    }

}

class C extends B {

    public C() {
        getText();
    }

}

