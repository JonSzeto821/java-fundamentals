package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 3;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        //less than
        if (a < c) {
            System.out.println("a is less than c");
        }

        //less than or equal
        if (c <= d) {
            System.out.println("c is less than or equal to d");
        }

        //greater than
        if (d > 1) {
            System.out.println("d is greater than 1");
        }

        //greater than or equal to
        if (d >= 3) {
            System.out.println("d is greater than or equal to 3");
        }

        //equal to
        if (b == 2) {
            System.out.println("b is equal to 2");
        }
    }

}

