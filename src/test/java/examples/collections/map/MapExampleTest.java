package examples.collections.map;

import lombok.extern.log4j.Log4j;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static examples.collections.map.MapExample.*;

@Log4j
public class MapExampleTest {

    @Before
    public void setUpTestDataToMaps() {
        loadedTestDataToMaps(hashMap, linkedHashMap, treeMap, hashtable, syncMap);
    }

    @Test
    public void testListExampleLoadedTestDataToListCheckListSize() {
        checkMapSize(hashMap, DEFAULT_VAL);
        checkMapSize(linkedHashMap, DEFAULT_VAL);
        checkMapSize(treeMap, DEFAULT_VAL);
        checkMapSize(hashtable, DEFAULT_VAL);
        checkMapSize(syncMap, DEFAULT_VAL);
    }

    private static void checkMapSize(final Map map, final int expectedSize) {
        final int actualSize = map.size();
        Assertions.assertThat(map.size())
                .as(String.format("actual map size = %d is not as expected size = %d", actualSize, expectedSize))
                .isEqualTo(expectedSize);
    }

    @After
    public void cleanMapsFromTestData() {
        clearMaps(hashMap, linkedHashMap, treeMap, hashtable, syncMap);
    }
}