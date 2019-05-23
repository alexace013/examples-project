package examples.collections_examples;

import static java.lang.System.out;

import utils.test.Test;

import java.util.*;

public class CollectionsExample01 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        ((ArrayList<String>) collection).add(0, Test.TEST.getTestValue());
        out.printf("%s\n", ((ArrayList<String>) collection).get(0));
        List<String> list = new LinkedList<>();
        ((LinkedList<String>) list).addFirst(Test.TEST.getTestValue());
        out.printf("%s\n", list.get(0));
        Map<Integer, String> map = new HashMap<>();
        map.put(1, Test.TEST.getTestValue());
        out.printf("%s\n", map.get(1));
        Queue<String> queue = new PriorityQueue<>();
        ((PriorityQueue<String>) queue).add(Test.TEST.getTestValue());
        out.printf("%s\n", ((PriorityQueue<String>) queue).peek());
    }
}
