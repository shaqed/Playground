package oop.exe2;

/**
 * In this exercise you will be creating a Dynamic Array.
 *
 * As we know, arrays - once declared, cannot change their size.
 * We would like to write a class that can do that
 *
 * Below in the "main" you will see code written by a programmer using your
 * class, expected output in the prints are written in the comments.
 *
 * Complete the DynamicArray class methods to make the class function as desired
 *
 * Note: You may add as many fields and methods you like - but they must be 'private'
 */
public class Mainer {

    public static void main(String[] args) {
        // Create a new dynamic array object
        // The array is currently empty
        DynamicArray arr = new DynamicArray();

        System.out.println(arr.length());   // 0
        System.out.println(arr.get(0));     // -1, there are no items
        System.out.println(arr.get(-9));    // -1, -9 is a bad index

        arr.add(65);
        arr.add(-100);
        arr.add(1337);

        System.out.println(arr.length());   // 3
        System.out.println(arr.get(0));     // 65
        arr.print();                        // {65, -100, 1337}

        System.out.println(arr.remove(1)); // true
        arr.print();                            // {65, 1337}
        System.out.println(arr.length());       // 2


    }
}
