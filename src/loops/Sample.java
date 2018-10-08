package loops;

public class Sample {
    /*
     * This file contains examples on how to use loops in Java
     * */
    public static void main(String[] args) {

        /* While loops
        * While loops are the simplest way to create a loop.
        * Inside of the parenthesis we supply a condition (a boolean value),
        *
        * The syntax is as follows:
        * while (SOME_BOOLEAN_HERE) {
        *       // Code here
        * }
        *
        * */

        int x = 6;
        while (x != 0) { // The condition is (x != 0) which initially is true
            x--; // decrement x by one
        }
        // This loop runs 6 times

        // To emphasis on the boolean value in the condition, this is also ok
        while (1 == 1) {
            // do stuff
        }
        // This loop runs indefinitely



        /*
        * For loops
        *
        * A For loops can be used as a shortcut from the while loop when
        * we want the loops to run a specific amount of time and using a runner variable
        * that counts how many times we've iterated so far.
        *
        * Note: EVERYTHING DONE WITH A FOR LOOP CAN BE DONE WITH A WHILE LOOP
        *       AND EVERYTHING DONE WITH A WHILE LOOP CAN BE DONE WITH A FOR LOOP
        *
        * For loop structure:
        * for ( {initial statement} ; {boolean condition} ; {iteration statement} ) {
        *       // CODE OF LOOP
        * }
        *
        *       - Initial Statement
        *       This is a line of code that is performed before the loop begins
        *       and even before the condition is checked.
        *       We can use this statement to initialize a variable that we will use
        *       in the loop (for example a counter: "int counter = 0")
        *
        *       - Boolean Condition
        *       Like the while loop, every iteration the loop checks if this boolean
        *       expression is true. If so - the loops continues, if not - the loop exits.
        *       Note that here we can use the variable we declared in the initial statement.
        *
        *
        *       - Iteration Statement
        *       This is a line of code that is performed each time a single iteration ends.
        *       Note that here we can use the variable we declared in the initial statement,
        *       for example we can increment it by one
        *
        * A Classic example of a for loop that runs 50 times:
        *       for (int counter = 1; counter <= 50; counter++) {
        *           // CODE
        *       }
        *
        *
        * */

        // Variables declared inside of loop are NOT ACCESSIBLE from outside of it
//        for (int i = 0; i < 50; i++) {
//            int foo = 88;
//        }
//        System.out.println(foo); // Error, can't find variable "foo"

        // Variables declared outside of the loop may be accessed from within the loop
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
//        }



    }
}
