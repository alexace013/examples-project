package examples.patterns.factory.figures;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.Test;

import static java.lang.String.format;
import static examples.patterns.factory.figures.Figure.ZERO_VALUE;

public class FiguresTests {

    private static final String ASSERT_MESSAGE = "Some wrong with <%s> figure.";
    private static final byte DEFAULT_TEST_VALUE_4 = 4;
    private static final byte DEFAULT_TEST_VALUE_5 = 5;

    private Figure figure;

    @Test
    public void figureCircleDefaultTest() {
        figure = new Circle();
        Assert.assertTrue(figure.getArea() == ZERO_VALUE);
    }

    @Test
    public void figureCircleTest() {
        final Circle circle = new Circle(DEFAULT_TEST_VALUE_5);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(Double.parseDouble(String.format("%1.1f", circle.getArea())))
                .as(format(ASSERT_MESSAGE, circle.getClass().getSimpleName()))
                .isEqualTo(78.5d);
        softly.assertThat(circle.getDiameter())
                .as(format(ASSERT_MESSAGE, circle.getClass().getSimpleName()))
                .isEqualTo(10.0d);
        softly.assertAll();
    }

    @Test
    public void figureSquareDefaultTest() {
        figure = new Square();
        Assert.assertTrue(figure.getArea() == ZERO_VALUE);
    }

    @Test
    public void figureSquareTest() {
        figure = new Square(DEFAULT_TEST_VALUE_4);
        Assert.assertEquals(format(ASSERT_MESSAGE, figure.getClass().getSimpleName()),
                16.0d, figure.getArea(), 0.0d);
    }

    @Test
    public void figureRectangleDefaultTest() {
        figure = new Rectangle();
        Assert.assertTrue(figure.getArea() == ZERO_VALUE);
    }

    @Test
    public void figureRectangleTest() {
        figure = new Rectangle(DEFAULT_TEST_VALUE_4, DEFAULT_TEST_VALUE_5);
        Assert.assertEquals(format(ASSERT_MESSAGE, figure.getClass().getSimpleName()),
                20.0d, figure.getArea(), 0.0d);
    }

}