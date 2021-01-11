package simplealgorithms;

import java.util.ArrayList;

public class FindPrimeNumber {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>primes=new ArrayList<Integer>();

		for(int i=1; i<=100; i++) {
			boolean isPrime=true;
		}
			boolean isPrime = false;
			int i = 0;
			for(int j=2; j<i; j++) {
				if(i%j==0){
				//System.out.println(i+" is not a prime number");
				isPrime=false;
				break;
			}
		}
			if(isPrime==true) 
			primes.add(i);
			//System.out.println(i+" is a prime number");
			//else
				//System.out.println(i+" is not a prime number");
			System.out.println(primes);
	}
		

	}

