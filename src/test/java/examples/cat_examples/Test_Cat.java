package examples.cat_examples;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test_Cat {

    private static final Object[] CAT_DATA_1 = {"Barsik", 15, "yellow", 25, 40};
    private static Cat cat1;
    private static Cat cat2;

    @BeforeClass
    public static void createCats() {
        cat1 = new Cat();
        cat2 = new Cat((String) CAT_DATA_1[0],
                (Integer) CAT_DATA_1[1],
                (String) CAT_DATA_1[2],
                (Integer) CAT_DATA_1[3],
                (Integer) CAT_DATA_1[4]);
    }

    @Test
    public void test01() {
        assertEquals(cat1.getPower(), 10);
    }

    @Test
    public void test02() {
        assertEquals(cat2.getPower(), 26);
    }

}
