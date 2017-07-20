package examples.basic_examples;

public class BasicExamples01 {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hel" + "lo";
        String str3 = " mum";

        if (str1 == str2) {
            System.out.println("1. same");
        } else {
            System.out.println("1. different");
        }

        if (str1 + str3 == "hello mum") {
            System.out.println("2. same");
        } else {
            System.out.println("2. different");
        }

    }

}
