package simplealgorithms;

public class FindMinNumber {

	public static void main(String[] args) {
		// 
		
		int[] num= {2000, 209, 4, 567, 45, 5006, 10};
		//int max=-1;
		//int min=1000000;
				
		 int min=Integer.MAX_VALUE;
		
		for(int i=0; i<num.length; i++) {
			if(num[i]<min)
				min=num[i];
		}
		System.out.println(min);
	}

}
