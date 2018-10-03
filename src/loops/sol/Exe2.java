package loops.sol;

import java.util.Scanner;

public class Exe2 {

    /**
     * Exercise 02
     *
     * Write a program that computes exponentiation of two positive integers
     * The program receive 2 numbers from the user (from the keyboard)
     * And prints the result of the first number to the power of the second one
     *
     * Sample output:
     *
     * Enter your first number:
     * 5
     * Enter your second number:
     * 0
     * Result of 5^0 is: 1
     *
     * ---------
     * Enter your first number:
     * 2
     * Enter your second number:
     * 8
     * Result of 2^8 is: 256
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int b = scanner.nextInt();

        int res = 1;
        int temp = b;
        while (temp > 0) {
            res = res * a;
            temp--;
        }

        System.out.println("Result of " + a + "^" + b + " is: " + res);

        scanner.close();
    }
}
