package methods.sol;

public class Exe9 {
    // WRITE YOUR METHOD HERE


    /*
    * ADVANCED !
    * Write a function that sorts an array
    * The function will receive an array of integers and return a NEW instance of
    * the array that is sorted
    *
    * Note: The solution doesn't need to be efficient in terms of speed or space, just needs to work
    * Note2: Do not use Arrays.sort(), that's cheating
    * Note3: Looking the solution up on the internet is easy - come up with your own!
    *
    * Extra: Write another function with the same name that does the same thing
    * Except this time it accepts an array of doubles
    * */

    public static void main(String[] args) {
        int[] unsorted = {5,1,21,-5,-99, 3, 2, 0};

        // CALL YOUR FUNCTION HERE

        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + " ");
        }
        System.out.println();
    }
}
