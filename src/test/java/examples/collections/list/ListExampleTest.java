package examples.collections.list;

import lombok.extern.log4j.Log4j;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static examples.collections.list.ListExample.*;

@Log4j
public class ListExampleTest {

    @Before
    public void setUpTestDataToLists() {
        loadedTestDataToList(vector);
        loadedTestDataToList(arrayList);
        loadedTestDataToList(linkedList);
        loadedTestDataToList(stack);
        loadedTestDataToList(synchronizedList);
    }

    @Test
    public void testListExampleLoadedTestDataToListCheckListSize() {
        checkListSize(vector, DEFAULT_VAL);
        checkListSize(arrayList, DEFAULT_VAL);
        checkListSize(linkedList, DEFAULT_VAL);
        checkListSize(stack, DEFAULT_VAL);
        checkListSize(synchronizedList, DEFAULT_VAL);
    }

    @Test
    public void testListExampleLoadedTestDataToListCheckListsSizeAsEquals() {
        checkListsSizeAsEquals(vector, arrayList, linkedList, stack, synchronizedList);
    }

    private static void checkListSize(final List list, final int expectedSize) {
        final int actualSize = list.size();
        Assertions.assertThat(list.size())
                .as(String.format("actual size = %d is not as expected size = %d", actualSize, expectedSize))
                .isEqualTo(expectedSize);
    }

    private static void checkListsSizeAsEquals(final List... lists) {
        for (int i = 0; i < lists.length; i++) {
            Assertions.assertThat(lists[i].size())
                    .as("lists size are different.")
                    .isEqualTo(lists[i++].size());
        }
    }

    @After
    public void cleanListsFromTestData() {
        clearLists(vector, arrayList, linkedList, stack, synchronizedList);
    }
}