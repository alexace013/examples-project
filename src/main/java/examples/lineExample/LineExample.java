package examples.lineExample;

import java.util.List;

public class LineExample {

    private static final int A = 0;
    private static final int B = 100;
    private static final int FROM = 15;
    private static final int TO = 95;

    public static void main(String[] args) {
        calcLine(A, B, FROM, TO);
    }

    private static void calcLine(int a, int b, int from, int to) {
        Line line = new Line(a, b);
        for (int x = from; x <= to; x++) {
            int y = line.getY(x);
            System.err.println(String.format("(x, y) = (%d, %d)", x, y));
        }
    }

    static class Line {

        final int a;
        final int b;

        public Line(int a, int b) {
            this.a = a;
            this.b = b;
        }

        // inLining
        int getY(int x) {
            return (a * x + b);
        }

    }

}
