package IntermediateAlgorithm;

public class FizzBuzz {

	public static void main(String[] args) {
		
		// num divisible by 3=fizz
		//num divisible by 5=buzz
		//num divisible by 3 & 5 =fizzbuzz
		
		int[]num= {3, 10, 15, 9, 17, 19, 25, 30, 31, 45, 50};
		for(int i=0; i<num.length; i++) {
			if(num[i]% 3== 0 && num[i]% 5== 0)
				System.out.println(num[i]+" fizzbuzz");
				else if(num[i]% 3== 0)
					System.out.println(num[i]+ " fizz");
				else if(num[i]% 5== 0)
					System.out.println(num[i]+ " buzz");
				else
					System.out.println(num[i]);
		}

	}

}
