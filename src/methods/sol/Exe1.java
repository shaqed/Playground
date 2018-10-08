package methods.sol;

public class Exe1 {
	
	public static int[] duplicateAnArray(int[] arr) {
		
		int[] A = new int[arr.length];
		for (int i = 0; i < A.length; i++) {
			A[i] = arr[i];
		}
		
		return A;
	}
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
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
