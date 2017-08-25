package examples.stringsExamples;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;

public class StringEndsWithAndRegexExample {

    public static boolean isTextContainsWord(final String text, final String delimiterRegex, final String expectedWord) {
        return Arrays.stream(text.split(delimiterRegex)).anyMatch(word -> word.equals(expectedWord));
    }

    @Contract(pure = true)
    public static boolean isTextEndsWith(final String text, final String expected) {
        return text.endsWith(expected);
    }

}
