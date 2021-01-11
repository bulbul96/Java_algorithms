package String;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		
		//array--store a set a values---homogenious values
		//arrray is a fixed length data structure
		//
		
		String[] state = new String[5];
		
		state[0]="NY";
		state[1]="NJ";
		state[2]="VA";
		state[3]="MN";
		state[4]="CT";		
System.out.println(state[2]);
System.out.println(state.length);

int[] id= {1, 2, 3, 4, 5};
System.out.println(id[2]);
System.out.println(Arrays.toString(id));

	}

}
