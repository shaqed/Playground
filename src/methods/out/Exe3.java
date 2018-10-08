package methods.out;

public class Exe3 {
    public static boolean doesContainThisNumber(int[] arr, int number) {
        // YOUR CODE HERE



        return false;
    }



    /**
     * Complete the following function so that the following output will be given:
     *
     * Expected output
     true
     false
     true
     * */
    public static void main(String[] args) {
        int A [] = {50,55,13,31,4,10};

        boolean firstTry = doesContainThisNumber(A, 50);
        boolean secondTry = doesContainThisNumber(A, 33);
        boolean thirdTry = doesContainThisNumber(A, 55);

        System.out.println(firstTry);
        System.out.println(secondTry);
        System.out.println(thirdTry);
    }

}
