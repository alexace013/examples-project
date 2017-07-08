package examples.collections_examples.list_examples;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ListExamples01Test01 {

    private static List<Integer> list = new ArrayList<>();

    @Before
    public void setUp() {
        for (int i = 0; i < 100; i++) {
            ListExamples01.addValueIntoList(list, generateRandomValue());
        }
    }

    @Test
    public void test01() {
        for (String info : ListExamples01.getInfoAboutList(list)) {
            System.out.println(info);
        }
        System.out.println(String.format("list sum = %d", ListExamples01.sumAllValuesFromList(list)));
        assertTrue(ListExamples01.sumAllValuesFromList(list) != 0);
    }

    @Test
    public void test02() {
        assertFalse(ListExamples01.sumAllValuesFromList(list) == 0);

    }

    @Test
    public void test03() {
        try {
            assertTrue(!ListExamples01.isListEmpty(list));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test04() throws Exception {
        ListExamples01.clearList(list);
        assertTrue(ListExamples01.isListEmpty(list));
    }

    private static int generateRandomValue() {
        return (int) (Math.random() * 100);
    }

}
