package IntermediateAlgorithm;

public class Fibonacci {

	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.....
		//addition of previous two numbers(0+1=1), 
		//
		
		int range=15;
		int n1=0;
		int n2=1;
		int n3;
		
		//find first 10 or 15 Fibonnaci numbers
		
		System.out.println(n1+ " "+n2);//this will print 0 and 1
		
		for(int i=0; i<range; i++) {
			//for(int i=0; i<10; i++);
			//for(int i=2; i<20; i++);
			n3=n1+n2;
			System.out.print(" "+n3);//this will print addition of previous two numbers(0+1=1, 1+1=2, ....)
			//System.out.println(n3);
			
			n1=n2;
			n2=n3;
		}

	}

}
