package examples.patterns.factory.figures;

abstract class Figure {

    static final byte VALUE_2 = 2;
    static final byte ZERO_VALUE = 0;

    Figure(final double... parameters) {
    }

    abstract double getArea();

}