
package it.unical.demacs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    private Algorithms algorithms;

    @BeforeEach
    void setUp() {
        algorithms = new Algorithms();
    }

    // Tests for isPalindrome()

    @Test
    void testPalindromeSingleWord() {
        assertTrue(algorithms.isPalindrome("Anna"));
    }

    
    @Test
    void testPalindromeSentenceIgnoringSpacesAndCase() {
        assertTrue(algorithms.isPalindrome("I topi non avevano nipoti"));
    }


    @Test
    void testPalindromeIgnoringPunctuation() {
        assertTrue(algorithms.isPalindrome("I topi non avevano nipoti!"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(algorithms.isPalindrome("Java"));
    }

    @Test
    void testEmptyStringIsPalindrome() {
        assertTrue(algorithms.isPalindrome(""));
    }

    @Test
    void testSingleCharacterIsPalindrome() {
        assertTrue(algorithms.isPalindrome("a"));
    }

    @Test
    void testNullStringThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> algorithms.isPalindrome(null)
        );
    }

    // Tests for binarySearch()

    @Test
    void testBinarySearchFindsFirstElement() {
        int[] numbers = {1, 3, 5, 7, 9};

        assertEquals(0, algorithms.binarySearch(numbers, 1));
    }

    @Test
    void testBinarySearchFindsMiddleElement() {
        int[] numbers = {1, 3, 5, 7, 9};

        assertEquals(2, algorithms.binarySearch(numbers, 5));
    }

    @Test
    void testBinarySearchFindsLastElement() {
        int[] numbers = {1, 3, 5, 7, 9};

        assertEquals(4, algorithms.binarySearch(numbers, 9));
    }

    @Test
    void testBinarySearchTargetGreaterThanMiddle() {
        int[] numbers = {1, 3, 5, 7, 9};

        assertEquals(3, algorithms.binarySearch(numbers, 7));
    }

    @Test
    void testBinarySearchTargetNotFound() {
        int[] numbers = {1, 3, 5, 7, 9};

        assertEquals(-1, algorithms.binarySearch(numbers, 4));
    }

    @Test
    void testBinarySearchEmptyArray() {
        int[] numbers = {};

        assertEquals(-1, algorithms.binarySearch(numbers, 5));
    }

    @Test
    void testBinarySearchSingleElementFound() {
        int[] numbers = {5};

        assertEquals(0, algorithms.binarySearch(numbers, 5));
    }

    @Test
    void testBinarySearchSingleElementNotFound() {
        int[] numbers = {5};

        assertEquals(-1, algorithms.binarySearch(numbers, 8));
    }


    @Test
    void testEvenLengthNonPalindrome() {
        assertFalse(algorithms.isPalindrome("abca"));
    }

    @Test
    void testBinarySearchNullArrayThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> algorithms.binarySearch(null, 5)
        );
    }

}
