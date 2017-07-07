package examples.stringsExamples;

public class StringSplitExample {

    public static int getValue(String str) {
        String[] array = str.split("\\D+");
        int result;
        String res = "";
        for (String s : array) {
            res += s;
        }
        result = Integer.parseInt(res);
        return result;
    }

}
