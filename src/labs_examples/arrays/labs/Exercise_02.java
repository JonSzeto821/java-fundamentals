package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1-10:");
        int userInput = scanner.nextInt();
        int arrLength = array.length;

        for (int i = 0; i < arrLength; i++) {
            if (array[i] == userInput) {
                System.out.println("The index of " + userInput + " is " + i);
                break;
            }
        }
    }
}