package examples.palindromeExample;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableListIterator;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeExampleTest {

    private static final String PALINDROME_STR = "abba";
    private static final String NOT_PALINDROME_STR = PALINDROME_STR.concat("c");

    @Test
    public void _01_palindromeTestPositive01() {
        Assert.assertTrue(PalindromeExample.isPalindrome(getIterator(PALINDROME_STR)));
    }

    @Test
    public void _02_palindromeTestNegative02() {
        Assert.assertFalse(PalindromeExample.isPalindrome(getIterator(NOT_PALINDROME_STR)));
    }

    private static UnmodifiableListIterator<Character> getIterator(final String data) {
        ImmutableList<Character> CHARACTERS = Lists.charactersOf(data);
        return CHARACTERS.listIterator();
    }
}
