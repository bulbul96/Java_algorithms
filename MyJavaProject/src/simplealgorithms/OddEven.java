package simplealgorithms;

public class OddEven {

	public static void main(String[] args) {
	
		
		//odd number---3, 5, 7---not divisible by 2
		//Even number---2, 4, 10---divisible by 2
		
		int num=123;
		if(num>1) {
			if(num%2==0) 
		System.out.println("Even Number");
		
		
	//	if(num%2==0)
	//		System.out.println("Even Number");
		
		else if(num%2!=0)
			System.out.println("Odd Number");
		else
			System.out.println("Unknown");
		
		

	}
			else
				System.out.println("Number must be greater than 1");

}
}