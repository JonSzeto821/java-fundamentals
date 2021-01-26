package labs_examples.arrays.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[10];
        float sum = 0;

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Enter next integer: ");
            userNumbers[i] = scanner.nextInt();
            sum += userNumbers[i];
        }

        float avg = sum/userNumbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}