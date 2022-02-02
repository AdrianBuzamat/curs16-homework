package ro.fasttrackit.curs16.ex1;

public class RecursiveExercises {

    public Integer sumOfNumbers(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("insert a positive number ");
        }
        if (number <= 1) {
            return number;
        } else {
            return number + sumOfNumbers(number - 1);
        }
    }

    public int sumOfEvenNumbers(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Insert a positive number");
        }
        if (number < 2) {
            return 0;
        }
        if (number % 2 == 0) {
            return number + sumOfEvenNumbers(number - 2);
        } else {
            return sumOfEvenNumbers(number - 1);
        }
    }

    public String reverseString(String word) {
        if (word.isEmpty() || word.length() == 1) {
            return word;
        } else {
            return reverseString(word.substring(1)) + word.charAt(0);
        }
    }

    public boolean isPalindromeFirstMethod(String word) {
        if (word == null || word.length() < 2) {
            return false;
        }
        if (word.equals(reverseString(word))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindromeSecondMethod(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Insert a valid word");
        }
        if (word.length()<2){
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        } else {
            return isPalindromeFirstMethod(word.substring(1, word.length() - 1));
        }
    }

    public int sumDigit(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Insert a positive number");
        }
        if (number < 10) {
            return number;
        } else {
            return sumDigit(number / 10) + number % 10;
        }
    }

    public int fibonacciNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Insert a positive number");
        }
        if (number == 0) {
            return 0;
        }
        if (number < 2) {
            return 1;
        } else {
            return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
        }
    }
}
