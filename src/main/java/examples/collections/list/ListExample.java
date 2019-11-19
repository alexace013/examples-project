package examples.collections.list;

import lombok.extern.log4j.Log4j;

import java.util.*;

@Log4j
class ListExample {

    static final int DEFAULT_VAL = 1_000;

    static Vector<String> vector = new Vector<>();
    static ArrayList<String> arrayList = new ArrayList<>();
    static LinkedList<String> linkedList = new LinkedList<>();
    static Stack<String> stack = new Stack<>();
    static List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

    static void loadedTestDataToList(final List<String> list) {
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < DEFAULT_VAL; i++) {
            list.add(String.format("%s_%d", "TEST", i));
        }
        final long endTime = System.currentTimeMillis();
//        log.debug(list);
        log.info("TEST DATA WAS LOADED.");
        log.info(String.format("List %s was loaded to time: %d",
                list.getClass().getSimpleName(), endTime - startTime));
    }

    static void clearLists(final List... lists) {
        for (List list : lists) {
            list.clear();
            log.info(String.format("LIST %s WAS CLEANED.", list.getClass().getSimpleName()));
        }
    }
}