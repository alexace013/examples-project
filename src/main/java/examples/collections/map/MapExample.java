package examples.collections.map;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j;

import java.util.*;

@Log4j
public class MapExample {

    static final int DEFAULT_VAL = 10;

    static HashMap<String, String> hashMap = new HashMap<>();
    static LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
    static TreeMap<String, String> treeMap = new TreeMap<>();
    static Hashtable<String, String> hashtable = new Hashtable<>();
    static Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<String, String>());

    static void loadedTestDataToMaps(final Map<String, String>... maps) {
        for (Map<String, String> map : maps) {
            final long startTime = System.currentTimeMillis();
            for (int i = 1; i <= DEFAULT_VAL; i++) {
                map.put(String.format("%s_%d", "TEST", i), Faker.instance().name().firstName());
            }
            final long endTime = System.currentTimeMillis();
            log.debug(map);
            log.info("TEST DATA WAS LOADED.");
            log.info(String.format("Map %s was loaded to time: %d",
                    map.getClass().getSimpleName(), endTime - startTime));
        }
    }

    static void clearMaps(Map<String, String>... maps) {
        for (Map<String, String> map : maps) {
            map.clear();
            log.info(String.format("MAP %s WAS CLEANED.", map.getClass().getSimpleName()));
        }
    }
}