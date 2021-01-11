package IntermediateAlgorithm;

public class PrimeNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]num= {34, 57, 17, 15, 101, 201};
		boolean isPrime=true;
		for(int i=0; i<num.length; i++) {
			for(int j=2; j<num[i]/2; j++) {
				if(num[i]%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==false)
			System.out.println(num[i]+ " is not a prime number");
			else
			System.out.println(num[i]+ " is a prime number");
			isPrime=true;
		}
	}

}
