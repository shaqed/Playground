package methods.sol;

public class Exe8 {

    static String arrayToString(int[] arr) {
        // Safety first
        if (arr == null) {
            return "{}";
        }


        String str = "{";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                // Not recommended, but works for this exercise
                // String concatenation can be done differently
                // But we have not learned about that yet
                str = str + arr[i] + ", ";
            } else {
                str = str + arr[i];
            }
        }
        return str + "}";
    }

    /*
    * Complete the function above to return a String represeting the array
    * Again, you are not to change the "main" function but only the function above
    *
    * Hint: You can use the plus operator + to concat strings together
    *       And also to concat an existing string to an integer or a float
    * */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,1,-3};
        int[] arr3 = {};
        int[] arr4 = null;

        String arr1str = arrayToString(arr1); // {1, 2, 3, 4, 5, 6}
        String arr2str = arrayToString(arr2); // {4, 5, 1, -3}
        String arr3str = arrayToString(arr3); // {}
        String arr4str = arrayToString(arr4); // {}

        System.out.println(arr1str);
        System.out.println(arr2str);
        System.out.println(arr3str);
        System.out.println(arr4str);

    }
}
