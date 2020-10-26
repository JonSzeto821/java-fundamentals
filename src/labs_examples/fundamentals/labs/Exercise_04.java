package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate valyue, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        boolean bool = true;
        char charVal = 'j';
        byte byteVal = 12;
        short shortVal = 111;
        int intVal = 10000;
        long longVal = 321232122L;
        float floatVal = 2343.11F;
        double doubleVal = 432423.32423432423423;

        System.out.println(bool);
        System.out.println(charVal);
        System.out.println(byteVal);
        System.out.println(shortVal);
        System.out.println(intVal);
        System.out.println(longVal);
        System.out.println(floatVal);
        System.out.println(doubleVal);

    }

}