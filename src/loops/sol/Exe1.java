package loops.sol;

import java.util.Scanner;

public class Exe1 {

    /**
     * Exercise 01
     * Write a program which asks the user for numbers.
     * When the number entered by the user is -10, the program stops asking for
     * more numbers and prints the following information:
     *      1. The largest number received
     *      2. The smallest number received
     *      3. Average of all numbers received
     *
     * Hint 1: Number received may be a floating points numbers (e.g. 5.1)
     * Hint 2: Check how the average changes every time a new number appears
     * Example output:
     * Enter a number:
     * 1
     * Enter a number:
     * 3
     * Enter a number:
     * 5
     * Enter a number:
     * 6
     * Enter a number:
     * 6
     * Enter a number:
     * 4
     * Enter a number:
     * 5
     * Enter a number:
     * -10
     * -10 Detected, stopping program.
     * Information:
     * Average is: 4.285714285714286
     * Max is: 6.0
     * Min is: 1.0
     *
     * */

    public static void main(String[] args) {
        // YOUR CODE HERE

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = scanner.nextDouble();

        double sum = 0;
        double totalNumbers = 0;
        double min = n;
        double max = n;

        while (n != -10) {
            sum += n;
            totalNumbers++;


            if (n < min) {
                min = n;
            }

            if (n > max) {
                max = n;
            }

            System.out.println("Enter a number: ");
            n = scanner.nextDouble();

        }

        System.out.println("-10 Detected, stopping program.");
        System.out.println("Information:");
        System.out.println("Average is: " + (sum/totalNumbers));
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);

        scanner.close();

    }

}
