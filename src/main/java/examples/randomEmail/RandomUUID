package tests;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class RandomUUID {

    public static String randomEmail() {
        return "test-mail" + UUID.randomUUID()+ "@rootfest.net";
    }

    public static long getUUID() {
        return UUID.randomUUID().getLeastSignificantBits();
    }

    public static void main(String[] args) {

        List<Long> uuidList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            uuidList.add(i, getUUID());
        }

        System.out.println(Arrays.toString(uuidList.toArray()));

        int count = 0;
        for (int i = 0; i < uuidList.size(); i++) {
            for (int j = i +1; j < uuidList.size() - 1; j++) {
                if (uuidList.get(i).equals(uuidList.get(j))) {
                    count++;
                    System.out.println(count);
                }
            }
        }

//        System.out.println(randomEmail());

    }

}
