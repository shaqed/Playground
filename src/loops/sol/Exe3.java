package loops.sol;

import java.util.Scanner;

public class Exe3 {

    /**
     * Exercise 03
     *
     * Write a program that receive a positive integer from the user and prints
     * if the number is a prime number or not
     *
     * Note: A "Prime number" is a number which is divisible ONLY by itself and 1
     * For example: 6 is not a prime number because it's divisible by 2 and 3
     *              7 is a prime number because it can only be divided by 1 and 7
     *              2 is a prime number
     *
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number: " + n + " is prime");
        } else {
            System.out.println("Number: " + n + " is not prime");
        }

        scanner.close();
    }
}
