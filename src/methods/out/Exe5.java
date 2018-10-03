package methods.out;

public class Exe5 {

    public static int[][] splitArrayAtIndex(int[] array, int index) {
        int[][] arr = new int[2][];
        arr[0] = new int[index];
        arr[1] = new int[array.length - index];

        // YOUR CODE HERE

        return arr;
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }


    /**
     * Complete the following function so the following output will be given:
     *
     * Expected output:
     First half:
     10, 20,
     Second half:
     25, 31, 44, 22, 137,
     * */


    public static void main(String[] args) {
        int[] A = {10,20,25,31,44,22,137};

        int[][] result = splitArrayAtIndex(A, 2);

        System.out.println("First half:");
        printArray(result[0]);
        System.out.println("Second half:");
        printArray(result[1]);
    }
}
