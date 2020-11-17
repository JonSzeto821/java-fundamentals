package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a word: ");
        String word = scanner.next();

        int wordLength = word.length();

//        for loop
        /*for (int i = 0; i < wordLength; i++ ) {
            char currentChar = word.charAt(i);
            if (currentChar == 'a' | currentChar == 'e' | currentChar == 'i' | currentChar == 'o' | currentChar == 'u') {
                System.out.println("The word is: " + word);
                System.out.println("The first vowel is: " + currentChar);
                break;
            }
        }*/

//        while loop
        int i = 0;
        while (i < wordLength) {
            char currentChar = word.charAt(i);
            if (currentChar == 'a' | currentChar == 'e' | currentChar == 'i' | currentChar == 'o' | currentChar == 'u') {
                System.out.println("The word is: " + word);
                System.out.println("The first vowel is: " + currentChar);
                break;
            }
            i++;
        }

    }
}
