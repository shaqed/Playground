package strings.out;

public class Exe2 {
    static boolean compare(String s1, String s2) {
        // YOUR CODE HERE
        return false;
    }

    /*
    * Complete the function above to compare 2 strings together and return the answer
    * as a boolean.
    *
    * EXTRA: Overload the function to receive an extra boolean as an argument:
    *       "boolean caseSensitive"
    *       If the boolean is false, the comparison ignores the cases of letter
    *       and will treat "Hello" and "HELLO" as equals
    *
    * */

    public static void main(String[] args) {
        String a1 = "Hello world";
        String b1 = "HelloWorld";

        String a2 = "Hi, my name is";
        String b2 = "Hi, my name is\n";

        String a3 = "";
        String b3 = "";

        String a4 = "Wazap";
        String b4 = "Wazap";

        System.out.println(compare(a1, b1)); // false
        System.out.println(compare(a2, b2)); // false
        System.out.println(compare(a3, b3)); // false
        System.out.println(compare(a4, b4)); // true

    }
}
