package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        if (list.isEmpty()) {
            System.out.println("The list is empty! Fill it up!");
        } else {
            System.out.println("The list contains items!");
        }

        if (list.contains("three")) {
            System.out.println("Three exists in the array!");
        }
    }
}
