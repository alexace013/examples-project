package examples.patterns.factory.figures;

public class Square extends Figure {

    private double parameter;

    public Square() {
        parameter = ZERO_VALUE;
    }

    public Square(final double parameter) {
        this.parameter = parameter;
    }

    @Override
    double getArea() {
        return Math.pow(parameter, VALUE_2);
    }

}