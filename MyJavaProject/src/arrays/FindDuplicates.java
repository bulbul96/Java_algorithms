package arrays;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		
		String sentence="This is my my dup dup test";//string data type, sentence is the variable name and value is the "This...."
		String[] dup=sentence.split("\\s");//another variable
		//System.out.println(Arrays.deepToString(dup));
		//String myString=""
	for(int i=0; i<dup.length-1; i++) {
			if(dup[i].equalsIgnoreCase(dup[i+1]))
				System.out.println(dup[i]+" is a duplicate");
		}
	}

}
