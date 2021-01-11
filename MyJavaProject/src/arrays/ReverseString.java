package arrays;

public class ReverseString {//class name

	public static void main(String[] args) {//main method
		
		
		String name="CareerHack";//data type is the string, variable is the name, and value is the 'Careerhack
		String reverse="";//is an empty variable
		for(int i=name.length()-1; i>=0; i--) {
			reverse=reverse+name.charAt(i);
			
		}
System.out.println(name);
System.out.println(reverse);
	}

}
