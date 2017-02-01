package examples.enums_examples;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class EnumExample1Test {

    @Test
    public void positive_test_01() {
        assertEquals(EnumExample1.MyEnum.selectEnum(0), EnumExample1.MyEnum.ENUM1);
    }

    @Test
    public void positive_test_02() {
        System.out.println(Arrays.toString(EnumExample1.MyEnum.values()));
        String[] strings = {"ENUM3", "ENUM1", "ENUM2"};
        EnumExample1.MyEnum[] enums = new EnumExample1.MyEnum[strings.length];
        for (int i = 0; i < strings.length; i++) {
            enums[i] = EnumExample1.MyEnum.valueOf(strings[i]);
        }
        System.out.println(Arrays.toString(enums));
        for (int i = 0; i <= enums.length - 1; i++) {
            assertTrue(enums[i].toString().equals(strings[i]));
        }
    }

    @Test
    public void negative_test_03() {
        try {
            assertEquals(EnumExample1.MyEnum.selectEnum(0).ordinal(), EnumExample1.MyEnum.ENUM2.ordinal());
        } catch (AssertionError e) {
            e.printStackTrace();
            System.out.println("incorrect result");
        }
    }

}
