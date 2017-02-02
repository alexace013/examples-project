package examples.enums_examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnumExample2Test {

    @Test
    public void test01() {
        assertEquals(EnumExample2.MyEnum.VALUE1.toString(), "VALUE1");
    }

    @Test
    public void test02() {
        assertEquals(EnumExample2.MyEnum.VALUE2.getValue(), "VALUE2");
    }

    @Test
    public void test03() {
        System.out.println("----- test03 -----");
        printAllValues();
    }

    @Test
    public void test04() {
        String newValue = "VALUE3";
        EnumExample2.MyEnum.VALUE3.setValue(newValue);
        assertEquals(EnumExample2.MyEnum.VALUE3.toString(), newValue);
    }

    @Test
    public void test05() {
        System.out.println("\n----- test05 -----");
        printAllValues();
    }

    @Test
    public void test06() {
        String newValue = "VALUE4";
        EnumExample2.MyEnum.VALUE3.setValue(newValue);
        assertEquals(EnumExample2.MyEnum.VALUE3.getValue(), newValue);
    }

    @Test
    public void test07() {
        System.out.println("\n----- test07 -----");
        printAllValues();
    }

    @Test
    public void test08() {
        String newValue = "VALUE5";
        EnumExample2.MyEnum.VALUE1.setValue(newValue);
        assertEquals(EnumExample2.MyEnum.VALUE1.toString(), newValue);
    }

    private void printAllValues() {
        EnumExample2.MyEnum[] myEnums = EnumExample2.MyEnum.values();
        for (int i = 0; i < EnumExample2.MyEnum.values().length; i++) {
            System.out.println(myEnums[i].getValue());
        }
    }

}
