package simplealgorithms;

public class FizzBuzzRange {

	static void fizzbuzz(int range, int num1, int num2) {
		
		
		for(int i=1; i<=range; i++) {
			if(i%num1==0 && i%num2==0);
			System.out.println("FizzBuzz");
			
			if(i % num1==0)
			
			System.out.println("Fizz");
			
			else if(i%num2==0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}

	}
public static void main(String[] args) {
	//fuzzbuzz fbr=new fizzbuzzrange();
	fizzbuzz(50, 3, 7);
	
}
}
