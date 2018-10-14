package oop.exe2;

public class DynamicArray {

    /***
     * Create a new Dynamic Array that
     * combines the values of the first array
     * with the second
     * @param arr1 The first array
     * @param arr2 The second array
     * @return arr1 + arr2
     */
    public static DynamicArray combine(DynamicArray arr1, DynamicArray arr2) {
        return null;
    }




    /***
     * Default empty constructor
     */
    public DynamicArray() {

    }

    /***
     * A Copy-constructor.
     * Given an object of dynamic array
     * creates a new object with the same values as "other"
     * @param other The other dynamic array
     */
    public DynamicArray(DynamicArray other) {

    }

    /***
     * This method retrieves an item from the dynamic array at said index
     *
     * if the given index is out of the bounds an error message
     * will be printed and the method will return -1
     *
     * @param index The desired index
     * @return The value desired
     */
    public int get(int index) {
        return -1;
    }


    /***
     * This method returns the current length of the Dynamic Array
     * Note that for every new item added to the dynamic array,
     * the length increases
     * @return The length of the dynamic array
     */
    public int length() {
        return 0;
    }

    /***
     * This method adds a new item to the dynamic array
     */
    public void add(int value) {

    }

    /***
     * Attempts to remove an item from the dynamic array based on a given index
     * The method will fail if the index is invalid
     *
     * The method will also re-arrange the array in the following way:
     * Let some array be: {5, 6, 7} (where index 0: 5 and index 1: 6 and index 2: 7)
     * After a remove(1) (remove the 6)
     * The array will be: {5,7}     (where index 0: 5 and index 1: 7)
     *
     * @param index A valid given index
     * @return A boolean indicating whether the deletion was successful
     */
    public boolean remove(int index) {
        return false;
    }

    /***
     * Prints the array in a nice format
     */
    public void print() {

    }
}
