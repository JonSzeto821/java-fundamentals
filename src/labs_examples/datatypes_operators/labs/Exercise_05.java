package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        //AND
        if (a & c) {
            System.out.println("a & c are true");
        }

        //short-circuit AND
        if (a && c) {
            System.out.println("a is true and c is true");
        }

        //OR
        if (b | c) {
            System.out.println("c is true");
        }

        //short-circuit OR
        if (c || d) {
            System.out.println("c is true");
        }

        //XOR
        if (b ^ c) {
            System.out.println("b is fales but c is true");
        }

        //NOT
        if (b != c) {
            System.out.println("b does not equal to c");
        }
    }

}

