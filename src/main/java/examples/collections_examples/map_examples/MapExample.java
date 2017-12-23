package examples.collections_examples.map_examples;

import utils.logger.Log4JWrapper;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapExample<K, V> {

    private Map<K, V> mapExample;

    public Map<K, V> createExampleMap() {
        return mapExample = new HashMap<>();
    }

    public void put(final K key, final V value) {
        if (isMapExampleCreate()) {
            mapExample.put(key, value);
        }
        mapExample.put(key, value);
    }

    private boolean isMapExampleCreate() {
        if (mapExample == null) {
            Log4JWrapper.debug("example map was created by default");
            mapExample = Collections.EMPTY_MAP;
        }
        return true;
    }

    public Map<K, V> getOriginalMap() {
        return mapExample;
    }
}
