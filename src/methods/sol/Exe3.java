package methods.sol;

public class Exe3 {
    public static boolean doesContainThisNumber(int[] arr, int number) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                found = true;
                break;
            }
        }
        return found;

    }


    /**
     * Complete the following function so that the following output will be given:
     * <p>
     * Expected output
     * true
     * false
     * true
     */
    public static void main(String[] args) {
        int A[] = {50, 55, 13, 31, 4, 10};

        boolean firstTry = doesContainThisNumber(A, 50);
        boolean secondTry = doesContainThisNumber(A, 33);
        boolean thirdTry = doesContainThisNumber(A, 55);

        System.out.println(firstTry);
        System.out.println(secondTry);
        System.out.println(thirdTry);
    }

}
