package methods.out;

public class Exe10 {

    static int[] toBinary(int n) {
        //YOUR CODE HERE
        return new int[0]; // change this
    }

    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    /*
    * Complete the function above to convert an integer to an array of bits
    * The array will contain only 1's and 0's as a binary representation of the given number
    *
    * Note: The number given must be in the bound of 0-255 (including)
    * */
    public static void main(String[] args) {
        int a1 = 127;
        int a2 = 44;
        int a3 = 0;
        int a4 = -5;
        int a5 = 900;
        int a6 = 255;

        printArray(toBinary(a1));
        printArray(toBinary(a2));
        printArray(toBinary(a3));
        printArray(toBinary(a4));
        printArray(toBinary(a5));
        printArray(toBinary(a6));

        /*
        * Expected output:
        *   0 1 1 1 1 1 1 1
            0 0 1 0 1 1 0 0
            0 0 0 0 0 0 0 0
            [Empty line]
            [Empty line]
            1 1 1 1 1 1 1 1
        * */

    }

}
