package IntermediateAlgorithm;

public class FindPrimeNumber {

	public static void main(String[] args) {
		
		
		// prime numbers: 2, 3, 5, 7, 11, 13, 17
		//prime number divisible by 1 and itself only
		
		//is 15 is a prime number---not a prime number
		
		int x=17;
		boolean isPrime=true;
		for(int i=2; i<x/2; i++) {
			if(x%i==0) {
				isPrime=false;
				break;
			}
			//nested for loop when one for loop is used into another for loop
						
			
		}
		
		if(isPrime==true)
			System.out.println(x+" is a Prime Number");
		else
		   System.out.println(x+" is Not a Prime Number");

	}

}
