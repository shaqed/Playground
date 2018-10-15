package oop.exe5;


/***
 * Object Oriented - Sets
 *
 * Set is a data structure that contains numbers
 * There are 2 main rules to sets
 *      1. There are no repeating numbers in the set
 *      So the set {1,2,3} and the set {1,2,3,3,2,2} are the same (they are equal)
 *
 *      2. The ordering of the numbers doesn't matter
 *      So the set {1,2,3} and the set {3,2,1} are the same (they are equal)
 *
 * Implement the empty methods so the desired output will be given in the Mainer class
 * You are free to add as many methods and fields that you like, as long
 * as they are 'private'
 */
public class MySet {

    /***
     * Union of 2 sets is defined as follows:
     * A union between two set is a combination of all the items
     * from both sets while eliminating the duplicates
     *
     * Example: {1,2,3} union {2,3,4} ==> {1,2,3,4}
     * @param james The first set object
     * @param jared The second set object
     * @return A new set object with the values of the united sets
     */
	public static MySet union(MySet james, MySet jared) {
		
		MySet result = new MySet();
		
//		// Iterating over all items in "james"
//		for(int i = 0; i < james.size(); i++) {
//			int itemFromJames = james.getByIndex(i);
//			
//			result.add(itemFromJames);
//		}
//		
//		// Iterating over all items in "jared"
//		for(int i = 0; i < jared.size(); i++) {
//			int itemFromJames = jared.getByIndex(i);
//					
//			result.add(itemFromJames);
//		}
		
		/* Better way to do that */
		result.add(james);
		result.add(jared);
		
		
		return result;
	}


    /***
     * An intersection between two sets results in a set that contains
     * all of the numbers the two sets share
     *
     * Example: {1,2,3} intersect {2,3,4} ==> {2,3}
     * @param s1 The first set
     * @param s2 The second set
     * @return A new instance of MySet object that contains the result of the intersection
     */
	public static MySet intersect(MySet s1 , MySet s2) {
		MySet result = new MySet();

		// YOUR CODE HERE

		return result;
	}


    /***
     * minus between two sets is a new set which values are the values from set1
     * after removing all the shared items with set2
     *
     * Example: {1,2,3} minus {2,3} ==> {1}
     * Example: {1,2,3} minus {}    ==> {}
     * Example: {1,2,3} minus {4,5,6} ==> {1,2,3} (there are no shared items)
     * @param s1 The first set
     * @param s2 The second set
     * @return A new instance of MySet
     */
	public static MySet minus(MySet s1, MySet s2) {



	    return null; // change this
    }
	
	// Fields
	private int[] innerArray; // = null

    // Methods
	
	public MySet() {
		innerArray = new int[0];
	}
	
	
	/***
	 * Copy constructor
	 * 
	 * Hint: implement this constructor using the 
	 * add(MySet) method
	 * @param otherSet
	 */
	public MySet(MySet otherSet) {
		
	}
	
	
	
	public int getByIndex(int index) {
		if (index >= 0 && index < innerArray.length) {
			return innerArray[index];
		} else {
			return -1;
		}
	}
	
	public boolean exists(int value) {
		for(int i = 0; i < innerArray.length; i++) {
			if (value == innerArray[i]) {
				return true;
			}
			
		} // ends the for loop
		return false;
	}
	
	

	/***
	 * Adds a value to the Set
	 * This method has no effect if the given value
	 * is already inside the set
	 * @param value
	 */
	public void add(int value) {
		
		if (!exists(value)) {
			
			// Create a new array of size innerArray.length + 1
			int[] temp = new int[innerArray.length + 1];
			
			// copy all elements from innerArray
			// to the "temp" array
			// leaving 1 spot empty in temp
			for(int i = 0; i < innerArray.length; i++) {
				temp[i] = innerArray[i];
			}
			
			// copy the last one
			temp[innerArray.length] = value;
			
			innerArray = temp;
			
		} // end of "if"	
		
	}

	
	/***
	 * Adds an array of values to the set
	 * Any values inside this array that already exists
	 * inside of the set will be ignored
	 * @param arrayOfValues
	 */
	public void add(int[] arrayOfValues) {
		// COMPLETE THIS
	}
	
	
	/***
	 * Adds all of the values from another Set object
	 * Any values inside of that set that already exists
	 * inside of this set will be ignored
	 * @param otherSet
	 */
	public void add(MySet otherSet) {
		// COMPLETE THIS
	}
	
	
	/***
	 * This method attempts to remove a value from the set
	 * if the value does not exists, the returned value is false
	 * if the value was removed - the method returns true
	 * @param value
	 * @return
	 */
	public boolean remove(int value) {
		// YOUR CODE HERE
		return false; // change this
	}


	
	public int size() {
		return innerArray.length;
	}
	
	public void print() {	
		// all this does is to print
		for(int x : innerArray) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
