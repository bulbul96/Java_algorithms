package arrays;

import java.util.Arrays;

public class DemoArray {
	public static void main(String[]args) {
		
		//store a set of homogeneous value		
		//integer array--declaring array by allocating memory
		
		int[] age;//variable
		age=new int[3];//variable
		
		//assign values to an array
		age[0]=7;
		age[1]=5;
		age[2]=2;
		
		
		
		System.out.println("2nd value of the array: "+age[1]);
		
		age[1]=12;
		
		
		for(int i=0; i<age.length; i++) {
			System.out.println("Age of index "+i+": "+age[1]);
			
			
		}
		//declaring array by list of values
		
		int[] score= {98, 92, 78};
		
		System.out.println("2nd value of the array: "+score[1]);
		
		//string array
		
		String[]names;
		names=new String[3];
		names[0]="mahbub";
		names[1]="Tapan";
		names[2]="Eshan";
				
		System.out.println(Arrays.toString(age));
		
	}

}
