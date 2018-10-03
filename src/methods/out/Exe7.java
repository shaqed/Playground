package methods.out;

public class Exe7 {

    static int factorial(int n) {
        // YOUR CODE HERE
        return -1;
    }

    /*
    * Complete the function above to compute the "factorial" of a positive integer "n"
    * A factorial for the number n is defined as the product of all numbers
    * From n to 1.
    * Where the factorial of 0 is 1
    *
    * If the method receive a non-positive integer it returns -1 as an answer
    *
    * For Example: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    * */
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = -55;
        int d = 10;

        System.out.println(factorial(a)); // 120
        System.out.println(factorial(b)); // 1
        System.out.println(factorial(c)); // -1
        System.out.println(factorial(d)); // 3628800


    }
}
