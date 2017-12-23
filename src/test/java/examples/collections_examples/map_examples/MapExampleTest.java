package examples.collections_examples.map_examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import utils.generator.NameGenerator;
import utils.logger.Log4JWrapper;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MapExampleTest {

    private MapExample<Integer, String> mapExample = new MapExample<>();
    private NameGenerator nameGenerator = new NameGenerator();
    private static final short RANGE_VALUE = 200;

    @Test
    public void test01() {
        mapExample.createExampleMap();
        for (int i = 1; i <= RANGE_VALUE; i++) {
            String name = nameGenerator.generate();
            mapExample.put(i, name);
        }
        mapExample.getOriginalMap()
                .forEach((key, value) -> Log4JWrapper.info(String.format("index %d name %s", key, value)));
    }

}
