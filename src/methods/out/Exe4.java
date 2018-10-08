package methods.out;

public class Exe4 {

    public static boolean doesContainThisSum(int[] arr, int sum) {
        // YOUR CODE HERE
        return false;
    }

    /**
     * Complete the following methods so the correct output will be given:
     * Note: The function checks if TWO DIFFERENT cells added together will create the argument
     * That means, in the example array -> the sum of 5 can NOT be created from this array
     *
     * Expected output:
     true
     false
     true
     * */
    public static void main(String[] args) {
        int A[] = {5,3,1,0,14};
        boolean firstTry = doesContainThisSum(A, 8); // true because 5 + 3 = 8
        boolean secondTry = doesContainThisSum(A, 100); // false
        boolean thirdTry = doesContainThisSum(A, 5); // true because 5 + 0 = 5


        System.out.println(firstTry);
        System.out.println(secondTry);
        System.out.println(thirdTry);

    }
}
