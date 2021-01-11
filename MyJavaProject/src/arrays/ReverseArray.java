package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int[] x= {1, 2, 3, 4, 5, 6, 7, 8, 9};//array list
		int temp;//int temp is an empty variable
		for(int i=0; i<x.length/2; i++) {
			temp=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=temp;
			System.out.println(Arrays.toString(x));
		}

	}

}
