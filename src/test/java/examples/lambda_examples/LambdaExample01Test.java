package examples.lambda_examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample01Test {

    private static final byte ZERO = 0;
    private static final short SIZE = 1024;

    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= SIZE; i++) {
            list.add(randomValue(ZERO, SIZE));
        }
        LamdaExample01.dataOutput(list);
    }

    private static int randomValue(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

}
