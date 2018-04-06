package examples.patterns.factory.figures;

import lombok.Getter;

@Getter
public class Circle extends Figure {

    private double radius;

    public Circle() {
        radius = ZERO_VALUE;
    }

    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, VALUE_2);
    }

    public double getDiameter() {
        return radius * VALUE_2;
    }

}