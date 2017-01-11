package examples.classes_examples;

public class X {

    public X() {
        System.out.println("result X");
    }

    public static void main(String[] args) {
        X x = new Z();
    }

}

class Y extends X {

    public Y() {
        System.out.println("result Y");
    }

}

class Z extends Y {

    public Z() {
        System.out.println("result Z");
    }

}
