package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        float height = 5;
        float radius = 3.14f;
        float pi = 3.14f;

        float calcVolume = (float) (pi * Math.sqrt(radius) * height);
        float calcSurfaceArea = (float) ((2 * pi * radius * height) + (2 * pi * Math.sqrt(radius)));

        System.out.println(calcVolume);
        System.out.println(calcSurfaceArea);
    }
}