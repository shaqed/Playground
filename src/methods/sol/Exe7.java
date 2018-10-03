package methods.sol;

public class Exe7 {

    static int factorial(int n) {
        // If the number is not positive, return -1
        if (n < 0) {
            return -1; // return from the function, exit the function
        }
        // If not, continue here
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        return ans;

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
