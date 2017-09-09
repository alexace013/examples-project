package examples.collections_examples.examples;

import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

    private static final Logger LOG = Logger.getLogger(CollectionsExamples.class);

    private static final String LIST_IS_NULL = "List is NULL!";

    @Contract("null -> false")
    static boolean collectionsShuffle(final List list) {
        if (list == null) {
            LOG.error(LIST_IS_NULL);
            return false;
        }
        LOG.info(String.format("List before shuffle %s", list));
        Collections.shuffle(getSynchronizedList(list));
        LOG.info(String.format("List after shuffle %s", list));
        return true;
    }

    /**
     * Use the following methods:
     * - Collections.synchronizedList(list);
     * - Collections.synchronizedSet(set);
     * - Collections.synchronizedMap(map);
     * They all accept the collection as a parameter, and return
     * a thread-safe collection with the same elements inside.
     */
    @NotNull
    private static List getSynchronizedList(final List list) {
        return Collections.synchronizedList(list);
    }

}
