package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
            int [][] irr_array = new int[][]{
                    {12, 10},
                    {78, 46, 12, 77},
                    {11, 89, 34}
            };

            for (int[] arr:irr_array) {
               for (int val : arr) {
                   System.out.print(val + " | ");
               }
            }
    }
}
