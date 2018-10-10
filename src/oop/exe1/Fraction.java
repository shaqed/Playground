package oop.exe1;

public class Fraction {

    public void setNumerator(int n) {
        // YOUR CODE HERE
    }

    public void setDenominator(int n) {
        // YOUR CODE HERE
    }

    public int getNumerator() {
        // YOUR CODE HERE
        return -1; // change this
    }

    public int getDenominator() {
        // YOUR CODE HERE
        return -1;
    }

    /***
     * This function checks if the current fraction is equal to another fracion
     * given as an argument.
     * Note: Comparing Fractions cannot be done with the '==' operator alone
     * You have to extract other's numerator and denominator and compare them!
     *
     * @param other Another Fraction object
     * @return true if they are equal, false otherwise
     */
    public boolean isEqual(Fraction other) {
        // YOUR CODE HERE
        return false;
    }


    /***
     * Prints the fraction in a nice format
     */
    public void print() {
        // YOUR CODE HERE
    }

    /***
     * This function returns the double value of the fraction.
     * For example: if the fraction contains num as 5 and denom as 10
     *              The value returned from the function is 0.5
     *
     * @return A double value representing the fraction
     */
    public double getDoubleValue() {
        // YOUR CODE HERE
        return 0.0; // change this
    }


    /**
     * This method returns an integer representing the fraction,
     * the integer is a rounded value of the fraction itself.
     * For example: if the fraction is 5/10 -> the method rounds UP => 1
     *              if the fraction is 6/10 -> the method rounds UP => 1
     *              if the fraction is 4/10 -> the method rounds DOWN => 0
     * @return An integer representing the rounded value of the fraction
     */
    public int round() {
        return -1; // change this
    }


}
