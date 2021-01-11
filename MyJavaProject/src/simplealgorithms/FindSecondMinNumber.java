package simplealgorithms;

public class FindSecondMinNumber {

	public static void main(String[] args) {
		// int[] num= {2000, 209, 4, 567, 45, 5006, 10};
		int[] num= {2000, 209, 4, 567, 45, 5006, 10};
		int minOne=1000000;
		int minTwo=1000000;
		
		for(int i=0; i<num.length; i++) {
			if(num[i]<minOne) {
				minTwo=minOne;
				minOne=num[i];
			}
			else if((num[i]<minTwo)) {
				minTwo=num[i];
			}
		}
		
		System.out.println("Min One: "+minOne);
		System.out.println("Min Two: "+minTwo);

	}

}
