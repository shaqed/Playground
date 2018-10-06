package oop.exe1;
/**
 *
 * Object Oriented Programming - Bank
 *
 * In this exercise you will have to create a Bank, by implementing the empty methods listed below.
 * The bank will store its clients by name and the amount of currency they have,
 * it will store the clients using an array of Strings, and array of doubles
 * to represent the amount of currency.
 *
 * In the constructor, an initial value for CAPACITY is given, there can be no more than
 * this number of clients to this bank
 *
 *
 * Implement the empty methods, be sure to check every possible input and return the correct results:
 *      1. No prints inside the methods
 *      2. Account for bad inputs (non existing name, invalid amount of currency)
 *      3. The bank DOES NOT ALLOW anyone to be in debt, so no client should have a negative amount of currency
 *      4. Each deletion / addition to the clients list requires to modify the array
 *          so that there will be no empty spaces in the array
 *      5. The total number of clients (size) will never exceed CAPACITY
 *
 *
 * Extra:
 *      1. The bank now does allow anyone to be in debt, associate maximum possible debt for each person
 *      and modify the methods accordingly
 * */
public class Bank {
    private double[] currency;
    private String[] persons;
    private int size;

    private final int CAPACITY;

    public Bank(int capacity) {
        this.CAPACITY = 0; // Change this
    }


    /**
     * Adds a new person to the bank
     *
     * Returns whether the operation was successful or not
     * */
    public boolean addPerson(String name, double currency) {
        // Your code here
        return false;
    }

    /**
     * Tries to remove a person from the bank
     *
     * Returns whether the operation was successful or not
     * */
    public boolean removePerson(String name) {
        // Your code here
        return false;
    }


    /**
     * Returns the amount of currency a person has
     *
     * returns -1.0 if operation was not successful
     * returns a positive decimal number if the operation was successful
     * */
    public double getCurrencyOf(String name) {
        return -1.0;
    }

    /**
     * Attempts to update the currency of a person, given his name
     *
     * Returns whether the operation was successful or not
     * */
    public boolean deposit(String person, double amount) {
        // Your code here
        return false;
    }

    /**
     * Attempts to withdraw an amount of money from the person's account
     *
     * Returns -1.0 if the operation was unsuccessful
     * Returns any positive decimal number if the operation was successful
     * */
    public double withdraw(String person, double amount) {
        // Your code here
        return -1.0;
    }


    /**
     * Attempts to transfer the amount of
     * currency from personFrom to personTo
     *
     * Returns whether the operation was successful
     */
    public boolean transfer(String personFrom, String personTo, double amount) {
        // Your code here
        return false;
    }




    public void print() {
        System.out.println("Printing content of the bank:");
        for (int i = 0; i < size; i++) {
            System.out.print("Person: " + persons[i] + " has " + currency[i] + "\n");
        }
    }
}
