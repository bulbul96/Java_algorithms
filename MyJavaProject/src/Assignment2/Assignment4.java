package Assignment2;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		//scanner is an object here
		System.out.println("Enter First Number: ");
		scn.nextInt();
		int x=scn.nextInt();
		System.out.println("Enter 2nd Number: ");
		int y=scn.nextInt();
		if(x>y)
			System.out.println("x is bigger");
		else
			System.out.println("y is bigger");
		
	}

}
//Write a class with User Input