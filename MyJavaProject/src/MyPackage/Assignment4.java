package MyPackage;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String [] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter First Number");
		
		int x=scn.nextInt();
		int y=2;
		int sumofeven=0;
		if(x>y) {
		for(int i=2; i<=x; i+=2) {
			sumofeven=sumofeven+i;
}

		System.out.println("All even numbers between 2 and the input value is: "+sumofeven);
		
	
}	

else
	System.out.println("Please enter a number bigger than 2");
}

}