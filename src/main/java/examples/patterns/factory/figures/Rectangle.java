package examples.patterns.factory.figures;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

    public Rectangle() {
        sideA = ZERO_VALUE;
        sideB = ZERO_VALUE;
    }

    public Rectangle(final double sideA, final double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double getArea() {
        return sideA * sideB;
    }

}