package methods.out;

public class Exe2 {

    public static boolean tryToSwap(int arr[], int indexA, int indexB) {
        // YOUR CODE HERE
        return false;
    }
    public static void printArray(int[] arr) {
        // YOUR CODE HERE
    }



    /**
     * Complete the following function (without changing the main)
     * So that the output of the program will be exactly as the following:
     *
     * Expected output:
     Swapping between index -1 and 4 failed
     Swapping between index 1, 9 failed
     5, 6, -2, 3, 1, 2,

     * */
    public static void main(String[] args) {
        int A [] = {5,6,2,3,1,-2};

        boolean firstTry = tryToSwap(A, -1, 4);
        if (firstTry == true) {
            printArray(A);
        } else {
            System.out.println("Swapping between index -1 and 4 failed");
        }

        boolean secondTry = tryToSwap(A, 1, 9);
        if (secondTry == true) {
            printArray(A);
        } else {
            System.out.println("Swapping between index 1, 9 failed");
        }

        boolean thirdTry = tryToSwap(A, 5, 2);
        if (thirdTry == true) {
            printArray(A);
        } else {
            System.out.println("Swapping between index 5, 2 failed");
        }
    }
}
