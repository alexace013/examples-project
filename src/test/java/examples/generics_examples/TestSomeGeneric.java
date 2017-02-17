package examples.generics_examples;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TestSomeGeneric {

    private static List<SomeGeneric<Object>> list = new ArrayList<SomeGeneric<Object>>();

    @BeforeClass
    public static void createGenerics() {
        list.add(new SomeGeneric<Object>(10));
        list.add(new SomeGeneric<Object>("hello"));
        list.add(new SomeGeneric<Object>(18.9d));
    }

    @Before
    public void createGeneric() {
        new SomeGeneric<Float>(14.78F);
        new SomeGeneric<Integer>(Integer.parseInt("1000"));
    }

    @Test
    public void test01() {
        assertEquals(SomeGeneric.getCount(), 5);
    }

    @Test
    public void test02() {
        SomeGeneric<Integer> someGeneric = new SomeGeneric<Integer>(100);
        assertEquals(SomeGeneric.getCount(), 8);
    }

    @Test
    public void test03() {
        assertEquals(SomeGeneric.getCount(), 10);
    }

}
