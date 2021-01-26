package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] multiple_three = new int[5][5];

        //populate array
        int count = 3;

        for (int i = 0; i < multiple_three.length; i++) {
            for (int x = 0; x < multiple_three[i].length; x++) {
                multiple_three[i][x] = count;
                count += 3;
//                System.out.println(count);
            }
        }


        for (int i = 0; i < multiple_three.length; i++) {
            for (int x = 0; x < multiple_three[i].length; x++) {
                System.out.print(multiple_three[i][x] + " | ");
            }
            System.out.println();
        }
    }
}
