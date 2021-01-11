package simplealgorithms;

public class FindMaxValue {

	public static void main(String[] args) {
		// num=2 . 10, 209. 5. 567. 45.5
		
		int[] num= {2000, 209, 5, 567, 45, 5006, 10};
		//int max=-1
		int max= Integer.MIN_VALUE;
		//int max=0;
		for(int i=0; i<num.length; i++) {
			if(num[i]>max)
				max=num[i];
		}//end for
		
System.out.println("The max value: "+max);

	}//end main

}//end class

//above is the find the max value
