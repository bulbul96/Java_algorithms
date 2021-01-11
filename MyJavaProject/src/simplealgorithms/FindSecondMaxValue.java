package simplealgorithms;

public class FindSecondMaxValue {

	public static void main(String[] args) {
		// 
		
		int[] num= {2000, 209, 4, 567, 45, 5006, 10};
		int maxOne=0;
		int maxTwo = 0;
		
		for(int i=0; i<num.length; i++) {
			maxTwo=maxOne;
			if(num[i]>maxTwo) {
				maxTwo=num[i];
			}
		}

		System.out.println("Max One: "+maxOne);
		System.out.println("Max Two: "+maxTwo);
	}

}
