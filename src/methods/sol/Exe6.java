package methods.sol;

public class Exe6 {

    public static void printArraySpecial(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }



    /**
     * Complete the function so the following output will be given
     *
     10
     10 4
     10 4 3
     10 4 3 55
     10 4 3 55 13
     10 4 3 55 13 -1


     EXTRA::
     make the function print the following:
     10
     10 4
     10 4 3
     10 4 3 55
     10 4 3 55 13
     10 4 3 55 13 -1
     10 4 3 55 13 -1
     10 4 3 55 13
     10 4 3 55
     10 4 3
     10 4
     10
     * */
    public static void main(String[] args) {
        int arr[] = {10,4,3,55,13,-1,-2};
        printArraySpecial(arr);
    }
}
