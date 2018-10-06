package strings.sol;

public class Exe1 {

    static int spaces(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char tempChar = s.charAt(i);

            if (tempChar == ' ') {
                ans++;
            }
        }
        return ans;
    }


    /*
    * Complete the function to count the number of spaces in a string
    * */
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "The Red Fox";
        String str3 = "";

        System.out.println(spaces(str1)); // 1
        System.out.println(spaces(str2)); // 2
        System.out.println(spaces(str3)); // 0
    }

}
