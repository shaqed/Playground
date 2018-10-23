package strings.out;

public class Exe3 {

    static int asciiSum(String str) {
        // YOUR CODE HERE
        return 3;
    }

    /**
     * Complete the function above so that the function returns
     * the asciiSum of all ASCII values of a given string.
     *
     * For example: The string "Hello" according to the ASCII table is:
     * 72, 101, 108, 108, 111 which sums up to 500
     * */
    public static void main(String[] args) {
        System.out.println(asciiSum("Hello"));          // 500
        System.out.println(asciiSum("Civilization 5")); // 1354
        System.out.println(asciiSum("Java is nice"));   // 1085
    }

}
