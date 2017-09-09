package examples.lambda_examples;

import org.jetbrains.annotations.Contract;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LambdaExamplesWithList {

    static List<String> getSortingStringListBeforeJava8(final List<String> list) {
        Comparator<String> comparatorList = new Comparator<String>() {
            @Contract(pure = true)
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list, comparatorList);
        return list;
    }

    static List<String> getSortingStringListAfterJava8(final List<String> list) {
        list.sort(String::compareTo);
        return list;
    }

}
