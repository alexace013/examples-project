package examples.collections_examples.list_examples;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;

class ListExamples01 {

    static void addValueIntoList(List<Integer> list, int value) {
        list.add(value);
    }

    @Contract(pure = true)
    static int sumAllValuesFromList(List<Integer> list) throws NullPointerException {
        if (list == null) {
            throw new NullPointerException();
        }
        int sum = 0;
        for (Integer value : list) {
            sum += value;
        }
        return sum;
    }

    @Contract("null -> fail")
    static List<String> getInfoAboutList(List<Integer> list) throws NullPointerException {
        if (list == null) {
            throw new NullPointerException();
        }
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultList.add(String.format("list index: %s where value %s", i, list.get(i)));
        }
        return resultList;
    }

    @Contract("null -> fail")
    static void clearList(List<Integer> list) throws NullPointerException {
        if (list == null) {
            throw new NullPointerException();
        }
        list.clear();
    }

    @Contract("null -> fail")
    static boolean isListEmpty(List<Integer> list) throws Exception {
        if (list == null) {
            throw new Exception("list is null");
        }
        return list.size() == 0;
    }

}
