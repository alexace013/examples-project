package examples.palindromeExample;

import lombok.extern.log4j.Log4j;

import java.util.Iterator;

@Log4j
public class PalindromeExample {

    public static boolean isPalindrome(final Iterator<Character> iterator) {
        StringBuilder builder = new StringBuilder();
        while (iterator.hasNext()) {
            builder.append(iterator.next());
        }
        String result = getReplaceText(builder);
        log.debug(result);
        int resultLength = result.length();
        for (int i = 0; i < resultLength / 2; i++) {
            if (result.charAt(i) != result.charAt(resultLength - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeReverse(final Iterator<Character> iterator) {
        return isPalindromeReverseIgnoreCaseMode(iterator, false);
    }

    public static boolean isPalindromeReverseIgnoreCaseMode(
            final Iterator<Character> iterator,
            final boolean isIgnoreCase) {
        StringBuilder textResult = new StringBuilder();
        String reverseResult;
        String expectedText;
        while (iterator.hasNext()) {
            textResult.append(iterator.next());
        }
        expectedText = getReplaceText(textResult);
        reverseResult = getReplaceText(textResult.reverse());
        log.debug(expectedText);
        log.debug(reverseResult);
        return isIgnoreCase ?
                reverseResult.equalsIgnoreCase(expectedText) : reverseResult.equals(expectedText);
    }

    private static String getReplaceText(final StringBuilder builder) {
        return builder.toString().replace(" ", "");
    }

}
