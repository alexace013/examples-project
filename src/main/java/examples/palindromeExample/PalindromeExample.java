package examples.palindromeExample;

import java.util.Iterator;

public class PalindromeExample {

    public static boolean isPalindrome(final Iterator<Character> iterator) {
        StringBuilder builder = new StringBuilder();
        while (iterator.hasNext()) {
            builder.append(iterator.next());
        }
        String result = builder.toString();
        int resultLength = result.length();
        for (int i = 0; i < resultLength / 2; i++) {
            if (result.charAt(i) != result.charAt(resultLength - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
