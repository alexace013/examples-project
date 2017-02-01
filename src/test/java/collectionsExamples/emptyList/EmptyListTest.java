package collectionsExamples.emptyList;

import java.util.Collections;
import java.util.List;


public class EmptyListTest {

    public static void main(String[] args) {
        System.out.println(getList());
        System.out.println(getListSize());
    }

    private static List getList() {
        return Collections.emptyList();
    }

    private static int getListSize() {
        return getList().size();
    }

}
