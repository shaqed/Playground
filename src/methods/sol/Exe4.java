package methods.sol;

public class Exe4 {

    public static boolean doesContainThisSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == sum){
                        return true;
                    }
                }
            }
        }
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
        boolean firstTry = doesContainThisSum(A, 8);
        boolean secondTry = doesContainThisSum(A, 100);
        boolean thirdTry = doesContainThisSum(A, 5);

        System.out.println(firstTry);
        System.out.println(secondTry);
        System.out.println(thirdTry);

    }
}
