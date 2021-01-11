package IntermediateAlgorithm;

import java.util.ArrayList;

public class PrimeNumberRange {

	public static void main(String[] args) {
		// how many prime between 1 to 50

		int range=50;
		//int c=0;
		boolean isPrime=true;
		ArrayList<Integer>Primes=new ArrayList<Integer>();
		for(int i=1; i<=range; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
				
		}
			if(isPrime==true)
				Primes.add(i);
			//c=c+1;
			isPrime=true;
		}
		System.out.println(Primes);
		System.out.println(Primes.size());
		//System.out.println();
		//isPrime=false;
	}

}
