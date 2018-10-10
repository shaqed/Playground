package oop.exe1;

public class Mainer {

    static Fraction multiplyFractions(Fraction a, Fraction b) {
        Fraction ans = new Fraction();

        // Your code here

        return ans; // Return value is 'ans' which its data-type is a Fraction
                    // As required by the function return type
    }


    /***
     * In this exercise, you are to complete the empty methods of Fraction
     * So the described output will be received.
     *
     * In the main you can an example of a usage of your Fraction class
     * by another programmer, you are not to touch the main!
     */

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.setNumerator(1);
        f1.setDenominator(0); // Should print "ERROR"
        f1.setDenominator(3);

        System.out.println(f1.round()); // 0
        System.out.println(f1.getDoubleValue()); // 0.333...
        System.out.println(f1.getNumerator()); // 1
        System.out.println(f1.getDenominator()); // 3


        Fraction f2 = new Fraction();
        f2.setNumerator(4);
        f2.setDenominator(5);


        System.out.println(f2.isEqual(f1)); // false
        f2.setNumerator(1);
        f2.setDenominator(3);
        System.out.println(f2.isEqual(f1)); // true
        System.out.println(f1.isEqual(f2)); // true

        f1.setDenominator(30);

        f1.print(); // 1/3
        f2.print(); // 1/30

        Fraction f3 = multiplyFractions(f1, f2);
        f3.print(); // 1/90
    }
}
