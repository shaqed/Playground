package oop.exe0;

public class Fraction {

    /* Definitions of fields (variables) */

    // public variable, accessible from other classes
    // (Accessible to other programmers who will use this class)
    public int numerator;

    // private variable, accessible from only within the class
    private int denominator;



    /* Definitions of methods of that class */

    /***
     * The programmer that uses the class may ask this class to change
     * its denominator via this method.
     * Since the denominator is a private field, this is the only way of changing
     * the denominator of the class
     *
     * This method asks for a number as a denominator, and if it's not 0
     * it sets the denominator to be that number
     * if the number is zero, an error message will be displayed
     */
    public void setDenominator(int t) {
        if (t != 0) {
            denominator = t;
        } else {
            // Denominator cannot be 0...
            System.out.println("ERROR OMG");
        }
    }


    /***
     * Since the denominator field (=variable) is private, the programmer
     * does not have access even to read its value.
     * We do however like to give access to the programmer to read that value.
     * So we provide a public method (which the programmer can call)
     * and inside it we retrieve the value of the denominator and return it
     * @return The value of denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * This function prints the values of the fields in a nice format
     */
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
}
