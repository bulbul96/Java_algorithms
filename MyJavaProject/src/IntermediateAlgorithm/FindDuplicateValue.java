package IntermediateAlgorithm;

public class FindDuplicateValue {

	public static void main(String[] args) {

		// Find the duplicate numbers

		int[] num = { 2, 3, 4, 4, 5, 6, 7, 8, 8 };

		for (int i = 0; i < num.length-1; i++) {
			if (num[i] == num[i + 1])
				System.out.println("Found Duplicate " + num[i]);
		}//end for

	}//end main

}//end class
