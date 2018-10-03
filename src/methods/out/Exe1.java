package methods.out;

public class Exe1 {
	
	public static int[] duplicateAnArray(int[] arr) {
		
		int[] A = new int[arr.length];

		// YOUR CODE HERE
		
		return A;
	}
	public static void printArray(int[] arr) {
		// YOUR CODE HERE
	}



	/**
	 *
	 * Complete the following functions (do not change the main)
	 * duplicateAnArray(int[]) and printArray(int[])
	 * So that the following output will be displayed when the program executes
	 * Expected Output:
	 A:
	 0, 2, 3, 4, 5, 6,
	 B:
	 50, 2, 3, 4, 5, 6,
	 * */
	public static void main(String[] args) {	
		int A [] = {1,2,3,4,5,6};
		int B [] = duplicateAnArray(A);
		
		A[0] = 0;
		B[0] = 50;
		
		System.out.println("A: ");
		printArray(A);
		System.out.println("B: ");
		printArray(B);
		
	}


}
