package examples.palindromeExample;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableListIterator;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PalindromeExampleTest {

    private static final String PALINDROME_STR = "No Lemon nO Melon";
    private static final String NOT_PALINDROME_STR = PALINDROME_STR.concat("c");

    @Test
    public void _01_palindromeTestPositive() {
        assertTrue(PalindromeExample.isPalindrome(getIterator(PALINDROME_STR.toLowerCase())));
    }

    @Test
    public void _02_palindromeTestNegative() {
        assertFalse(PalindromeExample.isPalindrome(getIterator(NOT_PALINDROME_STR)));
    }

    @Test
    public void _03_palindromeReverseTestPositive() {
        assertTrue(PalindromeExample.isPalindromeReverse(getIterator(PALINDROME_STR.toLowerCase())));
    }

    @Test
    public void _04_palindromeReverseTestNegative() {
        assertFalse(PalindromeExample.isPalindromeReverse(getIterator(NOT_PALINDROME_STR)));
    }

    @Test
    public void _05_palindromeReverseIgnoreCaseModeTestPositive() {
        assertTrue(PalindromeExample.isPalindromeReverseIgnoreCaseMode(getIterator(PALINDROME_STR), true));
    }

    @Test
    public void _06_palindromeReverseIgnoreCaseModeTestNegative() {
        assertFalse(PalindromeExample.isPalindromeReverseIgnoreCaseMode(getIterator(PALINDROME_STR), false));
    }

    private static UnmodifiableListIterator<Character> getIterator(final String data) {
        ImmutableList<Character> CHARACTERS = Lists.charactersOf(data);
        return CHARACTERS.listIterator();
    }
}
