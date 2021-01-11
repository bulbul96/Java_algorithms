package simplealgorithms;

public class FindMaxThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {2000, 209, 4, 567, 45, 5006, 10};
		int maxOne=0;
		int maxTwo=0;
		int maxThree=0;
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>maxOne) {
				maxThree=maxTwo;
				maxTwo=maxOne;
				maxOne=num[i];
			}
			else if(num[i]>maxTwo) {
				maxThree=maxTwo;
				maxTwo=num[i];
			}
			else if(num[i]>maxThree) {
				maxThree=num[i];
			}
		}

		System.out.println("Max One: "+maxOne);
		System.out.println("Max Two: "+maxTwo);
		System.out.println("Max Three: "+maxThree);
	}

}
