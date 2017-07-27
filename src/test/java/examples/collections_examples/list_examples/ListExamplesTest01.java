package examples.collections_examples.list_examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class ListExamplesTest01 {

    public static void main(String[] args) {

//        deleteFile("E:\\workspace\\Java\\projects\\examples-project\\test.txt");

        short listSize = 1000;
        List<String> list = new ArrayList<>();
        for (short index = 0; index < listSize; index++) {
            list.add(index, generateRandomString());
        }
        list.forEach(out::println);
        list.forEach(data -> {
            writeInTheFile("test.txt", data);
        });
    }

    private static String generateRandomString() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String list = new String(chars);
        String result = reverseByArray(list);
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (byte i = 0; i < 10; i++) {
            char letter = chars[random.nextInt(chars.length)];
            char letter2 = chars[(int) (Math.random() * chars.length)];
            builder.append(String.format("%s test %s test %s ", letter, letter2, result.toString()));
        }
        return builder.toString();
    }

    private static void writeInTheFile(final String fileName, String data) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName, true);
            writer.append(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String reverseByArray(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);
    }

    private static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        return file.delete();
    }

}
