package tutorials;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] x= {18, 7, 8, 90, 5, 12, 33, 87, 98, 4};
		int temp=0;
		for(int i=0; i<x.length/2; i++) {
			temp=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-i-i]=temp;
		}
System.out.println(Arrays.toString(x));
	}

}
