package methods.out;

public class Exe8 {

    static String arrayToString(int[] arr) {
        // YOUR CODE HERE
        return ""; // change this of course
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
