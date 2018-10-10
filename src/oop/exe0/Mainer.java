package oop.exe0;

public class Mainer {
    public static void main(String[] args) {
        // This code represents the "programmer" referred to in the Fraction class

        Fraction f1 = new Fraction(); // Create a new "Fraction" variable
        f1.numerator = 1;       // Change f1's numerator
        f1.setDenominator(3);   // Change f1's denominator

        Fraction f2 = new Fraction(); // Create a new "Fraction" variable
        f2.numerator = 2;
        f2.setDenominator(5);

        // After creating 2 objects, we can play around with them for a bit
        f1.print(); // Prints the data of f1
        f1.setDenominator(9);
        f1.print(); // Now it will print 1/9 because f1's denominator changed

        f1.setDenominator(0); // This will print "ERROR" and will not change the denominator

        f2.print();
        f2.numerator = 3;
        f2.print();
    }
}
