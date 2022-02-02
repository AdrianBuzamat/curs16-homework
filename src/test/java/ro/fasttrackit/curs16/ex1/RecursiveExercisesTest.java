package ro.fasttrackit.curs16.ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursiveExercisesTest {
    @Test
    @DisplayName("WHEN a number is given THEN calculate the sum from 0 to n numbers")
    void testSumOfNumbers() {
        RecursiveExercises recursiveExercises = new RecursiveExercises();
        assertThat(recursiveExercises.sumOfNumbers(0)).isEqualTo(0);
        assertThat(recursiveExercises.sumOfNumbers(1)).isEqualTo(1);
        assertThat(recursiveExercises.sumOfNumbers(2)).isEqualTo(3);
        assertThat(recursiveExercises.sumOfNumbers(6)).isEqualTo(21);
    }

    @Test
    @DisplayName("WHEN a number is given THEN calculate the some of its n even number")
    void testSumOfEvenNumbers() {
        RecursiveExercises recursiveExercises = new RecursiveExercises();
        assertThat(recursiveExercises.sumOfEvenNumbers(2)).isEqualTo(2);
        assertThat(recursiveExercises.sumOfEvenNumbers(3)).isEqualTo(2);
        assertThat(recursiveExercises.sumOfEvenNumbers(7)).isEqualTo(12);
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> recursiveExercises.sumOfEvenNumbers(-10));
        assertThat(exc.getMessage()).isEqualTo("Insert a positive number");
    }

    @Test
    @DisplayName("WHEN a string is given THEN return the string reversed")
    void testReversedString() {
        RecursiveExercises recursiveExercises = new RecursiveExercises();
        assertThat(recursiveExercises.reverseString("mere")).isEqualTo("erem");
        assertThat(recursiveExercises.reverseString("ana")).isEqualTo("ana");
        assertThat(recursiveExercises.reverseString("a")).isEqualTo("a");
    }

    @Test
    @DisplayName("WHEN a string is given THEN check if its palindrome and return its reversed version")
    void testIsPalindrome(){
        RecursiveExercises recursiveExercises = new RecursiveExercises();
        assertThat(recursiveExercises.isPalindromeFirstMethod("mercks")).isEqualTo(false);
        assertThat(recursiveExercises.isPalindromeSecondMethod("mercks")).isEqualTo(false);
        assertThat(recursiveExercises.isPalindromeFirstMethod("madam")).isEqualTo(true);
        assertThat(recursiveExercises.isPalindromeSecondMethod("madam")).isEqualTo(true);
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> recursiveExercises.isPalindromeSecondMethod(""));
        assertThat(exc.getMessage()).isEqualTo("Insert a valid word");

    }

    @Test
    @DisplayName("WHEN a number is given THEN return the sum of it digits")
    void testSumDigit() {
        RecursiveExercises recursiveExercises = new RecursiveExercises();
        assertThat(recursiveExercises.sumDigit(234)).isEqualTo(9);
        assertThat(recursiveExercises.sumDigit(1)).isEqualTo(1);
    }

    @Test
            @DisplayName("WHEN a number is given THEN return its value in the fibonacci array")
    void testFibonacciNumber(){
        RecursiveExercises recursiveExercises = new RecursiveExercises();
        assertThat(recursiveExercises.fibonacciNumber(0)).isEqualTo(0);
        assertThat(recursiveExercises.fibonacciNumber(4)).isEqualTo(3);
        assertThat(recursiveExercises.fibonacciNumber(10)).isEqualTo(55);
    }



}
