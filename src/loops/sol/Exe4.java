package loops.sol;

import java.util.Scanner;

public class Exe4 {

    /**
     * Exercise 04
     *
     * Write a program that, given a number as an input 'n',
     * prints a triangle of asterisks (*) of size 'n'
     *
     * For example: for input 3 the output is:
     *              *
     *              **
     *              ***
     *
     *              for input 4 the output is:
     *              *
     *              **
     *              ***
     *              ****
     *
     * Hint: to print something without a newline afterwards use: System.methods.out.print()
     * instead of Syste
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
