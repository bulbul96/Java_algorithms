package Assignment2;

import java.util.Scanner;

public class ProductOfTwoNumbers {
public static void main(String[] args) {
	
	/*this reads the input provided by user using keyboard*/
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter first number: ");
	
	//This method reads the number provided using keyboard
	
	int num1=scan.nextInt();
	
	System.out.println("Enter second number: ");
	int num2=scan.nextInt();
	
	//Closing Scanner after the use
	scan.close();
	
	//calculating product of two numbers
	
	int product = num1*num2;
	
	//Displaying the multiplication result
	
	System.out.println("Output: "+product);
	
}
}
